package com.ddd.demo.detail.application;

import java.util.List;

import com.ddd.demo.detail.domain.model.detail.DetailBatch;
import com.ddd.demo.detail.domain.model.detail.DetailError;

public class DetailBatchServiceImpl implements DetailBatchService {

	@Override
	public boolean createBatch() {
		return false;
	}

	@Override
	public List<DetailBatch> queryBatchs() {
		return null;
	}

	@Override
	public List<DetailError> queryErrors() {
		return null;
	}

}
