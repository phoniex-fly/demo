package com.ddd.demo.detail.domain.repository;

import java.util.List;

import com.ddd.demo.detail.domain.model.detail.DetailBatch;

public interface IBatchRepository {
	boolean save(DetailBatch detailBatch);

	List<DetailBatch> findBatchs();

	boolean delete(DetailBatch detailBatch);
}
