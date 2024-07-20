i = int(input())

for j in range(i):
    senha = input()

    nova_senha = ""

    for k in senha:     
        nova_senha += chr(ord(k)+3) if k.isalpha() else k
    
    nova_senha = nova_senha[::-1] # Senha invertida

    metade = nova_senha[len(nova_senha)//2::] # Pegando a metade da senha

    nova_metade = ""

    for l in metade:
        nova_metade += chr(ord(l)-1) # Criptografando a metade da senha

    senha = nova_senha[:len(nova_senha)//2:] + nova_metade # Concatenando

    print(senha)
