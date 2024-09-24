import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu peso em kg: ");
        float peso = scanner.nextFloat();
        
        System.out.print("Digite sua altura em metros: ");
        float altura = scanner.nextFloat();
        
        float imc = calcularIMC(peso, altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);
        
        scanner.close();
    }

    public static float calcularIMC(float peso, float altura) {
        return peso / (altura * altura);
    }
}
