package com.project.electronics.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.electronics.ac.Ac;
import com.project.electronics.exception.PriceException;

public interface AcRepo extends JpaRepository<Ac, Integer> {
	@Query(value = "select * from ac where brand like?", nativeQuery = true)
	public List<Ac> getByBrand(String brand);

	@Query(value = "select * from ac where color like?", nativeQuery = true)
	public List<Ac> getByColor(String color);

	@Query(value = "select * from ac where price>?", nativeQuery = true)
	public List<Ac> getByPriceRange(int price);

	@Query(value = "select * from ac where price>? and price<?", nativeQuery = true)
	public List<Ac> getByPrice(int price1, int price2);

//	@Query(value="select * from ac where modelYear>?",nativeQuery=true)
//	public List<Ac> getBymodelYear(int my);

	@Query(value = "select max(price) from ac", nativeQuery = true)
	public int getMax();

	@Query(value = "select min(price) from ac", nativeQuery = true)
	public int getMin();

	@Query(value = "select * from ac where price=(select max(price) from ac)", nativeQuery = true)
	public Ac getMaxVal();

	@Query(value = "select * from ac where price=(select min(price) from ac)", nativeQuery = true)
	public Ac getMinVal();

	@Query(value = "select * from ac where model like?", nativeQuery = true)
	public Optional<Ac> getByModel(String m);

	@Query(value = "select * from ac where price>?", nativeQuery = true)
	public Optional<Ac> getPrice(int p);

	

	@Query(value="select * from ac where color like ?",nativeQuery = true)
	public List<Ac> getCol(String m);

	public void save(int g);
	
	@Query(value = "select * from ac where modelYear>?", nativeQuery = true)
	public Optional<Ac> getmodelYear(int g);

}
