package com.woori.yourtoday.member;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.woori.yourtoday.journal.JournalService;

@Controller
public class MemberController {

	@Resource(name="memberService")
	MemberService service;
	
	@RequestMapping("member/list")
	@ResponseBody
	List<MemberDto> list(){
		
		List<MemberDto> list = service.getList(null);
		
		return list;
	}
	
	@RequestMapping("member/insert")
	@ResponseBody
	HashMap<String, String> insert(MemberDto dto) {
		
		service.insert(dto);

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "success");
		return map;
	}
	
	@RequestMapping("member/update")
	@ResponseBody
	HashMap<String, String> update(MemberDto dto) {
		
		service.update(dto);

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "success");
		return map;
	}
	
	
	@RequestMapping("member/delete")
	@ResponseBody
	HashMap<String, String> delete(MemberDto dto) {
		
		service.delete(dto);

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "success");
		return map;
	}
	
	@RequestMapping("member/total")
	@ResponseBody
	HashMap<String, String> total(MemberDto dto) {
		
		//int total = service.getTotal(dto);

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "10");
		return map;
	}
	
	@RequestMapping("member/view")
	@ResponseBody
	MemberDto view(MemberDto dto) {
		
		MemberDto resultDto = service.getView(dto);

		return resultDto;
	}
	
	@RequestMapping("login")
	String login() {
		return "login";
	}
	
}
