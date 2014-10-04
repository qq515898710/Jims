package org.mo.jims.coop.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mo.jims.coop.entity.TbCustomerInfo;
import org.mo.open.common.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository("customerInfoRepository")
public interface CustomerInfoRepository extends BaseRepository<TbCustomerInfo, String> {

	public TbCustomerInfo selcetByName(@Param("name") String cname);

	public int countAllByNameOrAbbreviation(@Param("name") String param);

	public List<TbCustomerInfo> selectAllByNameOrAbbreviation(@Param("name") String param,
			@Param("offset") int offset, @Param("size") int size);
}
