package com.test.demo.resource;

import com.test.demo.AwsClient;
import com.test.demo.model.ApiParameters;
import com.test.demo.model.MeterItem;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class MeterResource
{
    private final ApiParameters apiParameters;

    private final AwsClient awsClient;

    @Autowired
    public MeterResource(ApiParameters apiParameters, AwsClient awsClient) {
        this.apiParameters = apiParameters;
        this.awsClient = awsClient;
    }

    @GetMapping(value = "/api/meter/transactions/sum", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Integer>> createAndOpenDcsBooking(@ApiParam String meter, @ApiParam String date)
    {
        apiParameters.setMeter(meter);
        apiParameters.setDate(date);
        MeterItem item = awsClient.getDynamoItems();

        return ResponseEntity.ok(List.of(item.getConsumptionSum()));
    }
}
