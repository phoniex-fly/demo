package com.designPattern.demo.detailUpload.pattern.chain;

import java.util.List;

import com.designPattern.demo.detailUpload.domain.CheckItem;
import com.designPattern.demo.detailUpload.domain.DetailBatchDO;

/**
 * 
 * @ClassName: DetailApprover
 * @Description:TODO(责任链抽象父类)
 * @author: Shixiaoyan
 * @date: 2021年1月18日 下午2:26:22
 * @Copyright:
 */
public abstract class DetailApprover {

	/**
	 * 指定下一个处理者：可通过spring管理
	 */
	private DetailApprover nextApprover;

	public DetailApprover getNextApprover() {
		return nextApprover;
	}

	public void setNextApprover(DetailApprover nextApprover) {
		this.nextApprover = nextApprover;
	}

	/**
	 * 处理请求
	 * 
	 * @param detailBatchDOs
	 */
	public abstract void detailApprove(List<DetailBatchDO> detailBatchDOs, CheckItem checkItem);

}
