# Exercícios - Classe e objeto
1. Tipo, Potencia, Tensão, Preço, Marca, Quantidade no Estoque

7. Nome de classe não pode conter espaço (corrigido seria : class RegistroDeEleitor {} ) e não houve o encapsulamento das variáveis dentro da classe.

8. Os dois métodos menor e maior estão errados, o menor está em valor void quando deveria estar inteiro e o maior tem que ser em boolean ja que retorna verdadeiro ou falso.

14. Encapsulamento é uma forma de proteger os dados de uma classe, controlando quem pode acessar ou alterar suas informações. Com isso, só dá pra mexer nos dados de forma segura, usando métodos específicos, o que evita problemas e mantém tudo funcionando direitinho.
Sem encapsulamento:     public String nome;  // Qualquer um pode alterar diretamente
Com encapsulamento:     private String nome;  // Atributos são privados, 0 controle é feito pelos métodos `set` e `get`, garantindo que apenas valores válidos sejam atribuídos
