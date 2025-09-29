package br.senai.sp.jandira.IMC;

import java.util.Scanner;

public class IMC {

    // Método principal (main) - Ponto de entrada para executar o programa.
    public static void main(String[] args) {
        // Criamos um objeto da classe IMC para usar seus métodos.
        IMC calculadora = new IMC();
        calculadora.iniciarCalculo();
    }

    // Variáveis da classe (atributos) com nomes seguindo a convenção camelCase.
    public String coletarDados;
    public double iniciarCalculo;
    public double altura;
    public double peso;
    public String nome;

    /**
     * Método que coleta os dados do usuário (nome, peso e altura).
     */
    public void coletarDados() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- C A L C U L A D O R A . D E . I M C ---");

        System.out.print("Qual seu nome? ");
        String nome = leitor.nextLine();

        System.out.print("Qual o seu peso (em kg)? ");
        peso = leitor.nextDouble();

        System.out.print("Qual a sua altura (em metros)? ");
        altura = leitor.nextDouble();

        leitor.close(); // É uma boa prática fechar o Scanner após o uso.
    }

    /**
     * Método que calcula o IMC com base nos dados coletados.
     * A fórmula correta é: peso / (altura * altura)
     * @return o valor do IMC calculado como um double.
     */
    public double calcularImc() {
        return peso / (altura * altura);
    }

    /**
     * Método que retorna a classificação do IMC de acordo com o valor.
     * @param imc O valor do IMC a ser classificado.
     * @return Uma String com a classificação.
     */
    public String getClassificacao(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidade Grau I";
        } else if (imc < 40) {
            return "Obesidade Grau II";
        } else {
            return "Obesidade Grau III (mórbida)";
        }
    }

    /**
     * Método principal que organiza a execução: coleta dados, calcula e exibe o resultado.
     */
    public void iniciarCalculo() {
        coletarDados();
        double imc = calcularImc();
        String classificacao = getClassificacao(imc);

        System.out.println("\n--- RESULTADO ---");
        System.out.printf("Ola" + nome);
        System.out.printf("Seu IMC é: %.2f\n", imc);
        System.out.println("Classificação: " + classificacao);
    }


    public void nome() {
    }
}