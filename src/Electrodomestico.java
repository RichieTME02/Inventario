import java.util.Scanner;

public class Electrodomestico extends Producto{

    private int vidaUtilAnios;
    private String sitioFabricacion;
    private double voltajeAlimentacion;

    private String garantia;

    public Electrodomestico(String nombre, double precio, String codigo, int cantidad, String marca, int vidaUtilAnios, String sitioFabricacion, double voltajeAlimentacion, String garantia) {
        super(nombre, precio, codigo, cantidad, marca);
        this.vidaUtilAnios = vidaUtilAnios;
        this.sitioFabricacion = sitioFabricacion;
        this.voltajeAlimentacion = voltajeAlimentacion;
        this.garantia = garantia;
    }

    public Electrodomestico() {
    }

    public double intervaloMantenimiento(){
        double intervalo=vidaUtilAnios/5;
        return intervalo;
    }

    @Override
    public String toString(){
        return "El electrodomestico "+this.nombre+"es de marca: "+this.marca;
    }

    @Override
    public void ingresarProducto(){
        super.ingresarProducto();
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese la vida util del electrodomestico: ");
        this.vidaUtilAnios=sc.nextInt();
        System.out.println("Ingrese el sitio de fabricacion del elctrodomestico:  ");
        this.sitioFabricacion=sc.next();
        System.out.println("Ingrese el voltaje de consumo del electrodomestico:");
        this.voltajeAlimentacion=sc.nextDouble();
        System.out.println("Ingrese la garantia del electrodomestico: ");
        this.garantia= sc.next();
    }


    @Override
    public void imprimirProducto(){
        super.imprimirProducto();
        System.out.println("Vida util: "+vidaUtilAnios);
        System.out.println("Lugar de fabricacion: "+sitioFabricacion);
        System.out.println("Voltaje de consumo: "+voltajeAlimentacion);
        System.out.println("Garantia: "+garantia);
    }


    public int getVidaUtilAnios() {
        return vidaUtilAnios;
    }

    public void setVidaUtilAnios(int vidaUtilAnios) {
        this.vidaUtilAnios = vidaUtilAnios;
    }

    public String getSitioFabricacion() {
        return sitioFabricacion;
    }

    public void setSitioFabricacion(String sitioFabricacion) {
        this.sitioFabricacion = sitioFabricacion;
    }

    public double getVoltajeAlimentacion() {
        return voltajeAlimentacion;
    }

    public void setVoltajeAlimentacion(double voltajeAlimentacion) {
        this.voltajeAlimentacion = voltajeAlimentacion;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }
}