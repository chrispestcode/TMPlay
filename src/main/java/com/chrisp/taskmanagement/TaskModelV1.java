package com.chrisp.taskmanagement;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Entity
@Table
public class TaskModelV1 {
    @Id
    @SequenceGenerator(name="task_id_seq", sequenceName = "task_id_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="task_id_seq")
    private long taskId;
    @Column
    private long userId;
    @Column
    private String taskName;
    @Column
    private String status;

    @JsonProperty
    public long getTaskId() {
        return taskId;
    }

    @JsonProperty
    public long getUserId() {
        return userId;
    }

    @JsonProperty
    public String getTaskName() {
        return taskName;
    }

    @JsonProperty
    public String getStatus() {
        return status;
    }
}
