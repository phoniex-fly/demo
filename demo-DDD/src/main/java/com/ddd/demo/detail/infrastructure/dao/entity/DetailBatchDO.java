package com.ddd.demo.detail.infrastructure.dao.entity;

import java.util.List;

/**
 * 上传批次：聚合根
 * 
 * @author HelloWorld
 *
 */
public class DetailBatchDO {

	// 批次ID
	private Long batchId;
	// 批次编码
	private String batchNo;
	// 记录id
	private Long recordId;
	// 批次状态
	private String status;
	// 操作人
	private String operator;

	private List<DetailDataDO> detailDataDOs;

	private List<DetailErrorDO> DetailErrorDOs;

	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public Long getRecordId() {
		return recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public List<DetailDataDO> getDetailDataDOs() {
		return detailDataDOs;
	}

	public void setDetailDataDOs(List<DetailDataDO> detailDataDOs) {
		this.detailDataDOs = detailDataDOs;
	}

	public List<DetailErrorDO> getDetailErrorDOs() {
		return DetailErrorDOs;
	}

	public void setDetailErrorDOs(List<DetailErrorDO> detailErrorDOs) {
		DetailErrorDOs = detailErrorDOs;
	}

}
