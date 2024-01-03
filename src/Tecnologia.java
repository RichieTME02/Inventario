import java.util.Scanner;

public class Tecnologia extends Producto{

    private int memoriaRam;
    private String tipoCarga;
    private String tipoRed;
    private int almacenamiento;


    public Tecnologia(String nombre, double precio, String codigo, int cantidad, String marca, int memoriaRam, String tipoCarga, String tipoRed, int almacenamiento) {
        super(nombre, precio, codigo, cantidad, marca);
        this.memoriaRam = memoriaRam;
        this.tipoCarga = tipoCarga;
        this.tipoRed = tipoRed;
        this.almacenamiento = almacenamiento;
    }

    public Tecnologia() {
    }



    @Override
    public String toString(){
        return "El equipo tecnologico"+this.nombre+"es de marca: "+this.marca;
    }

    @Override

    public void ingresarProducto(){
        super.ingresarProducto();
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingres la memoria Ram del equipo tecnologico: ");
        this.memoriaRam=sc.nextInt();
        System.out.println("Ingrese el tipo de carga del equipo tecnologico: ");
        this.tipoCarga=sc.next();
        System.out.println("Ingrese el tipp de red del equipo tecnologico: ");
        this.tipoRed=sc.next();
        System.out.println("Ingrese el almacenamiento de red del equipo tecnologico: ");
        this.almacenamiento= sc.nextInt();
    }

    @Override
    public void imprimirProducto(){
        super.imprimirProducto();
        System.out.println("Memoria Ram: "+memoriaRam);
        System.out.println("Tipo de Carga: "+tipoCarga);
        System.out.println("Tipo de red: "+tipoRed);
        System.out.println("Almacenamiento: "+almacenamiento);
    }



    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public String getTipoRed() {
        return tipoRed;
    }

    public void setTipoRed(String tipoRed) {
        this.tipoRed = tipoRed;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }



}
