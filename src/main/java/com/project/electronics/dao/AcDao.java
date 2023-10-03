package com.project.electronics.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.electronics.ac.Ac;
import com.project.electronics.exception.IoNotFoundException;
import com.project.electronics.exception.ModelNotFoundException;
import com.project.electronics.exception.PriceException;
import com.project.electronics.repo.AcRepo;


@Repository
public class AcDao {
	@Autowired
	AcRepo ar;

	public String postAll(List<Ac> a) {
		ar.saveAll(a);
		return "Posted";
	}

	public List<Ac> getByBrand(String brand) {
		
		return ar.getByBrand(brand);
	}

	public List<Ac> getByColor(String br) {
		// TODO Auto-generated method stub
		return ar.getByColor(br);
	}

	public List<Ac> getByPriceRange(int d) {
		// TODO Auto-generated method stub
		return ar.getByPriceRange(d);
	}

	public List<Ac> getByPrice(int e,int f) {
		// TODO Auto-generated method stub
		return ar.getByPrice(e,f);
	}

	public int getMax() {
		// TODO Auto-generated method stub
		return ar.getMax();
	}

	public int getMin() {
		// TODO Auto-generated method stub
		return ar.getMin();
	}

	public Ac getMaxVal() {
		// TODO Auto-generated method stub
		return ar.getMaxVal();
	}

	public Ac getMinVal() {
		// TODO Auto-generated method stub
		return ar.getMinVal();
	}

	public Ac getByModel(String m)throws Exception {
		if(ar.getByModel(m).isEmpty()) {
			throw new ModelNotFoundException("Model Unavailable");
			
		}
		else {
		return ar.getByModel(m).get(); }
	}

	public String post(Ac p) {
		ar.save(p);
		return "Done";
	}

	

	
	public List<Ac> getCol(String m) {
		return ar.getCol(m);
		
	}

	

	public String postYear(Ac g) {
		ar.save(g);
		return "Okie";
	}
	
	public String posts(Ac i) {
		ar.save(i);
		return "Okey";
	}
	



	
	
	

//	public List<Ac> getBymodelYear(int g) {
//		// TODO Auto-generated method stub
//		return ar.getBymodelYear(g);
//	}

	

	
	
	

	
	
}
