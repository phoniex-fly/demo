package com.designPattern.demo.task.service;

import com.designPattern.demo.task.domain.Task;
import com.designPattern.demo.task.domain.TaskDetail;

/**
 *
 * @ClassName: TaskService
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月20日 上午10:31:41
 * @Copyright:
 */
public interface TaskService {

	public String deal(Task task);

	public String submit(Task task);

	public String back(Task task);

	public String redo(Task task);

	public TaskDetail query(Task task);

	public void export(Task task);

}
