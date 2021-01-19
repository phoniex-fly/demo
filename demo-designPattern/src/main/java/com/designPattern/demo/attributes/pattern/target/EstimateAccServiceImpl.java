package com.designPattern.demo.attributes.pattern.target;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 *
 * @ClassName: EstimateAccServiceImpl
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月19日 上午10:37:36
 * @Copyright:
 */
@Component("estimateAcc")
public class EstimateAccServiceImpl extends Target {

	@Override
	public void findData(List<String> type, List<String> data) {
		data.add("预估账单");
	}

}
