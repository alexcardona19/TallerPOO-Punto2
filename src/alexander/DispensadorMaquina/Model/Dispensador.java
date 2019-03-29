package alexander.DispensadorMaquina.Model;
import java.util.*;
import  alexander.DispensadorMaquina.Model.*;
public class Dispensador {

	private String nombre;
	private String identificacion;
	private int capacidad;
	private String tipomaquina;
	private double saldomaquina;
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	
	public void agregarProducto(Producto producto) {
		// Agregar producto a la lista
		productos.add(producto);
	}

	public void comprarProducto(String nombre, int codigo, int cantidadComprar) {
		for ( Producto p : productos ) {
			// Validar cantidad disponible con la cantidad a comprar
			int cantidadDisponible = p.getCantidadDisponible() - cantidadComprar;
			// Buscar producto por nombre
			if (nombre != "" && nombre.equals(p.getNombre()) && cantidadDisponible>=0) { 
				// Restar cantidad comprar y actualizar cantidad disponible
				p.setCantidadDisponible(cantidadDisponible);
		    }
			// Buscar producto por codigo
			else if (codigo != 0 && codigo == p.getCodigo() && cantidadDisponible>=0) { 
				// Restar cantidad comprar y actualizar cantidad disponible
				p.setCantidadDisponible(cantidadDisponible);
		    }
		}
	}
	
	public void aumentarUnidades(String nombre, int codigo, int unidades) {
		for ( Producto p : productos ) {
			// Buscar producto por nombre
			int cantidadDisponible = p.getCantidadDisponible() + unidades;
			if (nombre != "" && nombre.equals(p.getNombre())) { 
				// Aumentar cantidad comprar y actualizar cantidad disponible
				p.setCantidadDisponible(cantidadDisponible);
		    }
			// Buscar producto por codigo
			else if (codigo != 0 && codigo == p.getCodigo()) { 
				// Aumentar cantidad comprar y actualizar cantidad disponible
				p.setCantidadDisponible(cantidadDisponible);
		    }
		}
	}

	public ArrayList<Producto> verProductos() {
		return productos;
	}

	public ArrayList<Producto> verProductosAgotados() {
		ArrayList<Producto> productosAgotados = new ArrayList<Producto>();
		// Listar productos con cantidad en cero (0)
		for ( Producto p : productos ) {
			if (p.getCantidadDisponible()==0) {
				productosAgotados.add(p);
			}
		}
		return productosAgotados;
	}

	public ArrayList<Producto> verUnidades(String nombre, int codigo) {
		ArrayList<Producto> productosUnidades = new ArrayList<Producto>();
		for ( Producto p : productos ) {
			// Buscar producto por nombre
			if (nombre != "" && nombre.equals(p.getNombre())) {
				productosUnidades.add(p);
		    }
			// Buscar producto por codigo
			else if (codigo != 0 && codigo == p.getCodigo()) {
				productosUnidades.add(p);
		    }
		}
		return productosUnidades;
	}

	public ArrayList<Producto> verProductosTotales() {
		return productos;
	}

}