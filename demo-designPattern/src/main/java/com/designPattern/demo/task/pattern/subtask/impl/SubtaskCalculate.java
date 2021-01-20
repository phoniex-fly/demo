package com.designPattern.demo.task.pattern.subtask.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.designPattern.demo.calucate.pattern.BuilderDirector;
import com.designPattern.demo.task.domain.Subtask;
import com.designPattern.demo.task.pattern.subtask.SubtaskState;

/**
 *
 * @ClassName: SubtaskCalculate
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月20日 上午11:23:29
 * @Copyright:
 */
@Component("calculate")
public class SubtaskCalculate extends SubtaskState {

	@Autowired
	private BuilderDirector builderDirector;

	@Override
	public String deal(Subtask task) {
		builderDirector.calculate(task.getType());
		task.setState(Subtask.CHECK);
		return "OK";
	}

}
