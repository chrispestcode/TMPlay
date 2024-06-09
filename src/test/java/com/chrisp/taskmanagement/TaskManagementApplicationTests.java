package com.chrisp.taskmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TaskManagementApplicationTests {

	@Autowired
	private TaskManagementController taskManagementController;
	@Test
	void contextLoads() {
		assertThat(taskManagementController).isNotNull();
	}

}
