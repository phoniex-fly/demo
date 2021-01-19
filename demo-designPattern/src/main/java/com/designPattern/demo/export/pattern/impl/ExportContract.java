package com.designPattern.demo.export.pattern.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.designPattern.demo.export.pattern.ExportTemplet;

/**
 *
 * @ClassName: ExportContract
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月19日 上午9:53:36
 * @Copyright:
 */
@Component
public class ExportContract extends ExportTemplet {

	@Override
	protected Map<String, String> findData() {
		System.out.println("查找合同数据");
		return null;
	}

	@Override
	protected List<String> findTitle() {
		System.out.println("查找合同表头");
		return null;
	}

	@Override
	protected boolean uploadDoc() {
		return false;
	}

}
