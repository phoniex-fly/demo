package com.designPattern.demo.task.service;

import com.designPattern.demo.task.domain.Subtask;
import com.designPattern.demo.task.domain.TaskDetail;

/**
 *
 * @ClassName: TaskService
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月20日 上午10:31:41
 * @Copyright:
 */
public interface SubtaskService {

	public String deal(Subtask task);

	public TaskDetail query(Subtask task);

	public void export(Subtask task);

}
