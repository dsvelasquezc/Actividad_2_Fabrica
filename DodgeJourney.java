public class DodgeJourney implements Carro {
    private String motor, transmision, llantas, color, tipoFrenos;

    public DodgeJourney(String motor, String transmision, String llantas, String color, String tipoFrenos) {
        this.motor = motor;
        this.transmision= transmision;
        this.llantas= llantas;
        this.color = color;
        this.tipoFrenos = tipoFrenos;
    }

    public void encender() {
        System.out.println("Dodge Journey en marcha");
    }

    public void acelerar() {
        System.out.println("Dodge Journey acelerando");
    }

    public void apagar() {
        System.out.println("Dodge Journey apagado");
    }

    public void mostrarDetalles() {
        System.out.println("Dodge Journey - Motor: " + motor + ", con transmisión: " + transmision + ", Neumáticos: " + llantas + ", de color: " + color + ", con frenos: " + tipoFrenos);
    }
}