package com.test.demo.resource;

import com.test.demo.AwsClient;
import com.test.demo.TestObjectMapperFactory;
import com.test.demo.model.ApiParameters;
import com.test.demo.model.MeterItem;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

import static com.google.common.io.Resources.getResource;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MeterResourceTest
{

    @Mock
    private ApiParameters apiParameters;

    @Mock
    private AwsClient awsClient;

    @InjectMocks
    private MeterResource toTest;

    @Test
    void testResource() throws IOException
    {
        when(awsClient.getDynamoItems()).thenReturn(TestObjectMapperFactory.createObjectMapper()
                .readValue(getResource("com/test/demo/input/item.json").openStream(),MeterItem.class));
        ResponseEntity<List<Integer>> item = toTest.createAndOpenDcsBooking("EE00011", "2019-01-01");

        verify(apiParameters).setMeter("EE00011");
        verify(apiParameters).setDate("2019-01-01");
        assertThat(Objects.requireNonNull(item.getBody()).get(0)).isEqualTo(361);
    }
}
