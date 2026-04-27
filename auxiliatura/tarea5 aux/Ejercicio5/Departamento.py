class Departamento:
    def __init__(self, nroPuerta, nroPiso):
        self.nroPuerta=nroPuerta
        self.nroHab=0
        self.Hab=[None]*100
        self.nroPiso=nroPiso
    def agregarhabitacion(self, habitacion):
        if self.nroHab < 100:
            self.Hab[self.nroHab] = habitacion
            self.nroHab += 1
        else:
            print("No se pueden agregar mas habitaciones")

    def cantidad_habitaciones(self):
        return self.nroHab

    def cantidad_muebles(self):
        total = 0
        for i in range(self.nroHab):
            total += self.Hab[i].cantidad_muebles()
        return total