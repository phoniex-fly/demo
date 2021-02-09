package com.ddd.demo.detail.infrastructure.pattern.strategy;

/**
 *
 * @ClassName: DetailStrategy
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月18日 下午3:47:31
 * @Copyright:
 */
public abstract class DetailStrategy<T, E> {

	public abstract T accquire(E e);

}
