package org.mo.jims.coop.repository;

import java.util.List;

import org.mo.jims.coop.entity.User;
import org.springframework.stereotype.Repository;

@Repository(value = "userListRepository")
public interface UserRepository {
	public User selectById(String id);

	public List<User> selectAll();

	public boolean insert(User entity);

	public boolean update(User entity);

	public boolean updateById(String id);

	public boolean delete(User entity);

	public boolean deleteById(User id);
}
