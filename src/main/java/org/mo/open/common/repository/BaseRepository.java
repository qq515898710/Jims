package org.mo.open.common.repository;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseRepository<T extends Serializable, PK extends Serializable> {

	public T selectById(PK id);

	public List<T> selectAll();

	public List<T> selectAll(@Param("offset") int offset,
			@Param("size") int size);

	public boolean insert(T entity);

	public boolean update(T entity);

	public boolean updateById(PK id);

	public boolean delete(T entity);

	public boolean deleteById(PK id);

}
