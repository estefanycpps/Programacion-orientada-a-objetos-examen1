package VehiculosAereo;

public class aviondecarga {

private int volumenDisponible; 

public void carga(){
    super("Avion de Carga", 30086, 26754, 0, 3, 322, 121); 
    volumenDisponible =100; 
}

public void setVolumen(int vol){
    volumenDisponible = vol;
    System.out.println("El volumen disponible es de: " + vol);
}

public void getVolumen(){
    System.out.println("El volumen actual disponible es de: " + volumenDisponible);
}

public float calcularPrecioEspecifico(){
    float precioBase = calcularPrecioEspecifico();
    float precioEspecifico = precioBase + volumenDisponible * 300;
    System.out.println("El Precio Especifico de este avion de carga es de: " + precioEspecifico);
	return precioEspecifico;
}

public void setPeso(float set1) {
	// TODO Auto-generated method stub
	
}

public void imprimirCaracteristicas() {
	// TODO Auto-generated method stub
	
}

public void setCargaMaxima(float set1) {
	// TODO Auto-generated method stub
	
}

public void setHelices(int set2) {
	// TODO Auto-generated method stub
	
}

public void setVelM(int set2) {
	// TODO Auto-generated method stub
	
}
    
}
