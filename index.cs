using System;

class Program
{
    static void Main()
    {
        Console.Write("Digite seu peso em kg: ");
        float peso = float.Parse(Console.ReadLine());
        
        Console.Write("Digite sua altura em metros: ");
        float altura = float.Parse(Console.ReadLine());
        
        float imc = CalcularIMC(peso, altura);
        Console.WriteLine($"Seu IMC é: {imc:}");
    }

    static float CalcularIMC(float peso, float altura)
    {
        return peso / (altura * altura);
    }
}

