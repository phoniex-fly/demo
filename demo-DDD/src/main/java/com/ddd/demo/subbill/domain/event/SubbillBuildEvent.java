package com.ddd.demo.subbill.domain.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.ddd.demo.detail.domain.model.detail.DetailBatch;
import com.ddd.demo.subbill.domain.model.Subbill;
import com.ddd.demo.subbill.domain.service.SubbillFactory;

@Component
public class SubbillBuildEvent {

	@EventListener
	public Subbill buildSubbill(DetailBatch detailBatch) {
		return SubbillFactory.buildSubbill(detailBatch);
	}

}
