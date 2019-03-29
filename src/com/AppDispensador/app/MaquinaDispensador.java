package com.AppDispensador.app;
import java.util.ArrayList;
import alexander.DispensadorMaquina.Model.*;

public class MaquinaDispensador {

	public static void main(String[] args) {
		// Detalle productos
		Producto arequipe = new Producto("Arequipe Alpina x 50g",1,12,990);
		Producto avena = new Producto("Avena Alpina x 250g",2,12,2.990);
		Producto barra = new Producto("Barra tosh lyne x 23g",3,12,1.120);
		Producto bimbo = new Producto("Bimboletes bimbo sabor coco x 40g",4,12,1.250);
		Producto choclitos = new Producto("Choclito limon x 27g",5,12,900);
		Producto gol = new Producto("Chocolate gol sabor coco x 31g",6,12,800);
		Producto papa = new Producto("Papa margarita x 33g",7,12,1.449);
		Producto mani = new Producto("Mani con sal x 50g",8,12,1.250);
		Producto jumbo = new Producto("Chocolatina jumbo flowblancmini ",9,12,1.599);
		Producto mix = new Producto("Chocolatina jumbo Mix x 60g",10,12,450);
		
		// Agregar productos al Dispensador
		Dispensador dispensador = new Dispensador();
		dispensador.agregarProducto(arequipe);
		dispensador.agregarProducto(avena);
		dispensador.agregarProducto(barra);
		dispensador.agregarProducto(bimbo);
		dispensador.agregarProducto(choclitos);
		dispensador.agregarProducto(gol);
		dispensador.agregarProducto(papa);
		dispensador.agregarProducto(mani);
		dispensador.agregarProducto(jumbo);
		dispensador.agregarProducto(mix);
		
		// Consultar productos
		for (Producto p : dispensador.verProductos()) {
			System.out.println(
				String.format("Producto: %s - Cantidad disponible: %s - Precio: %s",
					p.getNombre(),
					p.getCantidadDisponible(),
					p.getPrecio()));
		}
		
		// Comprar o sacar producto 1 - Cantidad compra = 5
		dispensador.comprarProducto("", 1, 5);
		
		// Ver unidades producto 1
		for (Producto p : dispensador.verUnidades("", 1)) {
			System.out.println(
					String.format("Producto: %s - Cantidad disponible: %s",
						p.getNombre(),
						p.getCantidadDisponible()));
		}
		
		// Comprar o sacar producto 1 - Cantidad compra = 7
		dispensador.comprarProducto("", 1, 7);
		
		// Ver productos agotados
		for (Producto p : dispensador.verProductosAgotados()) {
			System.out.println(
					String.format("Producto agotado: %s - Cantidad disponible: %s",
						p.getNombre(),
						p.getCantidadDisponible()));
		}
		
		// Agregar 2 unidades a producto 1
		dispensador.aumentarUnidades("", 1, 2);
		
		// Ver unidades producto 1
		for (Producto p : dispensador.verUnidades("", 1)) {
			System.out.println(
					String.format("Producto: %s - Cantidad disponible: %s",
						p.getNombre(),
						p.getCantidadDisponible()));
		}
		
	}

}
