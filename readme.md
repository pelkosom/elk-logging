##To start this project: 

1. Download 'jiraVolume.zip' and 'jenkinsVolume.zip'
2. Unzip jiraVolume jenkinsVolume to 'elk-docker' of your project folder
3. Run ```docker-compose up``` command in the project folder
5. Go to Kibana and create new index patern - Management- Index patterns
6. Go to Jenkins and run one of the test jobs
7. You can check Serenity report and working link to Jira for test 'Create new pet in swagger petstore - successful QATS-2'
7. Go to Discover in Kibana and you should see log from test run

###All the services should be available at following URL'services
Jenkins https://localhost:8080
Jira https://localhost:8081
Kibana https://localhost:5601

###Logstash configuration is placed in file: 
elk-docker\logstash\pipeline\logstash.conf

###Useful links:
logstash configuration:
https://www.elastic.co/guide/en/logstash/current/plugins-inputs-tcp.html

