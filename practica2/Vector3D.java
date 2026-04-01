public class Vector3D {
    
    double x;
    double y;
    double z;
    
    Vector3D() {
        x = 0;
        y = 0;
        z = 0;
    }
    
    Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    Vector3D sumar(Vector3D v) {
        return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
    }
    
    Vector3D multiplicar(double r) {
        return new Vector3D(r * this.x, r * this.y, r * this.z);
    }
    
    double longitud() {
        return Math.sqrt(x*x + y*y + z*z);
    }
    
    Vector3D normalizar() {
        double mag = this.longitud();
        if (mag == 0) return new Vector3D();
        return new Vector3D(this.x/mag, this.y/mag, this.z/mag);
    }
    
    double productoEscalar(Vector3D v) {
        return this.x*v.x + this.y*v.y + this.z*v.z;
    }
    
    Vector3D productoVectorial(Vector3D v) {
        double nx = this.y*v.z - this.z*v.y;
        double ny = this.z*v.x - this.x*v.z;
        double nz = this.x*v.y - this.y*v.x;
        return new Vector3D(nx, ny, nz);
    }
    
    void mostrar() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }
    
    public static void main(String[] args) {
        System.out.println(" VECTORES 3D \n");
        
        Vector3D v1 = new Vector3D(3, 4, 0);
        Vector3D v2 = new Vector3D(1, 0, 0);
        
        System.out.print("Vector v1: "); v1.mostrar();
        System.out.print("Vector v2: "); v2.mostrar();
        System.out.println();
        
        Vector3D suma = v1.sumar(v2);
        System.out.print("v1 + v2 = "); suma.mostrar();
        
        Vector3D mult = v1.multiplicar(2);
        System.out.print("2 * v1 = "); mult.mostrar();
        
        System.out.println("|v1| = " + v1.longitud());
        System.out.println("|v2| = " + v2.longitud());
        
        Vector3D norm = v1.normalizar();
        System.out.print("v1 normalizado = "); norm.mostrar();
        
        System.out.println("v1 · v2 = " + v1.productoEscalar(v2));
        
        Vector3D cruz = v1.productoVectorial(v2);
        System.out.print("v1 × v2 = "); cruz.mostrar();
        
        Vector3D v3 = new Vector3D(0, 0, 5);
        System.out.print("\nv3 = "); v3.mostrar();
        System.out.println("¿v2 es perpendicular a v3? " + (v2.productoEscalar(v3) == 0));
        
        Vector3D v4 = new Vector3D(6, 8, 0);
        System.out.print("v4 = "); v4.mostrar();
        Vector3D cruz2 = v1.productoVectorial(v4);
        System.out.println("¿v1 es paralelo a v4? " + (cruz2.x == 0 && cruz2.y == 0 && cruz2.z == 0));
    }
}

