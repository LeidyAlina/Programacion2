from Prestamo import Prestamo

class Biblioteca:
    class Horario:
        
        def __init__(self, dias, apertura, cierre):
            self.__dias = dias
            self.__apertura = apertura
            self.__cierre = cierre

        def __str__(self):
            return f"Horario [ Días: {self.__dias}, Apertura: {self.__apertura}, Cierre: {self.__cierre} ]"

    def __init__(self, nombre):
        self.__nombre = nombre
        
        self.__libros = []
        self.__autores = []

        self.__prestamos = []

        self.__horario = self.Horario("Lunes a Viernes", "08:00", "20:00")

    def agregarLibro(self, libro):
        self.__libros.append(libro)

    def agregarAutor(self, autor):
        self.__autores.append(autor)

    def prestarLibro(self, estudiante, libro):
        prestamo = Prestamo(estudiante, libro)
        self.__prestamos.append(prestamo)

    def mostrarEstado(self):
        print(f"\nBiblioteca: {self.__nombre}")
        print(self.__horario)

        print("\nAutores registrados:")
        for autor in self.__autores:
            print(autor)

        print("\nLibros disponibles:")
        for libro in self.__libros:
            print(libro)

        print("\nPréstamos activos:")
        for prestamo in self.__prestamos:
            print(prestamo)

    def cerrarBiblioteca(self):
        print("\nLa biblioteca está cerrando...")
        
        self.__prestamos = []

        print("Todos los préstamos han sido eliminados.")