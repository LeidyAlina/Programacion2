class Biblioteca:
    def __init__(self, nombre):
        self.nombre = nombre
        self.cantLibros = 0
        self.libros = [None] * 100
    def agregarlibro(self, libro):
        if self.cantLibros < 100:
            self.libros[self.cantLibros] = libro
            self.cantLibros += 1
        else:
            print("No se pueden agregar mas libros")
    def buscarlibro(self, nombre):
        for i in range(self.cantLibros):
            if self.libros[i].nombre == nombre:
                print("Libro encontrado:")
                print("Nombre:", self.libros[i].nombre)
                print("Autor:", self.libros[i].autor)
                print("Año:", self.libros[i].año)
                return
        print("Libro no encontrado")