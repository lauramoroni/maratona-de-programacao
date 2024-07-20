T = int(input())

for n in range(T):
    
    blocos = []
    qtd = 0

    N, M = [int(x) for x in input().split(' ')]

    blocos.extend(input().split(' '))

    blocos.sort(reverse=True)

    qtd = 0
    
    for bloco in blocos:
        if M == 0:
            break

        qtd += M // int(bloco)

        M -= int(bloco) * qtd

    print(qtd)
