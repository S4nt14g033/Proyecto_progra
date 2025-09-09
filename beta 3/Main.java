import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        casillero casillero = new casillero(4,4); // matriz 4x4 aqui se crea 

        boolean joel = true;


        while(joel){
            System.out.println("Bienvenido a Slots's MJ "+
                        "\nQue desea hacer el dia de hoy? " +
                        "\n1. Registrar paquete" +
                        "\n2. Ver estado de los casilleros" +
                        "\n3. Informacion del paquete"+
                        "\n4. Salir");
            int opcion = sc.nextInt();
            
            /*
             * [0][0] [0][1] [0][2] [0][3]
               [1][0] [1][1] [1][2] [1][3]  estas son las posiciones de cada 
               [2][0] [2][1] [2][2] [2][3]  una de las celdas
               [3][0] [3][1] [3][2] [3][3]
             */

            switch (opcion) {
                case 1:
                    System.out.print("Fila (0 - 3): "); // de 0 a 3 porque es una matriz 4x4 
                    int f = sc.nextInt(); // "f" para fila
                    System.out.print("Columna (0 - 3): "); 
                    int c = sc.nextInt(); // "c" para columna
                    sc.nextLine(); // limpiar buffer
                    System.out.print("Destinatario: "); 
                    String dest = sc.nextLine();
                    /*System.out.print("Fecha: "); 
                    String fecha = sc.nextLine();*/

                    paquete p = new paquete(dest); // crear paquete
                    
                    // agregamos una condicion para que no se salga del rango de la matriz 
                    if(casillero.registrarPaquete(f, c, p)){
                        System.out.println("Paquete registrado exitosamente.");
                    } else {
                        System.out.println("Error: Casillero ocupado.");
                    }
                    //agregamos otrA condicion por si ingresa un numero mayor 4 o menor a 1, solo por si a caso (por si ahi gente como leandro )
                    if(f < 0 || f > 4 || c < 0 || c > 4){
                        System.out.println("Error: Fila o columna fuera de rango.");
                        break; // salir del case
                    }
                case 2:
                    casillero.estadoCas(); // mostrar el estado del casillero 
                    break;
        

                case 3:

                System.out.print("Fila (0-3): "); 
                f = sc.nextInt();
                System.out.print("Columna (0-3): "); 
                c = sc.nextInt();

                paquete info = casillero.getpaquete(f, c);  //metodo para obtener la informacion del paquete   
 
                if (info != null) { // esta llinea se lee como "si info es diferente de null" el "!" es un operador logico que significa "diferente de"
                    System.out.println(" Destino: " + info.getDestino()); // si la condicion se cumple muestra el destino y la fecha
                    System.out.println(" Fecha de Ingreso: " + info.getfechaIngreso());
                } else {
                    System.out.println(" Casillero vacío."); // de lo contrario tomara que el casillero esta vacio 
                }
                break;
                    
                case 4:
                    joel= false; // salir del while o el bucle o del programa o del todo


                }

    }
    sc.close();

}}
