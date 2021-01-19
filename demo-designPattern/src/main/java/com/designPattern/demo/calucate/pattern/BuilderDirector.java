package com.designPattern.demo.calucate.pattern;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.designPattern.demo.calucate.domain.CalResult;

/**
 *
 * @ClassName: BuilderDirector
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月19日 下午6:27:43
 * @Copyright:
 */
@Component
public class BuilderDirector {

	@Autowired
	private Map<String, CalculateBuilder> builders = new HashMap<String, CalculateBuilder>();

	public CalResult calculate(String type) {
		return builders.get(type).buildCalResult();
	};

}
