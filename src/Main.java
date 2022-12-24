
public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo("Rojo", "Corvette", "ABC123",
                4, 5, 300
        );

        Boolean aceleracion = vehiculo.acelerar(100);

        vehiculo.setColor("Naranja");
        vehiculo.setPatente("VIX231");

        System.out.println(aceleracion);
        System.out.println(vehiculo);

        Moto moto = new Moto("Azul", "Yamaha", "KAJ202", 2, 2,
                400, true);

        Boolean aceleracion2 = moto.acelerar(100);
        moto.acelerar(450);
        moto.setModelo("Kawasaki");

        System.out.println(aceleracion2);
        System.out.println(moto);


    }
}