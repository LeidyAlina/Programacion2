package practica1;

class Anime {
    
    public String nombre;
    public String genero;
    
   
    private int nroEpisodios;
    private String[] episodios;
    
  
    public Anime(String nombre, String genero, int nroEpisodios) {
        this.nombre = nombre;
        this.genero = genero;
        this.nroEpisodios = nroEpisodios;
        this.episodios = new String[nroEpisodios]; 
    }
    
    public int getNroEpisodios() {
        return nroEpisodios;
    }
    
    public void setNroEpisodios(int nroEpisodios) {
        this.nroEpisodios = nroEpisodios;
    }
    
    public String[] getEpisodios() {
        return episodios;
    }
    
    public void setEpisodios(String[] episodios) {
        this.episodios = episodios;
    }
}