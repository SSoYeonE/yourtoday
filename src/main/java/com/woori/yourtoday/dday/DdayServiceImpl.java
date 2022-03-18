package com.woori.yourtoday.dday;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


@Service("ddayService")
public class DdayServiceImpl implements DdayService{

	@Resource(name="ddayDao")
	DdayDao dao;
	
	@Override
	public List<DdayDto> getList(DdayDto dto) {
		return dao.getList(dto);
	}

	@Override
	public DdayDto getView(DdayDto dto) {
		return dao.getView(dto);
	}

	@Override
	public void insert(DdayDto dto) {
		dao.insert(dto);
	}

	@Override
	public void update(DdayDto dto) {
		dao.update(dto);
		
	}

	@Override
	public void delete(DdayDto dto) {
		dao.delete(dto);
		
	}

	@Override
	public int getTotal(DdayDto dto) {
		return dao.getTotal(dto);
	}

}
