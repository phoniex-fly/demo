package com.designPattern.demo.attributes.pattern.decorator;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 *
 * @ClassName: AttributeDecorator
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月19日 上午10:50:05
 * @Copyright:
 */
@Component("evalAttr")
public class EvalAttrDecorator extends Decorator {

	@Override
	public void decorate(List<String> data) {
		data.add("评估属性");
	}

}
