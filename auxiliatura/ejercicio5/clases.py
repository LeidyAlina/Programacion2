import math
from abc import ABC, abstractmethod

class Figura(ABC):
    def __init__(self, color):
        self.color = color

    @abstractmethod
    def obtenerArea(self):
        pass

class Cuadrado(Figura):
    def __init__(self, lado, color):
        super().__init__(color)
        self.lado = lado

    def obtenerArea(self):
        return self.lado ** 2


class Triangulo(Figura):
    def __init__(self, lado1, lado2, lado3, color):
        super().__init__(color)
        self.l1 = lado1
        self.l2 = lado2
        self.l3 = lado3

    def obtenerArea(self):
        s = (self.l1 + self.l2 + self.l3) / 2
        return math.sqrt(s * (s - self.l1) * (s - self.l2) * (s - self.l3))

class Redondo(Figura):
    def __init__(self, radio, color):
        super().__init__(color)
        self.radio = radio

    def obtenerArea(self):
        return math.pi * self.radio ** 2


if __name__ == "__main__":
  
    figuras = [
        Cuadrado(4, "Rojo"),
        Cuadrado(6, "Azul"),
        Triangulo(3, 4, 5, "Verde"),
        Triangulo(5, 5, 6, "Amarillo"),
        Redondo(3, "Negro"),
        Redondo(5, "Blanco")
    ]

    print("Áreas:")
    for f in figuras:
        print(f"{type(f).__name__} ({f.color}) -> Área: {f.obtenerArea():.2f}")

    print("\n Comparación")

    c = Cuadrado(4, "Rojo")
    t = Triangulo(3, 4, 5, "Verde")

    if c.obtenerArea() > t.obtenerArea():
        print("Mayor área: Cuadrado, color:", c.color)
    else:
        print("Mayor área: Triángulo, color:", t.color)