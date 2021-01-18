package com.designPattern.demo.detailUpload.pattern.strategy.impl;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.designPattern.demo.detailUpload.domain.SubbillDO;
import com.designPattern.demo.detailUpload.pattern.strategy.DetailStrategy;

/**
 *
 * @ClassName: BalanceStrategy
 * @Description:TODO(余额计算策略)
 * @author: Shixiaoyan
 * @date: 2021年1月18日 下午4:07:07
 * @Copyright:
 */
public class BalanceStrategy {

	private static final Map<String, DetailStrategy> BALANCE = new HashMap<String, DetailStrategy>(2);

	static {
		BALANCE.put("分入", new StrategyIn());
		BALANCE.put("转分", new StrategyOut());
	}

	public static BigDecimal getBalance(SubbillDO e) {
		return (BigDecimal) BALANCE.get(e.getLevelOfBus()).accquire(e);
	}

	private static class StrategyIn extends DetailStrategy<BigDecimal, SubbillDO> {

		@Override
		public BigDecimal accquire(SubbillDO e) {
			return new BigDecimal("1000");
		}

	}

	private static class StrategyOut extends DetailStrategy<BigDecimal, SubbillDO> {

		@Override
		public BigDecimal accquire(SubbillDO e) {
			return new BigDecimal("2000");
		}

	}

}

class Test {
	public static void main(String[] args) {
		SubbillDO subbillDO = new SubbillDO();
		subbillDO.setLevelOfBus("分入");
		BigDecimal balance = BalanceStrategy.getBalance(subbillDO);
		System.out.println(balance);
	}
}