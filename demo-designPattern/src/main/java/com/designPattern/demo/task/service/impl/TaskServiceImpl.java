package com.designPattern.demo.task.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.designPattern.demo.task.domain.Task;
import com.designPattern.demo.task.domain.TaskDetail;
import com.designPattern.demo.task.pattern.task.TaskState;
import com.designPattern.demo.task.service.TaskService;

/**
 *
 * @ClassName: TaskServiceImpl
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月20日 上午10:31:56
 * @Copyright:
 */
public class TaskServiceImpl implements TaskService {

	@Autowired
	private Map<String, TaskState> states = new HashMap<String, TaskState>();

	/**
	 * 处理任务
	 */
	@Override
	public String deal(Task task) {
		return states.get(task.getState()).deal(task);
	}

	/**
	 * 提交任务
	 */
	@Override
	public String submit(Task task) {
		return states.get(task.getState()).submit(task);
	}

	/**
	 * 回退任务
	 */
	@Override
	public String back(Task task) {
		return states.get(task.getState()).back(task);
	}

	/**
	 * 任务拉回
	 * 
	 * @param task
	 * @return
	 */
	public String redo(Task task) {
		return "非法的操作";
	};

	/**
	 * 任务结果查看
	 */
	@Override
	public TaskDetail query(Task task) {
		return null;
	}

	/**
	 * 导出
	 */
	@Override
	public void export(Task task) {
	}

}
