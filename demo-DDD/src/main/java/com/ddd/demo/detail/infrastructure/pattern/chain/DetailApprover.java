package com.ddd.demo.detail.infrastructure.pattern.chain;

import java.util.List;

import com.ddd.demo.detail.domain.model.detail.DetailBatch;
import com.ddd.demo.detail.domain.model.service.CheckItem;

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
	public abstract void detailApprove(List<DetailBatch> detailBatchs, CheckItem checkItem);

}
