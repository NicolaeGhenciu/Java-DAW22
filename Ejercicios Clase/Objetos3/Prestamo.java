package Objetos3;

import java.sql.Date;

public class Prestamo {
	
	double interesAnual;
	int numeroA�os;
	double montante;
	Date fecha;
	
	public Prestamo (double interesAnual, int numeroA�os, double montante) {
		this.interesAnual = interesAnual;
		this.numeroA�os = numeroA�os;
		this.montante = montante;
	}
	
	public Prestamo() {
		this(2.5,1,1000);
	}

	@Override
	public String toString() {
		return "Prestamo [interesAnual=" + interesAnual + ", numeroA�os=" + numeroA�os + ", montante="
				+ montante + ", fecha=" + fecha + "]";
	}

	public double getInteresAnual() {
		return interesAnual;
	}

	public void setInteresAnual(double interesAnual) {
		this.interesAnual = interesAnual;
	}

	public int getNumeroA�os() {
		return numeroA�os;
	}

	public void setNumeroA�os(int numeroA�os) {
		this.numeroA�os = numeroA�os;
	}

	public double getMontante() {
		return montante;
	}

	public void setMontante(double montante) {
		this.montante = montante;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public double pagoMensual() {
	double interesmensual = interesAnual / 1200;
	double pagomensual = montante * interesmensual / (1 - 1 / Math.pow(1 + interesmensual, numeroA�os * 12));
	pagomensual = ((pagomensual * 100) /100.0);
	return pagomensual;
	}
	
	public double totalPagar() {
		double pagototal = pagoMensual() * numeroA�os * 12;
		pagototal = ((pagototal * 100) / 100.0);
		return pagototal;
		
	}
	
}
