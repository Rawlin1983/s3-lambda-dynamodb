##Problem Statement
Given a csv file containing consumption of various energy meters.
Provide a cloud native solution using AWS that is able to consume a potentially large number of these files that arrive daily into a data store, and an API to sum total consumption per day given a meter identifier.

### CSV file
The CSV file provided holds the monthly power consumption of an individual
The consumption amount on each row is split into half an hour slots for each day.
Repeated for each day per month.
For the sake of this exercise, we will assume a customer's data is updated monthly.
The unique key for the search would be the meter number and the date of consumption.

### AWS Solutions
1. Use Amazon Athena - directly query the S3 bucket : https://aws.amazon.com/athena/faqs/
   1. Did not pursue this option
2. Use the example already made public:
   1. S3 bucket where the files are uploaded
   2. Lambda to convert the uploaded CSV file and convert it into a DynamoDB database
   3. Create a DynamoDB to store the transformed CSV data.
   4. references :
      1. https://github.com/aws-samples/csv-to-dynamodb/blob/master/CloudFormation/CSVToDynamo.template
      2. https://aws.amazon.com/blogs/database/implementing-bulk-csv-ingestion-to-amazon-dynamodb/

### Write an API
1. Choosing SpringBoot because it is easy or this test in Java.

### What could be better
1. The API integration with AWS is not complete because it does not have a AWSSigner.
2. Docker implementation.
3. Could have added a componentTest.
4. Could have added a VPC endpoint for DynamoDB .
5. Need to find a better way for the DynamoDB JSON to be parsed into a POJO.

