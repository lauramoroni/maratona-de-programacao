consumo = int(input())
preco = 0

if (consumo >= 101):
    x = consumo - 100
    preco += x * 5
    consumo -= x
if (consumo >= 31):
    x = consumo - 30
    preco += x * 2
    consumo -= x
if (consumo >= 11):
    x = consumo - 10
    preco += x * 1
    consumo -= x

preco += 7
print(preco)