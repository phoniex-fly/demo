package com.designPattern.demo.task.pattern.task;

import com.designPattern.demo.task.domain.Task;

/**
 *
 * @ClassName: TaskState
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月20日 上午10:07:00
 * @Copyright:
 */
public abstract class TaskState {

	/**
	 * 任务处理
	 * 
	 * @param task
	 * @return
	 */
	public abstract String deal(Task task);

	/**
	 * 任务提交
	 * 
	 * @param task
	 * @return
	 */
	public String submit(Task task) {
		return "非法的操作";
	};

	/**
	 * 任务回退
	 * 
	 * @param task
	 * @return
	 */
	public String back(Task task) {
		return "非法的操作";
	};

	/**
	 * 任务拉回
	 * 
	 * @param task
	 * @return
	 */
	public String redo(Task task) {
		return "非法的操作";
	};

}
