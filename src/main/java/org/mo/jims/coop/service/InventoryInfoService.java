package org.mo.jims.coop.service;

import java.util.List;

import javax.annotation.Resource;

import org.mo.jims.coop.entity.TbInventoryInfo;
import org.mo.jims.coop.repository.InventoryInfoRepository;
import org.mo.open.common.util.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("inventoryInfoService")
public class InventoryInfoService {

	private InventoryInfoRepository inventoryInfoRepository;

	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public TbInventoryInfo getInventoryInfoByName(String name) {
		TbInventoryInfo selcetByName = null;
		selcetByName = inventoryInfoRepository.selcetByName(name);
		if (selcetByName == null) {
			return null;
		}
		return selcetByName;
	}
	
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public Page<TbInventoryInfo> getInventoryInfoByNameOrAbbreviation(String name, int page, int pageSize) {
		Page<TbInventoryInfo> inventoryInfoPage = new Page<TbInventoryInfo>();
		inventoryInfoPage.setTotalElement(inventoryInfoRepository.countAllByNameOrAbbreviation(name), pageSize);
		if(inventoryInfoPage.getTotalElement() == 0){
			return inventoryInfoPage;
		}
		inventoryInfoPage.setPageSize(pageSize);
		inventoryInfoPage.setCurrentPage(page);
		List<TbInventoryInfo> selectAllByNameOrAbbreviation = 
				inventoryInfoRepository.selectAllByNameOrAbbreviation(name, (page - 1) * pageSize, pageSize);
		inventoryInfoPage.setContent(selectAllByNameOrAbbreviation);
		return inventoryInfoPage;
	}

	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public TbInventoryInfo getByPK(String id) {
		return inventoryInfoRepository.selectByPK(id);
	}

	@Transactional(noRollbackFor = Exception.class)
	public boolean save(TbInventoryInfo entity) {
		inventoryInfoRepository.insert(entity);
		return true;
	}

	@Transactional(noRollbackFor = Exception.class)
	public boolean alter(TbInventoryInfo entity) {
		inventoryInfoRepository.updateByPK(entity);
		return true;
	}

	@Transactional(noRollbackFor = Exception.class)
	public boolean removeByPK(String id) {
		inventoryInfoRepository.deleteByPK(id);
		return true;
	}

	public InventoryInfoRepository getInventoryInfoRepository() {
		return inventoryInfoRepository;
	}

	@Resource(name = "inventoryInfoRepository")
	public void setInventoryInfoRepository(
			InventoryInfoRepository inventoryInfoRepository) {
		this.inventoryInfoRepository = inventoryInfoRepository;
	}

}
