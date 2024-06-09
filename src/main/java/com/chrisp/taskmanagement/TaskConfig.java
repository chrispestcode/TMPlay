package com.chrisp.taskmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TaskConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
