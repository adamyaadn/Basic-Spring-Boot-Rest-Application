package training.trg.rest.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
public class HelloController {
	
	@RequestMapping(path="/message/{name}/{country}")
	public String sayHello(@PathVariable("name") String user, @PathVariable("country") String country) {
		return "Hello "+user + " from " + country;
	}
	
	@RequestMapping(path="/message/{name}/{age}")
	public String sayAge(@PathVariable("name") String user, @PathVariable("age") int age) {
		if(age<25 && age>0) {
			return "Hello "+user + ". You are young. ";
		}
		else if(age>50) {
			return "Hello "+user + ". You are old. ";
		}
		else if(age>25 && age<50) {
			return "Hello "+user + ". You are middle aged. ";
		} 
		else {
			return "Hello "+user + ". You are unreasonably aged. ";
		}
	}
	
	@RequestMapping(path="/exit")
	public String sayBye() {
		return "Bye Spring";
	}
}
