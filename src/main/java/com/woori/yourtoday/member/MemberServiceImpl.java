package com.woori.yourtoday.member;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


@Service("memberService")
public class MemberServiceImpl implements MemberService{

	@Resource(name="memberDao")
	MemberDao dao;

	
	@Override
	public List<MemberDto> getList(MemberDto dto) {
		return dao.getList(dto);
	}

	@Override
	public MemberDto getView(MemberDto dto) {
		return dao.getView(dto);
	}

	@Override
	public void insert(MemberDto dto) {
		dao.insert(dto);
	}

	@Override
	public void update(MemberDto dto) {
		dao.update(dto);
		
	}

	@Override
	public void delete(MemberDto dto) {
		dao.delete(dto);
		
	}

	@Override
	public int getTotal(MemberDto dto) {
		return dao.getTotal(dto);
	}

}
