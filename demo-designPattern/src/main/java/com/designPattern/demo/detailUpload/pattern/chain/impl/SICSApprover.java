package com.designPattern.demo.detailUpload.pattern.chain.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.designPattern.demo.detailUpload.domain.CheckItem;
import com.designPattern.demo.detailUpload.domain.DetailBatchDO;
import com.designPattern.demo.detailUpload.domain.SubbillDO;
import com.designPattern.demo.detailUpload.domain.SubbillDetailDO;
import com.designPattern.demo.detailUpload.feign.ISICSfeign;
import com.designPattern.demo.detailUpload.pattern.chain.DetailApprover;

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

	@Autowired
	private ISICSfeign iSICSfeign;

	@Override
	public void detailApprove(List<DetailBatchDO> detailBatchDOs, CheckItem checkItem) {
		List<DetailBatchDO> SICSbatch = new ArrayList<DetailBatchDO>();
		// 筛选可进行sics校验的批次
		SICSbatch(detailBatchDOs, SICSbatch);
		// 创建子账单
		createSubbill(SICSbatch);
		// 生成校验报文
		String SICSJson = createSICSJson(SICSbatch);
		// 校验并解析结果
		SICSCheck(SICSJson);
	}

	/**
	 * 筛选可进行sics校验的批次
	 * 
	 * @param detailBatchDOs
	 * @param toSICSbatch
	 */
	private void SICSbatch(List<DetailBatchDO> detailBatchDOs, List<DetailBatchDO> SICSbatch) {
		for (DetailBatchDO detailBatchDO : detailBatchDOs) {
			if (detailBatchDO.getDetailDataErrorDOs().size() > 0) {
				SICSbatch.add(detailBatchDO);
			}
		}
	}

	/**
	 * 创建子账单
	 * 
	 * @param sicSbatch
	 */
	private void createSubbill(List<DetailBatchDO> SICSbatch) {
		for (DetailBatchDO detailBatchDO : SICSbatch) {
			SubbillDO subbillDO = new SubbillDO();
			subbillDO.setSubbillDetailDOs(new ArrayList<SubbillDetailDO>());
			detailBatchDO.setSubbillDO(subbillDO);
		}
	}

	/**
	 * 生成校验报文
	 * 
	 * @param SICSbatch
	 * @return
	 */
	private String createSICSJson(List<DetailBatchDO> SICSbatch) {
		return "";
	}

	/**
	 * 校验并解析结果
	 * 
	 * @param SICSJson
	 */
	private void SICSCheck(String SICSJson) {
		iSICSfeign.SICSCheck(SICSJson);
	}

}
