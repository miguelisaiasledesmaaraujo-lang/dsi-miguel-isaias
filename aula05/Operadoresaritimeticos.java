package aula05;

public class Operadoresaritimeticos{
    public static void main(String[] args){
        //operadores aritimeticos, irei explicar eles nesse arquivo//

    
    //esta é a adição, tu bota o valor da variavel, e o operador "+" vai somar esses valores,
    // gerando obviamente um resultado //
        int x = 5;
        int y = 3;
        System.out.println(x + y);//8

        
        //este daqui, é o operador de subtração, tambem pega os valores das variaveis, porem o operador "-" vai subtrair esses valores//
        int x = 5;
        int y = 3;
        System.out.println(x - y);//2


        //este daqui multiplica o valor das duas variaveis com operador "*"//
         int x = 5;
         int y = 3;
         System.out.println(x * y);//15

       //já este daqui faz a divisão entre o valor das duas variaveis com o operador "/"//
         int x = 50;
         int y = 5;
         System.out.println(x / y);//10


        //isto por sua vez, o operador "%" pega o valor que sobrou da divisão, no exemplo de baixo, como 5/2 
        //dá 2, o que sobra é 1 pra completar o 5// 
        int x = 5;
        int y = 2;
        System.out.println(x % y); //1


        //este operador "++x" faz com que sempre adicione/incremente o valor de 1 no resultado, ou seja
        //o valor abaixo é 5, o ++x incrementa 1, 5+1=6
           int x = 5;
           ++x;
        System.out.println(x);//6
  

        //este é o contrario, ele decrementa, diminui o valor em 1, entao 5-1=4
        int x = 5;
        --x;
        System.out.println(x);//4
  

    }
}