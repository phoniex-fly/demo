package com.ddd.demo.detail.domain.model.detail;

import java.util.List;

/**
 * 上传批次：聚合根
 * 
 * @author HelloWorld
 *
 */
public class DetailBatch {

	// 批次ID
	private Long batchId;
	// 批次编码
	private String batchNo;
	// 记录id
	private Long recordId;
	// 批次状态
	private BatchStatus status;
	// 分入转分
	private String levelOfBus;
	// 操作人
	private String operator;

	private List<DetailData> detailDatas;

	private List<DetailError> DetailErrors;

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

	public BatchStatus getStatus() {
		return status;
	}

	public void setStatus(BatchStatus status) {
		this.status = status;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public List<DetailData> getDetailDatas() {
		return detailDatas;
	}

	public void setDetailDatas(List<DetailData> detailDatas) {
		this.detailDatas = detailDatas;
	}

	public List<DetailError> getDetailErrors() {
		return DetailErrors;
	}

	public void setDetailErrors(List<DetailError> detailErrors) {
		DetailErrors = detailErrors;
	}

	public String getLevelOfBus() {
		return levelOfBus;
	}

	public void setLevelOfBus(String levelOfBus) {
		this.levelOfBus = levelOfBus;
	}
}
