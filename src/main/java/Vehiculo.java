import java.util.ArrayList;
import java.util.List;

public abstract class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String fechaFabricacion;
    public final static double TARIFA=10000;
    private Estado estado;
    private Alquiler alquiler;
    private List<Alquiler> listaAlquiler;

    public Vehiculo(String placa, String marca, String modelo, String fechaFabricacion, Estado estadoVehiculo,Alquiler alquiler) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
        this.estado = estadoVehiculo;
        listaAlquiler = new ArrayList<Alquiler>();

    }

    public List<Alquiler> getListaAlquiler() {
        return listaAlquiler;
    }

    public void setListaAlquiler(List<Alquiler> listaAlquiler) {
        this.listaAlquiler = listaAlquiler;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public Estado getEstadoVehiculo() {
        return estado;
    }

    public void setEstadoVehiculo(Estado estadoVehiculo) {
        this.estado = estadoVehiculo;
    }

    public abstract double calcularTarifa(int dias);

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechaFabricacion='" + fechaFabricacion + '\'' +
                ", estado=" + estado +
                ", alquiler=" + alquiler +
                ", listaAlquiler=" + listaAlquiler +
                '}';
    }
}

