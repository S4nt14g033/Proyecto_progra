import java.time.LocalDate;// para manejar horas facilmente
//creamos la clase paquete con sus atributos 
public class paquete {
    private String destino; //variable 1
    private LocalDate fechaIngreso; //variable 2

    //creamos el constructor con sus this 
public paquete(String destino) {
    this.destino = destino; 
    this.fechaIngreso = LocalDate.now(); //asigna fecha actual autimaticamente
}
    //creamos los gets para poder obtener el valor de las variables
    public String getDestino() {
        return destino;
    }   
    public LocalDate getfechaIngreso() {
        return fechaIngreso; 
    }


}