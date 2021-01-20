package com.designPattern.demo.task.pattern.subtask.impl;

import org.springframework.stereotype.Component;

import com.designPattern.demo.task.domain.Subtask;
import com.designPattern.demo.task.pattern.subtask.SubtaskState;

/**
 *
 * @ClassName: SubtaskFinish
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月20日 上午11:24:12
 * @Copyright:
 */
@Component("finish")
public class SubtaskFinish extends SubtaskState {

	@Override
	public String deal(Subtask task) {
		return null;
	}

}
