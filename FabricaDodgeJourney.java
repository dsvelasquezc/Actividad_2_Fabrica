import java.util.Scanner;

public class FabricaDodgeJourney implements FabricaDeCarros {
    @Override
    public Carro crearCarro(Scanner scanner) {
        String motor, transmision, llantas, color, tipoFrenos;

        System.out.println("Selecciona el tipo de motor para la Dodge Journey (Convencional/7 Puestos): ");
        if(scanner.nextLine().equalsIgnoreCase("Convencional")) {
            motor = "2.4L Engine";
            System.out.println("Se ha seleccionado el motor 2.4L Engine.");
        } else {
            motor = "3.6L Engine";
            System.out.println("Se ha seleccionado el motor 3.6L Engine.");
        }

        System.out.println("Selecciona el tipo de transmisión preferida (Mecanica/Tiptronic): ");
        if(scanner.nextLine().equalsIgnoreCase("Mecanica")) {
            transmision = "Mecánica";
            System.out.println("Has seleccionado transmisión Mecánica para tu Dodge Journey.");
        } else {
            transmision = "Automática";
            System.out.println("Has seleccionado transmisión Automática para tu Dodge Journey.");
        }

        System.out.println("Selecciona el tipo de neumáticos para tu vehículo (Ciudad/Campo): ");
        if(scanner.nextLine().equalsIgnoreCase("Ciudad")) {
            System.out.println("Elige la marca de neumáticos (Continental/Pirelli): ");
            llantas = scanner.nextLine();
            System.out.println("Has seleccionado los neumáticos " + llantas + " convencionales.");
        } else {
            System.out.println("Elige la marca de neumáticos (Bridgestone/GoodYear): ");
            llantas = scanner.nextLine();
            System.out.println("Has seleccionado los neumáticos resistentes de marca " + llantas + ".");
        }

        System.out.println("Elige un color para tu Dodge Journey (Gris, Negro, Rojo, BlackMate): ");
        color = scanner.nextLine();
        System.out.println("Has elegido el color " + color + " para tu Dodge Journey.");

        System.out.println("Selecciona el tipo de frenos (ABS/Convencionales): ");
        if(scanner.nextLine().equalsIgnoreCase("ABS")) {
            tipoFrenos = "Disco ABS";
            System.out.println("Has seleccionado frenos con tecnología ABS.");
        } else {
            tipoFrenos = "Convencional";
            System.out.println("Has seleccionado frenos de campana o convencionales.");
        }

        return new DodgeJourney(motor, transmision, llantas, color, tipoFrenos);
    }
}