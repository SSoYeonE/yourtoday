package com.woori.yourtoday.dday;

import java.util.List;

public interface DdayDao {
	List<DdayDto> getList(DdayDto dto);
	DdayDto getView(DdayDto dto);
	void insert(DdayDto dto);
	void update(DdayDto dto);
	void delete(DdayDto dto);
	int getTotal(DdayDto dto);
}
