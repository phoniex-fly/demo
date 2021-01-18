package com.designPattern.demo.detailUpload.pattern.chain.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.designPattern.demo.detailUpload.domain.CheckItem;
import com.designPattern.demo.detailUpload.domain.DetailBatchDO;
import com.designPattern.demo.detailUpload.pattern.chain.DetailApprover;

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
	public void detailApprove(List<DetailBatchDO> detailBatchDOs, CheckItem checkItem) {
		// 整批业务规则校验
		for (DetailBatchDO detailBatchDO : detailBatchDOs) {
			this.check(detailBatchDO, checkItem);
		}
		// 进行下一个校验
		sicsApprover.detailApprove(detailBatchDOs, checkItem);

	}

	/**
	 * 整批业务规则校验
	 * 
	 * @param detailBatchDO
	 * @param checkItem
	 */
	private void check(DetailBatchDO detailBatchDO, CheckItem checkItem) {

	}

}
