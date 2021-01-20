package com.designPattern.demo.task.domain;

/**
 *
 * @ClassName: TaskDetail
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月20日 上午10:56:40
 * @Copyright:
 */
public class TaskDetail<T> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

}
