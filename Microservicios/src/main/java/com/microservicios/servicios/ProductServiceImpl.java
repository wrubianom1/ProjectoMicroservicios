package com.microservicios.servicios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicios.dao.ProductRepository;
import com.microservicios.entidades.Product;

@Service
public class ProductServiceImpl implements ProductService {
	private ProductRepository productRepository;

	@Autowired
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Iterable<Product> listAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
		return productRepository.findOne(id);
	}

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	public List<Product> getListaProductos() {
		List<Product> res = new ArrayList<Product>();

		Product p1 = new Product();
		p1.setId(123);
		p1.setDescription("Descripcion del producto");
		res.add(p1);

		return res;
	}

	@Override
	public Product getProductByIdProducto(Integer idproducto) {
		Product res = this.productRepository.buscarProductoByIdProducto(idproducto);
		return res;
	}
}
