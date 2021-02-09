package com.ddd.demo.subbill.domain.model;

import java.util.List;

/**
 * 子账单
 * 
 * @author HelloWorld
 *
 */
public class Subbill {

	private Long subbillId;
	// 子账单编号
	private String subbillNo;
	// 批次ID
	private Long batchId;
	// 分入转分
	private String levelOfBus;
	// 操作人
	private String operator;

	private List<SubbillDetail> SubbillDetails;

	public Long getSubbillId() {
		return subbillId;
	}

	public void setSubbillId(Long subbillId) {
		this.subbillId = subbillId;
	}

	public String getSubbillNo() {
		return subbillNo;
	}

	public void setSubbillNo(String subbillNo) {
		this.subbillNo = subbillNo;
	}

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public List<SubbillDetail> getSubbillDetails() {
		return SubbillDetails;
	}

	public void setSubbillDetails(List<SubbillDetail> subbillDetails) {
		SubbillDetails = subbillDetails;
	}

	public String getLevelOfBus() {
		return levelOfBus;
	}

	public void setLevelOfBus(String levelOfBus) {
		this.levelOfBus = levelOfBus;
	}
}
