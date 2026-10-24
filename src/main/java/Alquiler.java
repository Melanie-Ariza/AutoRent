import java.util.Date;

public class Alquiler {
    private int codigo;
    private Date fecha;
    private String cliente;
    private String vehiculo;
    private int dias;

    public Alquiler(int codigo, Date fecha, String cliente, String vehiculo, int dias) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.dias = dias;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Alquiler: " +
                ", codigo: " + codigo +
                ", fecha: " + fecha +
                ", cliente: " + cliente +
                ", vehiculo: " + vehiculo +
                ", dias: " + dias;
    }






}
