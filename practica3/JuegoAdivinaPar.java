package practica2;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {
    
    public JuegoAdivinaPar(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    
    @Override
    public boolean validaNumero(int numero) {

        if (!(numero >= 0 && numero <= 10)) {
            System.out.println("Error: El número debe estar entre 0 y 10.");
            return false;
        }
        
        if (numero % 2 != 0) {
            System.out.println("Error: El número " + numero + " no es par. Solo se permiten números pares.");
            return false;
        }
        
        return true;
    }
    
    @Override
    public void juega() {
        reiniciaPartida();
        
        int[] numerosPares = {0, 2, 4, 6, 8, 10};
        numeroAAdivinar = numerosPares[random.nextInt(numerosPares.length)];
        
        System.out.println("JUEGO: Adivina el Número PAR (0,2,4,6,8,10)");
        System.out.println("Vidas iniciales: " + this.numeroDeVidas);
        System.out.println("Récord actual: " + this.record);
        
        while (true) {
            try {
                System.out.println("\nTe quedan " + this.numeroDeVidas + " vidas");
                System.out.print("Adivina un número PAR entre 0 y 10: ");
                int numeroUsuario = scanner.nextInt();
                
                if (!validaNumero(numeroUsuario)) {
                    continue;
                }
                
                if (numeroUsuario == numeroAAdivinar) {
                    System.out.println("\n¡ACERTASTE!");
                    actualizaRecord();
                    System.out.println("El número PAR era: " + numeroAAdivinar);
                    System.out.println("Has terminado con " + this.numeroDeVidas + " vidas restantes");
                    System.out.println("Récord actual: " + this.record);
                    break;
                } else {
                    boolean tieneVidas = quitaVida();
                    
                    if (!tieneVidas) {
                        System.out.println("\nGAME OVER ");
                        System.out.println("El número PAR era: " + numeroAAdivinar);
                        System.out.println("Has perdido todas tus vidas");
                        System.out.println("Récord actual: " + this.record);
                        break;
                    } else {
                        if (numeroUsuario < numeroAAdivinar) {
                            System.out.println("¡Fallaste! El número PAR es MAYOR que " + numeroUsuario);
                        } else {
                            System.out.println("¡Fallaste! El número PAR es MENOR que " + numeroUsuario);
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

