class Estudiante:
    
    def __init__(self, codigo, nombre):
        self.__codigo = codigo
        self.__nombre = nombre

    def __str__(self):
        return f"Estudiante [ Código: {self.__codigo}, Nombre: {self.__nombre} ]"