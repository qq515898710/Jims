package org.mo.jims.coop.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mo.jims.coop.entity.TbUserLog;
import org.mo.jims.coop.entity.TbUserRole;
import org.mo.open.common.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository("userRoleRepository")
public interface UserRoleRepository extends BaseRepository<TbUserRole, Integer> {
	
	public int countAll(@Param("name")String name);
	
	public List<TbUserLog> selectAll(@Param("name") String name, @Param("offset") int offset, 
			@Param("size") int size);
	
}
