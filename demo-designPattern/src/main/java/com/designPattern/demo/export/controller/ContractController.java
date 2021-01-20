package com.designPattern.demo.export.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.designPattern.demo.export.service.ContractService;

/**
 * 
 * @ClassName: ContractController
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月19日 上午10:24:00
 * @Copyright:
 */
@Controller
@RequestMapping("/contract")
public class ContractController {

	@Autowired
	private ContractService contractService;

	@GetMapping("/export")
	@ResponseBody
	public void export() {
		contractService.exportContract();
	}

}
