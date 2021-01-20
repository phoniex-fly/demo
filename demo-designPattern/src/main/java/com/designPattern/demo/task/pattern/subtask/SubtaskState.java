package com.designPattern.demo.task.pattern.subtask;

import com.designPattern.demo.task.domain.Subtask;

/**
 *
 * @ClassName: TaskState
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月20日 上午10:07:00
 * @Copyright:
 */
public abstract class SubtaskState {

	/**
	 * 任务处理
	 * 
	 * @param task
	 * @return
	 */
	public abstract String deal(Subtask task);

}
