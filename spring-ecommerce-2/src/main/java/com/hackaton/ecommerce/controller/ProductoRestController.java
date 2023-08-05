package com.hackaton.ecommerce.controller;

import java.util.Collection;

import com.hackaton.ecommerce.model.Producto;
import com.hackaton.ecommerce.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoRestController {
	
	private ProductoService productoService;
	
	public ProductoRestController() {
	}
	
	
	@GetMapping("listar")
	public ResponsEntity<?> listar_GET()
	{
		Collection<Producto> list = productoService.findAll();
		
		if(list.isEmpty()) {
			return new ResponsEntity<>(HttpStatus.NOT_CONTENT);
		}
		
		return new ResponsEntity<>(list,HttpStatus.OK);
	}
	
	
	@PostMapping("/registrar")
	public ResponsEntity<?> registrar_POST(@RequestBody Producto producto){
		
		int isExit = productoService.isExist(producto.getNombre());
		
		if(isExit == 0) {
			productoService.insert(producto);
			return new ResponsEntity<>("Producto Registrado", HttpStatus.CREATED);
		}
		
		return new ResponseEntity<>("Error, producto" + producto.getNombre() + "ya existe", HttpStatus.CONFLICT);
	}
	
	@PutMapping("editar/{productoId}")
	public ResponseEntity<?> editar_PUT(@RequestBody Producto productoNew, @PathVariable Integer productoId){
		Producto productoDb = productoService.findById(productoId);
		
		if(productoDb!=null) {
			productoDb.setNombre(productoNew.getNombre());
			productoDb.setImagen(productoNew.getImagen());
			productoDb.setPrecio(productoNew.getPrecio());
			
			int isExit = productoService.isExist(producto.getNombre());
			if(isExit == 0) {
				productoService.update(productoDb);
				return new ResponseEntity<>("Producto editado", HttpStatus.OK);
			}
			
			return new ResponseEntity<>("Error, producto ya existe", HttpStatus.CONFLICT);
		}
		
		return new ResponseEntity<>("Producto " + productoId + " No encontrado", HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("Eliminar/{productoId}")
	public ResponseEntity<?> borrar_DELETE(@PathVariable Integer productoId){
		
		Producto productoDb = productoService.findById(productoId);
		if(productoDb!=null) {
			productoService.delete(productoId);
			return new ReponseEntity<>("Producto Borrado", HttpStatus.OK);
		}
		
		return new ResponseEntity<>("Producto " + productoId + "NO encontrado", HttpStatus.NOT_FOUND);
	}
		
	

	

}
