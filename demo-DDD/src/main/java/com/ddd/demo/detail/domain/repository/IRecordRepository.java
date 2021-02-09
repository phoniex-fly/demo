package com.ddd.demo.detail.domain.repository;

import java.util.List;

import com.ddd.demo.detail.domain.model.record.Record;

public interface IRecordRepository {

	boolean save(Record record);

	List<Record> findRecords();

	boolean delete(Record record);

}
