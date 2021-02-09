package com.ddd.demo.detail.application;

import java.util.List;

import com.ddd.demo.detail.domain.model.detail.DetailBatch;
import com.ddd.demo.detail.domain.model.detail.DetailError;

public interface DetailBatchService {

	boolean createBatch();

	List<DetailBatch> queryBatchs();

	List<DetailError> queryErrors();

}
