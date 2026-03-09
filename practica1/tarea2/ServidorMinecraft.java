package practica1.tarea2;

import java.util.ArrayList;

public class ServidorMinecraft {
    
    private String nombreServidor;
    private ArrayList<String> nombres;
    private ArrayList<Integer> diamantes;

    private final int MAX_JUGADORES = 10;
    private final int STACK_SIZE = 64;

    public ServidorMinecraft(String nombreServidor) {
        this.nombreServidor = nombreServidor;
        this.nombres = new ArrayList<>();
        this.diamantes = new ArrayList<>();
    }
    
    public void agregarJugador(String nombre, int cantidad) {
        if (nombres.size() >= MAX_JUGADORES) {
            System.out.println("ERROR: Servidor lleno");
            return;
        }
        
        for (int i = 0; i < nombres.size(); i++) {
            if (nombres.get(i).equalsIgnoreCase(nombre)) {
                System.out.println("ERROR: El jugador ya existe");
                return;
            }
        }
        
        nombres.add(nombre);
        diamantes.add(cantidad);
        System.out.println("OK: " + nombre + " agregado");
    }
    
    public void mostrarStacks() {
        System.out.println("\n--- STACKS EN " + nombreServidor + " ---");
        for (int i = 0; i < nombres.size(); i++) {
            int cant = diamantes.get(i);
            int stacks = cant / STACK_SIZE;
            int sueltos = cant % STACK_SIZE;
            System.out.println(nombres.get(i) + ": " + stacks + " stacks, " + sueltos + " sueltos");
        }
    }
    
    public void mostrarTopJugador() {
        if (nombres.isEmpty()) return;
        
        int max = 0;
        for (int i = 1; i < nombres.size(); i++) {
            if (diamantes.get(i) > diamantes.get(max)) {
                max = i;
            }
        }
        System.out.println("\n--- TOP EN " + nombreServidor + " ---");
        System.out.println(nombres.get(max) + " con " + diamantes.get(max) + " diamantes");
    }

    public void mostrarTotal() {
        int total = 0;
        for (int i = 0; i < diamantes.size(); i++) {
            total += diamantes.get(i);
        }
        System.out.println("\n--- TOTAL EN " + nombreServidor + " ---");
        System.out.println("Total diamantes: " + total);
    }
    
    public String getNombreServidor() {
        return nombreServidor;
    }
}