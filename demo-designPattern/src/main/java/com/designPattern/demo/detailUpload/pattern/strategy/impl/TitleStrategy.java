package com.designPattern.demo.detailUpload.pattern.strategy.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.designPattern.demo.detailUpload.pattern.strategy.DetailStrategy;

/**
 *
 * @ClassName: TitleStrategy
 * @Description:TODO(表头策略)
 * @author: Shixiaoyan
 * @date: 2021年1月18日 下午3:57:53
 * @Copyright:
 */
public class TitleStrategy {

	private static final Map<String, DetailStrategy> TITLE = new HashMap<String, DetailStrategy>(2);

	static {
		TITLE.put("分入", new StrategyIn());
		TITLE.put("转分", new StrategyOut());
	}

	public static List<String> getTitle(String type) {
		return (List<String>) TITLE.get(type).accquire("");
	}

	private static class StrategyIn extends DetailStrategy<List<String>, String> {

		@Override
		public List<String> accquire(String e) {
			return Arrays.asList("合同编号", "产品编号", "公司编号");
		}

	}

	private static class StrategyOut extends DetailStrategy<List<String>, String> {

		@Override
		public List<String> accquire(String e) {
			return Arrays.asList("合同名称", "产品名称", "公司名称");
		}

	}

}
