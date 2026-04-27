class Habitacion:
    def __init__(self, nombre,tamaño):
        self.nombre=nombre
        self.tamaño=tamaño
        self.cantMuebles=0
        self.muebles=[None]*100
    def agregarmueble(self, mueble):
        if self.cantMuebles < 100:
            self.muebles[self.cantMuebles] = mueble
            self.cantMuebles += 1
        else:
            print("No se pueden agregar mas muebles")

    def cantidad_muebles(self):
        return self.cantMuebles