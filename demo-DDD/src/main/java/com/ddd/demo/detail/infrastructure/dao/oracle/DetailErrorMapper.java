package com.ddd.demo.detail.infrastructure.dao.oracle;

import java.util.List;

import com.ddd.demo.detail.infrastructure.dao.entity.DetailErrorDO;

public interface DetailErrorMapper {

	int save(List<DetailErrorDO> detailErrorDO);

	List<DetailErrorDO> findErrors();

}
