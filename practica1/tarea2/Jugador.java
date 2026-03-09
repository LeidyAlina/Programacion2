package practica1.tarea2;

public class Jugador {
    
    public static final int TAMANO_STACK = 64;

    private String nombre;
    private int diamantes;

    public Jugador(String nombre, int diamantes) {
        this.nombre = nombre;
        this.diamantes = diamantes;
    }

    public Jugador(String nombre) {
        this(nombre, 0);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getDiamantes() {
        return diamantes;
    }
    
    public void setDiamantes(int diamantes) {
        if (diamantes >= 0) {
            this.diamantes = diamantes;
        }
    }

    public void agregarDiamantes(int cantidad) {
        if (cantidad > 0) {
            this.diamantes += cantidad;
        }
    }

    public int calcularStacks() {
        return diamantes / TAMANO_STACK;
    }
    
    public int calcularDiamantesSueltos() {
        return diamantes % TAMANO_STACK;
    }
    
    public String toString() {
        int stacks = calcularStacks();
        int sueltos = calcularDiamantesSueltos();
        
        String info = nombre + " - Diamantes: " + diamantes + " (";
        
        if (stacks > 0) {
            info += stacks + " stack" + (stacks != 1 ? "s" : "");
            if (sueltos > 0) {
                info += " y " + sueltos + " suelto" + (sueltos != 1 ? "s" : "");
            }
        } else {
            info += sueltos + " suelto" + (sueltos != 1 ? "s" : "");
        }
        
        info += ")";
        return info;
    }
}