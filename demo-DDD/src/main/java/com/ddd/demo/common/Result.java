package com.ddd.demo.common;

/**
 * 返回结果封装类
 *
 * @param <T>
 */
public class Result<T> {
	public boolean res;

	public int code;

	public T msg;

	private Result(boolean res, int code, T msg) {
		super();
		this.res = res;
		this.code = code;
		this.msg = msg;
	}

	public static <T> Result<T> newOne(boolean res, int code, T msg) {
		return new Result<T>(res, code, msg);
	}

}
