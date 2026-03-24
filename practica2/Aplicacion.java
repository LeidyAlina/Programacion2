package practica2;
public class Aplicacion {
public static void main(String[] args) {

        System.out.println("BIENVENIDO AL SISTEMA DE JUEGOS DE ADIVINANZA");
        
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);
        
        String[] nombresJuegos = {
            "JUEGO 1: Adivina cualquier número (0-10)",
            "JUEGO 2: Adivina números PARES (0,2,4,6,8,10)",
            "JUEGO 3: Adivina números IMPARES (1,3,5,7,9)"
        };
        
        JuegoAdivinaNumero[] juegos= {juego1, juego2, juego3};
        
        for (int i = 0; i < juegos.length; i++) {
            System.out.println(nombresJuegos[i]);
            
            juegos[i].juega();
        
            System.out.println("\nResumen del " + nombresJuegos[i] + ":");
            System.out.println("Récord alcanzado: " + juegos[i].getRecord() + " vidas restantes");
            
            if (i < juegos.length - 1) {
                System.out.print("\nPresiona Enter para continuar al siguiente juego...");
                try {
                    System.in.read();
                } catch (Exception e) {
                }
            }
        }
        System.out.println("¡FELICITACIONES! Has completado todos los juegos");
    }
}

