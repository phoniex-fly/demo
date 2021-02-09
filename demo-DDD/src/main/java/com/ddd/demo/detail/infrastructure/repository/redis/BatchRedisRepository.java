package com.ddd.demo.detail.infrastructure.repository.redis;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ddd.demo.detail.domain.model.detail.DetailBatch;
import com.ddd.demo.detail.domain.repository.IBatchRepository;

@Component
public class BatchRedisRepository implements IBatchRepository {

	@Override
	public boolean save(DetailBatch detailBatch) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<DetailBatch> findBatchs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(DetailBatch detailBatch) {
		// TODO Auto-generated method stub
		return false;
	}

}
