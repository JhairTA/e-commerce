package com.hackaton.ecommerce.repository;

import com.hackaton.ecommerce.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
	