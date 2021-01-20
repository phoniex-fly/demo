package com.designPattern.demo.task.pattern.task.impl;

import org.springframework.stereotype.Component;

import com.designPattern.demo.task.domain.Task;
import com.designPattern.demo.task.pattern.task.TaskState;

/**
 *
 * @ClassName: TaskVerify
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月20日 上午10:12:53
 * @Copyright:
 */
@Component("verify")
public class TaskVerify extends TaskState {

	@Override
	public String deal(Task task) {
		return null;
	}

	@Override
	public String submit(Task task) {
		task.setState(task.FINACIAL_VERIFY);
		return "OK";
	}

	@Override
	public String back(Task task) {
		task.setState(task.DEAL);
		return "OK";
	}

	@Override
	public String redo(Task task) {
		task.setState(task.DEAL);
		return "OK";
	}

}
