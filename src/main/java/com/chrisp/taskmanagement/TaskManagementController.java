package com.chrisp.taskmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.sql.SQLException;
import java.util.List;

@RestController
public class TaskManagementController {

    private final TaskManagementService taskManagementService;
    private RestTemplate restTemplate;

    @Autowired
    public TaskManagementController(TaskManagementService taskManagementService) {
        this.taskManagementService = taskManagementService;
    }

    @GetMapping(path = "dashboard",
            produces = MediaType.APPLICATION_JSON_VALUE
    )

    public List<TaskModelV1> getTasks() throws SQLException {
        return this.taskManagementService.getTasks();
    }
    @PostMapping(path = "publish")
    public void addTask(@RequestBody TaskModelV2 task) {
        try {
            this.taskManagementService.addTask(task);
        } catch (RuntimeException e) {
            System.out.println("Unable to deserialize request.");
        }
    }

    @PatchMapping
    private void updateTask(long taskId, long userId) {
        try {
            //verifyUserAuthorization(taskId, userId);
        } catch(Exception e) {

        }
    }

    // dashboard page displays:
    // tasks for a user
    // can create tasks, edit task, delete task, change status of task

}
