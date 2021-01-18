package com.designPattern.demo.detailUpload.domain;

import java.util.List;

/**
 *
 * @ClassName: SubbillDO
 * @Description:TODO(子账单)
 * @author: Shixiaoyan
 * @date: 2021年1月18日 下午3:14:08
 * @Copyright:
 */
public class SubbillDO {

	List<SubbillDetailDO> subbillDetailDOs;

	public List<SubbillDetailDO> getSubbillDetailDOs() {
		return subbillDetailDOs;
	}

	public void setSubbillDetailDOs(List<SubbillDetailDO> subbillDetailDOs) {
		this.subbillDetailDOs = subbillDetailDOs;
	}

}
