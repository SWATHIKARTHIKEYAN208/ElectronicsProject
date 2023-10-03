package com.project.electronics.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.electronics.ac.Ac;
import com.project.electronics.dao.AcDao;
import com.project.electronics.exception.BrandException;
import com.project.electronics.exception.ColorException;
import com.project.electronics.exception.PriceException;
import com.project.electronics.exception.YearException;

@Service
public class AcService {
	@Autowired
	AcDao ad;

	public String postAll(List<Ac> a) {
		return ad.postAll(a);
	}

	public List<Ac> getByBrand(String br) {
		
		return ad.getByBrand(br);
	}

	public List<Ac> getByColor(String br) {
		
		return ad.getByColor(br);
	}

	public List<Ac> getByPriceRange(int d) {
		// TODO Auto-generated method stub
		return ad.getByPriceRange(d);
	}

	public List<Ac> getByPrice(int e,int f) {
		// TODO Auto-generated method stub
		return ad.getByPrice(e,f);
	}

	public int getMax() {
		// TODO Auto-generated method stub
		return ad.getMax();
	}

	public int getMin() {
		// TODO Auto-generated method stub
		return ad.getMin();
	}

	public Ac getMaxVal() {
		// TODO Auto-generated method stub
		return ad.getMaxVal();
	}

	public Ac getMinVal() {
		// TODO Auto-generated method stub
		return ad.getMinVal();
	}

	public Ac getByModel(String m)throws Exception {
		// TODO Auto-generated method stub
		return ad.getByModel(m);
	}
	public String post(Ac p)throws Exception {
		try {
		if(p.getPrice()>=50000) {
			throw new PriceException("Price limit exceeds");
		}
		else {
			return ad.post(p);
		 
		
	}}catch(Exception e) {
		return "Invalid Price";
	}
	}

		
	

	public List<Ac> getCol(String m) throws Exception{
		List<Ac>x=ad.getCol(m);
		if(x.isEmpty()) {
			throw new ColorException("Color Unavailable");
			
		}
		else {
			return ad.getCol(m);
	}

	
	}

	public String postYear(Ac g)throws Exception {
		
		if(g.getModelYear()<2020) {
			throw new YearException("Year limit exceeds");
		}
		else {
			return ad.postYear(g);
		 
		
	}
	}
	
	public String posts(Ac i)throws Exception {
		
		if(i.getPrice()<30000 && i.getBrand()!="Croma") {
			throw new BrandException("Brand differs");
		}
		else {
			return ad.posts(i);
		 
		
	}
	}
		
		

	
}
	

