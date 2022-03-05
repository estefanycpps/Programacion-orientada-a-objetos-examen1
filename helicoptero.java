package VehiculosAereo;

public class helicoptero {

    private float aceleracionInmediata;
    public helicoptero(){
        super(); 
        aceleracionInmediata = 5; 
    }

    public void setAcce(float acce){
        aceleracionInmediata = acce;
        System.out.println("Ahora la aceleracion inmediata es de: " + acce);
    }

    public void getAcce(){
        System.out.println("La aceleracion inmediata del helicoptero es de: " + aceleracionInmediata);
    }

    public float calcularPrecioEspecifico(){
        float precioBase = calcularPrecioEspecifico();
        float precioEspecifico = precioBase + aceleracionInmediata * 325; 
        System.out.println("El Precio Especifico de este avion de carga es de: " + precioEspecifico);
		return precioEspecifico;
    }

	public void setCalidad(int set2) {
		
	}

	public void imprimirCaracteristicas() {
		// TODO Auto-generated method stub
		
	}
}

