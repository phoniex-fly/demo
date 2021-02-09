package com.ddd.demo.detail.infrastructure.pattern.chain.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ddd.demo.detail.domain.model.detail.DetailBatch;
import com.ddd.demo.detail.domain.model.service.CheckItem;
import com.ddd.demo.detail.infrastructure.pattern.chain.DetailApprover;
import com.ddd.demo.subbill.domain.model.Subbill;
import com.ddd.demo.subbill.domain.service.SubbillFactory;

/**
 *
 * @ClassName: SICSApprover
 * @Description:TODO(SICS校验)
 * @author: Shixiaoyan
 * @date: 2021年1月18日 下午2:32:05
 * @Copyright:
 */
@Component
public class SICSApprover extends DetailApprover {

	// @Autowired
	// private ISICSfeign iSICSfeign;

	@Override
	public void detailApprove(List<DetailBatch> detailBatchs, CheckItem checkItem) {
		List<DetailBatch> SICSbatch = new ArrayList<DetailBatch>();
		// 筛选可进行sics校验的批次
		SICSbatch(detailBatchs, SICSbatch);
		// 创建子账单
		List<Subbill> subbills = createSubbill(SICSbatch);
		// 生成校验报文
		String SICSJson = createSICSJson(subbills);
		// 校验并解析结果
		SICSCheck(SICSJson);
	}

	/**
	 * 筛选可进行sics校验的批次
	 * 
	 * @param detailBatchDOs
	 * @param toSICSbatch
	 */
	private void SICSbatch(List<DetailBatch> detailBatchs, List<DetailBatch> SICSbatch) {
		for (DetailBatch detailBatch : detailBatchs) {
			if (detailBatch.getDetailErrors().size() > 0) {
				SICSbatch.add(detailBatch);
			}
		}
	}

	/**
	 * 创建子账单
	 * 
	 * @param sicSbatch
	 */
	private List<Subbill> createSubbill(List<DetailBatch> SICSbatch) {
		List<Subbill> subbills = new ArrayList<>(SICSbatch.size());
		for (DetailBatch detailBatch : SICSbatch) {
			Subbill subbill = SubbillFactory.buildSubbill(detailBatch);
			subbills.add(subbill);
		}
		return subbills;
	}

	/**
	 * 生成校验报文
	 * 
	 * @param SICSbatch
	 * @return
	 */
	private String createSICSJson(List<Subbill> subbills) {
		return "";
	}

	/**
	 * 校验并解析结果
	 * 
	 * @param SICSJson
	 */
	private void SICSCheck(String SICSJson) {
		// iSICSfeign.SICSCheck(SICSJson);
	}

}
