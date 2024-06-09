package com.chrisp.taskmanagement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskManagementRepository extends JpaRepository<TaskModelV1, Integer> {
}
