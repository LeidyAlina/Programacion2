package practica1.tarea2;

import java.util.ArrayList;

public class Main {
   
    static final int MAX_JUGADORES = 10;
    static final int STACK_SIZE = 64;
    
    static ArrayList<String> nombres = new ArrayList<>();
    static ArrayList<Integer> diamantes = new ArrayList<>();
    
    public static void main(String[] args) {
        System.out.println("SERVIDOR MINECRAFT");
        System.out.println("==================");
        
        System.out.println("\n1. AGREGANDO JUGADORES");
        System.out.println("----------------------");
        agregarJugador("Steve", 120);
        agregarJugador("Alex", 65);
        agregarJugador("Creeper", 32);
        agregarJugador("Enderman", 200);
        agregarJugador("Zombie", 48);
        agregarJugador("Skeleton", 15);
        agregarJugador("Witch", 80);
        agregarJugador("Villager", 5);
        agregarJugador("IronGolem", 300);
        agregarJugador("Piglin", 95);
        
    
        System.out.println("\nIntentando agregar jugador extra:");
        agregarJugador("Extra", 50);
    
        System.out.println("\n2. STACKS DE DIAMANTES");
        System.out.println("----------------------");
        mostrarStacks();
        
        System.out.println("\n3. JUGADOR CON MAS DIAMANTES");
        System.out.println("----------------------------");
        mostrarTopJugador();
        
        System.out.println("\n4. TOTAL DE DIAMANTES");
        System.out.println("---------------------");
        mostrarTotal();
        
        System.out.println("\n5. LISTA COMPLETA");
        System.out.println("-----------------");
        mostrarTodos();
    }
    
    static void agregarJugador(String nombre, int cantidad) {

        if (nombres.size() >= MAX_JUGADORES) {
            System.out.println("  ERROR: Servidor lleno. No se puede agregar a " + nombre);
            return;
        }

        for (int i = 0; i < nombres.size(); i++) {
            if (nombres.get(i).equalsIgnoreCase(nombre)) {
                System.out.println("  ERROR: El jugador " + nombre + " ya existe");
                return;
            }
        }
        
        if (cantidad < 0) {
            System.out.println("  ERROR: Los diamantes no pueden ser negativos");
            return;
        }
        
        nombres.add(nombre);
        diamantes.add(cantidad);
        System.out.println("  ✓ " + nombre + " agregado con " + cantidad + " diamantes");
    }
    static void mostrarStacks() {
        if (nombres.isEmpty()) {
            System.out.println("  No hay jugadores");
            return;
        }
        
        for (int i = 0; i < nombres.size(); i++) {
            String nom = nombres.get(i);
            int cant = diamantes.get(i);
            int stacks = cant / STACK_SIZE;
            int sueltos = cant % STACK_SIZE;
            
            System.out.println("  " + nom + ": " + cant + " diamantes = " + 
                              stacks + " stack(s) y " + sueltos + " suelto(s)");
        }
    }
    
    static void mostrarTopJugador() {
        if (nombres.isEmpty()) {
            System.out.println("  No hay jugadores");
            return;
        }
        
        int posicionMax = 0;
        int maxDiamantes = diamantes.get(0);
        
        for (int i = 1; i < nombres.size(); i++) {
            if (diamantes.get(i) > maxDiamantes) {
                maxDiamantes = diamantes.get(i);
                posicionMax = i;
            }
        }
        
        String nombreTop = nombres.get(posicionMax);
        int stacks = maxDiamantes / STACK_SIZE;
        
        System.out.println("  🏆 " + nombreTop + " con " + maxDiamantes + 
                          " diamantes (" + stacks + " stacks)");
    }
    
    static void mostrarTotal() {
        if (nombres.isEmpty()) {
            System.out.println("  No hay jugadores");
            return;
        }
        
        int total = 0;
        for (int i = 0; i < diamantes.size(); i++) {
            total = total + diamantes.get(i);
        }
        
        int stacksTotales = total / STACK_SIZE;
        int sueltosTotales = total % STACK_SIZE;
        
        System.out.println("  Total diamantes: " + total);
        System.out.println("  Equivalente: " + stacksTotales + " stacks y " + 
                          sueltosTotales + " sueltos");
        
        double promedio = (double) total / nombres.size();
        System.out.println("  Promedio por jugador: " + promedio);
    }
    
    static void mostrarTodos() {
        if (nombres.isEmpty()) {
            System.out.println("  No hay jugadores");
            return;
        }
        
        System.out.println("  Capacidad: " + nombres.size() + "/" + MAX_JUGADORES);
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("  " + (i+1) + ". " + nombres.get(i) + 
                              " - " + diamantes.get(i) + " diamantes");
        }
    }
}