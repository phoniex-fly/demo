package com.ddd.demo.detail.domain.model.record;

/**
 * 上传状态枚举类：值对象
 * 
 * @author HelloWorld
 *
 */
public enum RecordStatus {

	processing("00", "处理中"),

	finished("01", "处理完成");

	private String code;

	private String description;

	RecordStatus(String code, String description) {
		this.code = code;
		this.description = description;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

}
