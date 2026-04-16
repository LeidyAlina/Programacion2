class Persona:
    def __init__(self, nombre, carnet, edad):
        self.nombre = nombre
        self.carnet = carnet
        self.edad = edad

    def mostrar(self):
        print(f"Nombre: {self.nombre}, Carnet: {self.carnet}, Edad: {self.edad}")


class Estudiante(Persona):
    def __init__(self, nombre, carnet, edad, matricula, carrera):
        super().__init__(nombre, carnet, edad)
        self.matricula = matricula
        self.carrera = carrera

    def mostrar(self):
        super().mostrar()
        print(f"Matrícula: {self.matricula}, Carrera: {self.carrera}")

    def mismaCarrera(self, otro):
        return self.carrera == otro.carrera


class Docente(Persona):
    def __init__(self, nombre, carnet, edad, antiguedad, sueldo):
        super().__init__(nombre, carnet, edad)
        self.antiguedad = antiguedad
        self.sueldo = sueldo

    def mostrar(self):
        super().mostrar()
        print(f"Antigüedad: {self.antiguedad}, Sueldo: {self.sueldo}")


if __name__ == "__main__":
    e1 = Estudiante("Carla", 125, 23, 1002, "Informática")
    e2 = Estudiante("Israel", 573,19, 1001, "Informática")
    d1 = Docente("Porfirio", 642, 20, 3, 4002)

    e1.mostrar()
    print()
    e2.mostrar()
    print()
    d1.mostrar()

    print("\nVerificaciones")

    if e1.edad == d1.edad:
        print("El estudiante y el docente tienen la misma edad")
    else:
        print("No tienen la misma edad")

    if e1.mismaCarrera(e2):
        print("Los estudiantes están en la misma carrera")
    else:
        print("Los estudiantes NO están en la misma carrera")