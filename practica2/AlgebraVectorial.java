public class AlgebraVectorial {

    double x;
    double y;
    double z;
    
    AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    double magnitud() {
        return Math.sqrt(x*x + y*y + z*z);
    }
    
    double productoPunto(AlgebraVectorial v) {
        return this.x*v.x + this.y*v.y + this.z*v.z;
    }
    
    AlgebraVectorial productoVectorial(AlgebraVectorial v) {
        double nx = this.y*v.z - this.z*v.y;
        double ny = this.z*v.x - this.x*v.z;
        double nz = this.x*v.y - this.y*v.x;
        return new AlgebraVectorial(nx, ny, nz);
    }
    
    boolean esPerpendicular(AlgebraVectorial v) {
        return this.productoPunto(v) == 0;
    }
    
    boolean esParalelo(AlgebraVectorial v) {
        AlgebraVectorial cruz = this.productoVectorial(v);
        return cruz.x == 0 && cruz.y == 0 && cruz.z == 0;
    }
    
    static AlgebraVectorial proyeccion(AlgebraVectorial a, AlgebraVectorial b) {
        double num = a.productoPunto(b);
        double den = b.productoPunto(b);
        double escalar = num / den;
        return new AlgebraVectorial(escalar*b.x, escalar*b.y, escalar*b.z);
    }
    
    static double componente(AlgebraVectorial a, AlgebraVectorial b) {
        return a.productoPunto(b) / b.magnitud();
    }
    
    public static void main(String[] args) {
       
        AlgebraVectorial v1 = new AlgebraVectorial(3, 0, 0);
        AlgebraVectorial v2 = new AlgebraVectorial(0, 4, 0);
        
        System.out.println("Vector a: (3,0,0)");
        System.out.println("Vector b: (0,4,0)");
        System.out.println();
        
        System.out.println("¿Son perpendiculares? " + v1.esPerpendicular(v2));
        
        System.out.println("¿Son paralelos? " + v1.esParalelo(v2));
        
        AlgebraVectorial proy = proyeccion(v1, v2);
        System.out.println("Proyección de a sobre b: (" + proy.x + "," + proy.y + "," + proy.z + ")");
        
        double comp = componente(v1, v2);
        System.out.println("Componente de a en b: " + comp);
    }
}

