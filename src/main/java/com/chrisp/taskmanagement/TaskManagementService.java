package com.chrisp.taskmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskManagementService {

    @Autowired
    TaskManagementRepository taskManagementRepository;
    public List<TaskModelV1> getTasks() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb","SA","");
        PreparedStatement statement = conn.prepareStatement("SELECT * FROM Task_ModelV1;");
        ResultSet rs = statement.executeQuery();
        List<TaskModelV1> t1 = new ArrayList<>();
        while (rs.next()) {
            TaskModelV1 tm = TaskModelV1.builder().taskId(rs.getInt("task_id"))
                            .taskName((rs.getString("task_name")))
                                    .status(rs.getString("status"))
                                            .userId(rs.getLong("user_id"))
                                                    .build();

            t1.add(tm);
        }
        return t1;

    }

    public void addTask(TaskModelV2 task) {

    }
}
