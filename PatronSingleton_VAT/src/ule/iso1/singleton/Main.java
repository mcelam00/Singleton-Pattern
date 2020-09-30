package ule.iso1.singleton;

public class Main {

	public static void main(String[] args) {
		   // Instancia la variable singleton
	       VATtoApply va1 = VATtoApply.getInstance(0.16);    // cambiar por la linea anterior para utilizar el patrÃ³n Singleton
	 
	      // Intenta instanciar un segundo singleton: debe devolver la misma instancia
	       VATtoApply va2 = VATtoApply.getInstance(0.20);    // cambiar por la linea anterior para utilizar el patrÃ³n Singleton
	       				/**Lo único que estoy haiendo es tener en va2 lo mismo que en va1 porque no se llamará al constructor en getInstance al tener ya una instancia anterior y el valor de parámetro se dehecha**/
	     // Comprueba que ambos objetos son referencias a la misma
	     // instancia, que es Ãºnica
	     System.out.println("Instancia 1: "+ va1.toString()+" VAT: "+ va1.getVatType());
	     System.out.println("Instancia 2: "+ va2.toString()+" VAT: "+ va2.getVatType()); //imprime el valor del IVA que al ser las 2 flechas a lo mismo en memoria, imprimirá 0.16 porque el 0.20 se desprecia al no llamarse al cosntructor dentro del metodo por existir ya la instancia
	     
	     //Modifica el valor del iva en una de las variables
	     
	     va1.setVatType(0.04); /**Para va1 ó si usara va2 da igual porque apuntan a lo mismo (acordarse que el new es el reserva el espacio, si no, solo son flechas), va2 es una flecha al espacio en memoria reservado al llamar en va1)**/
	     
	     // Comprueba que todas las variables acceden a la misma instancia modificada
	     System.out.println("Instancia 1: "+ va1.toString()+" VAT: "+ va1.getVatType());  //al haber cambiado el IVA en 1, como el resto son flechas al mismo espacio en memoria (porque solo hay una única instancia) se cambia en esa unica usando una de las flechas y todas imprimiran esa una (porque es lo que leen las otras)
	     System.out.println("Instancia 2: "+ va2.toString()+" VAT: "+ va2.getVatType());
	    
	     // Intenta instanciar una tercera variable: Todas acceden a la misma instancia
	     VATtoApply va3 = VATtoApply.getInstance(0.30);   // cambiar por la linea anterior para utilizar el patrÃ³n Singleton
	     			/**va3 otra flecha mas**/
	     System.out.println("Instancia 3: "+ va3.toString()+" VAT: "+ va3.getVatType());
	}

}
