package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


// 사용자가 요청 -> 응답(Data)
@RestController
public class HttpControllerTest {

	@GetMapping("/http/get") //select
	//public String getTest(@RequestParam int id, @RequestParam String username)
	public String getTest(Member m){ //?id=1&username=ssar&password=1234&email=xpowerno1@gmail.com //MessageConverter (스프링부트)
	//	return "get 요청"+id+", "+username;
		return "get 요청 : "+m.getId()+", "+m.getUsername()+", "+m.getPassword()+", "+m.getEmail();
	}

	@PostMapping("/http/post") //insert
	//public String postTest(Member m) {
	//public String postTest(@RequestBody String text) {
	public String postTest(@RequestBody Member m) { //MessageConverter (스프링부트)
		//return "post 요청";
		//return "post 요청 : "+m.getId()+", "+m.getUsername()+", "+m.getPassword()+", "+m.getEmail();
		//return "post 요청 :"+text;
		return "post 요청 : "+m.getId()+", "+m.getUsername()+", "+m.getPassword()+", "+m.getEmail();
	}
	
	@PutMapping("/http/put")
	public String putTest(@RequestBody Member m) {
		//return "put 요청";
		return "put 요청 : "+m.getId()+", "+m.getUsername()+", "+m.getPassword()+", "+m.getEmail();
	}
	
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
}
