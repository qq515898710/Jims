package org.mo.jims.coop.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mo.jims.coop.entity.TbUserLog;
import org.mo.open.common.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository("userLogRepository")
public interface UserLogRepository extends BaseRepository<TbUserLog, Long> {
	
	public int countAllByName(@Param("name")String name);
	
	public List<TbUserLog> selectAllByName(@Param("name") String name, @Param("offset") int offset, 
			@Param("size") int size);
	
}
