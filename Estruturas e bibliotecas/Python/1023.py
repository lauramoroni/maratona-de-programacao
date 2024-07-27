from math import floor

import time
ii = time.time()

n = int(input())

c = 0

while n != 0:

    soma_consumo, soma_pessoas = 0, 0
    pessoas_consumo = {}

    for _ in range(n):

        x, y = map(int, input().split(' '))

        soma_pessoas += x
        soma_consumo += y

        if (y//x in pessoas_consumo):
            pessoas_consumo[y//x] += x # acrescenta as pessoas à quantidade de consumo ja registrada   
        else:
            pessoas_consumo[y//x] = x

    c += 1
    print(f'Cidade# {c}:')

    output = []

    keys = sorted(list(pessoas_consumo.keys()))

    for k in keys:
        output.append(f'{pessoas_consumo[k]}-{k}')
    
    print(f'{" ".join(output)}')
    
    media = floor((100*soma_consumo) / soma_pessoas) / 100

    print(f'Consumo medio: {media:.2f} m3.')
    print()

    n = int(input())

ff = time.time()
print(ff-ii)