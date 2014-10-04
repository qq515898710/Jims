package org.mo.jims.coop.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mo.jims.coop.entity.TbInventoryInfo;
import org.mo.open.common.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository("inventoryInfoRepository")
public interface InventoryInfoRepository extends BaseRepository<TbInventoryInfo, String> {

	public TbInventoryInfo selcetByName(@Param("name") String gname);

	public int countAllByNameOrAbbreviation(@Param("name") String param);

	public List<TbInventoryInfo> selectAllByNameOrAbbreviation(@Param("name") String param,
			@Param("offset") int offset, @Param("size") int size);
}
