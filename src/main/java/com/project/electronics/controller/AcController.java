package com.project.electronics.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.electronics.ac.Ac;
import com.project.electronics.service.AcService;

@RestController
public class AcController {
	@Autowired
	AcService as;
	
	@PostMapping(value="postAll")
	public String postAll(@RequestBody List<Ac> a) {
		return as.postAll(a);
	}
	
	
	
	@GetMapping(value="getByBrand/{b}")
	public List<Ac> getByBrand(@PathVariable String b) {
		String br=b.toUpperCase();
		return as.getByBrand(br);
	}
	
	@GetMapping(value="getByColor/{c}")
	public List<Ac> getByColor(@PathVariable String c) {
		String br=c.toUpperCase();
		return as.getByColor(br);
	}
	@GetMapping(value="getByPriceRange/{d}")
	public List<Ac> getByPriceRange(@PathVariable int d) {
		
		return as.getByPriceRange(d);
	}
	
	@GetMapping(value="getByPrice/{e}/{f}")
	public List<Ac> getByPrice(@PathVariable int e,@PathVariable int f) {
		
		return as.getByPrice(e,f);
	}
	
	
	@GetMapping(value="getMax")
	public int getMax() {
		
		return as.getMax();
	}
	
	@GetMapping(value="getMin")
	public int getMin() {
		
		return as.getMin();
	}
	
	@GetMapping(value="getMaxVal")
	public Ac getMaxVal() {
		
		return as.getMaxVal();
	}
	
	@GetMapping(value="getMinVal")
	public Ac getMinVal() {
		
		return as.getMinVal();
	}
	
	@GetMapping(value="/getByModel/{m}")
	public Ac getByModel(@PathVariable String m) throws Exception {
		return as.getByModel(m);
	}
	
	@PostMapping(value="/postVa")
	public String post(@RequestBody Ac p) throws Exception {
		return as.post(p);
	}
	
	@GetMapping(value="/getCol/{m}")
	public List<Ac> getCol(@PathVariable String m) throws Exception {
		return as.getCol(m);
	}
	
	@PostMapping(value="postModelYear")
	public String postYear(@RequestBody Ac g) throws Exception {
		
		return as.postYear(g);
	}
	
	@PostMapping(value="posts")
	public String posts(@RequestBody Ac i) throws Exception {
		
		return as.posts(i);
	}
	
	
	
	
	

}


