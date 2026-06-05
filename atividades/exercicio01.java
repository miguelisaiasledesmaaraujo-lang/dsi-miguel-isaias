package atividades;
 import java.util.Scanner; 
public class exercicio01 {
    public static void main(String[] args){
        //irei primeiro fazer o scanner 
         Scanner leitor = new Scanner(System.in);
        //vou fazer primeiro esses mais facil de só ler tal informação
         System.out.println("nome do(a) func:");
          String nomeFuncionario = leitor.nextLine();
          System.out.println("nome do(a) func é:" + nomeFuncionario);
        
        System.out.println("horas trabalhadas na semana:");
        int horasTrabalhadas = leitor.nextInt();
        System.out.println("horas trabalhadas na semana foi:" + horasTrabalhadas);
        
        System.out.println("valor que recebe por hora chefia:");
        float valorHora = leitor.nextFloat();
        System.out.println("valor hora é: "+ valorHora);

        //diretamente filhos menores de 14 anos
        System.out.println("numero de filhos do(a) func:");
        int filhosMenores = leitor.nextInt();
        System.out.println("filhos do(a) func:" + filhosMenores);
        
        System.out.println("idade func:");
        int idade = leitor.nextInt();
        System.out.println("idade do cidadão(a):" + idade);

        System.out.println("tempo de serviço");
        int anos = leitor.nextInt();
        System.out.println("anos de serviço:" + anos);
        
      float salarioFamilia = 100.00f;
            float descontoINSS = 0.085f;

            //agora o que pede ali, calcular salario bruto, inss e salario familia

           float salBruto = valorHora*horasTrabalhadas;

            float  descontoINSSfinal = salBruto*0.085f;

         float salarioFamiliaTotal = filhosMenores*100.00f;
         
         //////agora vou calcular o IR
         /// o posIR é um pós calculo, o valor de 15% do salario
            

         float posIR = 0f;
         if(salBruto > 1500){
            float ir = 0.15f;
            posIR = salBruto*ir;
        System.out.println("salario com desconto do IR pra < 1500:"+posIR); 
        }
         else if(salBruto >= 500 && salBruto <1500){
            float ir = 0.08f;
            posIR = salBruto*ir;
            System.out.println("salario com desconto IR entre salario 500-1500:"+posIR);
         }
           else{
            System.out.println("imposto 0");
           }

           /////agora teremos adicionais
           /// 
        
           float posAdicional = 0f;
            if(idade > 40){
                float adicionar= 0.02f;
                float adicional = salBruto*adicionar;
                posAdicional= salBruto+adicional;
                System.out.println("40+, +2% do salario bruto"+posAdicional);
            }
            else if(anos > 15){
                float adicionar=0.035f;
                float adicional = salBruto*adicionar;
                posAdicional= salBruto+adicional;
                System.out.println("15+ de serviço, +3,5% do salario bruto"+posAdicional);
            }
            else if(anos > 5 && anos <15 && idade > 30){
             float adicionar= 0.015f;
                float adicional = salBruto*adicionar;
                posAdicional= salBruto+adicional;
                System.out.println("entre 5-15 anos de casa e 30+, +1,5% do salario bruto"+posAdicional);   
            }

            //fazer as atividades finais dessa atv1

            //antes do salario liquido, vou fazer o do numero do funcionario

            System.out.println("numero do funcionario(a):");
            int numeroFunc = leitor.nextInt();
            System.out.println("numero do(a) func. é:"+numeroFunc);

            //agora  vou pegar o salario liquido, a conta no caso

            System.out.println("salario liquido do ser:");
            float salarioLiquido = salBruto - posIR - descontoINSSfinal +  posAdicional ;
             System.out.println("salario liquido do(a)func:"+salarioLiquido);
    }}