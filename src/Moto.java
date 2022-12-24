
public class Moto extends Vehiculo {
    Boolean casco;

    public Moto(String color, String modelo, String patente, Integer ruedas, Integer capacidad, Integer velocidadMaxima, Boolean casco) {
        super(color, modelo, patente, ruedas, capacidad, velocidadMaxima);
        this.casco = casco;
    }

    @Override
    public String toString() {
        return "Moto {" +
                "casco=" + casco +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", patente='" + patente + '\'' +
                ", ruedas=" + ruedas +
                ", capacidadPersonas=" + capacidadPersonas +
                ", velocidad=" + velocidad +
                ", velocidadMaxima=" + velocidadMaxima +
                " }";
    }
}
