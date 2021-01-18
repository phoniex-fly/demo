package com.designPattern.demo.detailUpload.domain;

import java.util.List;

/**
 * 
 * @ClassName: DetailBatchDO
 * @Description:TODO(明细批次)
 * @author: Shixiaoyan
 * @date: 2021年1月18日 下午2:02:48
 * @Copyright:
 */
public class DetailBatchDO {

	List<DetailDataSuccDO> detailDataSuccDOs;

	List<DetailDataErrorDO> detailDataErrorDOs;

	SubbillDO subbillDO;

	public List<DetailDataSuccDO> getDetailDataSuccDOs() {
		return detailDataSuccDOs;
	}

	public void setDetailDataSuccDOs(List<DetailDataSuccDO> detailDataSuccDOs) {
		this.detailDataSuccDOs = detailDataSuccDOs;
	}

	public List<DetailDataErrorDO> getDetailDataErrorDOs() {
		return detailDataErrorDOs;
	}

	public void setDetailDataErrorDOs(List<DetailDataErrorDO> detailDataErrorDOs) {
		this.detailDataErrorDOs = detailDataErrorDOs;
	}

	public SubbillDO getSubbillDO() {
		return subbillDO;
	}

	public void setSubbillDO(SubbillDO subbillDO) {
		this.subbillDO = subbillDO;
	}

}
