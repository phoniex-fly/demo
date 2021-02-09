package com.ddd.demo.detail.infrastructure.pattern.chain.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ddd.demo.detail.domain.model.detail.DetailBatch;
import com.ddd.demo.detail.domain.model.service.CheckItem;
import com.ddd.demo.detail.infrastructure.pattern.chain.DetailApprover;

/**
 *
 * @ClassName: BatchApprover
 * @Description:TODO(整批业务规则校验)
 * @author: Shixiaoyan
 * @date: 2021年1月18日 下午2:31:51
 * @Copyright:
 */
@Component
public class BatchApprover extends DetailApprover {

	@Autowired
	private SICSApprover sicsApprover;

	@Override
	public void detailApprove(List<DetailBatch> detailBatchs, CheckItem checkItem) {
		// 整批业务规则校验
		for (DetailBatch detailBatch : detailBatchs) {
			this.check(detailBatch, checkItem);
		}
		// 进行下一个校验
		sicsApprover.detailApprove(detailBatchs, checkItem);

	}

	/**
	 * 整批业务规则校验
	 * 
	 * @param detailBatchDO
	 * @param checkItem
	 */
	private void check(DetailBatch detailBatch, CheckItem checkItem) {

	}

}
