import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Radio radio = new RadioCarro(); // usa la interfaz RadioCarro que implementa Radio

        int opcion;

        do {
            System.out.println("\n======= UVRADIO DEL CARRO =======");
            System.out.println("1. Prender la radio");
            System.out.println("2. Apagar la radio");
            System.out.println("3. Cambiar a FM");
            System.out.println("4. Cambiar a AM");
            System.out.println("5. Avanzar estación");
            System.out.println("6. Guardar estación en botón");
            System.out.println("7. Cargar estación desde botón");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    radio.prenderRadio();
                    System.out.println("Radio encendido");
                    break;

                case 2:
                    radio.apagarRadio();
                    System.out.println("Radio apagado");
                    break;

                case 3:
                    radio.cambiarFM();
                    System.out.println("Cambiado a FM");
                    break;

                case 4:
                    radio.cambiarAM();
                    System.out.println("Cambiado a AM");
                    break;

                case 5:
                    radio.avanzarEstacion();
                    System.out.println("Estación avanzada");
                    break;

                case 6:
                    System.out.print("Ingrese número de botón: ");
                    int botonGuardar = sc.nextInt();
                    radio.guardarEstacion(botonGuardar);
                    System.out.println("Estación guardada en botón " + botonGuardar);
                    break;

                case 7:
                    System.out.print("Ingrese número de botón: ");
                    int botonCargar = sc.nextInt();
                    radio.cargarEstacion(botonCargar);
                    System.out.println("Estación cargada desde botón " + botonCargar);
                    break;

                case 8:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 8);

        sc.close();
    }
}
