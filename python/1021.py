valor = input()

reais, centavos = [int(x) for x in valor.split('.')] # Divide a string em dois valores: reais e centavos

# Multiplicando por 100 para deixar os valores das moedas inteiros
notas = [10000, 5000, 2000, 1000, 500, 200]
moedas = [100, 50, 25, 10, 5, 1]

reais *= 100

print("NOTAS:")
for nota in notas:
    qtd = reais//nota 
    print(f'{int(qtd)} nota(s) de R$ {nota/100:.2f}')
    reais -= qtd * nota

centavos += reais

print("MOEDAS:")
for moeda in moedas:
    qtd = centavos//moeda
    print(f'{int(qtd)} moeda(s) de R$ {moeda/100:.2f}')
    centavos -= qtd * moeda

