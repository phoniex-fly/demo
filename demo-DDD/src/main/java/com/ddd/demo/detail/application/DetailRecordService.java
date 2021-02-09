package com.ddd.demo.detail.application;

import java.util.List;

import com.ddd.demo.detail.domain.model.record.Record;

public interface DetailRecordService {

	boolean createRecord();

	List<Record> queryRecords();

}
