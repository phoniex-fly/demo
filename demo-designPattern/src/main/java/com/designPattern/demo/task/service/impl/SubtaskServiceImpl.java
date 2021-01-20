package com.designPattern.demo.task.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.designPattern.demo.task.domain.Subtask;
import com.designPattern.demo.task.domain.TaskDetail;
import com.designPattern.demo.task.pattern.subtask.SubtaskState;
import com.designPattern.demo.task.service.SubtaskService;

/**
 *
 * @ClassName: TaskServiceImpl
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月20日 上午10:31:56
 * @Copyright:
 */
@Service
public class SubtaskServiceImpl implements SubtaskService {

	@Autowired
	private Map<String, SubtaskState> states = new HashMap<String, SubtaskState>();

	/**
	 * 处理任务
	 */
	@Override
	public String deal(Subtask task) {
		return states.get(task.getState()).deal(task);
	}

	/**
	 * 任务结果查看
	 */
	@Override
	public TaskDetail query(Subtask task) {
		return null;
	}

	/**
	 * 导出
	 */
	@Override
	public void export(Subtask task) {
	}

}
