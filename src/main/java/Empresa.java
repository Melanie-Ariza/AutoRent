import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private int codigo;
    private String nombre;
    private List<Alquiler> listaAlquiler;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Alquiler alquiler;
    private List <Cliente>  listaCliente;
    private List <Vehiculo>  listaVehiculo;


    public Empresa(int codigo, String nombre, Cliente cliente, Vehiculo vehiculo, Alquiler alquiler) {
        this.codigo = codigo;
        this.nombre = nombre;
        listaAlquiler = new ArrayList();
        listaCliente = new ArrayList();
        listaVehiculo = new ArrayList();
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.alquiler = alquiler;

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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
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
                ", cliente: " + cliente +
                ", vehiculo: " + vehiculo +
                ", alquiler: " + alquiler +
                ", listaCliente: " + listaCliente +
                ", listaVehiculo: " + listaVehiculo;
    }
}
