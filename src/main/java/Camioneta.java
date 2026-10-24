public class Camioneta extends Vehiculo {

    private int capacidadCarga;

    public Camioneta(String placa, String marca, String modelo, String fechaFabricacion, Estado estadoVehiculo, int capacidadCarga) {
        super(placa, marca, modelo, fechaFabricacion, estadoVehiculo);
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
}
