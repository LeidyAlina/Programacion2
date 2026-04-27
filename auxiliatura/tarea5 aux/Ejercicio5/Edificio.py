class Edificio:
    def __init__(self, nombre, superficie):
        self.nombre=nombre
        self.superficie=superficie
        self.cantDep=0
        self.dep=[None]*100
        self.parqueo=None
    def agregardepartamento(self, dep):
        if self.cantDep < 100:
            self.dep[self.cantDep] = dep
            self.cantDep += 1
        else:
            print("No se pueden agregar ms departamentos")

    def agregarparqueo(self, parqueo):
        self.parqueo = parqueo