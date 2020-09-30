package ule.iso1.singleton;



public class VATtoApply {

   
    private double vatType;
    private VATtoApply uniqueInstance;
   
    /**
     * MODIFICAR PARA CONSEGUIR QUE SEA SINGLETON
     */

    private VATtoApply(double vat) {
    	vatType=vat;
    }
  
   

	public double getVatType() {
		return vatType;
	}

	public void setVatType(double vatType) {
		this.vatType = vatType;
	}

}

/**
 * 
 * 1-Crear una variable privada que sea la única instancia
 * 2-El constructor tiene que ser privado
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */