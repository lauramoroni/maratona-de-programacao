def fib(x):
    calls[0] += 1
    if x == 1:
        return 1
    elif x == 0:
        return 0
    return fib(x-1) + fib(x-2)

index = int(input())

result = 0

for k in range(index):
    x = int(input())
    calls = [0] 
    result = fib(x)
    print(f'fib({x}) = {calls[0] - 1} calls = {result}')
