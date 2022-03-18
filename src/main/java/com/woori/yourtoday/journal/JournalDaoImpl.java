package com.woori.yourtoday.journal;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woori.yourtoday.dday.DdayDto;

@Repository("journalDao")
public class JournalDaoImpl implements JournalDao {
	
	@Autowired
	SqlSessionTemplate sm;
	
	@Override
	public List<JournalDto> getList(JournalDto dto) {
		return sm.selectList("Journal_getList", dto);
	}

	@Override
	public JournalDto getView(JournalDto dto) {
		return sm.selectOne("Journal_geiView", dto);
	}

	@Override
	public void insert(JournalDto dto) {
		sm.insert("Journal_insert", dto);
	}

	@Override
	public void update(JournalDto dto) {
		sm.update("Journal_update", dto);
		
	}

	@Override
	public void delete(JournalDto dto) {
		sm.delete("Journal_delete", dto);
		
	}

	@Override
	public int getTotal(JournalDto dto) {
		return sm.selectOne("Journal_getTotal", dto);
	}



}
