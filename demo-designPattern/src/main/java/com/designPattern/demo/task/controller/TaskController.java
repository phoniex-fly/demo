package com.designPattern.demo.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.designPattern.demo.task.domain.Task;
import com.designPattern.demo.task.service.TaskService;

/**
 * 
 * @ClassName: TaskController
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月20日 上午11:01:16
 * @Copyright:
 */
@Controller
@RequestMapping("/task")
public class TaskController {

	@Autowired
	private TaskService taskService;

	/**
	 * 处理任务
	 * 
	 * @param task
	 */
	@GetMapping("/deal")
	public Task deal() {
		Task task = new Task();
		task.setId("0001");
		task.setState(Task.DEAL);
		taskService.deal(task);
		return task;
	}

	/**
	 * 提交
	 * 
	 * @param task
	 */
	@GetMapping("/submit")
	public Task submit() {
		Task task = new Task();
		task.setId("0001");
		task.setState(Task.DEAL);
		taskService.submit(task);
		return task;
	}

	/**
	 * 回退
	 * 
	 * @param task
	 */
	@GetMapping("/back")
	public Task back() {
		Task task = new Task();
		task.setId("0001");
		task.setState(Task.DEAL);
		taskService.back(task);
		return task;
	}

}
