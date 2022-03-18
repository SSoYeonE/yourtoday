package com.woori.yourtoday.journal;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JournalController {
	
	@Resource(name="journalService")
	JournalService service;
	
	@RequestMapping("journal/list")
	@ResponseBody
	List<JournalDto> list(){
		
		List<JournalDto> list = service.getList(null);
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "test");
		return list;
	}
	
	@RequestMapping("journal/insert")
	@ResponseBody
	HashMap<String, String> insert(JournalDto dto) {
		
		service.insert(dto);

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "success");
		return map;
	}
	
	
	@RequestMapping("journal/update")
	@ResponseBody
	HashMap<String, String> update(JournalDto dto) {
		
		service.update(dto);

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "success");
		return map;
	}
	
	
	@RequestMapping("journal/delete")
	@ResponseBody
	HashMap<String, String> delete(JournalDto dto) {
		
		service.delete(dto);

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "success");
		return map;
	}
	
	
	@RequestMapping("journal/total")
	@ResponseBody
	HashMap<String, String> total(JournalDto dto) {
		
		//int total = service.getTotal(dto);

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "10");
		return map;
	}
	
	@RequestMapping("journal/view")
	@ResponseBody
	JournalDto view(JournalDto dto) {
		
		JournalDto resultDto = service.getView(dto);

		return resultDto;
	}

}
