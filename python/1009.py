nome = str(input())
salario = float(input())
vendas = float(input())

bonus = 0.15 * vendas
novo_salario = salario + bonus

print(f'TOTAL = R$ {novo_salario:.2f}')