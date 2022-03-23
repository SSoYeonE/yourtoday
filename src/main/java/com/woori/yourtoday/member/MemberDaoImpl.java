package com.woori.yourtoday.member;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {

	@Autowired
	SqlSessionTemplate sm;
	
	@Override
	public List<MemberDto> getList(MemberDto dto) {
		return sm.selectList("Member_getList", dto);
	}

	@Override
	public MemberDto getView(MemberDto dto) {
		return sm.selectOne("Member_geiView", dto);
	}

	@Override
	public void insert(MemberDto dto) {
		sm.insert("Member_insert", dto);
		
	}

	@Override
	public void update(MemberDto dto) {
		sm.update("Member_update", dto);
		
	}

	@Override
	public void delete(MemberDto dto) {
		sm.delete("Member_delete", dto);
		
	}

	@Override
	public int getTotal(MemberDto dto) {
		return sm.selectOne("Member_getTotal", dto);
	}

}
