package aula05;

public class Operadoresaritimeticos{
    public static void main(String[] args){
        //operadores aritimeticos, irei explicar eles nesse arquivo//

      //este operador "=" nada mais é do que pra por um valor em uma variavel
      //que nem abaixo, o valor da variavel x é 5
      int x = 5;
      System.out.println(x);//5

     
     //basicamente, pega o valor da variavel, que nem o x em baixo, e faz somar com o valor colocado
     //pegou o x e somou com +3, como x=5, 5+3=8
      int x = 5;
    x += 3;
    System.out.println(x); //8



    //este por sua vez já é o contrario, subtrai o valor da variavel pelo numero colocado pra subtrair
    //como x=5, 5-3=2
    int x = 5;
    x -= 3;
    System.out.println(x);//2


    //esta é o comando multiplicação, multiplica o valor da variavel x pelo valor que tá 
    //ali em baixo, 5*3=15
     int x = 5;
    x *= 3;
    System.out.println(x);//15

       //esta é a divisão, dividindo os 2 valores, para facilitar no exemplo abaixo, 15/3=5
    double x = 15;
    x /= 3;
    System.out.println(x);//5


    //oq este operador faz é que ele pega o valor de resto de uma divisão e bota como novo valor da variavel
    int x = 8;
    x %= 4;
    System.out.println(x);//0


    //ele pega o "codigo binario", ou valor binario mesmo, da variavel e do numero colocado
    //ou seja, o binario de 5 é "00101" e de 3 é "00011"
    //ele faz a conta entre esses codigos, o resultado é 00001
    int x = 5;
    x &= 3;
    System.out.println(x);//1

     //ele faz a soma entre os "codigos binarios" de cada numero
     //porem, sempre que tem 1 acima de 1, ou acima/abaixo de 0, esse 1 vai aparecer no resultado final
     //5 é "00101" e 3 é "00011", dando 00111, e 00111 é o binario de 7
    int x = 5;
    x |= 3;
    System.out.println(x);//7


    //este operador tambem faz as contas com os "codigos binarios"
    //porem, se os bits em cima do outro forem iguais, dá 0, senao, caso diferentes, dá 1
    //5 é "00101" e 3 "00011", o que na conta dá "00110", que é o codigo binario de 6
    int x = 5;
    x ^= 3;
    System.out.println(x);//6


    //este operador pega o codigo binario do numero, e retira as casas a direita
    //o valor que colocamos ali, o 3, é o numero de casas a direita que será retirada
    // ou seja, o 5 que seria "00000101", os 3 valores a direita, seriam "descartados", até porque nao existem mais
    //e pra completar, viriam entao 3 novos 0
    int x = 5;  //00000101 estaria 00000000
    x >>= 3; //00000110  estaria 00000000
    System.out.println(x);//0


    //este retira a esquerda e adiciona os novos 0 a direita
    int x = 5; //00101000
    x <<= 3; // 00110000
    System.out.println(x);//40

  }
}
