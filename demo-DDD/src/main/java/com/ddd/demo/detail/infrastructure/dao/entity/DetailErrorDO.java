package com.ddd.demo.detail.infrastructure.dao.entity;

/**
 * 错误详情
 * 
 * @author HelloWorld
 *
 */
public class DetailErrorDO {
	//
	private Long errId;
	// 批次ID
	private Long batchId;
	// 错误类型
	private String errType;
	// 错误详情
	private String errs;

	public Long getErrId() {
		return errId;
	}

	public void setErrId(Long errId) {
		this.errId = errId;
	}

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public String getErrType() {
		return errType;
	}

	public void setErrType(String errType) {
		this.errType = errType;
	}

	public String getErrs() {
		return errs;
	}

	public void setErrs(String errs) {
		this.errs = errs;
	}

}
