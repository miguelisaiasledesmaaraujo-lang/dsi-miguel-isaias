package atividades;
 import java.util.Scanner;
public class atividade02 {
    public static void main(String[] args){
        //scanner
    Scanner leitor = new Scanner(System.in);
     
       System.out.println("codigo:");
    String codigo = leitor.nextLine();
     System.out.println("codigo do(a) func:"+codigo);

     System.out.println("M para masculino ou F para feminino");
     String sexo = leitor.nextLine();

      if(sexo.equalsIgnoreCase("M")){
        System.out.println("masculino");
      }
      else if(sexo.equalsIgnoreCase("F")){
        System.out.println("feminino");
      }
      System.out.println("tempo de serviço");
      int anos = leitor.nextInt();
      System.out.println("tempo de casa:"+anos); 

      System.out.println("salario do cidadão(a):");
      float salario = leitor.nextFloat();
      System.out.println("salario é:"+salario);
       
      
      if (sexo.equalsIgnoreCase("masculino") && anos > 15){
        float bonus = 0.20f;      
        float bonusFinal = salario*bonus;
        System.out.println("homem com 15+ anos de casa, seu salario de natal será:"+bonusFinal);

      }
      else if(sexo.equalsIgnoreCase("feminino") && anos > 10){
        float bonus = 0.25f;
        float bonusFinal = salario*bonus;
        System.out.println("mulher com 10+ de casa, seu salario de natal é:"+bonusFinal);
      }

    }}