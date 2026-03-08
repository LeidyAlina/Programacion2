package practica1;

class Televisor {
  
    private String marca;
    private int resolucion;
    private String tipo; 
    
  
    public Televisor() {
        this.marca = "Desconocida";
        this.resolucion = 0;
        this.tipo = "Desconocido";
    }
    
    public Televisor(String marca, int resolucion, String tipo) {
        this.marca = marca;
        this.resolucion = resolucion;
        this.tipo = tipo;
    }
    
    public String toString() {
        return "Televisor [marca=" + marca + ", resolucion=" + resolucion + ", tipo=" + tipo + "]";
    }
    
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public int getResolucion() {
        return resolucion;
    }
    
    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}