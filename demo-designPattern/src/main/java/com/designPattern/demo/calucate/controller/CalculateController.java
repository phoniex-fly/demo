package com.designPattern.demo.calucate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.designPattern.demo.calucate.pattern.BuilderDirector;

/**
 * 
 * @ClassName: CalculateController
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月19日 下午6:32:05
 * @Copyright:
 */
@Controller
@RequestMapping("/calculate")
public class CalculateController {

	@Autowired
	private BuilderDirector builderDirector;

	@GetMapping("/calculate")
	public void calculate(String type) {
		builderDirector.calculate(type);
	}

}
