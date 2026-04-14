package practica3;
public class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    
    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    
    @Override
    public boolean validaNumero(int numero) {
        if (!(numero >= 0 && numero <= 10)) {
            System.out.println("Error: El número debe estar entre 0 y 10.");
            return false;
        }
        
        if (numero % 2 == 0) {
            System.out.println("Error: El número " + numero + " no es impar. Solo se permiten números impares.");
            return false;
        }
        
        return true;
    }
    
    @Override
    public void juega() {
        reiniciaPartida();
        
        int[] numerosImpares = {1, 3, 5, 7, 9};
        numeroAAdivinar = numerosImpares[random.nextInt(numerosImpares.length)];
        
        System.out.println("JUEGO: Adivina el Número IMPAR (1,3,5,7,9)");
        System.out.println("Vidas iniciales: " + this.numeroDeVidas);
        System.out.println("Récord actual: " + this.record);
        
        while (true) {
            try {
                System.out.println("\n Te quedan " + this.numeroDeVidas + " vidas");
                System.out.print("Adivina un número IMPAR entre 0 y 10: ");
                int numeroUsuario = scanner.nextInt();
                
                if (!validaNumero(numeroUsuario)) {
                    continue;
                }
                
                if (numeroUsuario == numeroAAdivinar) {
                    System.out.println("\n ¡ACERTASTE!");
                    actualizaRecord();
                    System.out.println("El número IMPAR era: " + numeroAAdivinar);
                    System.out.println("Has terminado con " + this.numeroDeVidas + " vidas restantes");
                    System.out.println("Récord actual: " + this.record);
                    break;
                } else {
                    boolean tieneVidas = quitaVida();
                    
                    if (!tieneVidas) {
                        System.out.println("\n GAME OVER");
                        System.out.println("El número IMPAR era: " + numeroAAdivinar);
                        System.out.println("Has perdido todas tus vidas");
                        System.out.println("Récord actual: " + this.record);
                        break;
                    } else {
                        if (numeroUsuario < numeroAAdivinar) {
                            System.out.println("¡Fallaste! El número IMPAR es MAYOR que " + numeroUsuario);
                        } else {
                            System.out.println("¡Fallaste! El número IMPAR es MENOR que " + numeroUsuario);
                        }
                        System.out.println("Te quedan" + this.numeroDeVidas + " vidas. ¡Inténtalo de nuevo!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: Por favor, ingresa un número válido.");
                scanner.next();
            }
        }
    }
}

