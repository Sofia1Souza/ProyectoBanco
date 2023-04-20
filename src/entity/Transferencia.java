package entity;

import java.time.LocalDate;

public class Transferencia {

 private int numOperacion;
 private long ctaDestino;
 private LocalDate fechaTransaccion;
 private String descripcion;
 private double monto;
 private Cuenta cuenta;


 public Transferencia() {
 }

 public Transferencia(int numOperacion, long ctaDestino, LocalDate fechaTransaccion, String descripcion, double monto, Cuenta cuenta) {
  this.numOperacion = numOperacion;
  this.ctaDestino = ctaDestino;
  this.fechaTransaccion = fechaTransaccion;
  this.descripcion = descripcion;
  this.monto = monto;
  this.cuenta = cuenta;
 }

 public int getNumOperacion() {
  return numOperacion;
 }

 public void setNumOperacion(int numOperacion) {
  this.numOperacion = numOperacion;
 }

 public long getCtaDestino() {
  return ctaDestino;
 }

 public void setCtaDestino(long ctaDestino) {
  this.ctaDestino = ctaDestino;
 }

 public LocalDate getFechaTransaccion() {
  return fechaTransaccion;
 }

 public void setFechaTransaccion(LocalDate fechaTransaccion) {
  this.fechaTransaccion = fechaTransaccion;
 }

 public String getDescripcion() {
  return descripcion;
 }

 public void setDescripcion(String descripcion) {
  this.descripcion = descripcion;
 }

 public double getMonto() {
  return monto;
 }

 public void setMonto(double monto) {
  this.monto = monto;
 }

 public Cuenta getCuenta() {
  return cuenta;
 }

 public void setCuenta(Cuenta cuenta) {
  this.cuenta = cuenta;
 }

 @Override
 public String toString() {
  return "Transferencia{" +
          "numOperacion=" + numOperacion +
          ", ctaDestino=" + ctaDestino +
          ", fechaTransaccion=" + fechaTransaccion +
          ", descripcion='" + descripcion + '\'' +
          ", monto=" + monto +
          ", cuenta=" + cuenta +
          '}';
 }
}



