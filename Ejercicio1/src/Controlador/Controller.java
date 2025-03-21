package Controlador;

import Modelo.Asientos;
import Modelo.Persona;
import Modelo.Sala;
import Vista.Usuario;
import java.util.List;

public class Controller {
    private Usuario Vista;
    private Persona persona;
    private Asientos asiento;
    private Sala sala;

    // Constructor
    public Controller(Usuario Vista, Persona persona, Asientos asiento, Sala sala) {
        this.Vista = Vista;
        this.persona = persona;
        this.asiento = asiento;
        this.sala = sala;
    }

    public void ejecutar() {
        boolean salir = false;

        while (!salir) {
            Vista.mostrarMenu();
            int opcion = Vista.capturaropcion();
            Vista.limpiarBuffer();

            switch (opcion) {
                case 1: // Agregar Persona
                    agregarPersona();
                    break;

                case 2: // Buscar Persona
                    buscarPersona();
                    break;

                case 3: // Mostrar Lista de Personas
                    mostrarListaPersonas();
                    break;

                case 4: // Agregar Asiento
                    agregarAsiento();
                    break;

                case 5: // Buscar Asiento
                    buscarAsiento();
                    break;

                case 6: // Mostrar Lista de Asientos
                    mostrarListaAsientos();
                    break;

                case 7: // Agregar Sala
                    agregarSala();
                    break;

                case 8: // Buscar Sala
                    buscarSala();
                    break;

                case 9: // Salir
                    salir = true;
                    break;

                default:
                    Vista.mostrarMensaje("Opción no válida.");
            }
        }
    }

    // Métodos para manejar cada opción

    private void agregarPersona() {
        // Captura los datos necesarios para crear una nueva persona
        String nombre = Vista.capturarfila(); // Ejemplo, puedes crear un método de captura específico
        String apellido = Vista.capturarfila();
        int cedula = Vista.capturarnumero();
        String correo = Vista.capturarfila();

        persona = new Persona(nombre, apellido, cedula, correo);

        if (Persona.AgregarPersona(persona)) {
            Vista.mostrarMensaje("Persona agregada correctamente.");
        } else {
            Vista.mostrarMensaje("Error al agregar la persona.");
        }
    }

    private void buscarPersona() {
        int cedula = Vista.capturarnumero();
        Persona personaEncontrada = Persona.buscarPersona(cedula);

        if (personaEncontrada != null) {
            Vista.mostrarMensaje("Persona encontrada: " + personaEncontrada.getNombre());
        } else {
            Vista.mostrarMensaje("Persona no encontrada.");
        }
    }

    private void mostrarListaPersonas() {
        List<Persona> listaPersonas = Persona.obtenerListaPersona();
        if (listaPersonas.isEmpty()) {
            Vista.mostrarMensaje("No hay personas registradas.");
        } else {
            Vista.mostrarMensaje("Lista de personas registradas:");
            for (Persona p : listaPersonas) {
                Vista.mostrarMensaje(p.getNombre() + " " + p.getApellido());
            }
        }
    }

    private void agregarAsiento() {
        // Captura los datos necesarios para crear un nuevo asiento
        String fila = Vista.capturarfila();
        int numero = Vista.capturarnumero();
        String columna = Vista.capturarfila();

        asiento = new Asientos(fila, numero, columna);

        if (Asientos.AgregarAsientos(asiento)) {
            Vista.mostrarMensaje("Asiento agregado correctamente.");
        } else {
            Vista.mostrarMensaje("Error al agregar el asiento.");
        }
    }

    private void buscarAsiento() {
        int numero = Vista.capturarnumero();
        Asientos asientoEncontrado = Asientos.buscarAsientos(numero);

        if (asientoEncontrado != null) {
            Vista.mostrarMensaje("Asiento encontrado en la fila: " + asientoEncontrado.getfila());
        } else {
            Vista.mostrarMensaje("Asiento no encontrado.");
        }
    }

    private void mostrarListaAsientos() {
        List<Asientos> listaAsientos = Asientos.obtenerListaAsientos();
        if (listaAsientos.isEmpty()) {
            Vista.mostrarMensaje("No hay asientos registrados.");
        } else {
            Vista.mostrarMensaje("Lista de asientos registrados:");
            for (Asientos a : listaAsientos) {
                Vista.mostrarMensaje("Fila: " + a.getfila() + ", Asiento: " + a.getnumero());
            }
        }
    }

    private void agregarSala() {
        String tipoSala = Vista.capturarfila();
        int capacidadSala = Vista.capturarnumero();
        String nombreSala = Vista.capturarfila();

        sala = new Sala(tipoSala, capacidadSala, nombreSala);

        if (Sala.AgregarSala(sala)) {
            Vista.mostrarMensaje("Sala agregada correctamente.");
        } else {
            Vista.mostrarMensaje("Error al agregar la sala.");
        }
    }

    private void buscarSala() {
        String nombreSala = Vista.capturarfila();
        Sala salaEncontrada = Sala.buscarSala(nombreSala);

        if (salaEncontrada != null) {
            Vista.mostrarMensaje("Sala encontrada: " + salaEncontrada.getnombreSala());
        } else {
            Vista.mostrarMensaje("Sala no encontrada.");
        }
    }
}