package org.mo.jims.coop.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mo.open.common.entity.UserLog;
import org.mo.open.common.entity.UserRole;
import org.mo.open.common.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository("userRoleRepository")
public interface UserRoleRepository extends BaseRepository<UserRole, Long> {
	
	public int countAll();
	
	public List<UserRole> selectAll();
	
}
