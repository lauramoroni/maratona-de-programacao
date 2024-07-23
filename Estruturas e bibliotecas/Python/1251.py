while True:
    try:
        texto = input()

        frequencia = {}

        for char in texto:
            if char in frequencia:
                frequencia[char] += 1
            else:
                frequencia[char] = 1

        lista = [(ord(char), freq) for char, freq in frequencia.items()]

    # Ordena por ascendencia da frequencia (menor vem primeiro) e descendencia de ascii (criterio de empate)
        lista.sort(key=lambda x: (x[1], -x[0]))

        for ascii, freq in lista:
            print(f'{ascii} {freq}')

        print("")
               
    except EOFError:
        break