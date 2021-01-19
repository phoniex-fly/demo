package com.designPattern.demo.attributes.pattern.decorator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.designPattern.demo.attributes.pattern.target.Target;

/**
 *
 * @ClassName: Decorator
 * @Description:TODO(装饰类)
 * @author: Shixiaoyan
 * @param <T>
 * @date: 2021年1月19日 上午10:41:26
 * @Copyright:
 */
@Component
public abstract class Decorator extends Target {

	@Autowired
	private Map<String, Target> targets = new HashMap<String, Target>();

	@Override
	public void findData(List<String> decoTypes, List<String> data) {
		if (decoTypes.size() > 0) {
			Target target = targets.get(decoTypes.get(0));
			target.findData(decoTypes.subList(1, decoTypes.size()), data);
			decorate(data);
		}
	}

	/**
	 * 装饰方法
	 * 
	 * @return
	 */
	public abstract void decorate(List<String> data);
}
