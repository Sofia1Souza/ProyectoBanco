package entities;

import java.time.LocalDate;

public class Transferencia {

 private int numTransferencia;
 private Cuenta cuentaOrigen;
 private Cuenta ctaDestino;
 private double monto;
 private LocalDate fechaTransferencia;
 private String detalle;


 public Transferencia() {
 }

 public Transferencia(int numTransferencia, Cuenta cuentaOrigen, Cuenta ctaDestino, double monto) {
  this.numTransferencia = numTransferencia;
  this.cuentaOrigen = cuentaOrigen;
  this.ctaDestino = ctaDestino;
  this.monto = monto;
  this.fechaTransferencia = LocalDate.now();

 }

 public int getNumTransferencia() {
  return numTransferencia;
 }

 public void setNumTransferencia(int numTransferencia) {
  this.numTransferencia = numTransferencia;
 }

 public Cuenta getCuentaOrigen() {
  return cuentaOrigen;
 }

 public void setCuentaOrigen(Cuenta cuentaOrigen) {
  this.cuentaOrigen = cuentaOrigen;
 }

 public Cuenta getCtaDestino() {
  return ctaDestino;
 }

 public void setCtaDestino(Cuenta ctaDestino) {
  this.ctaDestino = ctaDestino;
 }

 public double getMonto() {
  return monto;
 }

 public void setMonto(double monto) {
  this.monto = monto;
 }

 public LocalDate getFechaTransferencia() {
  return fechaTransferencia;
 }

 public void setFechaTransferencia(LocalDate fechaTransferencia) {
  this.fechaTransferencia = fechaTransferencia;
 }

 public String getDetalle() {
  return detalle;
 }

 public void setDetalle(String detalle) {
  this.detalle = detalle;
 }

 @Override
 public String toString() {
  return  detalle;
 }
}




