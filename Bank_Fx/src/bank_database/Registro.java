package bank_database;

import java.util.Date;

public class Registro {

	private int id;
	private Date fecha;
	private String tipo;
	private String remitente;
	private String destinatario;
	private float cantidad;

	public Registro(int id, Date fecha, String tipo, String remitente, String destinatario, float cantidad) {
		this.id = id;
		this.fecha = fecha;
		this.tipo = tipo;
		this.remitente = remitente;
		this.destinatario = destinatario;
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "ID = " + id + ", fecha = " + fecha + ", tipo = " + tipo + ", remitente = " + remitente
				+ ", destinatario = " + destinatario + ", cantidad = " + cantidad + " €\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	
	

}