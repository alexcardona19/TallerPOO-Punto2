package alexander.DispensadorMaquina.Model;
import java.util.*;

public class Producto {

	private String nombre;
	private int codigo;
	private int cantidadDisponible;
	private double precio;

	public Producto(String nombre, int codigo, int cantidadDisponible, double precio) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.cantidadDisponible = cantidadDisponible;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}