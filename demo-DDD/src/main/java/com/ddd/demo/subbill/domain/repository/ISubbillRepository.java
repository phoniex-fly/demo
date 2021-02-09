package com.ddd.demo.subbill.domain.repository;

import java.util.List;

import com.ddd.demo.subbill.domain.model.Subbill;

public interface ISubbillRepository {
	int save(Subbill subbill);

	List<Subbill> findSubbill();

	int delete(Subbill subbill);
}
