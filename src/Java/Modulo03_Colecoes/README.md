# 📘 Módulo 03 - Coleções e Estruturas de Dados

## 🎯 Objetivo do Módulo

Dominar as principais estruturas de dados do Java Collections Framework. Substituir arrays por coleções dinâmicas e aprender a manipular dados de forma eficiente!

---

## 📚 Conceitos Abordados

- ArrayList e LinkedList
- HashMap e HashSet
- Iteradores e for-each
- Generics (<T>)
- Comparable e Comparator
- Collections (sort, reverse, shuffle)
- Tratamento de Exceções (try/catch)

---

## ✅ Lista de Exercícios

### Nível 1 - ArrayList (Exercícios 01-05)

| # | Exercício | Conceito | Status |
|---|-----------|----------|--------|
| 01 | Lista de Compras | ArrayList básico | ⬜ |
| 02 | Agenda de Contatos | ArrayList com objetos | ⬜ |
| 03 | Gerenciador de Tarefas | ArrayList, remoção, busca | ⬜ |
| 04 | Lista de Alunos com Ordenação | Collections.sort | ⬜ |
| 05 | Playlist de Músicas | ArrayList, shuffle | ⬜ |

### Nível 2 - HashMap e HashSet (Exercícios 06-10)

| # | Exercício | Conceito | Status |
|---|-----------|----------|--------|
| 06 | Dicionário Simples | HashMap básico | ⬜ |
| 07 | Contador de Palavras | HashMap, contagem | ⬜ |
| 08 | Agenda Telefônica | HashMap com objetos | ⬜ |
| 09 | Controle de Estoque | HashMap, atualização | ⬜ |
| 10 | Removendo Duplicatas | HashSet | ⬜ |

### Nível 3 - Generics e Comparable (Exercícios 11-15)

| # | Exercício | Conceito | Status |
|---|-----------|----------|--------|
| 11 | Caixa Genérica | Generics básico | ⬜ |
| 12 | Lista Genérica | Generics com coleções | ⬜ |
| 13 | Ordenação de Produtos | Comparable | ⬜ |
| 14 | Ordenação Múltipla | Comparator | ⬜ |
| 15 | Par Genérico (Key-Value) | Generics avançado | ⬜ |

### Nível 4 - Tratamento de Exceções e Projeto (Exercícios 16-20)

| # | Exercício | Conceito | Status |
|---|-----------|----------|--------|
| 16 | Divisão Segura | try/catch básico | ⬜ |
| 17 | Validação de Entrada | try/catch, Scanner | ⬜ |
| 18 | Exceção Personalizada | throw, extends Exception | ⬜ |
| 19 | Leitura de Arquivo | try/catch, finally | ⬜ |
| 20 | Sistema de Cadastro Completo | Projeto integrador | ⬜ |

---

## 📝 Detalhamento dos Exercícios

---

### 🔹 Exercício 01 - Lista de Compras

**Objetivo:** Criar uma lista de compras usando ArrayList.

**Requisitos:**
- Crie um `ArrayList<String>` para armazenar itens
- Implemente funcionalidades:
  - Adicionar item
  - Remover item
  - Listar todos os itens
  - Verificar se item já existe
- Menu interativo

**Exemplo de Saída:**
```
=== LISTA DE COMPRAS ===
1. Adicionar item
2. Remover item
3. Listar itens
4. Buscar item
0. Sair

Item adicionado: Arroz
Item adicionado: Feijão
Item adicionado: Leite

Lista de compras:
1. Arroz
2. Feijão
3. Leite
```

**Dica:** Use `lista.add()`, `lista.remove()`, `lista.contains()` e `lista.size()`.

---

### 🔹 Exercício 02 - Agenda de Contatos

**Objetivo:** Gerenciar contatos usando ArrayList com objetos.

**Requisitos:**
- Crie uma classe `Contato` com: `nome`, `telefone`, `email`
- Use `ArrayList<Contato>` para armazenar
- Funcionalidades: adicionar, listar, buscar por nome, remover

**Exemplo de Saída:**
```
=== AGENDA DE CONTATOS ===
Contato adicionado: João - (11) 99999-0000

Contatos cadastrados:
1. João - (11) 99999-0000 - joao@email.com
2. Maria - (21) 88888-1111 - maria@email.com
```

---

### 🔹 Exercício 03 - Gerenciador de Tarefas

**Objetivo:** Criar um sistema de tarefas com status.

**Requisitos:**
- Classe `Tarefa` com: `descricao`, `concluida` (boolean)
- Use `ArrayList<Tarefa>`
- Funcionalidades:
  - Adicionar tarefa
  - Marcar como concluída
  - Listar pendentes
  - Listar concluídas
  - Remover tarefa

**Exemplo de Saída:**
```
Tarefas pendentes:
[ ] 1. Estudar Java
[ ] 2. Fazer exercícios

Tarefas concluídas:
[x] 3. Ler documentação
```

---

### 🔹 Exercício 04 - Lista de Alunos com Ordenação

