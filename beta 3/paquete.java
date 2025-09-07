//creamos la clase paquete con sus atributos 
public class paquete {
    private String destino; //variable 1
    private String ingreso; //variable 2

    //creamos el constructor con sus this 
public paquete(String destino, String ingreso) {
    this.destino = destino; 
    this.ingreso = ingreso;
}
    //creamos los gets para poder obtener el valor de las variables
    public String getDestino() { return destino;}   
    public String getIngreso() { return ingreso; }


}