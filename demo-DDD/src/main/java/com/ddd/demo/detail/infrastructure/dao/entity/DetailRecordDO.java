package com.ddd.demo.detail.infrastructure.dao.entity;

/**
 * 上传记录：聚合根
 * 
 * @author HelloWorld
 *
 */
public class DetailRecordDO {

	// 记录id
	private Long recordId;
	// 记录编号
	private String recordNo;
	// 上传状态
	private String status;
	// 操作人
	private String operator;

	public Long getRecordId() {
		return recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	public String getRecordNo() {
		return recordNo;
	}

	public void setRecordNo(String recordNo) {
		this.recordNo = recordNo;
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

}
