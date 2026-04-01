package practica2;

import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;
    protected int vidasIniciales;
    protected Scanner scanner;
    protected Random random;
    
    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
        this.vidasIniciales = numeroDeVidas;
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }
    
    @Override
    public void reiniciaPartida() {
        this.numeroDeVidas = this.vidasIniciales;
    }
    
    @Override
    public void actualizaRecord() {
        if (this.numeroDeVidas > this.record) {
            this.record = this.numeroDeVidas;
            System.out.println("¡NUEVO RÉCORD! " + this.record + " vidas restantes");
        }
    }
    
    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }
    
    public void juega() {
        reiniciaPartida();
        
        numeroAAdivinar = random.nextInt(11);
        
        System.out.println("JUEGO: Adivina el Número (0-10)");;
        System.out.println("Vidas iniciales: " + this.numeroDeVidas);
        System.out.println("Récord actual: " + this.record);
        
        while (true) {
            try {
                System.out.println("\nTe quedan " + this.numeroDeVidas + " vidas");
                System.out.print("Adivina un número entre 0 y 10: ");
                int numeroUsuario = scanner.nextInt();
                
                if (!validaNumero(numeroUsuario)) {
                    System.out.println("Error: El número debe estar entre 0 y 10.");
                    continue;
                }
                
                if (numeroUsuario == numeroAAdivinar) {
                    System.out.println("\n¡ACERTASTE!");
                    actualizaRecord();
                    System.out.println("El número era: " + numeroAAdivinar);
                    System.out.println("Has terminado con " + this.numeroDeVidas + " vidas restantes");
                    System.out.println("Récord actual: " + this.record);
                    break;
                } else {
                    boolean tieneVidas = quitaVida();
                    
                    if (!tieneVidas) {
                        System.out.println("\nGAME OVER ");
                        System.out.println("El número era: " + numeroAAdivinar);
                        System.out.println("Has perdido todas tus vidas");
                        System.out.println("Récord actual: " + this.record);
                        break;
                    } else {

                        if (numeroUsuario < numeroAAdivinar) {
                            System.out.println("¡Fallaste! El número es MAYOR que " + numeroUsuario);
                        } else {
                            System.out.println("¡Fallaste! El número es MENOR que " + numeroUsuario);
                        }
                        System.out.println("Te quedan " + this.numeroDeVidas + " vidas. ¡Inténtalo de nuevo!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: Por favor, ingresa un número válido.");
                scanner.next();
            }
        }
    }
}

