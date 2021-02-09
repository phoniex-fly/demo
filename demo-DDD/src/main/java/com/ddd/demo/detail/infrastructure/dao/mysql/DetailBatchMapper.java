package com.ddd.demo.detail.infrastructure.dao.mysql;

import java.util.List;

import com.ddd.demo.detail.infrastructure.dao.entity.DetailBatchDO;

public interface DetailBatchMapper {
	int save(DetailBatchDO detailBatchDO);

	List<DetailBatchDO> findBatchs();

	int delete(DetailBatchDO detailBatchDO);
}
