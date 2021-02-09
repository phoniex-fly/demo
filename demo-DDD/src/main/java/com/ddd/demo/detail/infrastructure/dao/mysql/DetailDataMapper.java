package com.ddd.demo.detail.infrastructure.dao.mysql;

import java.util.List;

import com.ddd.demo.detail.infrastructure.dao.entity.DetailDataDO;

public interface DetailDataMapper {

	int save(List<DetailDataDO> detaildataDO);

	List<DetailDataDO> findDatas();

	int delete(DetailDataDO detaildataDO);

}