**Objetivo:** Ordenar uma lista de alunos por nome e por nota.

**Requisitos:**
- Classe `Aluno` com: `nome`, `nota`
- Use `ArrayList<Aluno>`
- Ordene por nome usando `Collections.sort()`
- Ordene por nota (maior para menor)
- A classe `Aluno` deve implementar `Comparable<Aluno>`

**Exemplo de Saída:**
```
Ordenado por nome:
1. Ana - 8.5
2. Carlos - 6.0
3. Pedro - 9.0

Ordenado por nota (maior → menor):
1. Pedro - 9.0
2. Ana - 8.5
3. Carlos - 6.0
```

---

### 🔹 Exercício 05 - Playlist de Músicas

**Objetivo:** Criar uma playlist com funcionalidades musicais.

**Requisitos:**
- Classe `Musica` com: `titulo`, `artista`, `duracao`
- Use `ArrayList<Musica>`
- Funcionalidades:
  - Adicionar música
  - Remover música
  - Embaralhar playlist (`Collections.shuffle()`)
  - Exibir duração total
  - Listar músicas

**Exemplo de Saída:**
```
=== PLAYLIST ===
1. Bohemian Rhapsody - Queen (5:55)
2. Imagine - John Lennon (3:03)
3. Billie Jean - Michael Jackson (4:54)

Duração total: 13:52
Embaralhando... 🎵
```

---

### 🔹 Exercício 06 - Dicionário Simples

**Objetivo:** Criar um dicionário palavra-significado usando HashMap.

**Requisitos:**
- Use `HashMap<String, String>` (palavra → significado)
- Funcionalidades:
  - Adicionar palavra e significado
  - Buscar significado de uma palavra
  - Listar todas as palavras
  - Remover palavra

**Exemplo de Saída:**
```
Palavra adicionada: Java → Linguagem de programação

Buscando "Java"...
Java: Linguagem de programação

Todas as palavras:
- Java: Linguagem de programação
- POO: Programação Orientada a Objetos
```

**Dica:** Use `map.put()`, `map.get()`, `map.containsKey()`, `map.keySet()`.

---

### 🔹 Exercício 07 - Contador de Palavras

**Objetivo:** Contar quantas vezes cada palavra aparece em um texto.

**Requisitos:**
- Receba uma frase do usuário
- Use `HashMap<String, Integer>` (palavra → quantidade)
- Exiba cada palavra e sua contagem
- Ignore maiúsculas/minúsculas

**Exemplo de Saída:**
```
Texto: "Java é legal e Java é poderoso"

Contagem de palavras:
java: 2
é: 2
legal: 1
e: 1
poderoso: 1
```

**Dica:** Use `texto.toLowerCase().split(" ")` para separar as palavras.

---

### 🔹 Exercício 08 - Agenda Telefônica

**Objetivo:** Criar uma agenda usando HashMap com objetos.

**Requisitos:**
- Use `HashMap<String, Contato>` (nome → contato)
- Funcionalidades: adicionar, buscar, listar, remover
- Não permitir nomes duplicados

**Exemplo de Saída:**
```
Contato "João" adicionado!
Contato "João" já existe!

Buscando "João":
Nome: João
Telefone: (11) 99999-0000
```

---

### 🔹 Exercício 09 - Controle de Estoque

**Objetivo:** Gerenciar estoque de produtos usando HashMap.

**Requisitos:**
- Use `HashMap<String, Integer>` (produto → quantidade)
- Funcionalidades:
  - Adicionar produto com quantidade
  - Dar entrada (aumentar quantidade)
  - Dar saída (diminuir quantidade)
  - Consultar estoque
  - Listar produtos com estoque baixo (< 5)

**Exemplo de Saída:**
```
Estoque atualizado: Notebook - 10 unidades
Saída: 3 unidades de Notebook
Estoque atual: Notebook - 7 unidades

Produtos com estoque baixo:
- Mouse: 2 unidades
- Teclado: 4 unidades
```

---

### 🔹 Exercício 10 - Removendo Duplicatas

**Objetivo:** Usar HashSet para remover elementos duplicados.

**Requisitos:**
- Crie um ArrayList com valores repetidos
- Use `HashSet` para remover duplicatas
- Exiba a lista original e a lista sem duplicatas

**Exemplo de Saída:**
```
Lista original: [Java, Python, Java, C++, Python, JavaScript, Java]
Lista sem duplicatas: [Java, Python, C++, JavaScript]
Total removidos: 3
```

---

### 🔹 Exercício 11 - Caixa Genérica

**Objetivo:** Criar uma classe genérica simples.

**Requisitos:**
- Crie uma classe `Caixa<T>` com um atributo `conteudo` do tipo `T`
- Métodos: `guardar(T item)`, `abrir()` (retorna o item)
- Teste com diferentes tipos: String, Integer, Double

**Exemplo de Saída:**
```
Caixa de texto: "Olá Mundo"
Caixa de número: 42
Caixa de decimal: 3.14
```

---

### 🔹 Exercício 12 - Lista Genérica

