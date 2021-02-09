package com.ddd.demo.detail.infrastructure.pattern.chain.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ddd.demo.detail.domain.model.detail.DetailBatch;
import com.ddd.demo.detail.domain.model.service.CheckItem;
import com.ddd.demo.detail.infrastructure.pattern.chain.DetailApprover;

/**
 * 
 * @ClassName: FormatApprover
 * @Description:TODO(基本格式校验)
 * @author: Shixiaoyan
 * @date: 2021年1月18日 下午2:30:29
 * @Copyright:
 */
@Component
public class FormatApprover extends DetailApprover {

	@Autowired
	private LineApprover lineApprover;

	@Override
	public void detailApprove(List<DetailBatch> detailBatchs, CheckItem checkItem) {
		// 基本格式校验
		for (DetailBatch detailBatch : detailBatchs) {
			this.check(detailBatch, checkItem);
		}
		// 进行下一个校验
		lineApprover.detailApprove(detailBatchs, checkItem);
	}

	/**
	 * 单行格式校验
	 * 
	 * @param detailBatchDO
	 * @param checkItem
	 */
	private void check(DetailBatch detailBatch, CheckItem checkItem) {

	}

}
