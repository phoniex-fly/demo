package com.designPattern.demo.detailUpload.pattern.chain.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.designPattern.demo.detailUpload.domain.CheckItem;
import com.designPattern.demo.detailUpload.domain.DetailBatchDO;
import com.designPattern.demo.detailUpload.pattern.chain.DetailApprover;

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
	public void detailApprove(List<DetailBatchDO> detailBatchDOs, CheckItem checkItem) {
		// 单行业务规则校验
		for (DetailBatchDO detailBatchDO : detailBatchDOs) {
			this.check(detailBatchDO, checkItem);
		}
		// 进行下一个校验
		batchApprover.detailApprove(detailBatchDOs, checkItem);
	}

	/**
	 * 单行业务规则校验
	 * 
	 * @param detailBatchDO
	 * @param checkItem
	 */
	private void check(DetailBatchDO detailBatchDO, CheckItem checkItem) {

	}
}
