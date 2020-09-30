package ule.iso1.singleton;



public class VATtoApply {

   
    private double vatType;
    private static VATtoApply uniqueInstance;
   
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
	
	public static VATtoApply getInstance(double vat) { 			//publico porque se tiene que poder ver desde el Main
																//estático porque se tiene que poder instanciar sin haber creado una instancia de esta clase (porque no se puede al haber privatizado el constructor)
		//Controlamos que solamente se crea una instancia aunque llamemos infinitas veces al método
		if(uniqueInstance == null) {	//si la variable es vacía aún no se ha creado ninguna instancia
			
			uniqueInstance = new VATtoApply(vat); //llamo al constructor para crear la instancia y la inserto en el atributo
						
			
		}
		
		//si el atributo no es nulo, es que tiene ya una instancia, sea porque la tenia de una llamada anterior a este metodo o porque la acabamos de crear, luego devolvemos esa
		return uniqueInstance;	
		
	}	

}

/**
 * 
 * 1-Crear una variable privada que sea la única instancia
 * 2-El constructor tiene que ser privado
 * 3-Crear un método que se encargue de crear esa única instancia
 * 
 */