from Ejercicio1.Biblioteca import Biblioteca
from Ejercicio1.Libro import Libro

biblio_1 = Biblioteca("Biblioteca Municipal Andrés de Santa Cruz")
biblio_2 = Biblioteca("Biblioteca Casto Rojas del Banco Central de Bolivia")
libro_1 = Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605)
libro_2 = Libro("Orgullo y Prejuicio", "Jane Austen", 1813)
libro_3 = Libro("Rebelion en la granja", "George Orwell", 1945)
libro_4 = Libro("Crimen y castigo", "Fiódor Dostoyevski", 1866)

biblio_1.agregarlibro(libro_1)
biblio_1.agregarlibro(libro_2)

biblio_2.agregarlibro(libro_3)
biblio_2.agregarlibro(libro_4)

biblio_2.buscarlibro("Rebelion en la granja")
biblio_1.buscarlibro("Don Quijote de la Mancha")
biblio_1.buscarlibro("Rebelion en la granja")

bibliotecas = [biblio_1, biblio_2]
max_libros = -1
lista = []
for b in bibliotecas:
    if b.cantLibros > max_libros:
        max_libros = b.cantLibros
        lista = [b]
    elif b.cantLibros == max_libros:
        lista.append(b)
print("Biblioteca(s) con mas libros:")
for b in lista:
    print(b.nombre, "tiene la cantidad de", b.cantLibros,"libros")