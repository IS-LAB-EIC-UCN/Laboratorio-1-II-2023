package cl.ucn.comercio.modelo;

import java.util.List;

public class AdaptadorProveedorAfel implements Adaptador {

	private ProveedorAfel proveedor;


	public AdaptadorProveedorAfel(ProveedorAfel proveedor) {
		this.proveedor = proveedor;
	}
	
	@Override
	public List<Producto> getCelulares(String marca, int anho, int pulgadas) {
		// TODO Auto-generated method stub
		List<Producto> listaProductos = null;

		// TODO Auto-generated method stub
		if (anho == -1 && pulgadas != -1 && marca == null)
			listaProductos = proveedor.getAfelCelularTamanho(pulgadas);

		return listaProductos;
	}

}
