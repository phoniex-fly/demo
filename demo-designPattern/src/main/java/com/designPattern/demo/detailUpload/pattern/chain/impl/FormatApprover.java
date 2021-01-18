package com.designPattern.demo.detailUpload.pattern.chain.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.designPattern.demo.detailUpload.domain.CheckItem;
import com.designPattern.demo.detailUpload.domain.DetailBatchDO;
import com.designPattern.demo.detailUpload.pattern.chain.DetailApprover;

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
	public void detailApprove(List<DetailBatchDO> detailBatchDOs, CheckItem checkItem) {
		// 基本格式校验
		for (DetailBatchDO detailBatchDO : detailBatchDOs) {
			this.check(detailBatchDO, checkItem);
		}
		// 进行下一个校验
		lineApprover.detailApprove(detailBatchDOs, checkItem);
	}

	/**
	 * 单行格式校验
	 * 
	 * @param detailBatchDO
	 * @param checkItem
	 */
	private void check(DetailBatchDO detailBatchDO, CheckItem checkItem) {

	}

}
