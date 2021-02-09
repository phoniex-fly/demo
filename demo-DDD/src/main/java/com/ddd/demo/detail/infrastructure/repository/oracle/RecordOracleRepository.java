package com.ddd.demo.detail.infrastructure.repository.oracle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ddd.demo.detail.domain.model.record.Record;
import com.ddd.demo.detail.domain.repository.IRecordRepository;
import com.ddd.demo.detail.infrastructure.dao.oracle.DetailRecordMapper;
import com.ddd.demo.detail.infrastructure.repository.translator.RecordTranslator;

@Component
public class RecordOracleRepository implements IRecordRepository {

	@Autowired
	private DetailRecordMapper detailRecordMapper;
	@Autowired
	private RecordTranslator detailRecordTranslator;

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
