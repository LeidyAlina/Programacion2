package practica1.tarea2;

public class ejercicio4 {
    
    private int capacidadTotal;
    private int pasajerosActuales;
    private double dineroRecaudado;
    private final double COSTO_PASAJE = 1.50;
    
   
    public ejercicio4(int capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
        this.pasajerosActuales = 0;
        this.dineroRecaudado = 0.0;
    }

    public void subirPasajeros(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser positiva");
            return;
        }
        
        int asientosDisponibles = capacidadTotal - pasajerosActuales;
        
        if (cantidad <= asientosDisponibles) {
            pasajerosActuales += cantidad;
            System.out.println("✅ " + cantidad + " pasajeros subieron al bus exitosamente");
        } else {
           
            pasajerosActuales = capacidadTotal;
            System.out.println("⚠️ Solo pudieron subir " + asientosDisponibles + 
                             " pasajeros. El bus está lleno");
        }
    }
    
   
    public void cobrarPasaje() {
        if (pasajerosActuales == 0) {
            System.out.println("No hay pasajeros para cobrar");
            return;
        }
        
        double cobroTotal = pasajerosActuales * COSTO_PASAJE;
        dineroRecaudado += cobroTotal;
        
        System.out.printf("💰 Se cobró Bs. %.2f a %d pasajeros%n", 
                         cobroTotal, pasajerosActuales);
        System.out.printf("   Costo por pasaje: Bs. %.2f%n", COSTO_PASAJE);
    }
    
   
    public int asientosDisponibles() {
        int disponibles = capacidadTotal - pasajerosActuales;
        System.out.println("🪑 Asientos disponibles: " + disponibles + 
                         " de " + capacidadTotal);
        return disponibles;
    }
    
    public void mostrarEstado() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("ESTADO ACTUAL DEL BUS");
        System.out.println("=".repeat(40));
        System.out.println("Capacidad total: " + capacidadTotal + " asientos");
        System.out.println("Pasajeros actuales: " + pasajerosActuales);
        System.out.println("Asientos disponibles: " + (capacidadTotal - pasajerosActuales));
        System.out.printf("Dinero recaudado: Bs. %.2f%n", dineroRecaudado);
        System.out.println("=".repeat(40) + "\n");
    }
    
    public int getPasajerosActuales() {
        return pasajerosActuales;
    }
    
    public double getDineroRecaudado() {
        return dineroRecaudado;
    }
    
   public static void main(String[] args) {
        System.out.println("🚌 CREACIÓN DEL BUS");
        System.out.println("-".repeat(30));
        
        ejercicio4 miBus = new ejercicio4(40);
        miBus.mostrarEstado();
        
        
        System.out.println("\n📋 INCISO A: Subir pasajeros");
        System.out.println("-".repeat(30));
        miBus.subirPasajeros(25);  
        miBus.asientosDisponibles();
        
        System.out.println("\n📋 INCISO B: Cobrar pasaje");
        System.out.println("-".repeat(30));
        miBus.cobrarPasaje();
        
        System.out.println("\n📋 Subiendo más pasajeros...");
        miBus.subirPasajeros(10);
        miBus.asientosDisponibles();
        miBus.cobrarPasaje();
        
       
        System.out.println("\n📋 Intentando subir 10 pasajeros más...");
        miBus.subirPasajeros(10);
        miBus.asientosDisponibles();
        
       
        miBus.mostrarEstado();
        
        
        System.out.println("\n🚌 CREANDO OTRO BUS CON DIFERENTE CAPACIDAD");
        System.out.println("-".repeat(30));
        ejercicio4 busPequeno = new ejercicio4(20);
        busPequeno.mostrarEstado();
        busPequeno.subirPasajeros(15);
        busPequeno.cobrarPasaje();
        busPequeno.mostrarEstado();
    }
}
    