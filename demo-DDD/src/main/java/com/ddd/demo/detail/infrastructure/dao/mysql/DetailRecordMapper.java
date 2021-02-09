package com.ddd.demo.detail.infrastructure.dao.mysql;

import java.util.List;

import com.ddd.demo.detail.infrastructure.dao.entity.DetailRecordDO;

public interface DetailRecordMapper {

	int save(DetailRecordDO detailRecordDO);

	List<DetailRecordDO> findRecords();

	int delete(DetailRecordDO detailRecordDO);

}
