package com.ddd.demo.detail.domain.model.record;

import java.util.List;

/**
 * 上传记录：聚合根
 * 
 * @author HelloWorld
 *
 */
public class Record {

	// 记录id
	private Long recordId;
	// 记录编号
	private String recordNo;
	// 批次ID 暂不需要
	private List<String> detailBatchId;
	// 上传状态
	private RecordStatus status;
	// 操作人
	private String operator;
	// 文件路径
	private String path;

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

	public List<String> getDetailBatchId() {
		return detailBatchId;
	}

	public void setDetailBatchId(List<String> detailBatchId) {
		this.detailBatchId = detailBatchId;
	}

	public RecordStatus getStatus() {
		return status;
	}

	public void setStatus(RecordStatus status) {
		this.status = status;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
