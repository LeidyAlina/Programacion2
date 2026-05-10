from Autor import Autor
from Estudiante import Estudiante
from Libro import Libro
from Biblioteca import Biblioteca

print("SISTEMA DE BIBLIOTECA UNIVERSITARIA UMSA\n")

autor1 = Autor("Gabriel García Márquez", "Colombiano")
autor2 = Autor("Mario Vargas Llosa", "Peruano")

libro1 = Libro("Cien Años de Soledad", "1111", ["Página uno", "Página dos"])
libro2 = Libro("La Ciudad y los Perros", "2222", ["Inicio", "Desarrollo"])

est1 = Estudiante("2023001", "Ana Pérez")
est2 = Estudiante("2023002", "Luis Gómez")

biblioteca = Biblioteca("Biblioteca Central UMSA")

biblioteca.agregarAutor(autor1)
biblioteca.agregarAutor(autor2)

biblioteca.agregarLibro(libro1)
biblioteca.agregarLibro(libro2)

biblioteca.prestarLibro(est1, libro1)
biblioteca.prestarLibro(est2, libro2)

biblioteca.mostrarEstado()

biblioteca.cerrarBiblioteca()

biblioteca.mostrarEstado()