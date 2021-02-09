package com.ddd.demo.detail.infrastructure.dao.entity;

import java.math.BigDecimal;

/**
 * 明细数据
 * 
 * @author HelloWorld
 *
 */
public class DetailDataDO {
	//
	private Long id;
	// 批次ID
	private Long batchId;
	// 公司编号
	private String companyNo;
	// 合同编号
	private String contractNo;
	// 金额1
	private BigDecimal amount1;
	// 金额2
	private BigDecimal amount2;
	// 金额3
	private BigDecimal amount3;
	// 金额4
	private BigDecimal amount4;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
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

	public BigDecimal getAmount1() {
		return amount1;
	}

	public void setAmount1(BigDecimal amount1) {
		this.amount1 = amount1;
	}

	public BigDecimal getAmount2() {
		return amount2;
	}

	public void setAmount2(BigDecimal amount2) {
		this.amount2 = amount2;
	}

	public BigDecimal getAmount3() {
		return amount3;
	}

	public void setAmount3(BigDecimal amount3) {
		this.amount3 = amount3;
	}

	public BigDecimal getAmount4() {
		return amount4;
	}

	public void setAmount4(BigDecimal amount4) {
		this.amount4 = amount4;
	}

}
