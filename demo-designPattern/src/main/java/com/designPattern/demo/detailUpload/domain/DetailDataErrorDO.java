package com.designPattern.demo.detailUpload.domain;

import java.util.List;

/**
 * 
 * @ClassName: DetailDataErrorDO
 * @Description:TODO(校验不通过)
 * @author: Shixiaoyan
 * @date: 2021年1月18日 下午2:03:02
 * @Copyright:
 */
public class DetailDataErrorDO {

	List<DetailCheckResultDO> detailCheckResultDOs;

	public List<DetailCheckResultDO> getDetailCheckResultDOs() {
		return detailCheckResultDOs;
	}

	public void setDetailCheckResultDOs(List<DetailCheckResultDO> detailCheckResultDOs) {
		this.detailCheckResultDOs = detailCheckResultDOs;
	}

}
