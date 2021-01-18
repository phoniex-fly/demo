package com.designPattern.demo.detailUpload.domain;

import java.math.BigDecimal;
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

	String levelOfBus;// 分入转分

	BigDecimal balance;// 余额

	List<SubbillDetailDO> subbillDetailDOs;

	public String getLevelOfBus() {
		return levelOfBus;
	}

	public void setLevelOfBus(String levelOfBus) {
		this.levelOfBus = levelOfBus;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public List<SubbillDetailDO> getSubbillDetailDOs() {
		return subbillDetailDOs;
	}

	public void setSubbillDetailDOs(List<SubbillDetailDO> subbillDetailDOs) {
		this.subbillDetailDOs = subbillDetailDOs;
	}

}
