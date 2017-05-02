package com.microservicios.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.microservicios.entidades.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

	@Query("from Product a where a.id = ?1")
	public Product buscarProductoByIdProducto(Integer idDelProducto);
	// getShopOrder(@Param(value="id"));

}
