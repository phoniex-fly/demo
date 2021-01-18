package com.designPattern.demo.detailUpload.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.designPattern.demo.detailUpload.domain.CheckItem;
import com.designPattern.demo.detailUpload.domain.DetailBatchDO;
import com.designPattern.demo.detailUpload.pattern.chain.ApproverChain;
import com.designPattern.demo.detailUpload.service.BatchService;

@Service
public class BatchServiceImpl implements BatchService {

	@Autowired
	private ApproverChain approverChain;

	/**
	 * 明细数据上传
	 */
	@Override
	public void uploadDetail() {
		// 读取excel数据
		this.readExcel();
		// 将数据分批
		List<DetailBatchDO> detailBatchDOs = createDetailBatch();
		// 准备校验参数
		CheckItem checkItem = this.checkItemPrepare();
		// 调用校验责任链进行校验
		approverChain.approveDetail(detailBatchDOs, checkItem);
		// 保存校验结果
		this.save(detailBatchDOs);
	}

	/**
	 * 读取excel数据
	 */
	public void readExcel() {

	}

	/**
	 * 将数据分批
	 * 
	 * @return
	 */
	public List<DetailBatchDO> createDetailBatch() {

		return new ArrayList<DetailBatchDO>();
	}

	/**
	 * 准备校验参数
	 */
	public CheckItem checkItemPrepare() {

		return new CheckItem();
	}

	/**
	 * 保存校验结果
	 * 
	 * @param detailBatchDOs
	 */
	public void save(List<DetailBatchDO> detailBatchDOs) {

	}

}
