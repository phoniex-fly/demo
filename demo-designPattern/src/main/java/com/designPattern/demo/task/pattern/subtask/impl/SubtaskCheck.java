package com.designPattern.demo.task.pattern.subtask.impl;

import org.springframework.stereotype.Component;

import com.designPattern.demo.task.domain.Subtask;
import com.designPattern.demo.task.pattern.subtask.SubtaskState;

/**
 *
 * @ClassName: SubtaskCheck
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月20日 上午11:23:52
 * @Copyright:
 */
@Component("check")
public class SubtaskCheck extends SubtaskState {

	@Override
	public String deal(Subtask task) {
		task.setState(Subtask.END);
		return "OK";
	}

}
