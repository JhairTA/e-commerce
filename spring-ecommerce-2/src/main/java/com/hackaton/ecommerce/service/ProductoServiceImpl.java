package com.hackaton.ecommerce.service;

import java.util.Collection;

import com.hackaton.ecommerce.model.Producto;
import com.hackaton.ecommerce.repository.ProductoRepository;

public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoRepository repository;

	@Override
	public void insert(Producto producto) {
		repository.save(producto);
	}

	@Override
	public void update(Producto producto) {
		repository.save(producto);
	}

	@Override
	public void delete(Integer productoId) {
		return.deleteById(productoId);	
	}

	@Override
	public Producto findById(Integer productoId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Producto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
