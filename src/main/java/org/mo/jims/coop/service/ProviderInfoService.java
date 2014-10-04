package org.mo.jims.coop.service;

import java.util.List;

import javax.annotation.Resource;

import org.mo.jims.coop.entity.TbProviderInfo;
import org.mo.jims.coop.repository.ProviderInfoRepository;
import org.mo.open.common.util.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("providerInfoService")
public class ProviderInfoService {

	private ProviderInfoRepository providerInfoRepository;

	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public TbProviderInfo getProviderInfoByName(String name) {
		TbProviderInfo selcetByName = null;
		selcetByName = providerInfoRepository.selcetByName(name);
		if (selcetByName == null) {
			return null;
		}
		return selcetByName;
	}
	
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public Page<TbProviderInfo> getProviderInfoByNameOrAbbreviation(String name, int page, int pageSize) {
		Page<TbProviderInfo> providerInfoPage = new Page<TbProviderInfo>();
		providerInfoPage.setTotalElement(providerInfoRepository.countAllByNameOrAbbreviation(name), pageSize);
		if(providerInfoPage.getTotalElement() == 0){
			return providerInfoPage;
		}
		providerInfoPage.setPageSize(pageSize);
		providerInfoPage.setCurrentPage(page);
		List<TbProviderInfo> selectAllByNameOrAbbreviation = 
				providerInfoRepository.selectAllByNameOrAbbreviation(name, (page - 1) * pageSize, pageSize);
		providerInfoPage.setContent(selectAllByNameOrAbbreviation);
		return providerInfoPage;
	}

	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public TbProviderInfo getByPK(String id) {
		return providerInfoRepository.selectByPK(id);
	}

	@Transactional(noRollbackFor = Exception.class)
	public boolean save(TbProviderInfo entity) {
		providerInfoRepository.insert(entity);
		return true;
	}

	@Transactional(noRollbackFor = Exception.class)
	public boolean alter(TbProviderInfo entity) {
		providerInfoRepository.updateByPK(entity);
		return true;
	}

	@Transactional(noRollbackFor = Exception.class)
	public boolean removeByPK(String id) {
		providerInfoRepository.deleteByPK(id);
		return true;
	}

	public ProviderInfoRepository getProviderInfoRepository() {
		return providerInfoRepository;
	}

	@Resource(name = "providerInfoRepository")
	public void setProviderInfoRepository(ProviderInfoRepository providerInfoRepository) {
		this.providerInfoRepository = providerInfoRepository;
	}

}
