import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alimento extends Producto{

    private String fechaElaboracion;
    private String fechaExpiracion;
    private List<String> ingredientes =new ArrayList<>();

    public Alimento(String nombre, double precio, String codigo, int cantidad, String marca, String fechaElaboracion, String fechaExpiracion, List<String> ingredientes) {
        super(nombre, precio, codigo, cantidad, marca);
        this.fechaElaboracion = fechaElaboracion;
        this.fechaExpiracion = fechaExpiracion;
        this.ingredientes = ingredientes;
    }

    public Alimento() {
    }

    @Override
    public void ingresarProducto(){
        super.ingresarProducto();
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese la fecha de elaboracion del producto: ");
        this.fechaElaboracion= sc.next();
        System.out.println("Ingrese la fecha de expiracion del producto: ");
        this.fechaExpiracion =sc.next();

    }

    @Override
    public void imprimirProducto(){
        super.imprimirProducto();
        System.out.println("Fecha de elaboracion: "+fechaElaboracion);
        System.out.println("Fecha de expiracion: "+fechaExpiracion);
    }



    public String getFechaElaboracion() {
        return fechaElaboracion;
    }

    public void setFechaElaboracion(String fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
