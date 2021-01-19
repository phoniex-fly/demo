package com.designPattern.demo.attributes.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.designPattern.demo.attributes.pattern.target.Target;
import com.designPattern.demo.attributes.service.DecoratorService;

/**
 *
 * @ClassName: DecoratorServiceImpl
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月19日 下午2:24:14
 * @Copyright:
 */
@Service
public class DecoratorServiceImpl implements DecoratorService {

	@Autowired
	private Map<String, Target> targets = new HashMap<String, Target>();

	@Override
	public List<String> decorator(String src, List<String> decoType) {
		decoType.add(src);
		List<String> data = new ArrayList<String>();
		Target target = targets.get(decoType.get(0));
		target.findData(decoType.subList(1, decoType.size()), data);
		return data;
	}

}
