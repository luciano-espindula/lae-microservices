package br.com.lae.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;

@RestController
@RequestMapping("book-service")
public class FooBarController {
	
	private Logger logger = LoggerFactory.getLogger(FooBarController.class);

	@GetMapping("/foo")
//	@Retry(name = "foo", fallbackMethod = "meuMetodo")
//	@CircuitBreaker(name = "default", fallbackMethod = "meuMetodo")
//	@RateLimiter(name = "default")
	@Bulkhead(name = "default")
	public String fooBar() {
		logger.info("Request to foo is received!");
//		var response = new RestTemplate().getForEntity("http://localhost:8080/foo", String.class);
		return "Foo-Bar!!!";
//		return response.getBody();
	}
	
	public String meuMetodo(Exception ex) {
		return "fallbackMethod foo-bar!!!";
		
	}
}
