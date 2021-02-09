package com.ddd.demo.detail.infrastructure.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ddd.demo.detail.domain.model.detail.DetailBatch;
import com.ddd.demo.detail.domain.repository.IBatchRepository;
import com.ddd.demo.detail.infrastructure.repository.oracle.BatchOracleRepository;
import com.ddd.demo.detail.infrastructure.repository.redis.BatchRedisRepository;

@Component
public class BatchRepository implements IBatchRepository {

	@Autowired
	private BatchRedisRepository batchRedisRepository;
	@Autowired
	private BatchOracleRepository batchOracleRepository;

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
