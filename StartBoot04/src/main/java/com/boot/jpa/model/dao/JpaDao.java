package com.boot.jpa.model.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.boot.jpa.model.entity.JpaEntity;

@Repository
public interface JpaDao extends JpaRepository<JpaEntity, Integer>{
	//findAll(), save(), findById(), delete() 등의 작업이 이미 만들어져있다!  와! CRUD 자동!
	
	public List<JpaEntity> findAll();
	 
	public JpaEntity findByMyno(int myno);
	
	public JpaEntity save(JpaEntity dto);
	
	//public JpaEntity update(JpaEntity dto);
	
	//public void deleteById(int myno); 
	
	@Transactional
	public void deleteByMyno(int myno);
	
	//사용자가 jpql을 작성해 실행한다.
	@Modifying
	@Query(" DELETE FROM JpaEntity j WHERE j.myno= :myno")
	@Transactional
	public void delBoard(@Param("myno")int myno);
	
	
}
