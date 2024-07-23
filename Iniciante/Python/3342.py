n = int(input())

area = n ** 2

if n % 2 == 0:
    print(f"{area//2} casas brancas e {area//2} casas pretas")
else:
    print(f"{(area//2) + 1} casas brancas e {area//2} casas pretas")