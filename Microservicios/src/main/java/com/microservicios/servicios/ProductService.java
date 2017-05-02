package com.microservicios.servicios;

import java.util.List;

import com.microservicios.entidades.Product;

public interface ProductService {
	Iterable<Product> listAllProducts();

	Product getProductById(Integer id);

	Product saveProduct(Product product);

	List<Product> getListaProductos();
	
	
	Product getProductByIdProducto(Integer idproducto);
}
