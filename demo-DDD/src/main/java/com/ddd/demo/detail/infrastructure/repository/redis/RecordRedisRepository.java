package com.ddd.demo.detail.infrastructure.repository.redis;

import java.util.List;

import org.springframework.stereotype.Component;

import com.ddd.demo.detail.domain.model.record.Record;
import com.ddd.demo.detail.domain.repository.IRecordRepository;

@Component
public class RecordRedisRepository implements IRecordRepository {

	@Override
	public boolean save(Record record) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Record> findRecords() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Record record) {
		// TODO Auto-generated method stub
		return false;
	}

}
