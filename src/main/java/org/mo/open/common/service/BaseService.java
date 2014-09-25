package org.mo.open.common.service;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author moziqi
 *
 * @param <T>
 * @param <PK>
 */
public interface BaseService<T extends Serializable, PK extends Serializable> {
	/**
	 * 通过id获得信息
	 * 
	 * @param id
	 * @return
	 */
	public T getByPK(PK id);

	/**
	 * 获得所有信息
	 * 
	 * @return
	 */
	public List<T> gettAll();

	/**
	 * 保存信息
	 * 
	 * @param entity
	 * @return
	 */
	public boolean save(T entity);

	/**
	 * 更改信息
	 * 
	 * @param entity
	 * @return
	 */
	public boolean alter(T entity);

	/**
	 * 通过主键更改信息
	 * 
	 * @param id
	 * @return
	 */
	public boolean alterByPK(PK id);

	/**
	 * 移除信息
	 * 
	 * @param entity
	 * @return
	 */
	public boolean remove(T entity);
}
