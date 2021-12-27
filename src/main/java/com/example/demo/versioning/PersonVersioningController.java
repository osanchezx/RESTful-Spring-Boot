package com.example.demo.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {
	
	//@GetMapping("v1/person")
	//@GetMapping(value="/person/param", params="version=1")
	//@GetMapping(value="/person/header", headers="X-API-VERSION=1")
	@GetMapping(value="/person/produces", produces="application/vnd.company.app-v1+json")
	public PersonV1 personV1() {
		return new PersonV1("Oscar Sanchez");
	}
	
	//@GetMapping("v2/person")
	//@GetMapping(value="/person/param", params="version=2")
	//@GetMapping(value="/person/header", headers="X-API-VERSION=2")
	@GetMapping(value="/person/produces", produces="application/vnd.company.app-v2+json")
	public PersonV2 personV2() {
		return new PersonV2(new Name("Oscar","Sanchez"));
	}
}
