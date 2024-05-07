import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la maquina expendedora de bebidas");
        System.out.println("Elegi una opcion de las siguientes: ");
        System.out.println("1 Cafe");
        System.out.println("2 Mate");
        System.out.println("3 Gaseosa");
        System.out.println("4 Cerveza");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Cafe, Buenisima eleccion");              
                break;
            case 2:
                System.out.println("Mate, Debes ser Argentino, Uruguayo o Paraguayo");
                break;
            case 3:
                System.out.println("Gaseosa, Tene cuidado con el azucar porque es mala para la salud");
                break;
            case 4:
                System.out.println("Cervezsa, Si tomaste cerveza no manejes, por favor");
                break;        
            default:
                System.out.println("Opcion no valida, Fin del programa");
                break;   
        }

        if (opcion <=4){
            System.out.println("¡Disfrute su bebida!");
            
        }
            scanner.close();
    }
}
