package org.mo.open.common.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.mo.open.common.entity.User;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends BaseRepository<User, String> {

	public User selcetByName(@Param("name") String name);

	public int countAll(@Param("name") String name,
			@Param("username") String username);

	public List<User> selectAll(@Param("name") String name,
			@Param("username") String username, @Param("offset") int offset,
			@Param("size") int size);

	public User selectUserByNameAndPassword(@Param("name")String name, @Param("password")String password);

}
