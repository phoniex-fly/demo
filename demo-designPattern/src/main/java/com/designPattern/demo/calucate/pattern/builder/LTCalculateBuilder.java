package com.designPattern.demo.calucate.pattern.builder;

import org.springframework.stereotype.Component;

import com.designPattern.demo.calucate.domain.CalResult;
import com.designPattern.demo.calucate.pattern.CalculateBuilder;

/**
 *
 * @ClassName: LTCalculateBuilder
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月19日 下午5:48:12
 * @Copyright:
 */
@Component
public class LTCalculateBuilder extends CalculateBuilder {

	@Override
	public void calEstimateAcc(CalResult result) {
	}

	@Override
	public void calEstimateResult(CalResult result) {
	}

	@Override
	public void calAnnualAccural(CalResult result) {
	}

	@Override
	public void calQuarterAccural(CalResult result) {
	}

	@Override
	public void closeChain() {
	}

	@Override
	public void save(CalResult result) {
	}

}
