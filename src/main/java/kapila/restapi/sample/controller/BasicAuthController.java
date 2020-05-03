package kapila.restapi.sample.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kapila.restapi.sample.bean.AuthenticationBean;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/v1")
public class BasicAuthController {

	@GetMapping(path = "/basicauth2")
	public AuthenticationBean basicauth() {
		return new AuthenticationBean("You are authenticated");
	}	
}
