package com.example.demo.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringDinController {
	
	//Se envia field1 y field2
	@GetMapping("/filtering-din")
	public MappingJacksonValue retrieveSomeBean() {
		SomeDinBean someBean = new SomeDinBean("value1", "value2", "value3");
		
		MappingJacksonValue mapping = new MappingJacksonValue(someBean);
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");
		FilterProvider filters =  new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		mapping.setFilters(filters);
		
		return mapping;
	}
	
	@GetMapping("/filtering-din-list")
	public MappingJacksonValue retrieveListOfSomeBean() {
		List<SomeDinBean> list = Arrays.asList(new SomeDinBean("value1", "value2", "value3"), new SomeDinBean("value11", "value22", "value33"));
		
		MappingJacksonValue mapping = new MappingJacksonValue(list);
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3");
		FilterProvider filters =  new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		mapping.setFilters(filters);
		
		return mapping;
	}
}
