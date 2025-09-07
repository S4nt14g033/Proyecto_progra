public class casillero {
    //crear la matriz 
    private paquete[][] casilleros;

    public casillero (int filas, int columnas) { // crear constructor para la matriz
        casilleros = new paquete[4][4];
    }
    /*El metodo que vamos a utilizar para registrar los paquete en una posicion especifica sera el siguiente
     * si el casillero esta vacio se podra registrar el paquete y retornara true de lo contrario retornara false */

    public boolean registrarPaquete(int fila, int columna, paquete p){ // la variable para el paquete la llamaremos p

        //ahora creamos la condicion para saber si hay un espacio libre
        //como lo que esta arriba si la fila y la columna es igual a "null" se puede registrar el paquete


        if(casilleros[fila][columna]== null){
            casilleros[fila][columna]= p;
            return true; //por eso retorna un "true" si se registra osea si se cumple la condicion
        }
        return false; // de lo contrario retorna un "false"
    }
        //metodo para saber si un casillero esta ocupado o para saber el estado del casillero ¿ok?
        public void estadoCas() { 
            for (int i = 0; i < casilleros.length; i++) { // recorrer filas
                for (int j = 0; j < casilleros[i].length; j++) { // recorrer columnas
                    // Mostrar [] si está vacío o [X] si está ocupado
                    System.out.print((casilleros[i][j] == null ? "[ ]" : "[x]") + " "); // Imprimir en la misma línea
                }
                System.out.println(); // Hacer un salto de línea al final de cada fila
            }
            System.out.println(); // Salto de línea adicional después de mostrar toda la matriz
        }

             // Método que devuelve el paquete almacenado en la posición 
             // Retorna null si no hay paquete en esa posición
                public paquete getpaquete(int fila, int columna){ {
                 return casilleros[fila][columna];
    }
        }
}
