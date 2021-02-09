package com.ddd.demo.subbill.domain.service;

import com.ddd.demo.detail.domain.model.detail.DetailBatch;
import com.ddd.demo.subbill.domain.model.Subbill;

public class SubbillFactory {

	public static Subbill buildSubbill(DetailBatch detailBatch) {
		return new Subbill();
	}
}
