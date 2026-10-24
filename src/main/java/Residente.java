public class Residente extends Cliente{
    private String direccion;

    public Residente(String nombre, String correo, String documento, String direccion) {
        super(nombre, correo, documento);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", Dirección: "+direccion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Residente: "+ getNombre()+
                "Documento: "+getDocumento()+
                "Dirección: "+ direccion);
    }
}
