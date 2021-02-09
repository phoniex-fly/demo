package com.ddd.demo.detail.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.ddd.demo.detail.domain.model.record.Record;

public class DetailRecordServiceImpl implements DetailRecordService {

	@Autowired
	private ApplicationContext applicationContext;

	@Override
	public boolean createRecord() {
		// 1、文件上传至服务器，返回服务器存储路径
		String path = "";
		// 2、生成文件上传记录
		Record record = new Record();
		record.setPath(path);
		// 3、触发生成明细批次事件
		applicationContext.publishEvent(record);
		return false;
	}

	@Override
	public List<Record> queryRecords() {
		return null;
	}

}
