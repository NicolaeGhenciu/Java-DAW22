package utilidades;

import java.util.Date;

public class RegistrosOperaciones {

	private String email;
	private Date fecha;
	private String tipoOperacion;
	private int tripletes;
	private int fallos;

	public RegistrosOperaciones(String email, Date fecha, String tipoOperacion, int tripletes, int fallos) {
		this.email = email;
		this.fecha = fecha;
		this.tipoOperacion = tipoOperacion;
		this.tripletes = tripletes;
		this.fallos = fallos;
	}

	@Override
	public String toString() {
		return "Fecha: " + fecha + ", Operacion: " + tipoOperacion + ", Tripletes: " + tripletes + ", Fallos: " + fallos
				+ "\n\n";
	}

	public int getTripletes() {
		return tripletes;
	}

	public void setTripletes(int tripletes) {
		this.tripletes = tripletes;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	public int getFallos() {
		return fallos;
	}

	public void setFallos(int fallos) {
		this.fallos = fallos;
	}

}