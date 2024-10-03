# Projeto Final - Curso de Programação Orientada a Objetos (POO) - Alura

Este é o projeto final do curso de Programação Orientada a Objetos (POO) da Alura, desenvolvido em Java, que simula o funcionamento de um Cartão de Crédito com a possibilidade de registrar compras, verificar saldo disponível e gerar uma lista das compras realizadas.

## 💡 Descrição do Projeto

O sistema simula um cartão de crédito onde é possível:

- **Cadastrar um limite de crédito** para o cartão.
- **Registrar compras**, associando uma descrição e um valor para cada uma.
- O sistema verifica se há **saldo suficiente** para realizar a compra.
- Se a compra for realizada com sucesso, ela é adicionada a uma **lista de compras.**
- O usuário pode continuar comprando até atingir o limite do cartão ou escolher sair.


A aplicação foi construída utilizando princípios de Programação Orientada a Objetos (POO) e contém três classes principais:

- **Main:** Responsável pela interação com o usuário e controle do fluxo do programa.
- **CartaoCredito:** Representa o cartão de crédito, com funcionalidades para lançar compras e gerenciar o saldo.
- **Compra:** Representa uma compra realizada com descrição e valor, e implementa a interface Comparable para ordenar as compras por valor.


## 🛠️ Tecnologias Utilizadas

- **Java** (JDK 11 ou superior)
- **Orientação a Objetos**
- **Estruturas de Dados:** Listas (ArrayList)
- **Scanner** para entrada de dados do usuário.


## 🔑 Funcionalidades

- **Controle de limite de crédito:** Ao criar o cartão de crédito, o usuário define o limite, e o sistema gerencia o saldo à medida que as compras são realizadas.
- **Adição de compras:** O usuário pode registrar várias compras, sendo que cada uma tem uma descrição e um valor.
- **Verificação de saldo:** Antes de cada compra, o sistema verifica se o valor da compra não ultrapassa o saldo restante do cartão.
- **Listagem de compras:** Ao final, o sistema exibe todas as compras realizadas, com suas respectivas descrições e valores.
- **Ordenação das compras:** As compras são armazenadas em uma lista que pode ser ordenada por valor, graças à implementação da interface Comparable.

## 🎯 Objetivos do Projeto

Este projeto tem como objetivo colocar em prática os seguintes conceitos de Programação Orientada a Objetos:

- **Encapsulamento:** A lógica de negócio está separada e protegida nas classes CartaoCredito e Compra.
- **Herança:** Não aplicável diretamente nesse projeto, mas a estrutura modular poderia ser expandida com outras entidades relacionadas, como tipos de cartão (Crédito, Débito, etc.).
- **Polimorfismo:** A interface Comparable é um exemplo de polimorfismo, pois diferentes objetos Compra podem ser comparados com base no valor.


## 🎓 Aprendizado e Desafios

Este projeto ajudou a consolidar os conceitos de Orientação a Objetos, com ênfase no uso de classes, objetos, listas e estruturas de controle de fluxo. Além disso, foi uma ótima oportunidade para aprender a trabalhar com entrada de dados do usuário e validar condições, através de uma interface simples de usuário no terminal.
