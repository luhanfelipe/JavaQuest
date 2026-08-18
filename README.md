# ☕ JavaQuest

JavaQuest é um projeto pessoal criado para praticar Java e Programação Orientada a Objetos (POO) por meio de um pequeno cenário inspirado em RPG.

O projeto foi desenvolvido como uma forma de estudar Java na prática, começando pelos conceitos básicos de POO e evoluindo gradualmente para conceitos como encapsulamento, herança, polimorfismo e abstração.

## 🎯 Objetivo

O principal objetivo do JavaQuest foi servir como um projeto de aprendizado para colocar em prática os fundamentos de Programação Orientada a Objetos em Java.

Durante o desenvolvimento, foram estudados:

- Classes e objetos
- Construtores
- Encapsulamento
- Getters e setters
- Herança
- Sobrescrita de métodos
- Polimorfismo
- Classes abstratas
- Métodos abstratos

## ⚔️ Estrutura

O projeto possui uma estrutura simples de personagens:

              Personagem
             <<abstrata>>
                  │
          ┌───────┴───────┐
          │               │
      Guerreiro          Mago

Personagem é a classe abstrata que representa a estrutura comum dos personagens.

Guerreiro e Mago são especializações de Personagem e possuem suas próprias implementações do método atacar().

🛠️ Tecnologias
  Java 17
  Programação Orientada a Objetos
  Git
  GitHub



▶️ Como executar

  Na raiz do projeto, compile os arquivos Java:

  javac src/main/java/*.java

  Depois execute:

  java -cp src/main/java Main


📁 Estrutura do projeto
  JavaQuest/
  ├── docs/
  │   ├── architecture.md
  │   ├── ideas.md
  │   └── roadmap.md
  ├── src/
  │   └── main/
  │       └── java/
  │           ├── Main.java
  │           ├── Personagem.java
  │           ├── Guerreiro.java
  │           └── Mago.java
  ├── .gitignore
  └── README.md

📚 Documentação

  A pasta docs/ contém documentos relacionados ao projeto e ao seu desenvolvimento.

🏁 Status

  Concluído.

  O JavaQuest cumpriu seu objetivo como projeto pessoal de aprendizado dos fundamentos de Programação Orientada a Objetos em Java.

  O projeto foi intencionalmente mantido pequeno para que o foco permanecesse no aprendizado.

📌 Sobre

  Este é um projeto pessoal desenvolvido durante meus estudos de Java e POO.

  O JavaQuest não tem como objetivo ser um RPG completo. Ele foi criado como um espaço simples para aprender, experimentar e praticar os conceitos fundamentais da linguagem.
