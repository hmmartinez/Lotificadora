package lotificadora;
import java.util.Scanner;

public class Lotificadora {

    static Proyecto_Lotificadora xy = new Proyecto_Lotificadora();
    public static void main(String[] args) {
        int opc = 0;
        Scanner leer = new Scanner(System.in);
        do {
        System.out.println(" *********** LOTIFICADORA ***********");
        System.out.println("1. Venta de Terreno");
        System.out.println("2 Consulta/Reportes");
        System.out.println("3. Salir");
        System.out.println("Elija su opción: ");
        opc = leer.nextInt();
        boolean ocu;
        
        switch(opc){
            case 1: 
                System.out.print("Ingrese la fila del terreno a vender: ");
                int fila = leer.nextInt();
                System.out.print("Ingrese la columna del terreno a vender: ");
                int columna = leer.nextInt();
                    if(fila <= 4 && columna <= 4){
                        ocu = xy.ocupado(fila, columna);
                        if(ocu){
                                System.out.print("\nTerreno Disponible.");
    				System.out.print("\n Por favor, ingrese el largo: ");
    				double  largo = leer.nextDouble();
    				System.out.print("\nPor favor, ingrese el ancho: ");
    				double ancho = leer.nextDouble();
    				System.out.print("\nIngrese el precio: ");
    				double precio = leer.nextDouble();
    				xy.terrenos[fila][columna] = new Terreno(largo, ancho, precio);
    				System.out.println("\nTerreno Vendido.");                            
                        } else {
                            System.out.println("Terreno no está disponible.");
                        }
                    } else {
                        System.out.println("Coordenadas inválidas.");
                    }
                break;
            case 2:
                System.out.println(" ******* REPORTES *******");
                System.out.println("1. Cantidad de terrenos vacios y ocupados");
                System.out.println("2. Total de ganancias");
                System.out.println("Elija una opción: ");
                int opc2 = leer.nextInt();
                
                switch(opc2){
                    case 1:
                        System.out.println("Terrenos Ocupados: "+xy.ocupados());
                        System.out.println("Terrenos Vacios: "+xy.LosVacios());
                        break;
                    case 2:
                        System.out.println("Total ganancias: "+xy.totalPagar());
                        break;
                }
            case 3:
                System.out.println("Saliendo...");
                break;
        } 
    }while (opc != 3);
        
    }
}
        