package aula07;

public class atvcasa {
    public static void main(String[] args){

        //hoje vou explicar algumas coisas aqui//

        //switch//

        //basicamente, ele pega o valor da variavel e busca a case que há o mesmo valor da variavel ai abaixo
        //no caso abaixo, o x=4, o caso 4 é quinta, logo, o caso 4 ali abaixo é quinta
        //com o mesmo valor do x, o caso numero 4 será executado
    int day = 4;
    switch (day) {
      case 1:
        System.out.println("segunda");
        break;
      case 2:
        System.out.println("terça");
        break;
      case 3:
        System.out.println("quarta");
        break;
      case 4:
        System.out.println("quinta");
        break;
      case 5:
        System.out.println("sexta");
        break;
      case 6:
        System.out.println("sabado");
        break;
      case 7:
        System.out.println("domingo");
        break;
    }
  }
           //while loop agora
//coloca valor na variavel, que nem o i=5 abaixo
//e colocamos um "valor limite" depois de até quando queremos esse loop
//e faz o loop até quando o valor dar true
//ou seja, imprime 5, vira 6, imprime 6, vira 7, repete o processo até chegar no 9
//imprime 9, vira 10, mas como 10 é um valor igual ao 10 que colocamos, ou qualquer valor igual, dá false
//dá false pois valor igual não é valor maior do que o outro
//logo, a condição dá false, não dá pra prosseguir, e acaba
       int i = 5;
        while (i < 10) {
      System.out.println(i);
      i++;        //5,6,7,8,9
        }
    }
}
    //do/while loop
    //assim, apesar da função ser a mesma da while loop anterior, o metodo é diferente
    //se no while ele testa a condição entre true e false primeiro pra apresentar resultado
    //o do/while primeiro apresenta o resultado, ele mostra, faz a operação
    //porem, depois dele fazer, ele testa a condição pra ver se continua(caso continuar dando true) ou para(caso apresente false)
    //por isso, se por um valor nada ver com o contexto, como 68, while faria a condição primeiro e mostraria o resultado depois
    //nesse caso, sem resultado pois deu "false" antes de ter que mostrar na tela
    //agora, o do/while mostraria o numero 68, mas como deu false depois, ele simplesmente para de continuar o processo
    int i = 0; //caso eu botasse 61 aqui, apareceria 61
    do {
      System.out.println(i);
      i++;
    }
    while (i < 5);  //0,1,2,3,4
}
  
//for loop
//basicamente, aquele "i++"faz o valor da variavel i=0(o valor atual do i, no caso, esse é no "inicio" do exemplo abaixo)somar com +1
// no exemplo abaixo, o i=0, o processo/ordem seria assim
//testa condição, 0<5, se for true, prossigue pra executar o corpo(codigo lá embaixo)
//que nada mais é do que executar todas as ordens em sequencia dentro daquele codigo no system.out.println(i)
//durante o corpo, ele imprime o valor atual do i naquele momento, no caso...0
//ai depois de executar o corpo/imprimir, executa i++ 0+1=1...e repete
//no exemplo, chega no 5, 5 é valor igual a 5, ou seja, como nao é menor, ocorre false, e para por ali mesmo a sequencia
//basicamente, se a condição começa false, nem começa, se fosse i=10, não aconeteceria nada
for (int i = 0; i < 5; i++) {
      System.out.println(i);//0,1,2,3,4
    }  
  }
}


//nested for loops
//basicamente, repete os loops
//no caso, ali em baixo, quero que o bloco execute 99 vezes, coloquei ele pra executar 99 vezes
//assim, cada caso externo, variavel i, muda de valor, por exemplo, case 1, case 2, case 3, case 4...até case 99
//e o caso interno, variavel j, é uma só, porem, criada do 0 toda vez que entra no caso externo 
//ou seja, 1 bloco externo executado 99 vezes, com 1 variavel j com loop de execução 3 vezes em cada uma das 99 execuções
// Outer loop.
    for (int i = 1; i <= 99; i++) {
      System.out.println("Outer: " + i); //executa 99 vezes
      
      // Inner loop
      for (int j = 1; j <= 3; j++) {
        System.out.println(" Inner: " + j); //executa 297 vezes (99 * 3)
      }
    } 
  }
}
//AINDA DENTRO DO NESTED LOOP
//temos esse exemplo
//aqui, basicamente adaptou pra outer loop(LINHA) e inner loop(COLUNA)...ainda na logica anterior
//com isso, faremos a multiplicação i*j 
//nada mais será do que uma tabela de multiplicação entre colunas e linhas
//na logica anterior, 99 linhas com 3 colunas e casa numero é a multiplicação do numero da coluna e linha naquele ponto
//quase uma coordenada

 for (int i = 1; i <= 3; i++) {
      for (int j = 1; j <= 3; j++) {
        System.out.print(i * j + " ");
      }
      System.out.println();
      //1 2 3//
      //2 4 6//
      //3 6 9//  //previa do resultado
    }
  }
}



//for-each loop
//praticamente uma lista
//pega na ordem, no exemplo, um carro, tipo volvo
//imprime volvo, pega proximo carro, bmw, naquela rodada, a variavel pega o "valor" bmw, e imprime, ai assim por diante
//ele só para quando nao tem mais o proximo elemento, sem elemento pra variavel pegar na proxima rodada, simples assim

String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    
    for (String car : cars) {
      System.out.println(car);
    }    
  }
}



//break and continue 
//break basicamente é, fazer até onde onde pode
//no exemplo abaixo, a execução quer que loop só vá ate 9(i<10)
//o break diz que quando chegar ao 4, tem que para o loop sem mais nem menos 
  for (int i = 0; i < 10; i++) {
      if (i == 4) {
        break;
      }
      System.out.println(i);//0,1,2,3
    }  
  }
}

//CONTINUE
//agora falando do continue
//ele executa a rodada do 4(numero abaixo), mas ele não executa o que vem depois do continue dentro dela
//pula e prossegue com a condição dos outros numeros
//ou seja, ele checa o caso do numero que a gente colocou ali, mas corta a execução do caso
for (int i = 0; i < 10; i++) {
      if (i == 4) {
        continue;
      }
      System.out.println(i);//0,1,2,3,5,6,7,8,9
    }  
  }
}


//AINDA NO break/continue
//esse exemplo
//tu usa os 2 no mesmo loop
//o continue executa(ou nao né) o resto do codigo na iteração
//no codigo, se for 2, pula o println...senao, executa, ou seja, 0,1 e 3
//4 e 5 não aparecem porque o break é o 4, ou seja, morreu ali, parou
//com isso, como o if==2 faz com que no 2 haja o "continue", faz com que cheque o numero, mas não execute depois do continue
//e o 4 é o break
for (int i = 0; i < 6; i++) {
  if (i == 2) {
    continue;
  }
  if (i == 4) {
    break;
  }
  System.out.println(i);//0,1,3
 
 
}

