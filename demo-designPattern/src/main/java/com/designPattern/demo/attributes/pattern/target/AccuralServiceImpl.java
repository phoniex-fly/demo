package com.designPattern.demo.attributes.pattern.target;

import java.util.List;

import org.springframework.stereotype.Component;

/**
 *
 * @ClassName: AccuralServiceImpl
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月19日 上午10:38:24
 * @Copyright:
 */
@Component("accural")
public class AccuralServiceImpl extends Target {

	@Override
	public void findData(List<String> type, List<String> data) {
		data.add("年度分类利润");
	}

}
