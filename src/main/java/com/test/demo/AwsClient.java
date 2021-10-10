package com.test.demo;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.GetItemSpec;
import com.google.gson.Gson;
import com.test.demo.model.ApiParameters;
import com.test.demo.model.MeterItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class AwsClient
{

    private final ApiParameters apiParameters;

    @Autowired
    public AwsClient(ApiParameters apiParameters) {
        this.apiParameters = apiParameters;
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(AwsClient.class);

    public MeterItem getDynamoItems()
    {
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration("http://localhost:8080", "aws-region"))
                .build();

        DynamoDB dynamoDB = new DynamoDB(client);
        String tableName = "ConsumptionTable";

        Table table = dynamoDB.getTable(tableName);

        try
        {
            LOGGER.info("Attempting to read the item...");
            Item outcome = table.getItem(new GetItemSpec()
                    .withPrimaryKey("Meter", apiParameters.getMeter(), "Date", apiParameters.getDate()));
            LOGGER.info("GetItem succeeded: {}", outcome);
            return ObjectMapperFactory.createObjectMapper().readValue(new Gson().toJson(outcome.asMap()), MeterItem.class);
        }
        catch (Exception e)
        {
            LOGGER.info("Unable to read item:{} ", apiParameters.getMeter() + ", " + apiParameters.getDate());
            LOGGER.info(e.getMessage());
        }
        return null;
    }
}
