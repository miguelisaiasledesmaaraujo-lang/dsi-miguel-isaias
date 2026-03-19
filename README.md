# desenvolvimento de software I
aulas de desenvolvimento de software I com o professor joão silas utilizando java.

# JAVA #

<article>como configurar java no computador?</article>

Para instalar o Java no computador basta seguir alguns processos simples:

1- tu precisa primeiramente ir no site do oracle, ou tambem da openJDK, e lá baixar a versao mais recente do JDK, que são uns utilitarios para permitir criar jogo e programas no geral em java.

2-depois, na hora de instalar, abre o arquivo que tu acabou de baixar, vai aparecer pra voce clicar lá:

C:\program files\java\jdk-21

que nada mais é do que do que colocar a pasta JDK-21, que contem a pasta Java dentro dela, em outra pasta que é a "program files", dentro do disco principal

ou tu pode escolher o 

C:\java\jdk-21

se a pasta java nao existe, o proprio computador cria uma pasta pra isso
e dentro dessa pasta bin com os programas "java.exe" e "javac.exe".

3-depois de tudo isso, é hora de pesquisar "variaveis de ambiente" no windows e editar essa parte, clicando e "variaveis de ambiente" e em ""variaveis do sistema", depois clique em "nova" e bote 

java_home
C:\java\jdk-21

isso em esumo, diz ao windows onde o java está instalado

4-procure a variavel chamada "path", clique em "editar", em seguida "novo", e bota

%java_home%\bin

clique em OK e agora, no terminal, ao digitar "java" ou "javac" no terminal, o windows vai encontrar o programa e evitar dor de cabeça

5- basta clicar "java" ou "javac", que se aparecer "-Version", tá pronto pra codar já.

# REGRAS BASICAS DO JAVA #

1-todo o Java pecisa estar dentro de uma classe, nada mais é do que um molde de um objeto, e toda classe publica precisa ter o mesmo nome do arquivo, se tentar colocar algo fora da classe, simplesmente não funciona

2-as classes do codigo devem ser organizadas em pacotes(ou pastas tambem), que agrupam classes relacionadas, em resumo, pacotes que tem uma classe guardado dentro dela, e esses pacotes podem ter pastas dentro com outras diversas classes com nome igual ao arquivo que esta dentro do pacote, como já dito.

3-variaveis obviamente tem um tipo, uma "forma" definida e nao dá pra criar ou errar o codigo, sendo algo bem rigido e estatico, senão dá erro e não sabe o porque, por exemplo:

int idade = 20;

o java nao aceita um, por exemplo:

idade = "20";

4- existem modificadores de acesso pra deixar quem pode ver ou nao, nao é obrigatorio no codigo, se tu nao especificar no default(visivel só no pacote), mas é importante saber por segurança e organiação

public- visivel para qualquer um que queira, e tu pode acessar qualquer classe, mesmo sendo de outro pacote diferente

private- ninguem de fora consegue ver ou modificar nada, evitando modificar os dados ou perder o controle pra alguem de fora

protected- visivel dentro do pacote e para subclasses

default- se tu nao especificar nada no codigo sobre isso, o java automaticamente acaba assumindo isso pra voce, que nada mais do que visivel, só que dentro do mesmo pacote

5-o java sempre repara nas iniciais maiusculas e minusculas, pode parecer detalhe ridiculo mas se voce nao prestar atençaõ, o codigo simplesmente nao vai funcionar porque o java implic com isso

maisuculas no começo- classe, interface
minusculas no começo- metodos, variaveis, constantes e pacotes

o java é bem chato com esse detalhe da sintaxe toda

6-o codigo, ou grupo de codigo, precisa estar dentro destas chaves {}, metodo, classe, if loop, etc, o que precisa é estar dentro dessa chave pra executar

7-uma string, a famosa sequencia de caractere, ou uma simples escrita, deve sempre estar entre aspas, por exemplo:

String nome="isso aqui ó";

8-como perceptivel, tudo gira em torno de uma classe e um objeto criado a partir da classe, com cada objeto tendo que ter um valor e atributo, e pode criar diversos objetos, porem, com valores diferentes

9-deve-se sempre colocar o main no codigo, nem um programa, projeto ou qualquer coisa que rode no java vai rodar sem o main, nada mais é onde a execução começa, sem ele, a JVM e o codigo vai ficar "perdido" em outras palavras

10-atraves de "extends", tu pode fazer uma classe herdar atributos  metodos de outra classe, algo imporante pra funções parecidas porem objetos diferentes que rola no java

# COMO FUNCIONA O JAVA??? #
no java, o ue rola é que ele segue um modelo chamado de "write once, go anywhere", em resumo, tu escreve o codigo uma vez e ele roda em qualquer sistema sem precisar reescrever ou alterar nada, funcionando em 2 etapas
a primeira etapa é a chamada compilação, tu escreve o codigo e salva como ".java", o compilador, que vai traduzir isso tudo pra maquina, transforma em ".class", ou bytecode tambem, e o JVM pega isso tudo, interpreta e executa o bytecode, e com isso, roda em qualquer sistema operacional ou seja lá o onde for.
e ai tambem, o java tem tem alguns componentes principais, JDK como ja dito o kit com tudo que o java precisa pra rodar no pc, o JRE, que já vem no JDK e é necessario só pra rodar os programas java já existente, e o JVM, que executa aquele bytecode, para qualquer sistema operacional no geral.
ou seja, em resumo, num exemplo rapido, tu cria um codigo, e salva ele como:

Codigo.java

  depois compila javac Codigo.java e depois desse negocio vai dar resultado o Codigo.class, que tambem é o bytecode, e atraves do JVM no JDK, vai rodar em qualquer lugar


