package Objetos3;

import java.sql.Date;

public class Prestamo {
	
	double interesAnual;
	int numeroAņos;
	double montante;
	Date fecha;
	
	public Prestamo (double interesAnual, int numeroAņos, double montante) {
		this.interesAnual = interesAnual;
		this.numeroAņos = numeroAņos;
		this.montante = montante;
	}
	
	public Prestamo() {
		this(2.5,1,1000);
	}

	@Override
	public String toString() {
		return "Prestamo [interesAnual=" + interesAnual + ", numeroAņos=" + numeroAņos + ", montante="
				+ montante + ", fecha=" + fecha + "]";
	}

	public double getInteresAnual() {
		return interesAnual;
	}

	public void setInteresAnual(double interesAnual) {
		this.interesAnual = interesAnual;
	}

	public int getNumeroAņos() {
		return numeroAņos;
	}

	public void setNumeroAņos(int numeroAņos) {
		this.numeroAņos = numeroAņos;
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
	double pagomensual = montante * interesmensual / (1 - 1 / Math.pow(1 + interesmensual, numeroAņos * 12));
	pagomensual = ((pagomensual * 100) /100.0);
	return pagomensual;
	}
	
	public double totalPagar() {
		double pagototal = pagoMensual() * numeroAņos * 12;
		pagototal = ((pagototal * 100) / 100.0);
		return pagototal;
		
	}
	
}
