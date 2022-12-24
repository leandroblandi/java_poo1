public class Vehiculo {
    public String color, modelo, patente;
    public Integer ruedas, capacidadPersonas;
    public Integer velocidad, velocidadMaxima;

    public Vehiculo(String color, String modelo, String patente, Integer ruedas,
                    Integer capacidadPersonas, Integer velocidadMaxima
    ) {
        this.color = color;
        this.modelo = modelo;
        this.patente = patente;
        this.ruedas = ruedas;
        this.capacidadPersonas = capacidadPersonas;
        this.velocidad = 0;
        this.velocidadMaxima = velocidadMaxima;
    }

    public Boolean acelerar(Integer cantidad) {
        if((cantidad > 0) && (cantidad < this.velocidadMaxima)
                && (cantidad + this.velocidad < this.velocidadMaxima)
        ) {
            this.velocidad += cantidad;
            return true;
        }
        else if(this.velocidad < this.velocidadMaxima) {
            cantidad = this.velocidadMaxima - this.velocidad;
            this.velocidad = cantidad;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vehiculo {" +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", patente='" + patente + '\'' +
                ", ruedas=" + ruedas +
                ", capacidadPersonas=" + capacidadPersonas +
                ", velocidad=" + velocidad +
                ", velocidadMaxima=" + velocidadMaxima +
                " }";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Integer getRuedas() {
        return ruedas;
    }

    public void setRuedas(Integer ruedas) {
        this.ruedas = ruedas;
    }

    public Integer getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(Integer capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public Integer getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(Integer velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}


