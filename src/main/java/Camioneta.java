public class Camioneta extends Vehiculo {

    private int capacidadCarga;

    public Camioneta(String placa, String marca, String modelo, String fechaFabricacion, Estado estadoVehiculo, int capacidadCarga, Alquiler alquiler) {
        super(placa, marca, modelo, fechaFabricacion, estadoVehiculo, alquiler);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Camioneta{" +
                "capacidadCarga=" + capacidadCarga +
                '}';
    }

    @Override
    public double calcularTarifa(int dias) {
        return 0;
    }
}
