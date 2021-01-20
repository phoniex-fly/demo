package com.designPattern.demo.task.domain;

import java.util.List;

/**
 *
 * @ClassName: Task
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月20日 上午10:08:02
 * @Copyright:
 */
public class Task {

	public static final String DEAL = "deal";// 处理中
	public static final String VERIFY = "verify";// 审核中
	public static final String FINACIAL_VERIFY = "finaciaVerify";// 财务审核中
	public static final String FINALIZE = "finalize";// 定版中
	public static final String FINISH = "finish";// 已定版

	private String id;

	private String msg;

	private String state;

	private String type;

	private List<Subtask> subtasks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public List<Subtask> getSubtasks() {
		return subtasks;
	}

	public void setSubtasks(List<Subtask> subtasks) {
		this.subtasks = subtasks;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
