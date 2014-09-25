package org.mo.jims.coop.repository;

import org.mo.jims.coop.entity.TbUser;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

	public void insert(TbUser user);

	public void delete(TbUser user);

	public void update(TbUser user);

	public TbUser selcetByName(String name);
	
}
