package practica1;

public class practica1 {
    public static void main(String[] args) {
   
        Anime anime1 = new Anime("Naruto", "Shonen", 220);
        Anime anime2 = new Anime("One Piece", "Shonen", 1000);
        
        Televisor tv1 = new Televisor("Samsung", 3840, "OLED");
        Televisor tv2 = new Televisor();

        tv2.setMarca("LG");
        tv2.setResolucion(1920);
        tv2.setTipo("IPS");
      
        Instrumento inst1 = new Instrumento("Guitarra", "Madera", "cuerda");
        Instrumento inst2 = new Instrumento("Flauta", "Metal", "aire");
        
        System.out.println("Anime 1: " + anime1.nombre + ", " + anime1.genero + ", Episodios: " + anime1.getNroEpisodios());
        System.out.println("Anime 2: " + anime2.nombre + ", " + anime2.genero + ", Episodios: " + anime2.getNroEpisodios());
        System.out.println("TV1: " + tv1);
        System.out.println("TV2: " + tv2);
        System.out.println("Instrumento 1: " + inst1);
        System.out.println("Instrumento 2: " + inst2);
    }
}