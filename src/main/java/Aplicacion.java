public class Aplicacion {
    static void main() {
        Empresa empresa= new Empresa(123, "AutoRent");

        Cliente turista1= new Turista("Ana", "ana@gmail.com", "456", "789");
        Cliente turista2= new Turista("Hernesto", "hernesto@gmail.com", "363", "8736");

        Cliente residente1= new Residente("Luis", "luis@gmail.com", "873", "6374");
        Cliente residente2= new Turista("Antonio", "antonio@gmail.com", "7564", "73642");

        //Automovil

        Automovil automovil1 = new Automovil("AURA67", "Renaoult", "Twingo", "2012",Estado.BUENO, 2);
        Automovil automovil2 = new Automovil("TUFFMANGO", "Ferrari", "LAFERRARI", "2018",Estado.MALO, 2);

        //Motocicleta

        Motocicleta motocicleta1 = new Motocicleta("RPGNOM","Yamaha", "XTZ150", "2017",Estado.BUENO,150);
        Motocicleta motocicleta2 = new Motocicleta("CITYBOY","Susuki", "Burgman", "2020",Estado.BUENO,125);

        //Camioneta

        Camioneta camioneta1 = new Camioneta("CP34","Isuzi","D-MAX","2023",Estado.BUENO,500);
        Camioneta camioneta2 = new Camioneta("Cityboy64","Toyota","Lite ace","2022",Estado.MALO,700);



    }
}
