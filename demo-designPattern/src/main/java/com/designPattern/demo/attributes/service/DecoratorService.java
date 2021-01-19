package com.designPattern.demo.attributes.service;

import java.util.List;

/**
 *
 * @ClassName: DecoratorController
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月19日 下午2:23:34
 * @Copyright:
 */
public interface DecoratorService {

	public List<String> decorator(String src, List<String> decoType);

}
