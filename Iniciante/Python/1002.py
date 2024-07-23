pi = 3.14159
raio = float(input())

def area_circulo(raio):
    return pi * pow(raio, 2)

print(f'A={area_circulo(raio):.4f}')