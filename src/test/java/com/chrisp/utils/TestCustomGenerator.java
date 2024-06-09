package com.chrisp.utils;

import com.chrisp.taskmanagement.TaskManagementRepository;
import com.chrisp.taskmanagement.TaskModelV1;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestExecution;

@SpringBootTest(classes = {TaskModelV1.class})
@Slf4j
public class TestCustomGenerator {



    @Test
    public void testTaskModelV1Persistence() {


    }
}
