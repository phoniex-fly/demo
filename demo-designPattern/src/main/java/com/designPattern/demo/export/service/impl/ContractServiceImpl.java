package com.designPattern.demo.export.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.designPattern.demo.export.pattern.impl.ExportContract;
import com.designPattern.demo.export.service.ContractService;

/**
 *
 * @ClassName: ContractServiceImpl
 * @Description:TODO(描述这个类的作用)
 * @author: Shixiaoyan
 * @date: 2021年1月19日 上午9:56:39
 * @Copyright:
 */
@Service
public class ContractServiceImpl implements ContractService {

	@Autowired
	private ExportContract exportContract;

	/**
	 * 合同导出
	 */
	@Override
	public void exportContract() {
		exportContract.export();
	}

}
