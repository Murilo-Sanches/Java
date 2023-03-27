package com.ms;

import com.ms.utilities.Colors;

import java.text.DecimalFormat;
import java.util.Scanner;

import com.ms.data.UserScanner;

/**
 * Classe App, a primeira classe depois do package (ms) e a única com método
 * main(string[] args)
 * Ponto de partida de todo programa Java, a função main é a primeira coisa que
 * é
 * executada!
 */
public class App {
    public static void main(String[] args) {
        System.out.println(Colors.RED_BACKGROUND_BRIGHT + "Hello World!" + Colors.RESET);

        /*
         * String nullable = null;
         * System.out.println(nullable == null ? "nulo" : "nop");
         * System.out.println(Boolean.parseBoolean(nullable));
         * System.out.println(Boolean.getBoolean(nullable));
         * System.out.println(null == null);
         * 
         * byte code = 97;
         * System.out.println(((char) code));
         * 
         * char[] codee = { 77, 101, 0x20, 109, 97, 109, 97 };
         * String out = "";
         * for (char c : codee) {
         * out += c;
         * }
         * System.out.println(out);
         * 
         * System.out.println(Integer.MAX_VALUE);
         * System.out.println(Integer.MAX_VALUE + 1);
         * 
         * double d1 = 123.4;
         * // + notação científica, move-se a "vírgula" depois eleva (e) a 2
         * double d2 = 1.234e2;
         * 
         * int decimal = 26;
         * int hexadecimal = 0x1a;
         * int octadecimal = 032;
         * int binario = 0b11010; // + JDK 7
         * 
         * // + underscore serve para ficar mais legível
         * int underscore = 100_000_000;
         * long cpf = 101_134_156_68l;
         * float pi = 3.14_15f;
         * 
         * System.out.print("\"alguma mensagem\"\n\r"); // + o println adiciona isso no
         * final
         * System.out.println("oba");
         */

        /*
         * Scanner scanner = new Scanner(System.in);
         * System.out.println(scanner.getClass().getName());
         * 
         * // + Várias palavras = apenas o valor de "Várias", para quando acha espaço
         * System.out.println("Digite seu nome completo: ");
         * String nextSóLêUmaString = scanner.next();
         * System.out.println("Seu nome é: " + nextSóLêUmaString);
         * 
         * System.out.println("Digite seu nome completo: ");
         * String nextLineLêTudo = scanner.nextLine();
         * System.out.println("Seu nome é: " + nextLineLêTudo);
         * 
         * System.out.println("Digite seu primeiro nome e sua idade");
         * String name = scanner.next();
         * byte age = scanner.nextByte();
         * System.out.println("Seu nome é: " + name + " e você tem " + age + " anos");
         * scanner.close();
         */

        /*
         * byte plusplus = 1;
         * System.out.println(plusplus++); // + mostra a váriavel depois adiciona 1
         * System.out.println(++plusplus); // + adiciona 1 e depois mostra a váriavel
         * System.out.println(plusplus--);
         * System.out.println(--plusplus);
         * 
         * for (int i = 0; i <= 4; i++) {
         * // + esse sistema de rótulos vou ver mais em assembly já que não existe for
         * rotulo1: {
         * rotulo2: {
         * rotulo3: {
         * if (i == 1)
         * break rotulo1; // + go to
         * if (i == 2)
         * break rotulo2; // + go to
         * if (i == 3)
         * break rotulo3; // + go to
         * 
         * System.out.println("Rótulo 3");
         * }
         * System.out.println("Rótulo 2");
         * }
         * System.out.println("Rótulo 1");
         * }
         * System.out.println("For");
         * }
         */

        /*
         * // + criando um array do tipo float com 365 espaços
         * float[] yearTemperatures = new float[365];
         * System.out.println(yearTemperatures.length);
         * System.out.println(yearTemperatures); // + endereço na memória
         * yearTemperatures[0] = 31.5f;
         * yearTemperatures[1] = 9;
         * DecimalFormat df = new DecimalFormat("###,###.###");
         * System.out.println(Math.sqrt(yearTemperatures[0]));
         * System.out.println(df.format(Math.sqrt(yearTemperatures[0])));
         * System.out.println(Math.sqrt(yearTemperatures[1]));
         * 
         * int roundedRandomic = ((int) Math.round(Math.random() * 6));
         * System.out.println(roundedRandomic);
         */

        /*
         * 
         * // * matriz (array multidimensional) - 30 alunos e cada um tem 4 notas
         * // * 30 linhas (alunos) e 4 colunas(bimestres - notas)
         * // * float[][] studentsGrades = new float[30][4];
         * float[][] studentsGrades = new float[2][4];
         * float[][] outroJeito = { { 9.5f, 2.0f, 9.5f, 7.5f }, { 0f, 2.9f, 9.9f, 5f }
         * };
         * 
         * // + notas dos bimestres para o primeiro aluno
         * studentsGrades[0][0] = 9.5f;
         * studentsGrades[0][1] = 2.0f;
         * studentsGrades[0][2] = 9.5f;
         * studentsGrades[0][3] = 7.5f;
         * // + notas dos bimestres para o segundo aluno
         * studentsGrades[1][0] = 0f;
         * studentsGrades[1][1] = 2.9f;
         * studentsGrades[1][2] = 9.9f;
         * studentsGrades[1][3] = 5f;
         * 
         * // + percorrendo as linhas da matriz (tabela)
         * for (int i = 0; i < studentsGrades.length; i++) {
         * // + percorrendo as colunas da matriz (tabela)
         * for (int j = 0; j < studentsGrades[i].length; j++) {
         * System.out.print(studentsGrades[i][j] + " - ");
         * }
         * System.out.println();
         * }
         */

        /*
         * 
         * // + váriavel primitiva do tipo int tem como padrão o valor 0
         * int[][][] triDimensional = new int[3][3][3];
         * // + "eixo y"
         * for (int i = 0; i < triDimensional.length; i++) {
         * // + "eixo x"
         * for (int j = 0; j < triDimensional[i].length; j++) {
         * // + "eixo z"
         * for (int k = 0; k < triDimensional[i][j].length; k++) {
         * triDimensional[i][j][k] = i + j + k;
         * }
         * }
         * }
         * int soma = 0;
         * int somaPares = 0;
         * int somaImpares = 0;
         * // + "eixo y"
         * for (int i = 0; i < triDimensional.length; i++) {
         * // + "eixo x"
         * for (int j = 0; j < triDimensional[i].length; j++) {
         * // + "eixo z"
         * for (int k = 0; k < triDimensional[i][j].length; k++) {
         * soma += triDimensional[i][j][k];
         * 
         * // + ver se é par, dividindo por e verificando se o resto é 0
         * if (triDimensional[i][j][k] % 2 == 0) {
         * somaPares += triDimensional[i][j][k];
         * } else {
         * somaImpares += triDimensional[i][j][k];
         * }
         * }
         * }
         * }
         * System.out.println("Soma total: " + soma);
         * System.out.println("Soma total dos pares: " + somaPares);
         * System.out.println("Soma total dos impares: " + somaImpares);
         * 
         * // + arrays irregulares
         * int[][] linhasFixasComColunasVariadas = new int[3][];
         * linhasFixasComColunasVariadas[0] = new int[1];
         * linhasFixasComColunasVariadas[1] = new int[2];
         * linhasFixasComColunasVariadas[2] = new int[4];
         */

        String s1 = "por referência";
        String s2 = "por referência";
        String s3 = s1;
    }
}
