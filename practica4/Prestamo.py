class Prestamo:
    
    def __init__(self, estudiante, libro):
        self.__estudiante = estudiante
        self.__libro = libro
        self.__fechaPrestamo = "10/05/2026"
        self.__fechaDevolucion = "17/05/2026"

    def __str__(self):
        return f"Prestamo [ {self.__estudiante}, {self.__libro}, Fecha préstamo: {self.__fechaPrestamo}, Fecha devolución: {self.__fechaDevolucion} ]"