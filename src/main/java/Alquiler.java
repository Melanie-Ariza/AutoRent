import java.util.Date;

public class Alquiler {
    private int codigo;
    private Date fecha;
    private int dias;

    private Vehiculo vehiculo;
    private Cliente cliente;

    public Alquiler(int codigo, Date fecha, int dias, Vehiculo vehiculo, Cliente cliente) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.dias = dias;
        this.vehiculo= vehiculo;
        this.cliente= cliente;
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

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Alquiler\n " +
                ", Codigo: " + codigo +
                ", Fecha: " + fecha +
                ", Dias: " + dias+
                ", Cliente: " + cliente +
                ", Vehiculo: " + vehiculo;
    }
    void mostrarFactura() {
        double costoTotal = vehiculo.calcularTarifa(dias);
        double costoDiario = costoTotal / dias;

        System.out.println("==================================================");
        System.out.println("                    FACTURA                       ");
        System.out.println("==================================================");
        System.out.println("Código Alquiler : " + codigo);
        System.out.println("Fecha           : " + fecha);
        System.out.println("--------------------------------------------------");
        System.out.println("DATOS DEL CLIENTE:");
        System.out.println(cliente.toString());
        System.out.println("--------------------------------------------------");
        System.out.println("DATOS DEL VEHÍCULO:");
        System.out.println("Placa: " + vehiculo.getPlaca() + " | Marca: " + vehiculo.getMarca() + " | Modelo: " + vehiculo.getModelo());
        System.out.println("Estado: " + vehiculo.getEstadoVehiculo());
        System.out.println("--------------------------------------------------");
        System.out.println("DETALLE DEL COBRO:");
        System.out.println("Días de renta : " + dias);
        System.out.println("Tarifa / Día  : $" + costoDiario);
        System.out.println("TOTAL A PAGAR : $" + costoTotal);
        System.out.println("==================================================\n");
    }
}