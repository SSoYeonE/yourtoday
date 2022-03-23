package com.woori.yourtoday.dday;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("ddayDao")
public class DdayDaoImpl implements DdayDao {

	@Autowired
	SqlSessionTemplate sm;

	@Override
	public List<DdayDto> getList(DdayDto dto) {
		return sm.selectList("Dday_getList", dto);
	}

	@Override
	public DdayDto getView(DdayDto dto) {
		return sm.selectOne("Dday_geiView", dto);
	}

	@Override
	public void insert(DdayDto dto) {
		sm.insert("Dday_insert", dto);
		
	}

	@Override
	public void update(DdayDto dto) {
		sm.update("Dday_update", dto);
		
	}

	@Override
	public void delete(DdayDto dto) {
		sm.delete("Dday_delete", dto);
		
	}

	@Override
	public int getTotal(DdayDto dto) {
		return sm.selectOne("Dday_getTotal", dto);
	}




	


}
