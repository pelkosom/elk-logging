##To start this project: 

1. go to folder elk-docker
2. run "docker-compose up" (you should have docker installed)
3. open "http://localhost:5601" in your browser (open Kibana)
4. run test ElkLoggingTest.test
5. go to Kibana and create new index patern - Management- Index patterns
6. go to Discover in Kibana and you should see log

###logstash configuration is placed in file: 
elk-docker\logstash\pipeline\logstash.conf

###useful links:
logstash configuration:
https://www.elastic.co/guide/en/logstash/current/plugins-inputs-tcp.html

