package com.designPattern.demo.detailUpload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.designPattern.demo.detailUpload.service.BatchService;

/**
 * 
 * @ClassName: RecordController
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月18日 下午2:02:32
 * @Copyright:
 */
@Controller
@RequestMapping("record")
public class RecordController {

	@Autowired
	private BatchService batchService;

	public void upload() {
		batchService.uploadDetail();
	}

}
