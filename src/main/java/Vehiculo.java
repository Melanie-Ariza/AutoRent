public abstract class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String fechaFabricacion;
    public final static double TARIFA=10000;
    private Estado estado;

    public Vehiculo(String placa, String marca, String modelo, String fechaFabricacion, Estado estado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
        this.estado = estado;
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
        return "Vehiculo\n" +
                "Placa: " + placa+
                ", Marca: " + marca +
                ", Modelo: " + modelo +
                ", Fecha fabricación: " + fechaFabricacion +
                ", Estado:" + estado;
        }
    }

