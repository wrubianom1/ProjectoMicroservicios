package com.microservicios.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservicios.entidades.Product;
import com.microservicios.servicios.ProductService;

@RestController
@RequestMapping(value = "/rest")
@CrossOrigin
public class ProductController {

	private ProductService productService;

	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping(value = "/productoId/{idin}", method = RequestMethod.GET)
	public Product list(@PathVariable("idin") Integer idin) {
		//
		Product res = null;
		System.out.println("Entro para consultar por " + idin);
		res = productService.getProductByIdProducto(idin);
		System.out.println("Returning rpoducts:" + res);
		return res;
	}

	@RequestMapping(value = "/productos", method = RequestMethod.GET)
	public Iterable<Product> listProduc() {
		Iterable<Product> res = productService.listAllProducts();
		System.out.println("Returning rpoducts:" + res);
		return res;
	}

	@RequestMapping("product/{id}")
	public String showProduct(@PathVariable Integer id, Model model) {
		model.addAttribute("product", productService.getProductById(id));
		return "productshow";
	}

	@RequestMapping("product/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		model.addAttribute("product", productService.getProductById(id));
		return "productform";
	}

	@RequestMapping("product/new")
	public String newProduct(Model model) {
		model.addAttribute("product", new Product());
		return "productform";
	}

	@RequestMapping(value = "product", method = RequestMethod.POST)
	public String saveProduct(Product product) {

		productService.saveProduct(product);

		return "redirect:/product/" + product.getId();
	}

}
