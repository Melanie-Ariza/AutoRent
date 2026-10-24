public class Turista extends Cliente{
    private String visa;

    public Turista(String nombre, String correo, String documento, String visa) {
        super(nombre, correo, documento);
        this.visa = visa;
    }

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Visa: "+visa;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Turista: "+ getNombre()+
                "Documento: "+getDocumento()+
                "Visa: "+visa);
    }
}
