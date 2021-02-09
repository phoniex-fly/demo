package com.ddd.demo.detail.domain.model.detail;

/**
 * 批次状态枚举类：值对象
 * 
 * @author HelloWorld
 *
 */
public enum BatchStatus {

	processing("00", "处理中"),

	actuary_check_fail("02", "校验一失败"),

	sics_check_fail("03", "校验二失败"),

	finished("04", "处理完成");

	private String code;

	private String description;

	BatchStatus(String code, String description) {
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
