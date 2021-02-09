package com.ddd.demo.detail.infrastructure.dao.oracle;

import java.util.List;

import com.ddd.demo.detail.infrastructure.dao.entity.DetailRecordDO;

public interface DetailRecordMapper {

	int save(DetailRecordDO detailRecordDO);

	List<DetailRecordDO> findRecords();

	int delete(DetailRecordDO detailRecordDO);

}
