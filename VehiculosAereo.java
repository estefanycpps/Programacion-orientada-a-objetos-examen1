package VehiculosAereo;
import java.util.Scanner;

public class VehiculosAereo {
public static void main(String[] args) throws Exception{
    Scanner input = new Scanner(System.in);
        
       
    
     int op1, op2;
     float set1;
     int set2;
     char continuar;
     

       
        System.out.println("Seleccione el vehiculo que desea diseñar");
        System.out.println("\1 Avion de Carga");
        System.out.println("\2 Avioneta");
        System.out.println("\3 Helicoptero");
        System.out.println("\4 Avion de Pasajeros");
        System.out.println("Opciones: ");

      
        op1 = input.nextInt();



        switch(op1){
            case 1:
                System.out.println("Diseñe su avion de carga");
                aviondecarga slinky = new aviondecarga();
                System.out.println("Se ha culminado con exito su vehiculo");
                System.out.println("Seleccione las siguientes opciones para seguir modificando:");
               
                
                
                while(true){
                    System.out.println();
                    System.out.println("Complete las siguientes caracteristicas: ");
                    System.out.println("1. Modelo");
                    System.out.println("2. Cantidad de motores");
                    System.out.println("3. Capacidad");
                    System.out.println("4. Velocidad");
                    System.out.println("5. Volumen Disponible");
                    System.out.println("6. Ninguna de las anteriores");
                    System.out.println("Opciones: ");
                    op2 = input.nextInt();

                    
                    
                    switch(op2){
                    
                        case 1:
                            System.out.println("Diseñe el Modelo: ");
                            set1 = input.nextFloat();
                            slinky.setPeso(set1);
                            break;
                        case 2:
                            System.out.println("Diseñe la Cantidad de motores: ");
                            set1 = input.nextFloat();
                            slinky.setCargaMaxima(set1);
                            break;
                        case 3:
                            System.out.println("Diseñe la Capacidad del vehiculo: ");
                            set2 = input.nextInt();
                            slinky.setHelices(set2);
                            break;
                        case 4:
                            System.out.println("Modificando la velocidad maxima");
                            set2 = input.nextInt();
                            slinky.setVelM(set2);
                            break;
                        case 5:
                            System.out.println("Diseñe el volumen disponible: (NUMERO ENTERO)");
                            set2 = input.nextInt();
                            slinky.setVolumen(set2);
                            break;
                        default:
                        System.out.println("Esta opcion no es permitida");
                        continue;
                    }
                    
                    
                    
                    System.out.println("Desea seguir diseñando: (Y/N)?");
                    continuar = input.next().charAt(0);

                    if(continuar != 'Y' && continuar != 'y'){
                        break;
                    }

                }
                slinky.imprimirCaracteristicas();
                slinky.calcularPrecioEspecifico();
                break;
                 
                

            case 2:
                System.out.println("Diseñe la avioneta");
                avioneta blinky = new avioneta();
                System.out.println("Se ha culminado con exito su vehiculo");
                System.out.println("Seleccione las siguientes opciones para seguir modificando:");
               
                
                
                
                while(true){
                    System.out.println();
                    System.out.println("Complete las siguientes caracteristicas: ");
                    System.out.println("1. Modelo");
                    System.out.println("2. Cantidad de motores");
                    System.out.println("3. Capacidad");
                    System.out.println("4. Velocidad");
                    System.out.println("5. Volumen Disponible");
                    System.out.println("6. Ninguna de las anteriores");
                    System.out.println("Opciones: ");
                    op2 = input.nextInt();
                    
                    
                    

                    switch(op2){
                    case 1:
                        System.out.println("Diseñe el Modelo: ");
                        set1 = input.nextFloat();
                        slinky.setPeso(set1);
                        break;
                    case 2:
                        System.out.println("Diseñe la Cantidad de motores: ");
                        set1 = input.nextFloat();
                        slinky.setCargaMaxima(set1);
                        break;
                    case 3:
                        System.out.println("Diseñe la Capacidad del vehiculo: ");
                        set2 = input.nextInt();
                        slinky.setHelices(set2);
                        break;
                    case 4:
                        System.out.println("Modificando la velocidad maxima");
                        set2 = input.nextInt();
                        slinky.setVelM(set2);
                        break;
                    case 5:
                        System.out.println("Diseñe el volumen disponible: (NUMERO ENTERO)");
                        set2 = input.nextInt();
                        slinky.setVolumen(set2);
                        break;
                    default:
                    System.out.println("Esta opcion no es permitida");
                    continue;
                    }
                    
                    
                    
                    
                    System.out.println("Desea seguir realizando cambios: (Y/N)?");
                    continuar = input.next().charAt(0);

                    if(continuar != 'Y' && continuar != 'y'){
                        break;
                    }
                }
                blinky.imprimirCaracteristicas();
                blinky.calcularPrecioEspecifico();
                break;

                
                
                
            case 3:
                System.out.println("Diseñe el avion de pasajeros");
                aviondepasajeros clinky = new aviondepasajeros();
                System.out.println("Se ha culminado con exito su vehiculo");
                System.out.println("Seleccione las siguientes opciones para seguir modificando:");
               
                
                
                
                while(true){
                	System.out.println();
                    System.out.println("Complete las siguientes caracteristicas: ");
                    System.out.println("1. Modelo");
                    System.out.println("2. Cantidad de motores");
                    System.out.println("3. Capacidad");
                    System.out.println("4. Velocidad");
                    System.out.println("5. Volumen Disponible");
                    System.out.println("6. Ninguna de las anteriores");
                    System.out.println("Opciones: ");
                    op2 = input.nextInt();
                    
                    
                    
                    
                    
                    switch(op2){
                    case 1:
                        System.out.println("Diseñe el Modelo: ");
                        set1 = input.nextFloat();
                        slinky.setPeso(set1);
                        break;
                    case 2:
                        System.out.println("Diseñe la Cantidad de motores: ");
                        set1 = input.nextFloat();
                        slinky.setCargaMaxima(set1);
                        break;
                    case 3:
                        System.out.println("Diseñe la Capacidad del vehiculo: ");
                        set2 = input.nextInt();
                        slinky.setHelices(set2);
                        break;
                    case 4:
                        System.out.println("Modificando la velocidad maxima");
                        set2 = input.nextInt();
                        slinky.setVelM(set2);
                        break;
                    case 5:
                        System.out.println("Diseñe el volumen disponible: (NUMERO ENTERO)");
                        set2 = input.nextInt();
                        slinky.setVolumen(set2);
                        break;
                    default:
                    System.out.println("Esta opcion no es permitida");
                    continue;
                    }
                    }
                    System.out.println("Desea seguir realizando cambios: (Y/N)?");
                    continuar = input.next().charAt(0);
                    if(continuar != 'Y' && continuar != 'y'){
                        break;
                    }

                }
                aviondecarga clinky;
				clinky.imprimirCaracteristicas();
                clinky.calcularPrecioEspecifico();
                break;
                
                

            case 4:
                System.out.println("Diseñe su Helicoptero");
                helicoptero dlinky = new helicoptero();
                System.out.println("Se ha culminado con exito su vehiculo");
                System.out.println("Seleccione las siguientes opciones para seguir modificando:");
                
                
                
                
                while(true){
                	System.out.println();
                    System.out.println("Complete las siguientes caracteristicas: ");
                    System.out.println("1. Modelo");
                    System.out.println("2. Cantidad de motores");
                    System.out.println("3. Capacidad");
                    System.out.println("4. Velocidad");
                    System.out.println("5. Volumen Disponible");
                    System.out.println("6. Ninguna de las anteriores");
                    System.out.println("Opciones: ");
                    op2 = input.nextInt();
                    
                    
                    
                    
                    aviondecarga slinky;
					switch(op2){
                    case 1:
                        System.out.println("Diseñe el Modelo: ");
                        set1 = input.nextFloat();
                        slinky.setPeso(set1);
                        break;
                    case 2:
                        System.out.println("Diseñe la Cantidad de motores: ");
                        set1 = input.nextFloat();
                        slinky.setCargaMaxima(set1);
                        break;
                    case 3:
                        System.out.println("Diseñe la Capacidad del vehiculo: ");
                        set2 = input.nextInt();
                        slinky.setHelices(set2);
                        break;
                    case 4:
                        System.out.println("Modificando la velocidad maxima");
                        set2 = input.nextInt();
                        slinky.setVelM(set2);
                        break;
                    case 5:
                        System.out.println("Diseñe el volumen disponible: (NUMERO ENTERO)");
                        set2 = input.nextInt();
                        slinky.setVolumen(set2);
                        break;
                        default:
                        System.out.println("Opcion Invalida");
                        continue;

                    }
                    System.out.println("Desea seguir realizando cambios: (Y/N)?");
                    continuar = input.next().charAt(0);

                    if(continuar != 'Y' && continuar != 'y'){
                        break;
                    }

                }
                dlinky.imprimirCaracteristicas();
                dlinky.calcularPrecioEspecifico();
                break;

            default:
                System.out.println("Entrada invalida, finalizando el programa");
                input.close();
                return;
        }
        System.out.println("El programa ha sido terminado con exito");
        input.next();
        input.close();

    }
