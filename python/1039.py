import math

def dist_entre_pontos(xa, ya, xb, yb):
    d = math.sqrt(pow(xb - xa, 2) + pow(yb - ya, 2))

    return d

while True:
    try:
        rc, x1, y1, rf, x2, y2 = [int(x) for x in input().split(' ')]

        # a distancia entre o circulo da flor e o centro do circulo do caçador mais o raio da flor deve ser menor que o raio do caçador

        if dist_entre_pontos(x1, y1, x2, y2) + rf <= rc:
            print("RICO")
        else:
            print("MORTO") 

    except EOFError:
        break
