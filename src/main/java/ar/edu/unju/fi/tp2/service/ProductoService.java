package ar.edu.unju.fi.tp2.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import ar.edu.unju.fi.tp2.model.Producto;

@Service
public interface ProductoService {

	public void guardarProducto(Producto unProducto);
	public void modificaProducto(Producto productoAModificar);
	public void eliminarProducto(Producto productoAElimiar);
	public Producto obtenerUnProducto(String nombreProducto);
	public ArrayList<Producto> obtenerTodosProductos();
	public Producto obtenerProductoNuevo();
}
