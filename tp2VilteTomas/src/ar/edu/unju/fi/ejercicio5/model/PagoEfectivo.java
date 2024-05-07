package ar.edu.unju.fi.ejercicio5.model;

import ar.edu.unju.fi.ejercicio5.interfaces.Pago;

public class PagoEfectivo implements Pago{
	
	private double montoPagado;
	private double fechaPago;
	
	public PagoEfectivo(double montoPagado, double fechaPago) {
		this.montoPagado = montoPagado;
		this.fechaPago = fechaPago;
	}
	
	public double getMontoPagado() {
		return montoPagado;
	}

	public void setMontoPagado(double montoPagado) {
		this.montoPagado = montoPagado;
	}

	public double getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(double fechaPago) {
		this.fechaPago = fechaPago;
	}

	@Override
	public void realizarPago(double monto) {
		
	}

	@Override
	public void imprimirRecibo() {
		System.out.println("\nFecha de Pago "+getFechaPago());
		System.out.println("\nMonto Pagado: "+getMontoPagado());
	}
	
}
