package org.mo.jims.coop.repository;

import java.util.List;

import org.mo.jims.coop.entity.UserList;
import org.springframework.stereotype.Repository;

@Repository(value = "userListRepository")
public interface UserListRepository {
	public UserList selectById(String id);

	public List<UserList> selectAll();

	public boolean insert(UserList entity);

	public boolean update(UserList entity);

	public boolean updateById(String id);

	public boolean delete(UserList entity);

	public boolean deleteById(UserList id);
}
