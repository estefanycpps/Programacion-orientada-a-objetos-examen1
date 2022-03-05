package VehiculosAereo;

public class clasesdevehiculos {

    private float modelo;
    private float cantidademotores;
    private float capacidad;
    private int volumen;
    private int velocidad;

    private boolean encendido = false;
    private boolean enAire = false;
    
    

    public void VehiculoAereo(float modelo, float cantidaddemotores, float capacidad, int volumen, int velocidad, float cantidademotores){
        this.modelo = modelo;
        this.cantidademotores = cantidademotores;
        this.capacidad = capacidad;
        this.volumen = volumen;
        this.velocidad = velocidad;   
    }

 
    public void setmodelo(float modelo){
       this.modelo = modelo;
        System.out.println("El modelo: " + modelo);
    }

    public void setcantidademotores(int cantidademotores){
        this.cantidademotores = cantidademotores;
        System.out.println("La cantidad de motores es: " + cantidademotores);
    }

    public void setcapacidad(int capacidad){
       this.capacidad = capacidad;
        System.err.println("La capacidad es: " + capacidad);
    }

    public void setvelocidad(int velocidad){
        this.velocidad = velocidad;
        System.out.println("La velocidad es: " + velocidad);
    }

    public void setvolumen(int volumen){
       this.volumen = volumen;
        System.out.println("El volumen es de: " + volumen);;
    }

   
    public void encender(){
        if(encendido){
            System.out.println("El vehiculo aereo se encuentra encendido");
        }
        else{
            System.out.println("Encendiendo el vehiculo");
            encendido = true;
        }
    }

    public void apagar(){
        if(encendido == false){
            System.out.println("El vehiculo aereo se encuentra apagado");
            return;
        }
        if(enAire){
            System.out.println("no es permitido encender el vehiculo en el aire!!!");
        }
        else{
            encendido = false;
        }
    }

    public void despegar(){
        if(enAire){
            System.out.println("El vehiculo aereo ya despego");
            return;  
        }

        if(encendido == false){
            System.out.println("No se puede despegar con el vehiculo apagado");
        }

        else{
            System.out.println("Despegando");
            enAire = true;
        }
    }

    public void aterrizar(){
        if(enAire == false){
            System.out.println("El vehiculo aereo ya esta en tierra");
            return;
        }

        System.out.println("Dirigiendose a tierra");
        enAire = false;
    }

   
   
    public void imprimirCaracteristicas(){
        System.out.println("El modelo del vehiculo es: " + modelo);
        System.out.println("La cantidad de motores del vehiculo es: " + cantidademotores);
        System.out.println("La capacidad del vehiculo es: " + capacidad);
        System.out.println("El volumen del vehiculo es: " + volumen);
        System.out.println("L del vehiculo es: " + velocidad);
    
    }

   
    public float calcularPrecioBase(){
        float precio = 50 *cantidademotores + 20 * capacidad + 4* volumen; 
        return precio;
    }


}