package com.designPattern.demo.attributes.pattern.decorator;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 *
 * @ClassName: ReserveDecorator
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月19日 上午10:52:46
 * @Copyright:
 */
@Component("reserve")
public class ReserveDecorator extends Decorator {

	@Override
	public void decorate(List<String> data) {
		data.add("准备金");
	}

}
