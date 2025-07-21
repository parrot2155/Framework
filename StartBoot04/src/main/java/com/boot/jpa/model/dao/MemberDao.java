package com.boot.jpa.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.jpa.model.entity.MemberEntity;

@Repository
public interface MemberDao extends JpaRepository<MemberEntity, Integer> {
	
	//public MemberEntity findByMyIdAndMyPw(String myid, String mypw);
	
	public List<MemberEntity> findAll();
	
	public MemberEntity findByMemberno(int memberno);
	
	public MemberEntity save(MemberEntity dto);
}
