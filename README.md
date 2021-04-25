### Kafka Installation
Install kafka/zookeeper and start servers
```sh
$ brew install kafka
$ brew install zookeeper
$ brew services start zookeeper
$ brew services start kafka
$ brew services list
```
###  Build and Run 
- Build and Run the application in IDE or use gradle commands
- Publish message to Kafka topic using below curl or postman tool
```sh
curl --location --request POST 'localhost:8081/kafka/topics/ENV.PACKAGE.TRACKING.PUBLISH/messages' \
--header 'Content-Type: application/json' \
--data-raw 'Spring Kafka Demo'
```
