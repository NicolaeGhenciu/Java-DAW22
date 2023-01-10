package Objetos3;

import java.sql.Date;

public class Prestamo {
	
	double interesAnual;
	int numeroAños;
	double montante;
	Date fecha;
	
	public Prestamo (double interesAnual, int numeroAños, double montante) {
		this.interesAnual = interesAnual;
		this.numeroAños = numeroAños;
		this.montante = montante;
	}
	
	public Prestamo() {
		this(2.5,1,1000);
	}

	@Override
	public String toString() {
		return "Prestamo [interesAnual=" + interesAnual + ", numeroAños=" + numeroAños + ", montante="
				+ montante + ", fecha=" + fecha + "]";
	}

	public double getInteresAnual() {
		return interesAnual;
	}

	public void setInteresAnual(double interesAnual) {
		this.interesAnual = interesAnual;
	}

	public int getNumeroAños() {
		return numeroAños;
	}

	public void setNumeroAños(int numeroAños) {
		this.numeroAños = numeroAños;
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
	double pagomensual = montante * interesmensual / (1 - 1 / Math.pow(1 + interesmensual, numeroAños * 12));
	pagomensual = ((pagomensual * 100) /100.0);
	return pagomensual;
	}
	
	public double totalPagar() {
		double pagototal = pagoMensual() * numeroAños * 12;
		pagototal = ((pagototal * 100) / 100.0);
		return pagototal;
		
	}
	
}
