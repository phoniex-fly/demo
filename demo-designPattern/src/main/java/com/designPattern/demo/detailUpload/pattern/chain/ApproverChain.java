package com.designPattern.demo.detailUpload.pattern.chain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.designPattern.demo.detailUpload.domain.CheckItem;
import com.designPattern.demo.detailUpload.domain.DetailBatchDO;
import com.designPattern.demo.detailUpload.pattern.chain.impl.BatchApprover;
import com.designPattern.demo.detailUpload.pattern.chain.impl.FormatApprover;
import com.designPattern.demo.detailUpload.pattern.chain.impl.LineApprover;
import com.designPattern.demo.detailUpload.pattern.chain.impl.SICSApprover;

/**
 *
 * @ClassName: ApproverChain
 * @Description:TODO(责任链调用入口,两种调用方式)
 * @author: Shixiaoyan
 * @date: 2021年1月18日 下午2:35:00
 * @Copyright:
 */
@Component
public final class ApproverChain {
	/**
	 * 对象创建未交给spring托管
	 */
	public static final DetailApprover initChain() {
		FormatApprover formatApprover = new FormatApprover();
		LineApprover lineApprover = new LineApprover();
		BatchApprover batchApprover = new BatchApprover();
		SICSApprover sicsApprover = new SICSApprover();

		formatApprover.setNextApprover(lineApprover);
		lineApprover.setNextApprover(batchApprover);
		batchApprover.setNextApprover(sicsApprover);
		return formatApprover;
	}

	public static void approveDetails(List<DetailBatchDO> detailBatchDOs, CheckItem checkItem) {
		DetailApprover initChain = initChain();
		initChain.detailApprove(detailBatchDOs, checkItem);
	}

	/**
	 * 对象创建交给spring托管
	 */
	@Autowired
	private FormatApprover formatApprover;

	public void approveDetail(List<DetailBatchDO> detailBatchDOs, CheckItem checkItem) {
		formatApprover.detailApprove(detailBatchDOs, checkItem);
	}

}
