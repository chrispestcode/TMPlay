package com.chrisp.taskmanagement;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;
import java.util.Objects;
@Data
public class TaskModelV2 {
     enum TASK_STATUS {
        NOT_STARTED,
        COMPLETED,
        IN_PROGRESS,
        TERMINATED
    }

    private long taskId;
    private long userId;
    private String taskName;
    private String taskDescription;
    private Date datetime;
    private TASK_STATUS status;

    public long getTaskId() {
        return taskId;
    }

    public long getUserId() {
        return userId;
    }
    public String getTaskName() {
        return taskName;
    }
    public String getTaskDescription() {
        return taskDescription;
    }
    public Date getDatetime() {
        return datetime;
    }
    public TASK_STATUS getStatus() {
        return status;
    }

    private TaskModelV2(final long taskId, final long userId, final String taskName,
                        final String taskDescription, final Date datetime, final TASK_STATUS status){
        this.taskId = taskId;
        this.userId = userId;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.datetime = datetime;
        this.status = status;
    }

    private TaskModelV2() {}

    public static  TaskModelBuilder builder() {
        return new TaskModelBuilder();
    }
    public static class TaskModelBuilder {

        private long taskId;

        private long userId;

        private String taskName;

        private String taskDescription;

        private Date datetime;

        private TASK_STATUS status;
        TaskModelBuilder() {}

        @JsonProperty("taskId")
        public TaskModelBuilder taskId(long taskId) {
            this.taskId = taskId;
            return this;
        }

        @JsonProperty("userId")
        public TaskModelBuilder userId(long userId){
            this.userId = userId;
            return this;
        }
        @JsonProperty("taskName")
        public TaskModelBuilder taskName(String taskName){
            this.taskName = taskName;
            return this;
        }

        @JsonProperty("taskDescription")
        public TaskModelBuilder taskDescription(String taskDescription){
            this.taskDescription = taskDescription;
            return this;
        }
        @JsonProperty("datetime")
        @JsonAlias({"date"})
        public TaskModelBuilder datetime(Date datetime){
            this.datetime = datetime;
            return this;
        }

        @JsonProperty("status")
        public TaskModelBuilder status(TASK_STATUS status){
            this.status = status;
            return this;
        }

        public TaskModelV2 build() {
            if(Objects.isNull(taskId)  && Objects.isNull(userId) && Objects.isNull(taskName) && Objects.isNull(taskDescription)
                    && Objects.isNull(datetime) && Objects.isNull(status)) {
                return new TaskModelV2();
            }
            return new TaskModelV2(taskId, userId, taskName, taskDescription, datetime, status);
        }

    }

}
