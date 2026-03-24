package practica2;

public class Juego {
protected int numeroDeVidas;
protected int record;
    
public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }
    
public void reiniciaPartida() {
        
    }
    
public void actualizaRecord() {
        
    }
    
public boolean quitaVida() {
        numeroDeVidas--;
        return numeroDeVidas > 0;
    }
    
public int getNumeroDeVidas() {
        return numeroDeVidas;
    }
    
public void setNumeroDeVidas(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
    }
    
public int getRecord() {
        return record;
    }
    
public void setRecord(int record) {
        this.record = record;
    }
}

