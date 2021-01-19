package com.designPattern.demo.calucate.pattern;

import com.designPattern.demo.calucate.domain.CalResult;

/**
 *
 * @ClassName: CalculateBuilder
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月19日 下午5:48:47
 * @Copyright:
 */
public abstract class CalculateBuilder {

	/**
	 * 生成计算结果
	 * 
	 * @return
	 */
	public CalResult buildCalResult() {
		CalResult result = new CalResult();
		this.calEstimateAcc(result);
		this.calEstimateResult(result);
		this.calQuarterAccural(result);
		this.calAnnualAccural(result);
		this.closeChain();
		this.save(result);
		return result;
	}

	/**
	 * 计算预估账单
	 * 
	 * @param result
	 */
	public abstract void calEstimateAcc(CalResult result);

	/**
	 * 计算预估结果
	 * 
	 * @param result
	 */
	public abstract void calEstimateResult(CalResult result);

	/**
	 * 计算年度分类利润
	 * 
	 * @param result
	 */
	public abstract void calAnnualAccural(CalResult result);

	/**
	 * 计算当季分类利润
	 * 
	 * @param result
	 */
	public abstract void calQuarterAccural(CalResult result);

	/**
	 * 历史结果关链
	 */
	public abstract void closeChain();

	/**
	 * 保存计算结果
	 * 
	 * @param result
	 */
	public abstract void save(CalResult result);

}
