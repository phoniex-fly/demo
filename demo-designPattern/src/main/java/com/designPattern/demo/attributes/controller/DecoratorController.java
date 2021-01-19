package com.designPattern.demo.attributes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.designPattern.demo.attributes.service.DecoratorService;

/**
 * 
 * @ClassName: DecoratorController
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月19日 下午2:22:13
 * @Copyright:
 */
@Controller
@RequestMapping("/decorator")
public class DecoratorController {

	@Autowired
	private DecoratorService decoratorService;

	@GetMapping("/decorator")
	@ResponseBody
	public String decorator() {
		List<String> decoType = new ArrayList<String>();
		String src = "accural";
		decoType.add("evalAttr");
		decoType.add("reserve");
		return decoratorService.decorator(src, decoType).toString();
	}

}
