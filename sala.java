    import java.util.Scanner;
public class sala {

  
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    // contruir la matriz de sillas s1 s2 fila s3 s4
boolean [][]asientos = {
  {true, true, true, true},     //true S false o s1 s2
  {true, true, true, true},
  {true, true, true, true}
}; // s3 s4

      //visualizar la sala al inicio
      System.out.println("Estado de las sillas (D disponible O Ocupada) ");
      System.out.println(" [ " +(asientos [0][0] ? "D": "O")+"]["+(asientos[0][0]?"D":"O")+"]");
      System.out.println(" [ " +(asientos [0][0] ? "D": "O")+"]["+(asientos[0][1]?"D":"O")+"]");
      System.out.println(" [ " +(asientos [0][0] ? "D": "O")+"]["+(asientos[0][2]?"D":"O")+"]");
      System.out.println(" [ " +(asientos [0][0] ? "D": "O")+"]["+(asientos[0][3]?"D":"O")+"]");


//solicitar clave
System.out.print("INGRESE LA CLAVE: ");
String clave = teclado.nextLine();
while (clave.equalsIgnoreCase("cinemark")){
 //generar el menu (1 2)
 System.out.println("SALA DE CINE SISTEMA");
 System.out.println("1. SELECCIONAR SILLA ");
 System.out.println("2. VER SALA ACTUAL ");
 System.out.println ("INGRESE UNA OPCION ");
 int opcion = teclado.nextInt();
 switch (opcion){
     case 1:
       System.out.print("INGRESE LA FILA 1 2 ");
       int fila = teclado.nextInt()-1; // quiar fila 
       System.out.print("INGRESE LA COLUMNA 1 2");
       int columna = teclado.nextInt ()-1; //quitar columna
    if ( fila>=0 && fila <2 && columna >=0 && columna <2){
        if (asientos [fila][columna]){
            asientos[fila][columna]= false;// cambio
        }
    }  
    break;
    
    
 }


}

}
}

