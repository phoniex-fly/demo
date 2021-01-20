package com.designPattern.demo.task.pattern.task.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.designPattern.demo.task.domain.Subtask;
import com.designPattern.demo.task.domain.Task;
import com.designPattern.demo.task.pattern.task.TaskState;
import com.designPattern.demo.task.service.SubtaskService;

/**
 *
 * @ClassName: TaskDeal
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月20日 上午10:11:04
 * @Copyright:
 */
@Component("deal")
public class TaskDeal extends TaskState {

	@Autowired
	private SubtaskService subtaskService;

	@Override
	public String deal(Task task) {
		for (Subtask subtask : task.getSubtasks()) {
			subtaskService.deal(subtask);
		}
		return "OK";
	}

	@Override
	public String submit(Task task) {
		task.setState(task.VERIFY);
		return "OK";
	}

}
