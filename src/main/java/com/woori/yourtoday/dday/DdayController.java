package com.woori.yourtoday.dday;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woori.yourtoday.journal.JournalDto;
import com.woori.yourtoday.journal.JournalService;

@Controller
public class DdayController {

	@Resource(name="ddayService")
	DdayService service;
	
	@RequestMapping("dday/list")
	@ResponseBody
	HashMap<String, String> list(){
		
		List<DdayDto> list = service.getList(null);
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "test");
		return map;
	}
	
	@RequestMapping("dday/insert")
	@ResponseBody
	HashMap<String, String> insert(DdayDto dto) {
		
		service.insert(dto);

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "success");
		return map;
	}
	
	@RequestMapping("dday/update")
	@ResponseBody
	HashMap<String, String> update(DdayDto dto) {
		
		service.update(dto);

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "success");
		return map;
	}
	
	
	@RequestMapping("dday/delete")
	@ResponseBody
	HashMap<String, String> delete(DdayDto dto) {
		
		service.delete(dto);

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "success");
		return map;
	}
	
	@RequestMapping("dday/total")
	@ResponseBody
	HashMap<String, String> total(DdayDto dto) {
		
		//int total = service.getTotal(dto);

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "10");
		return map;
	}
	
	@RequestMapping("dday/view")
	@ResponseBody
	DdayDto view(DdayDto dto) {
		
		DdayDto resultDto = service.getView(dto);

		return resultDto;
	}
	


}
