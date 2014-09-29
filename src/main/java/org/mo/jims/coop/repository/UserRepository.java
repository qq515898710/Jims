package org.mo.jims.coop.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mo.jims.coop.entity.TbUser;
import org.mo.open.common.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends BaseRepository<TbUser, String> {

	public TbUser selcetByName(@Param("name") String name);

	public int countAll();

	public List<TbUser> selectAll(@Param("name") String name,
			@Param("username") String username, @Param("offset") int offset,
			@Param("size") int size);

}
