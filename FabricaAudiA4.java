import java.util.Scanner;

public class FabricaAudiA4 implements FabricaDeCarros {
    @Override
    public Carro crearCarro(Scanner scanner) {
        String motor, transmision, llantas, color, tipoFrenos;

        System.out.println("Selecciona el tipo de motor para el Audi A4 2024 (Tradicional/Racing): ");
        if(scanner.nextLine().equalsIgnoreCase("Tradicional")) {
            motor = "Audi Engine 1.8";
            System.out.println("Se ha seleccionado el motor 'Audi Engine 1.8.");
        } else {
            motor = "Turbo";
            System.out.println("Se ha seleccionado el modo Racing, por lo cual el motor será un Audi Engine 2.0 Turbo.");
        }

        System.out.println("Selecciona el tipo de transmisión preferida (Mecanica/Tiptronic): ");
        if(scanner.nextLine().equalsIgnoreCase("Mecanica")) {
            transmision = "Mecánica";
            System.out.println("Has seleccionado transmisión Mecánica para tu Audi.");
        } else {
            transmision = "Automática";
            System.out.println("Has seleccionado transmisión Tiptronica o Automática.");
        }

        System.out.println("Selecciona el tipo de neumáticos para tu vehículo (Ciudad/Pista): ");
        if(scanner.nextLine().equalsIgnoreCase("Ciudad")) {
            System.out.println("Elige la marca de neumáticos (Continental/Pirelli): ");
            llantas = scanner.nextLine();
            System.out.println("Has seleccionado los neumáticos " + llantas + " convencionales.");
        } else {
            System.out.println("Elige la marca de neumáticos (Bridgestone/Continental): ");
            llantas = scanner.nextLine();
            System.out.println("Has seleccionado los neumáticos para pista de marca " + llantas + ".");
        }

        System.out.println("Elige un color para tu Audi A4 2024 (Rojo, Negro, Plata, BlackMate): ");
        color = scanner.nextLine();
        System.out.println("Has elegido el color " + color + " para tu Audi A4.");

        System.out.println("Selecciona el tipo de frenos (ABS/Competencia): ");
        if(scanner.nextLine().equalsIgnoreCase("ABS")) {
            tipoFrenos = "Disco ABS";
            System.out.println("Has seleccionado frenos con tecnología ABS.");
        } else {
            tipoFrenos = "Disco ventilado";
            System.out.println("Has seleccionado frenos para competencia, cuentan con discos ventilados para mayor rendimiento en condiciones extremas.");
        }

        return new AudiA4(motor, transmision, llantas, color, tipoFrenos);
    }
}