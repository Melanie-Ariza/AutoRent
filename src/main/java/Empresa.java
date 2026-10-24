import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private int codigo;
    private String nombre;
    private List<Alquiler> listaAlquiler;
    private List <Cliente>  listaCliente;
    private List <Vehiculo>  listaVehiculo;


    public Empresa(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        listaAlquiler = new ArrayList();
        listaCliente = new ArrayList();
        listaVehiculo = new ArrayList();
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public List<Vehiculo> getListaVehiculo() {
        return listaVehiculo;
    }

    public void setListaVehiculo(List<Vehiculo> listaVehiculo) {
        this.listaVehiculo = listaVehiculo;
    }

    public List<Alquiler> getListaAlquiler() {
        return listaAlquiler;
    }

    public void setListaAlquiler(List<Alquiler> listaAlquiler) {
        this.listaAlquiler = listaAlquiler;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empresa: " +
                "codigo: " + codigo +
                ", nombre: " + nombre +
                ", lista alquiler: " + listaAlquiler +
                ", listaCliente: " + listaCliente +
                ", listaVehiculo: " + listaVehiculo;
    }

    public void mostrarDatosEmpresa(){
        System.out.println("=== AutoRent ===");
        System.out.println("Código: "+ codigo);

        System.out.println("--- Alquileres ---");
        for (Alquiler alquiler:listaAlquiler){
            System.out.println(alquiler);
        }

        System.out.println("--- Clientes ---");
        for (Cliente cliente:listaCliente){
            System.out.println(cliente);
        }

        System.out.println("--- Vehiculos ---");
        for (Vehiculo vehiculo:listaVehiculo){
            System.out.println(vehiculo);
        }

    }
}
