package com.ddd.demo.detail.infrastructure.repository.translator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.ddd.demo.detail.domain.model.detail.DetailBatch;
import com.ddd.demo.detail.domain.model.detail.DetailError;
import com.ddd.demo.detail.infrastructure.dao.entity.DetailBatchDO;
import com.ddd.demo.detail.infrastructure.dao.entity.DetailErrorDO;

@Component
public class BatchTranslator {

	public DetailBatchDO TranslateToEntity(DetailBatch detailBatch) {
		DetailBatchDO enyity = new DetailBatchDO();
		BeanUtils.copyProperties(detailBatch, enyity);
		enyity.setStatus(detailBatch.getStatus().getCode());
		// 转化DetailErrors
		if (detailBatch.getDetailErrors().size() > 0) {
			List<DetailError> detailErrors = detailBatch.getDetailErrors();
			List<DetailErrorDO> detailErrorDOs = new ArrayList<DetailErrorDO>(detailErrors.size());
			for (DetailError err : detailErrors) {
				DetailErrorDO errDO = new DetailErrorDO();
				BeanUtils.copyProperties(err, errDO);
				errDO.setErrType(err.getErrType().getCode());
				// errDO.setErrs(JSONObject.toJSONString(err.getErrs()));
				detailErrorDOs.add(errDO);
			}
		}
		return enyity;
	}

	public DetailBatch TranslateFromEntity(DetailBatchDO enyity) {
		DetailBatch detailBatch = new DetailBatch();
		BeanUtils.copyProperties(enyity, detailBatch);
		// detailBatch.setStatus();
		// 转化DetailErrors

		return detailBatch;
	}

}
