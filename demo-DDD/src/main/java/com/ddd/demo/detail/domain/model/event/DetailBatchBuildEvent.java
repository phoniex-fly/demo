package com.ddd.demo.detail.domain.model.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.ddd.demo.detail.application.DetailBatchService;
import com.ddd.demo.detail.domain.model.record.Record;

/**
 * 领域事件：上传记录生成后，触发生成明细批次
 * 
 * @author HelloWorld
 *
 */
@Component
public class DetailBatchBuildEvent {

	@Autowired
	private DetailBatchService detailBatchService;

	@EventListener
	public boolean createDetailBatch(Record record) {
		return detailBatchService.createBatch();
	}

}
