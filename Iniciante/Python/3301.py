a, b, c = map(int, input().split())

primos = {"huguinho": a, "zezinho": b, "luisinho": c}

maior = max(list(primos.values()))
menor = min(list(primos.values()))

for i in primos:
    if (primos[i] != maior) and (primos[i] != menor):
        print(i)