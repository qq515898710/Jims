package org.mo.jims.coop.repository;

import java.util.List;

import org.mo.jims.coop.entity.Permission;
import org.mo.open.common.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository("permissionRepository")
public interface PermissionRepository extends BaseRepository<Permission, Long> {

	public int count();

	public List<Permission> selectAll();

}