**Objetivo:** Criar uma lista genérica personalizada.

**Requisitos:**
- Crie uma classe `MinhaLista<T>` que encapsula um `ArrayList<T>`
- Métodos: `adicionar(T item)`, `remover(int indice)`, `buscar(int indice)`, `tamanho()`
- Teste com `MinhaLista<String>` e `MinhaLista<Integer>`

---

### 🔹 Exercício 13 - Ordenação de Produtos

**Objetivo:** Implementar Comparable para ordenar objetos.

**Requisitos:**
- Classe `Produto implements Comparable<Produto>`
- Atributos: `nome`, `preco`
- Implemente `compareTo()` para ordenar por preço
- Use `Collections.sort()` para ordenar

**Exemplo de Saída:**
```
Produtos ordenados por preço:
1. Mouse - R$ 29.90
2. Teclado - R$ 79.90
3. Monitor - R$ 899.00
```

---

### 🔹 Exercício 14 - Ordenação Múltipla

**Objetivo:** Usar Comparator para múltiplos critérios de ordenação.

**Requisitos:**
- Classe `Funcionario` com: `nome`, `salario`, `idade`
- Crie Comparators separados para ordenar por nome, salário e idade
- Permita ao usuário escolher qual critério

**Exemplo de Saída:**
```
Ordenar por:
1. Nome
2. Salário
3. Idade
Escolha: 2

Funcionários por salário:
1. Pedro - R$ 3.000,00
2. Ana - R$ 5.500,00
3. Carlos - R$ 8.000,00
```

---

### 🔹 Exercício 15 - Par Genérico (Key-Value)

**Objetivo:** Criar uma classe genérica com dois tipos.

**Requisitos:**
- Crie uma classe `Par<K, V>` com `chave` do tipo K e `valor` do tipo V
- Métodos: `getChave()`, `getValor()`, `exibir()`
- Teste com: `Par<String, Integer>`, `Par<String, String>`

---

### 🔹 Exercício 16 - Divisão Segura

**Objetivo:** Tratar exceções com try/catch.

**Requisitos:**
- Solicite dois números ao usuário
- Trate `ArithmeticException` (divisão por zero)
- Trate `InputMismatchException` (entrada inválida)
- Use `finally` para mensagem final

**Exemplo de Saída:**
```
Digite o dividendo: 10
Digite o divisor: 0
Erro: Divisão por zero não é permitida!

Digite o dividendo: abc
Erro: Entrada inválida! Digite um número.
```

---

### 🔹 Exercício 17 - Validação de Entrada

**Objetivo:** Validar entrada do usuário com try/catch em loop.

**Requisitos:**
- Solicite idade, salário e nome
- Use try/catch dentro de um loop para repetir até entrada válida
- Valide cada tipo de dado (int, double, String)

---

### 🔹 Exercício 18 - Exceção Personalizada

**Objetivo:** Criar suas próprias exceções.

**Requisitos:**
- Crie `IdadeInvalidaException extends Exception`
- Crie `SaldoInsuficienteException extends Exception`
- Use em contexto de cadastro de pessoa e conta bancária
- Lance com `throw` e trate com `try/catch`

---

### 🔹 Exercício 19 - Leitura de Arquivo

**Objetivo:** Ler dados de um arquivo texto com tratamento de exceções.

**Requisitos:**
- Crie um arquivo .txt com dados
- Leia o arquivo usando `BufferedReader`
- Trate `FileNotFoundException` e `IOException`
- Use `finally` ou try-with-resources para fechar o arquivo
- Exiba o conteúdo lido

---

### 🔹 Exercício 20 - Sistema de Cadastro Completo (Projeto Integrador)

**Objetivo:** Criar um CRUD completo usando coleções.

**Requisitos:**
- Classe `Pessoa` com: `nome`, `cpf`, `idade`
- Use `ArrayList<Pessoa>` para armazenar
- Use `HashMap<String, Pessoa>` para busca rápida por CPF
- Funcionalidades:
  - Cadastrar pessoa
  - Listar todas
  - Buscar por CPF
  - Alterar dados
  - Excluir pessoa
  - Ordenar por nome ou idade
- Trate exceções (entrada inválida, CPF duplicado)
- Menu interativo
- Exceção personalizada para CPF duplicado

---

## 🏆 Critérios de Conclusão

Para considerar o módulo concluído:

- ✅ Resolver pelo menos **16 dos 20 exercícios**
- ✅ Usar ArrayList e HashMap corretamente
- ✅ Implementar Comparable ou Comparator
- ✅ Tratar exceções adequadamente
- ✅ Completar o Exercício 20 (projeto integrador)

---

## 📌 Próximo Módulo

Após concluir este módulo, você estará pronto para o **Módulo 04 - Java Avançado**, onde aprenderá:
- Streams e Lambda Expressions
- Enums
- Annotations
- Manipulação de datas (LocalDate)
- E muito mais!

---

**Bons estudos! Qualquer dúvida, estou aqui para ajudar!** 💪
