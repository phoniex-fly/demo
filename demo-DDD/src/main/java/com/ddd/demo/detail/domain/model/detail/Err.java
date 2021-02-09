package com.ddd.demo.detail.domain.model.detail;

/**
 * 错误信息：值对象
 * 
 * @author HelloWorld
 *
 */
public class Err {

	private String line;

	private String msg;

	private Err(String line, String msg) {
		this.line = line;
		this.msg = msg;
	}

	public static Err build(String line, String msg) {
		return new Err(line, msg);
	}

	public static final String CONTRACT_ERR = "合同简称不正确";
	public static final String COMPANY_ERR = "公司简称不正确";
	public static final String AMOUNT_ERR = "金额不能为0";

}
