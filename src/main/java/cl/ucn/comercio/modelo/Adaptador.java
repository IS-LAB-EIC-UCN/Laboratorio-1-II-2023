package cl.ucn.comercio.modelo;

import java.util.List;

public interface Adaptador {

	List<Producto> getCelulares(String marca, int anho, int pulgadas);
}
