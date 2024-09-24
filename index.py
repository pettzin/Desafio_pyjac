def calcular_imc(peso, altura):
    imc = peso / (altura ** 2)
    return imc

def main():
    peso = float(input("Digite seu peso em kg: "))
    altura = float(input("Digite sua altura em metros: "))
    
    imc = calcular_imc(peso, altura)
    print(f"Seu IMC é: {imc:.2f}")

if __name__ == "__main__":
    main()
