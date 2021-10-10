package com.test.demo.model;

import com.test.demo.TestObjectMapperFactory;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static com.google.common.io.Resources.getResource;
import static org.assertj.core.api.Assertions.assertThat;

class MeterItemTest
{
    @Test
    void meterItemTest() throws IOException
    {
        final var meterItem = TestObjectMapperFactory.createObjectMapper()
                .readValue(getResource("com/test/demo/input/item.json").openStream(),MeterItem.class);
        assertThat(meterItem.getMeter().getValue()).isEqualTo("EE00011");
        assertThat(meterItem.getDate().getValue()).isEqualTo("2019-01-01");
        assertThat(meterItem.getConsumptionSum()).isEqualTo(361);
    }

}
