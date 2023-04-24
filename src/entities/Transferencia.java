package entities;

import java.time.LocalDate;

public class Transferencia {

 private int numTransferencia;
 private Cuenta cuentaOrigen;
 private Cuenta ctaDestino;
 private double monto;
 private LocalDate fechaTransferencia;


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

 @Override
 public String toString() {
  return "\n"+"Transferencia{" +
          "numTransferencia=" + numTransferencia +
         // ", cuentaOrigen=" + cuentaOrigen +
         // ", ctaDestino=" + ctaDestino +
          ", monto=" + monto +
          ", fechaTransferencia=" + fechaTransferencia +
          '}';
 }
}



