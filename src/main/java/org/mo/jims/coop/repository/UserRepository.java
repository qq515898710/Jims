package org.mo.jims.coop.repository;

import org.apache.ibatis.annotations.Param;
import org.mo.jims.coop.entity.TbUser;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository {

	public void insert(TbUser user);

	public void delete(TbUser user);

	public void update(TbUser user);

	public TbUser selcetByName(@Param("name") String name);
	
}
