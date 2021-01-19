package com.designPattern.demo.attributes.pattern.target;

import java.util.List;

/**
 *
 * @ClassName: Target
 * @Description:TODO(待装饰目标类)
 * @author: Shixiaoyan
 * @date: 2021年1月19日 上午10:26:21
 * @Copyright:
 */
public abstract class Target {

	/**
	 * 查找数据
	 * 
	 * @return
	 */
	public abstract void findData(List<String> type, List<String> data);

}
