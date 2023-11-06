import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FabricaDeCarros fabrica = null;
        String eleccion;
        
        while (true) { // Bucle para introducir un modelo de vehículo válido
            System.out.println("¿Qué carro deseas fabricar? (AudiA4 o DodgeJourney)");
            eleccion = scanner.nextLine();
            
            if (eleccion.equalsIgnoreCase("AudiA4")) {
                fabrica = new FabricaAudiA4();
                break; 
            } else if (eleccion.equalsIgnoreCase("DodgeJourney")) {
                fabrica = new FabricaDodgeJourney();
                break;
            } else {
                System.out.println("Modelo de vehículo no disponible, intente nuevamente.");
            }
        }

        Carro carro = fabrica.crearCarro(scanner);
        carro.mostrarDetalles();
        
        String accion;
        do {
            System.out.println("Prueba tú vehículo, puedes encender, acelerar, o apagar.");
            accion = scanner.nextLine();
            switch (accion.toLowerCase()) {
                case "encender":
                    carro.encender();
                    System.out.println("Vehículo encendido ¡Prueba todas sus funciones!");
                    break;
                case "acelerar":
                    carro.acelerar();
                    System.out.println("Motor en marcha");
                    break;
                case "apagar":
                    carro.apagar();
                    System.out.println("¡Disfruta al máximo tu nuevo vehículo!");
                    break;
                default:
                    System.out.println("Acción no disponible. Escribe que acción deseas realizar con tu coche nuevo. Elige entre 'encender', 'acelerar' o 'apagar'.");
                    break;
            }
        } while (!accion.equalsIgnoreCase("apagar"));

        scanner.close();
    }
}