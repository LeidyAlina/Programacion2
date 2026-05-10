class Libro:
    
    class Pagina:
        
        def __init__(self, numero, contenido):
            self.__numero = numero
            self.__contenido = contenido

        def __str__(self):
            return f"Página {self.__numero}: {self.__contenido}"

    def __init__(self, titulo, isbn, paginas_contenido):
        self.__titulo = titulo
        self.__isbn = isbn
        
        self.__paginas = []

        numero = 1
        for contenido in paginas_contenido:
            pagina = self.Pagina(numero, contenido)
            self.__paginas.append(pagina)
            numero += 1

    def leer(self):
        for pagina in self.__paginas:
            print(pagina)

    def __str__(self):
        return f"Libro [ Título: {self.__titulo}, ISBN: {self.__isbn} ]"