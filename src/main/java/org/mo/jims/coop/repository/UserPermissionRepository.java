package org.mo.jims.coop.repository;

import java.util.List;

import org.mo.jims.coop.entity.TbUserPermission;
import org.mo.open.common.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository("userPermissionRepository")
public interface UserPermissionRepository extends BaseRepository<TbUserPermission, Long> {

	public int count();

	public List<TbUserPermission> selectAll();

}
