def pesquisa_binaria(N, q):

    baixo, alto = 0, len(N)

    while baixo < alto:
        meio = (baixo + alto) // 2

        if (q > N[meio]):
            baixo = meio + 1
        else:
            alto = meio

    if(baixo >= len(N)):
        return -1

    return baixo if N[baixo] == q else -1

n, q = [int(x) for x in input().split(' ')]
t = 1

while n != 0 and q != 0:

    lista_n = []

    for i in range(n): # mármores
        lista_n.append(int(input()))
    
    lista_n.sort() # coloca em ordem crescente

    print(f'CASE# {t}:')

    t += 1

    for j in range(q): #consulta

        valor_q = int(input())

        pos = pesquisa_binaria(lista_n, valor_q)

        if pos <= -1:
            print(f'{valor_q} not found')
        else:
            print(f'{valor_q} found at {pos+1}')

    n, q = [int(x) for x in input().split(' ')]


