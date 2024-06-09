package com.chrisp.taskmanagement;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Fail.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TaskManagementControllerTests {

    @Mock
    TaskManagementController taskManagementController;

    @Autowired
    RestTemplate restTemplate;

    @Mock
    TaskModelV2 mockTask;

    @Test
    public void contextLoads() {
        assertThat(taskManagementController).isNotNull();
    }

    @Test
    public void testGetTasks_serverActive() throws Exception {
        assertNotNull(this.restTemplate.getForObject("http://localhost:8080/dashboard", List.class));
    }

    @Test
    public void testUpdateTasks_verifyAuth() throws Exception {
        throw new Exception("Not yet implemented.");
    }

    @Test
    public void testUpdateTasks_updateTask(){
        try {
            this.taskManagementController.addTask(mockTask);
        } catch (RuntimeException e) {
            fail("Unable to deserialize request.");
        }
        verify(this.taskManagementController, times(1)).addTask(mockTask);
    }

    @Test
    public void testUpdateTasks_exception() throws Exception {
        doThrow(new RuntimeException()).when(this.taskManagementController).addTask(mockTask);
        try {
            this.taskManagementController.addTask(mockTask);
            fail("Unable to deserialize request.");
        } catch(RuntimeException e) {
            assertEquals(RuntimeException.class, e.getClass());
        }
    }
}
