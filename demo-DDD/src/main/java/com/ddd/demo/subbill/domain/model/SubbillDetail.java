package com.ddd.demo.subbill.domain.model;

import java.math.BigDecimal;

/**
 * 子账单明细
 * 
 * @author HelloWorld
 *
 */
public class SubbillDetail {
	//
	private Long id;

	private Long subbillId;
	// 公司编号
	private String companyNo;
	// 合同编号
	private String contractNo;
	// 分入转分
	private String levelOfBus;
	// 总金额
	private BigDecimal totalAmount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSubbillId() {
		return subbillId;
	}

	public void setSubbillId(Long subbillId) {
		this.subbillId = subbillId;
	}

	public String getCompanyNo() {
		return companyNo;
	}

	public void setCompanyNo(String companyNo) {
		this.companyNo = companyNo;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getLevelOfBus() {
		return levelOfBus;
	}

	public void setLevelOfBus(String levelOfBus) {
		this.levelOfBus = levelOfBus;
	}

}
