class Parqueo:
    def __init__(self, capacidad,precioH):
        self.capacidad=capacidad
        self.cantAuto=0
        self.parqueo=[None]*100
        self.precioH=precioH
    def agregarauto(self, placa):
        if self.cantAuto < self.capacidad:
            self.parqueo[self.cantAuto] = placa
            self.cantAuto += 1
            print("Auto agregado")
        else:
            print("Parqueo lleno")

    def cantidad_autos(self):
        return self.cantAuto