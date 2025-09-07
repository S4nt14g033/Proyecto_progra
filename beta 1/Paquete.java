import java.time.LocalDate; //Para manejar horas facilmente

public class Paquete{
    private String Destinatario;
    private LocalDate FechaIngreso;


    //Creacion de nuevo paquete
    public Paquete(String Destinatario){
        this.Destinatario = Destinatario;
        this.FechaIngreso = LocalDate.now(); //Asignar fecha actual automaticamente
    }

    //metodos para obtener los datos
    public String getDestinatario() {
        return Destinatario;
    }

    public LocalDate getFechaIngreso() {
        return FechaIngreso;
    }
}