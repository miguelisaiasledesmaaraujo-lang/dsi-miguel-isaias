package atividades;
import java.util.Scanner;
public class atividade03 {
public static void main(String[] args){
        //scanner
    Scanner leitor = new Scanner(System.in);    

      System.out.println("valor A:");
      float valorA = leitor.nextFloat();
      System.out.println("valor a é:"+valorA);

      System.out.println("valor B:");
      float valorB = leitor.nextFloat();
      System.out.println("valor a é:"+valorB);

      System.out.println("valor C:");
      float valorC = leitor.nextFloat();
      System.out.println("valor a é:"+valorC);

      //agora vou botar os if/else pra comparar os valores dos lados ABC

      if(valorA > valorB+valorC){
        System.out.println("nao forma trangulo");
      }
      //esse daqui quero fazer uma potencia de 2 nos valores
      else if(valorA == valorB+valorC){
         float valorAquadrado = valorA*valorA;
         float valorBquadrado = valorB*valorB;
         float valorCquadrado = valorC*valorC;
         float trianguloA = valorBquadrado+valorCquadrado; 
         if (valorA == trianguloA)
        System.out.println("A^2= B^=2 +C^=2 dá um triangulo retangulo");
      }
      //esse é um triangulo obstangulo
      else if(valorA > valorB+valorC){
        float valorAquadrado = valorA*valorA;
         float valorBquadrado = valorB*valorB;
         float valorCquadrado = valorC*valorC;
          float  obstanguloA = valorBquadrado+valorCquadrado;
          if(valorA > obstanguloA){
            System.out.println("A^2 > B^2 + C^2 dá um obstangulo");
          }
      }
      //vou fazer a mesma coisa, só que invertido pro BeC ser maior
      else if(valorA < valorB+valorC){
        float valorAquadrado = valorA*valorA;
         float valorBquadrado = valorB*valorB;
         float valorCquadrado = valorC*valorC;
         float acutanguloA = valorBquadrado+valorCquadrado;
         if(valorA< acutanguloA){
            System.out.println("A^2 < B^2 + C^2 é um acutangulo");
         }
      }
      //equilatero
      else if(valorA == valorB && valorB == valorC){
        System.out.println("equilatero");
      }
      else if(valorA == valorB||valorB == valorC||valorA == valorC){
          System.out.println("isso é um triangulo isosceles");
      }

}}
