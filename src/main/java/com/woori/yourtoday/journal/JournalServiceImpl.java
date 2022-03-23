package com.woori.yourtoday.journal;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("journalService")
public class JournalServiceImpl implements JournalService{
	
	@Resource(name="journalDao")
	JournalDao dao;

	@Override
	public List<JournalDto> getList(JournalDto dto) {

		return dao.getList(dto);
	}

	@Override
	public JournalDto getView(JournalDto dto) {
		
		return dao.getView(dto);
	}

	@Override
	public void insert(JournalDto dto) {
		dao.insert(dto);
		
	}

	@Override
	public void update(JournalDto dto) {
		dao.update(dto);
		
	}

	@Override
	public void delete(JournalDto dto) {
		dao.delete(dto);
	}

	@Override
	public int getTotal(JournalDto dto) {
		return dao.getTotal(dto);
	}

}
