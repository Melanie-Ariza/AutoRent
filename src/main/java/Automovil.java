public class Automovil extends Vehiculo{
    private int numeroPuertas;

    public Automovil(String placa, String marca, String modelo, String anio, Estado estado, int numeroPuertas, Alquiler alquiler) {
        super(placa, marca, modelo, anio, estado, alquiler);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularTarifa(int dias) {
        double tarifa= (TARIFA+20000)*dias;
        return tarifa;
    }
}