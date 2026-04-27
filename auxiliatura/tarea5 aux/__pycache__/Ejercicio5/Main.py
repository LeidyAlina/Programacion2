from Mueble import Mueble
from Habitacion import Habitacion
from Departamento import Departamento
from Parqueo import Parqueo
from Edificio import Edificio

ed = Edificio("La Casa Grande", 5000)

parqueos = Parqueo(20, 10.5)
ed.agregarparqueo(parqueos)
print("Parqueo agregado")

dep2 = Departamento(1, 2)
dep3 = Departamento(2,2)
dep1 = Departamento(1, 1)
dep4 = Departamento(2,1)
dep5 = Departamento(3,1)

h1 = Habitacion("Sala", 20)
h2_1 = Habitacion("Cocina", 10)
h2_2 = Habitacion("Cocina", 10)
h3_1 = Habitacion("Dormitorio", 15)
h3_2 = Habitacion("Dormitorio", 15)
h4_1 = Habitacion("Sala", 25)
h4_2 = Habitacion("Sala", 25)
h5_1 = Habitacion("Comedor", 15)
h5_2 = Habitacion("Comedor", 15)

dep2.agregarhabitacion(h2_1)
dep2.agregarhabitacion(h3_1)
dep3.agregarhabitacion(h4_1)
dep3.agregarhabitacion(h3_2)
dep3.agregarhabitacion(h5_1)
dep1.agregarhabitacion(h1)
dep4.agregarhabitacion(h2_2)
dep5.agregarhabitacion(h5_2)
dep5.agregarhabitacion(h4_2)

ed.agregardepartamento(dep1)
ed.agregardepartamento(dep2)
ed.agregardepartamento(dep3)
ed.agregardepartamento(dep4)
ed.agregardepartamento(dep5)

piso = 2
mayor = None
max_hab = -1

for i in range(ed.cantDep):
    d = ed.dep[i]
    if d.nroPiso == piso:
        if d.cantidad_habitaciones() > max_hab:
            max_hab = d.cantidad_habitaciones()
            mayor = d
if mayor:
    print("Departamento con más habitaciones en el piso", piso, "de la Puerta",mayor.nroPuerta)
else:
    print("No hay departamentos en ese piso")

puerta = 3
piso = 1

nuevo_mueble = Mueble("Librero", "Madera")
encontrado = False
for i in range(ed.cantDep):
    d = ed.dep[i]
    if d.nroPuerta == puerta and d.nroPiso == piso:
        if d.nroHab > 0:
            d.Hab[0].agregarmueble(nuevo_mueble)
            print("Mueble agregado correctamente al departamento de la puerta", puerta,"del piso",piso)
        else:
            print("El departamento no tiene habitaciones")
        encontrado = True
        break
if not encontrado:
    print("Departamento no encontrado")


dep4.Hab[0].agregarmueble(Mueble("Ropero", "Madera"))
max_muebles = -1
lista = []
for i in range(ed.cantDep):
    d = ed.dep[i]
    cant = d.cantidad_muebles()

    if cant > max_muebles:
        max_muebles = cant
        lista = [d]

    elif cant == max_muebles:
        lista.append(d)

if len(lista) > 0:
    print("Departamento con mas muebles:")

    for d in lista:
        print("Puerta:", d.nroPuerta, "Piso:", d.nroPiso)
else:
    print("No hay departamentos")

dep6 = Departamento(1, 3)
dep7 = Departamento(2, 3)

h6 = Habitacion("Estudio", 30)
h7 = Habitacion("Baño", 15)

dep6.agregarhabitacion(h6)
dep7.agregarhabitacion(h7)

ed.agregardepartamento(dep6)
ed.agregardepartamento(dep7)

h6.agregarmueble(Mueble("Estante", "Madera"))
h6.agregarmueble(Mueble("Escritorio", "Vidrio"))
h7.agregarmueble(Mueble("Espejo", "Vidrio"))

piso = 3
max_muebles = -1
nombre = ""
for i in range(ed.cantDep):
    d = ed.dep[i]

    if d.nroPiso == piso:
        for j in range(d.nroHab):
            h = d.Hab[j]
            if h.cantidad_muebles() > max_muebles:
                max_muebles = h.cantidad_muebles()
                nombre = h.nombre
if max_muebles != -1:
    print("Habitacion con mas muebles del piso", piso)
    print("Nombre:", nombre)
else:
    print("No hay habitaciones en ese piso")


def primo(n):
    if n < 2:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True
nuevos = [None] * 100
nuevo_cant = 0
for i in range(ed.cantDep):
    d = ed.dep[i]
    if not primo(d.cantidad_habitaciones()):
        nuevos[nuevo_cant] = d
        nuevo_cant += 1
ed.dep = nuevos
ed.cantDep = nuevo_cant
print("Departamentos con cantidad NO prima de habitaciones:")

for i in range(ed.cantDep):
    d = ed.dep[i]
    print("Piso:", d.nroPiso,"Puerta:", d.nroPuerta, "Habitaciones:", d.cantidad_habitaciones())

ed.parqueo.agregarauto("13h2b3")
ed.parqueo.agregarauto("dj2nd3")
for i in range(25):
    ed.parqueo.agregarauto("AUTO" + str(i))