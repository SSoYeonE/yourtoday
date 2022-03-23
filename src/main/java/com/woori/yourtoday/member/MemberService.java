package com.woori.yourtoday.member;

import java.util.List;

public interface MemberService {
	List<MemberDto> getList(MemberDto dto);
	MemberDto getView(MemberDto dto);
	void insert(MemberDto dto);
	void update(MemberDto dto);
	void delete(MemberDto dto);
	int getTotal(MemberDto dto);
}
