package me.fazilahamedk.agiledevopsmonitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("me.fazilahamedk.agiledevopsmonitoring.repository")
public class AgileDevOpsMonitoringApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(AgileDevOpsMonitoringApplication.class, args);
    }
}