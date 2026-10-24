public class Aplicacion {
    static void main() {
        Empresa empresa= new Empresa(123, "AutoRent");

        Cliente turista1= new Turista("Ana", "ana@gmail.com", "456", "789");
        Cliente turista2= new Turista("Hernesto", "hernesto@gmail.com", "363", "8736");

        Cliente residente1= new Residente("Luis", "luis@gmail.com", "873", "6374");
        Cliente residente2= new Turista("Antonio", "antonio@gmail.com", "7564", "73642");
    }
}
