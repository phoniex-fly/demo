package com.designPattern.demo.task.pattern.task.impl;

import org.springframework.stereotype.Component;

import com.designPattern.demo.task.domain.Task;
import com.designPattern.demo.task.pattern.task.TaskState;

/**
 *
 * @ClassName: TaskFinish
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月20日 上午10:13:03
 * @Copyright:
 */
@Component("finish")
public class TaskFinish extends TaskState {

	@Override
	public String deal(Task task) {
		return null;
	}
}
