package com.ddd.demo.detail.infrastructure.repository.oracle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ddd.demo.detail.domain.model.detail.DetailBatch;
import com.ddd.demo.detail.domain.repository.IBatchRepository;
import com.ddd.demo.detail.infrastructure.dao.entity.DetailBatchDO;
import com.ddd.demo.detail.infrastructure.dao.entity.DetailDataDO;
import com.ddd.demo.detail.infrastructure.dao.entity.DetailErrorDO;
import com.ddd.demo.detail.infrastructure.dao.oracle.DetailBatchMapper;
import com.ddd.demo.detail.infrastructure.dao.oracle.DetailDataMapper;
import com.ddd.demo.detail.infrastructure.dao.oracle.DetailErrorMapper;
import com.ddd.demo.detail.infrastructure.repository.translator.BatchTranslator;

@Component
public class BatchOracleRepository implements IBatchRepository {

	@Autowired
	private DetailBatchMapper detailBatchMapper;
	@Autowired
	private DetailDataMapper detailDataMapper;
	@Autowired
	private DetailErrorMapper detailErrorMapper;
	@Autowired
	private BatchTranslator detailBatchTranslator;

	@Override
	public boolean save(DetailBatch detailBatch) {
		DetailBatchDO entity = detailBatchTranslator.TranslateToEntity(detailBatch);
		List<DetailDataDO> detailDataDOs = entity.getDetailDataDOs();
		List<DetailErrorDO> detailErrorDOs = entity.getDetailErrorDOs();
		int saveBatch = detailBatchMapper.save(entity);
		int saveData = detailDataMapper.save(detailDataDOs);
		int saveError = detailErrorMapper.save(detailErrorDOs);
		return saveBatch == 1 ? true
				: saveData == detailDataDOs.size() ? true : saveError == detailErrorDOs.size() ? true : false;
	}

	@Override
	public List<DetailBatch> findBatchs() {
		return null;
	}

	@Override
	public boolean delete(DetailBatch detailBatch) {
		return true;
	}

}
