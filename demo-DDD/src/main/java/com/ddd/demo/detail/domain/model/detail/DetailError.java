package com.ddd.demo.detail.domain.model.detail;

import java.util.List;

/**
 * 错误详情
 * 
 * @author HelloWorld
 *
 */
public class DetailError {
	//
	private Long errId;
	// 批次ID
	private Long batchId;
	// 错误类型
	private ErrType errType;
	// 错误详情
	private List<Err> errs;

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

	public ErrType getErrType() {
		return errType;
	}

	public void setErrType(ErrType errType) {
		this.errType = errType;
	}

	public List<Err> getErrs() {
		return errs;
	}

	public void setErrs(List<Err> errs) {
		this.errs = errs;
	}

}
