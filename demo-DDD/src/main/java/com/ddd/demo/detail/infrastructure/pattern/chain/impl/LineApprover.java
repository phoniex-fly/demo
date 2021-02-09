package com.ddd.demo.detail.infrastructure.pattern.chain.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ddd.demo.detail.domain.model.detail.DetailBatch;
import com.ddd.demo.detail.domain.model.service.CheckItem;
import com.ddd.demo.detail.infrastructure.pattern.chain.DetailApprover;

/**
 * @ClassName: LineApprover
 * @Description:TODO(单行业务规则校验)
 * @author: Shixiaoyan
 * @date: 2021年1月18日 下午2:30:46
 * @Copyright:
 */
@Component
public class LineApprover extends DetailApprover {

	@Autowired
	private BatchApprover batchApprover;

	@Override
	public void detailApprove(List<DetailBatch> detailBatchs, CheckItem checkItem) {
		// 单行业务规则校验
		for (DetailBatch detailBatch : detailBatchs) {
			this.check(detailBatch, checkItem);
		}
		// 进行下一个校验
		batchApprover.detailApprove(detailBatchs, checkItem);
	}

	/**
	 * 单行业务规则校验
	 * 
	 * @param detailBatchDO
	 * @param checkItem
	 */
	private void check(DetailBatch detailBatch, CheckItem checkItem) {

	}
}
