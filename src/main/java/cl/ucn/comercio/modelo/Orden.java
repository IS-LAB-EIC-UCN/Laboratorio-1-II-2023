package cl.ucn.comercio.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import cl.ucn.comercio.observer.Sujeto;

@Entity
@Table(name="orden")
public class Orden extends Sujeto  {

	@Id
	@Column(name="orden_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int numeroOrden;
	boolean confirmado;
	boolean enviado;
	boolean entregado;

	public Orden(){

	}

	public int getNumeroOrden() {
		return numeroOrden;
	}

	public void setNumeroOrden(int numeroOrden) {
		this.numeroOrden = numeroOrden;
	}

	public boolean isConfirmado() {
		return confirmado;
	}

	public void setConfirmado(boolean confirmado) {
		this.confirmado = confirmado;
	}

	public boolean isEnviado() {
		return enviado;
	}

	public void setEnviado(boolean enviado) {
		this.enviado = enviado;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getStatus() {

		if (enviado == false && entregado == false && confirmado == true)
			return "confirmado";
		else
			if (enviado == true && entregado == false && confirmado == true)
				return "enviado";
			else
				if (enviado == true && entregado == true && confirmado == true)
					return "entregado";
		return null;
	}
	
	public void setStatus(boolean confirmado, boolean enviado, boolean entregado) {
		
		this.confirmado = confirmado;
		this.enviado = enviado;
		this.entregado = entregado;
		this.notificarObservadores();
		
	}

}
