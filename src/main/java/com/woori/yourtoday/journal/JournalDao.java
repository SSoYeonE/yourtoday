package com.woori.yourtoday.journal;

import java.util.List;

import com.woori.yourtoday.dday.DdayDto;

public interface JournalDao {
	List<JournalDto> getList(JournalDto dto);
	JournalDto getView(JournalDto dto);
	void insert(JournalDto dto);
	void update(JournalDto dto);
	void delete(JournalDto dto);
	int getTotal(JournalDto dto);
}
