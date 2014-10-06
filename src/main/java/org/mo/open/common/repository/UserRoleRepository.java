package org.mo.open.common.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mo.open.common.entity.UserLog;
import org.mo.open.common.entity.UserRole;
import org.springframework.stereotype.Repository;

@Repository("userRoleRepository")
public interface UserRoleRepository extends BaseRepository<UserRole, Long> {
	
	public int countAll();
	
	public List<UserRole> selectAll();
	
}
