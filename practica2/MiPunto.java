public class MiPunto {
    
    double x;
    double y;
    
    MiPunto() {
        x = 0;
        y = 0;
    }
    
    MiPunto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    double distancia(MiPunto p) {
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    public static void main(String[] args) {
        MiPunto p1 = new MiPunto();
        MiPunto p2 = new MiPunto(10, 30.5);
        
        double d = p1.distancia(p2);
        System.out.println("Distancia: " + d);
    }
}