package com.designPattern.demo.calucate.domain;

import java.util.List;

/**
 *
 * @ClassName: CalResult
 * @Description:TODO(计算结果)
 * @author: Shixiaoyan
 * @date: 2021年1月19日 下午5:43:28
 * @Copyright:
 */
public class CalResult {

	private List<EstimateAccDO> estimateAcc;

	private List<EstimateResultDO> estimateResult;

	private List<AnnualAccuralDO> annualAccural;

	private List<QuarterAccuralDO> quarterAccural;

	public List<EstimateAccDO> getEstimateAcc() {
		return estimateAcc;
	}

	public void setEstimateAcc(List<EstimateAccDO> estimateAcc) {
		this.estimateAcc = estimateAcc;
	}

	public List<EstimateResultDO> getEstimateResult() {
		return estimateResult;
	}

	public void setEstimateResult(List<EstimateResultDO> estimateResult) {
		this.estimateResult = estimateResult;
	}

	public List<AnnualAccuralDO> getAnnualAccural() {
		return annualAccural;
	}

	public void setAnnualAccural(List<AnnualAccuralDO> annualAccural) {
		this.annualAccural = annualAccural;
	}

	public List<QuarterAccuralDO> getQuarterAccural() {
		return quarterAccural;
	}

	public void setQuarterAccural(List<QuarterAccuralDO> quarterAccural) {
		this.quarterAccural = quarterAccural;
	}

}
