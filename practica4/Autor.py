class Autor:
    
    def __init__(self, nombre, nacionalidad):
        self.__nombre = nombre
        self.__nacionalidad = nacionalidad

    def __str__(self):
        return f"Autor [ Nombre: {self.__nombre}, Nacionalidad: {self.__nacionalidad} ]"