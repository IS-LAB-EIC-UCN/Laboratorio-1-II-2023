package cl.ucn.comercio.modelo;

import java.util.List;

public class AdaptadorProveedorAcme implements Adaptador{

	
	private ProveedorAcme proveedor;
	
	public AdaptadorProveedorAcme(ProveedorAcme proveedor) {
		this.proveedor = proveedor;
	}
	
	@Override
	public List<Producto> getCelulares(String marca, int anho, int pulgadas) {
		
		List<Producto> listaProductos = null;
		
		// TODO Auto-generated method stub
		if (anho == -1 && pulgadas == -1 && marca != null)
			listaProductos = proveedor.getAcmeCelularesMarca(marca);
		
		return listaProductos;
	}

}
