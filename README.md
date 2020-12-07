# Laboratório 4

## Introdução
O padrão Memento permite guardar o estado atual de um objeto para que possa ser recuperado após alterações, i.e., undo.

Neste laboratório pretende-se oferecer suporte para a operação undo num carrinho de compras.

O padrão determina que existe um objeto `Originator` com um estado que será guardado através de um objeto `Memento`, gerido por um `CareTaker`. A responsabilidade do `CareTaker` é simplesmente guardar estados do `Originator`, de forma a que os possa recuperar.

![image](memento.png)

De acordo esta versão do padrão, o `CareTaker` conhece os objetos estado no `Originator`. Para promover o encapsulamento na utilização do padrão, propõe-se uma versão adaptada que define interfaces `Originator` e `Memento`, implementando o estado (`MyMemento`) como classe privada interna à instância de `Originator`(`ShoppingCart`).

![image](memento_adapted.png)

## Nível Básico (Acompanhamento em Aula ou Autónomo)
1.	Altere a classe `ShoppingCart` para que esta passe a implementar a interface `Originator`.
      
2.	Crie a classe `Caretaker`, que será responsável por manter um objeto `Memento` de `ShoppingCart`.

   * Deverá ter como atributo um `Memento`.
     
   * O método `void saveState()` deve obter e guardar o `Memento` atual do carrinho de compras.

3.	O método `void restoreState()` deve reestabelecer o estado do carrinho de compras com base no `Memento` guardado. Se não existir `Memento` guardado deve lançar a exceção `NoMementoException`.
      
3.	Adicione um atributo `Caretaker` ao `ShoppingListController`.

   * Modifique o método `void addProduct(String name, double cost)` para que passe a guardar o estado anterior a cada modificação do carrinho de compras.
     
   * Modifique o método `void reset()` para que salve o estado antes de limpar o carrinho.
     
   * Modifique o método `void removeProduct(String name)` para que salve o estado antes de remover um produto.
     
   * Implemente o método `void undo(Date date) que executa a operação undo sobre o carrinho de compras.

4.	Adicione o comportamento do botão buttonUndo na interface JavaFX na classe `GUI`, de forma a permitir um undo após inserção de um produto na lista de compras.
      
5.	Complete os testes unitários para a classe `ShoppingCartController`.

## Nível Avançado (Autónomo)

Altere o programa de forma a suportar vários carrinhos de compras. Cada carrinho de compras deverá ter um nome.

Altere a interface gráfica de forma a permitir gerir os vários carrinhos de compras, permitindo undo para cada um.

### Interface gráfica 
Acrescente um `TextField` e `Button`, e os `Label` que considerar necessários para que seja possível criar carrinhos de compras diferentes.

Acrescente um `ComboBox` para permitir visualizar e adicionar produtos a carrinhos diferentes.

A seleção carrinhos na `ComboBox` deve alterar o conteúdo de `listViewCartContents`, e a operação de adicionar produto deve operar sobre o carrinho selecionado.
