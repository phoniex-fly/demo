package com.ddd.demo.detail.domain.model.detail;

/**
 * 错误类型枚举类：值对象
 * 
 * @author HelloWorld
 *
 */
public enum ErrType {

	actuary_check("00", "校验一"),

	sics_check("01", "校验二");

	private String code;

	private String description;

	ErrType(String code, String description) {
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
