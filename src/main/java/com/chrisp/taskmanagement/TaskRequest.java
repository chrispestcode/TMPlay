package com.chrisp.taskmanagement;

import java.util.Date;

public record TaskRequest(String taskId,
                          String userId,
                          String taskName,
                          String taskDescription,
                          Date datetime,
                          TaskModelV2.TASK_STATUS status) {

}
