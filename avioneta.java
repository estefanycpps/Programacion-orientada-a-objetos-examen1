package VehiculosAereo;

public class avioneta {

    private float coeficienteDeAerodinamismo; 

    public avioneta(){
    	super(); 
        coeficienteDeAerodinamismo = 0.5f;       
    }
    
    

    public void setAero(float aero){
        coeficienteDeAerodinamismo = aero;
        System.out.println("Ahora el coeficiente de aerodinamismo es de: " + aero);
    }
    
    
    

    public void getAero(){
        System.out.println("El aerodinamismo de la avioneta es de: " + coeficienteDeAerodinamismo);
    }

    
    
    
    public void calcularPrecioEspecifico1(){
        float precioBase = calcularPrecioBase();
        float precioEspecifico = precioBase + coeficienteDeAerodinamismo * 175;
        System.out.println("El Precio Especifico de este avion de carga es de: " + precioEspecifico);
    }



	public void imprimirCaracteristicas() {
		// TODO Auto-generated method stub
		
	}



	public void calcularPrecioEspecifico() {
		// TODO Auto-generated method stub
		
	}
}
