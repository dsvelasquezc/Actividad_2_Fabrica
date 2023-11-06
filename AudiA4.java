public class AudiA4 implements Carro {
    private String motor, transmision, llantas, color, tipoFrenos;

    public AudiA4(String motor, String transmision, String llantas, String color, String tipoFrenos) {
        this.motor = motor;
        this.transmision= transmision;
        this.llantas= llantas;
        this.color = color;
        this.tipoFrenos = tipoFrenos;
    }

    public void encender() {
        System.out.println("Vehículo en marcha");
    }

    public void acelerar() {
        System.out.println("Vehículo acelerando");
    }

    public void apagar() {
        System.out.println("Vehículo apagado");
    }

    public void mostrarDetalles() {
        System.out.println("Audi A4 2024 - Motor: " + motor + ", con transmisión: " + transmision + ", Neumáticos: " + llantas + ", de color: " + color + ", con frenos: " + tipoFrenos);
    }
}