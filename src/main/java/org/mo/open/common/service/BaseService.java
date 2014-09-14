package org.mo.open.common.service;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.mo.open.common.repository.BaseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public abstract class BaseService<T extends Serializable, PK extends Serializable> {

	public BaseRepository<T, PK> baseRepository;

	public BaseRepository<T, PK> getBaseRepository() {
		return baseRepository;
	}

	@Resource
	public void setBaseRepository(BaseRepository<T, PK> baseRepository) {
		this.baseRepository = baseRepository;
	}

	public T getById(PK id) {
		return baseRepository.selectById(id);
	}

	public List<T> getAll() {
		return baseRepository.selectAll();
	}

	public List<T> getAll(int offset, int size) {
		return baseRepository.selectAll(offset, size);
	}

	@Transactional
	public boolean save(T entity) {
		return baseRepository.insert(entity);
	}

	@Transactional
	public boolean update(T entity) {
		return baseRepository.update(entity);
	}

	@Transactional
	public boolean updateById(PK id) {
		return baseRepository.updateById(id);
	}

	@Transactional
	public boolean delete(T entity) {
		return baseRepository.delete(entity);
	}

	@Transactional
	public boolean deleteById(PK id) {
		return baseRepository.deleteById(id);
	}
}
