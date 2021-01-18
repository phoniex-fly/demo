package com.designPattern.demo.detailUpload.feign;

import org.springframework.stereotype.Component;

/**
 *
 * @ClassName: ISICSfeign
 * @Description:TODO(feign接口，此处简化为普通方法)
 * @author: Shixiaoyan
 * @date: 2021年1月18日 下午2:54:13
 * @Copyright:
 */
@Component
public class ISICSfeign {

	public String SICSCheck(String SICSJson) {
		return "OK";
	}
}
