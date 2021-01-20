package com.designPattern.demo.task.domain;

/**
 *
 * @ClassName: Subtask
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月20日 上午11:09:02
 * @Copyright:
 */
public class Subtask {

	public static final String CALCULATE = "calculate";// 计算
	public static final String CHECK = "check";// 复核
	public static final String END = "end";// 处理完成

	private String id;

	private String taskId;

	private String msg;

	private String state;

	private String type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
