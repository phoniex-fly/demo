package com.ddd.demo.detail.infrastructure.repository.translator;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.ddd.demo.detail.domain.model.record.Record;
import com.ddd.demo.detail.infrastructure.dao.entity.DetailRecordDO;

@Component
public class RecordTranslator {

	public DetailRecordDO TranslateToEntity(Record record) {
		DetailRecordDO enyity = new DetailRecordDO();
		BeanUtils.copyProperties(record, enyity);
		enyity.setStatus(record.getStatus().getCode());
		return enyity;
	}

	public Record TranslateFromEntity(DetailRecordDO enyity) {
		Record record = new Record();
		BeanUtils.copyProperties(enyity, record);
		// record.setStatus();
		return record;
	}

}
