public class Motocicleta extends Vehiculo {
    private int cilindraje;

    public Motocicleta(String placa, String marca, String modelo, String fechaFabricacion, Estado estado, int cilindraje) {
        super(placa, marca, modelo, fechaFabricacion, estado);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Motocicleta\n" +
                "Cilindraje:" + cilindraje;
    }

    @Override
    public double calcularTarifa(int dias) {
        double tarifa= TARIFA*dias*0.9;
        return tarifa;
    }
}
