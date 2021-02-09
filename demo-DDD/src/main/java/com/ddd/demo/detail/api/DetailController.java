package com.ddd.demo.detail.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ddd.demo.common.Result;
import com.ddd.demo.detail.application.DetailBatchService;
import com.ddd.demo.detail.application.DetailRecordService;
import com.ddd.demo.detail.domain.model.detail.DetailBatch;
import com.ddd.demo.detail.domain.model.detail.DetailError;
import com.ddd.demo.detail.domain.model.record.Record;

/**
 * 明细数据相关操作
 * 
 * @author HelloWorld
 *
 */
@Controller
public class DetailController {

	@Autowired
	private DetailRecordService detailRecordService;
	@Autowired
	private DetailBatchService detailBatchService;

	/**
	 * 明细数据上传：入参略
	 * 
	 * @return
	 */
	public Result<String> upload() {
		if (detailRecordService.createRecord()) {
			return Result.newOne(true, 500, "处理成功");
		}
		return Result.newOne(false, 501, "处理异常，请联系管理员");
	}

	/**
	 * 上传记录查询：入参略
	 * 
	 * @return
	 */
	public Result<List<Record>> queryRecords() {
		List<Record> results = detailRecordService.queryRecords();
		return Result.newOne(false, 501, results);
	}

	/**
	 * 上传批次查询：入参略
	 * 
	 * @return
	 */
	public Result<List<DetailBatch>> queryBatchs() {
		List<DetailBatch> results = detailBatchService.queryBatchs();
		return Result.newOne(false, 501, results);
	}

	/**
	 * 批次错误详情查询：入参略
	 * 
	 * @return
	 */
	public Result<List<DetailError>> queryErrors() {
		List<DetailError> results = detailBatchService.queryErrors();
		return Result.newOne(false, 501, results);
	}

}
