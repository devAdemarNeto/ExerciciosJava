# 📘 Módulo 01 - Fundamentos e Lógica de Programação

## 🎯 Objetivo do Módulo

Dominar os conceitos básicos de Java e desenvolver raciocínio lógico sólido. Este módulo é a **base de tudo** - não pule para o próximo sem dominar esses conceitos!

---

## 📚 Conceitos Abordados

- Variáveis e tipos de dados primitivos
- Operadores aritméticos, relacionais e lógicos
- Estruturas condicionais (if, else, switch)
- Estruturas de repetição (for, while, do-while)
- Arrays (vetores e matrizes)
- Métodos e funções
- Entrada e saída de dados (Scanner)

---

## ✅ Lista de Exercícios

### Nível 1 - Aquecimento (Variáveis e Operadores)

| # | Exercício | Conceito | Status |
|---|-----------|----------|------|
| 01 | Calculadora Simples | Operadores | [x]  |
| 02 | Conversor de Temperatura | Variáveis, Operadores | ⬜    |
| 03 | Cálculo de IMC | Entrada de dados, Operadores | ⬜    |
| 04 | Média de Notas | Variáveis, Média | ⬜    |
| 05 | Troca de Valores | Variáveis auxiliares | ⬜    |

### Nível 2 - Decisões (Condicionais)

| # | Exercício | Conceito | Status |
|---|-----------|----------|--------|
| 06 | Verificador Par/Ímpar | if/else | ⬜ |
| 07 | Maior de Três Números | if/else aninhado | ⬜ |
| 08 | Classificador de Triângulos | Condicionais múltiplas | ⬜ |
| 09 | Calculadora de Desconto | if/else, operadores | ⬜ |
| 10 | Menu de Opções | switch/case | ⬜ |

### Nível 3 - Repetições (Loops)

| # | Exercício | Conceito | Status |
|---|-----------|----------|--------|
| 11 | Tabuada | for | ⬜ |
| 12 | Fatorial | while | ⬜ |
| 13 | Sequência de Fibonacci | for, lógica | ⬜ |
| 14 | Validação de Senha | do-while | ⬜ |
| 15 | Números Primos | for aninhado, lógica | ⬜ |

### Nível 4 - Arrays

| # | Exercício | Conceito | Status |
|---|-----------|----------|--------|
| 16 | Maior e Menor do Array | Arrays, for | ⬜ |
| 17 | Inversão de Array | Arrays, lógica | ⬜ |
| 18 | Busca em Array | Arrays, condicionais | ⬜ |
| 19 | Ordenação Simples (Bubble Sort) | Arrays, for aninhado | ⬜ |
| 20 | Matriz Identidade | Matrizes | ⬜ |

### Nível 5 - Métodos

| # | Exercício | Conceito | Status |
|---|-----------|----------|--------|
| 21 | Calculadora com Métodos | Métodos, parâmetros | ⬜ |
| 22 | Validador de CPF | Métodos, String | ⬜ |
| 23 | Gerador de Senhas | Métodos, Random | ⬜ |
| 24 | Conversor de Bases Numéricas | Métodos, lógica | ⬜ |
| 25 | Mini Sistema de Cadastro | Métodos, Arrays | ⬜ |

---

## 📝 Detalhamento dos Exercícios

---

### 🔹 Exercício 01 - Calculadora Simples

**Objetivo:** Criar uma calculadora que realize as 4 operações básicas.

**Requisitos:**
- Solicite dois números ao usuário
- Solicite a operação desejada (+, -, *, /)
- Exiba o resultado
- Trate a divisão por zero

**Exemplo de Entrada/Saída:**
```
Digite o primeiro número: 10
Digite o segundo número: 5
Digite a operação (+, -, *, /): +
Resultado: 10 + 5 = 15
```

**Dica:** Use `Scanner` para entrada de dados e `switch` para as operações.

---

### 🔹 Exercício 02 - Conversor de Temperatura

**Objetivo:** Converter temperaturas entre Celsius, Fahrenheit e Kelvin.

**Requisitos:**
- Menu para escolher a conversão desejada
- Fórmulas:
  - C para F: `F = (C * 9/5) + 32`
  - C para K: `K = C + 273.15`
  - F para C: `C = (F - 32) * 5/9`
- Exibir resultado com 2 casas decimais

**Exemplo de Entrada/Saída:**
```
=== Conversor de Temperatura ===
1. Celsius para Fahrenheit
2. Celsius para Kelvin
3. Fahrenheit para Celsius
Escolha: 1
Digite a temperatura em Celsius: 25
Resultado: 25.00°C = 77.00°F
```

**Dica:** Use `System.out.printf("%.2f", valor)` para formatar decimais.

---

### 🔹 Exercício 03 - Cálculo de IMC

**Objetivo:** Calcular o Índice de Massa Corporal e classificar.

**Requisitos:**
- Solicite peso (kg) e altura (m)
- Calcule: `IMC = peso / (altura * altura)`
- Classifique conforme tabela:
  - Abaixo de 18.5: Abaixo do peso
  - 18.5 a 24.9: Peso normal
  - 25.0 a 29.9: Sobrepeso
  - 30.0 a 34.9: Obesidade grau I
  - 35.0 a 39.9: Obesidade grau II
  - 40.0 ou mais: Obesidade grau III

**Exemplo de Entrada/Saída:**
```
Digite seu peso (kg): 70
Digite sua altura (m): 1.75
Seu IMC é: 22.86
Classificação: Peso normal
```

---

### 🔹 Exercício 04 - Média de Notas

**Objetivo:** Calcular média de notas e verificar aprovação.

**Requisitos:**
- Solicite 4 notas (0 a 10)
- Valide se as notas estão no intervalo correto
- Calcule a média
- Exiba situação:
  - Média >= 7: Aprovado
  - Média >= 5 e < 7: Recuperação
  - Média < 5: Reprovado

**Exemplo de Entrada/Saída:**
```
Digite a nota 1: 8.5
Digite a nota 2: 7.0
Digite a nota 3: 9.0
Digite a nota 4: 6.5
Média: 7.75
Situação: APROVADO ✓
```

---

### 🔹 Exercício 05 - Troca de Valores

**Objetivo:** Trocar os valores de duas variáveis sem usar uma terceira.

**Requisitos:**
- Solicite dois números inteiros
- Troque os valores entre as variáveis
- **DESAFIO:** Faça sem usar variável auxiliar (use operações matemáticas)

**Exemplo de Entrada/Saída:**
```
Digite o valor de A: 10
Digite o valor de B: 25

Antes da troca:
A = 10, B = 25

Após a troca:
A = 25, B = 10
```

**Dica:** Pesquise sobre "swap sem variável auxiliar" ou use: `a = a + b; b = a - b; a = a - b;`

---

### 🔹 Exercício 06 - Verificador Par/Ímpar

**Objetivo:** Verificar se um número é par ou ímpar.

**Requisitos:**
- Solicite um número inteiro
- Use o operador módulo (%)
- Exiba se é par ou ímpar
- **EXTRA:** Verifique também se é positivo, negativo ou zero

**Exemplo de Entrada/Saída:**
```
Digite um número: 7
O número 7 é ÍMPAR e POSITIVO
```

---

### 🔹 Exercício 07 - Maior de Três Números

**Objetivo:** Encontrar o maior entre três números.

**Requisitos:**
- Solicite três números
- Determine qual é o maior
- Considere a possibilidade de números iguais
- **DESAFIO:** Faça usando apenas operador ternário

**Exemplo de Entrada/Saída:**
```
Digite o primeiro número: 15
Digite o segundo número: 8
Digite o terceiro número: 23
O maior número é: 23
```

---

### 🔹 Exercício 08 - Classificador de Triângulos

**Objetivo:** Verificar se três lados formam um triângulo e classificá-lo.

**Requisitos:**
- Solicite os três lados
- Verifique se forma um triângulo válido (cada lado deve ser menor que a soma dos outros dois)
- Classifique:
  - **Equilátero:** três lados iguais
  - **Isósceles:** dois lados iguais
  - **Escaleno:** três lados diferentes

**Exemplo de Entrada/Saída:**
```
Digite o lado A: 5
Digite o lado B: 5
Digite o lado C: 5
Os lados formam um triângulo EQUILÁTERO
```

---

### 🔹 Exercício 09 - Calculadora de Desconto

**Objetivo:** Aplicar descontos progressivos baseados no valor da compra.

**Requisitos:**
- Solicite o valor da compra
- Aplique desconto conforme tabela:
  - Até R$ 100: sem desconto
  - R$ 100,01 a R$ 500: 10% de desconto
  - R$ 500,01 a R$ 1000: 15% de desconto
  - Acima de R$ 1000: 20% de desconto
- Exiba valor original, desconto e valor final

**Exemplo de Entrada/Saída:**
```
Digite o valor da compra: R$ 750.00
Desconto aplicado: 15%
Valor do desconto: R$ 112.50
Valor final: R$ 637.50
```

---

### 🔹 Exercício 10 - Menu de Opções

**Objetivo:** Criar um menu interativo usando switch/case.

**Requisitos:**
- Exiba um menu com pelo menos 5 opções
- Use switch/case para tratar cada opção
- Inclua opção para sair
- Valide entrada inválida

**Exemplo de Entrada/Saída:**
```
=== SISTEMA DE GESTÃO ===
1. Cadastrar
2. Consultar
3. Alterar
4. Excluir
5. Relatório
0. Sair
Escolha uma opção: 3
Você selecionou: ALTERAR
```

---

### 🔹 Exercício 11 - Tabuada

**Objetivo:** Gerar a tabuada de um número.

**Requisitos:**
- Solicite um número
- Exiba a tabuada de 1 a 10
- Formate a saída de forma organizada
- **EXTRA:** Permita escolher o intervalo (ex: de 1 a 15)

**Exemplo de Entrada/Saída:**
```
Digite um número: 7

=== Tabuada do 7 ===
7 x  1 =  7
7 x  2 = 14
7 x  3 = 21
...
7 x 10 = 70
```

---

### 🔹 Exercício 12 - Fatorial

**Objetivo:** Calcular o fatorial de um número.

**Requisitos:**
- Solicite um número inteiro não negativo
- Calcule o fatorial usando while
- Lembre-se: 0! = 1 e 1! = 1
- **DESAFIO:** Implemente também uma versão recursiva

**Exemplo de Entrada/Saída:**
```
Digite um número: 5
5! = 5 x 4 x 3 x 2 x 1 = 120
```

---

### 🔹 Exercício 13 - Sequência de Fibonacci

**Objetivo:** Gerar os N primeiros termos da sequência de Fibonacci.

**Requisitos:**
- Solicite quantos termos exibir
- Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21...
- Cada termo é a soma dos dois anteriores

**Exemplo de Entrada/Saída:**
```
Quantos termos deseja? 10
Sequência de Fibonacci:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34
```

---

### 🔹 Exercício 14 - Validação de Senha

**Objetivo:** Validar senha com número limitado de tentativas.

**Requisitos:**
- Defina uma senha correta no código
- Permita no máximo 3 tentativas
- Use do-while para garantir pelo menos uma tentativa
- Exiba mensagem de sucesso ou bloqueio

**Exemplo de Entrada/Saída:**
```
Digite a senha: 1234
Senha incorreta! Tentativas restantes: 2
Digite a senha: abcd
Senha incorreta! Tentativas restantes: 1
Digite a senha: java123
Acesso liberado! Bem-vindo!
```

---

### 🔹 Exercício 15 - Números Primos

**Objetivo:** Verificar se um número é primo e listar primos em um intervalo.

**Requisitos:**
- Crie um método que verifica se um número é primo
- Solicite dois números que definem um intervalo
- Liste todos os primos no intervalo
- Conte quantos primos existem

**Exemplo de Entrada/Saída:**
```
Digite o início do intervalo: 1
Digite o fim do intervalo: 50

Números primos entre 1 e 50:
2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47

Total: 15 números primos
```

---

### 🔹 Exercício 16 - Maior e Menor do Array

**Objetivo:** Encontrar o maior e menor elemento de um array.

**Requisitos:**
- Crie um array com 10 números (pode ser entrada do usuário ou aleatório)
- Encontre o maior e o menor valor
- Exiba também a posição (índice) de cada um
- **NÃO USE** métodos prontos como Arrays.sort()

**Exemplo de Entrada/Saída:**
```
Array: [5, 2, 9, 1, 7, 6, 3, 8, 4, 10]
Maior valor: 10 (posição 9)
Menor valor: 1 (posição 3)
```

---

### 🔹 Exercício 17 - Inversão de Array

**Objetivo:** Inverter a ordem dos elementos de um array.

**Requisitos:**
- Crie um array com N elementos
- Inverta a ordem dos elementos
- **DESAFIO:** Faça a inversão "in place" (sem criar outro array)

**Exemplo de Entrada/Saída:**
```
Array original: [1, 2, 3, 4, 5]
Array invertido: [5, 4, 3, 2, 1]
```

---

### 🔹 Exercício 18 - Busca em Array

**Objetivo:** Implementar busca linear e verificar existência de elemento.

**Requisitos:**
- Crie um array de nomes ou números
- Solicite um valor para buscar
- Informe se foi encontrado e em qual posição
- **EXTRA:** Conte quantas vezes o elemento aparece

**Exemplo de Entrada/Saída:**
```
Array: ["Ana", "Bruno", "Carlos", "Diana", "Bruno"]
Digite o nome a buscar: Bruno
"Bruno" encontrado na posição 1
"Bruno" aparece 2 vezes no array
```

---

### 🔹 Exercício 19 - Ordenação Simples (Bubble Sort)

**Objetivo:** Implementar o algoritmo Bubble Sort.

**Requisitos:**
- Crie um array desordenado
- Implemente o Bubble Sort passo a passo
- Exiba o array antes e depois da ordenação
- **EXTRA:** Mostre cada passo da ordenação

**Exemplo de Entrada/Saída:**
```
Array original: [64, 34, 25, 12, 22, 11, 90]

Ordenando...
Passo 1: [34, 25, 12, 22, 11, 64, 90]
Passo 2: [25, 12, 22, 11, 34, 64, 90]
...

Array ordenado: [11, 12, 22, 25, 34, 64, 90]
```

---

### 🔹 Exercício 20 - Matriz Identidade

**Objetivo:** Criar e manipular uma matriz identidade.

**Requisitos:**
- Solicite a dimensão N da matriz (NxN)
- Gere uma matriz identidade (1s na diagonal, 0s no resto)
- Exiba a matriz formatada
- **EXTRA:** Calcule a soma dos elementos da diagonal

**Exemplo de Entrada/Saída:**
```
Digite a dimensão da matriz: 4

Matriz Identidade 4x4:
1  0  0  0
0  1  0  0
0  0  1  0
0  0  0  1

Soma da diagonal: 4
```

---

### 🔹 Exercício 21 - Calculadora com Métodos

**Objetivo:** Refatorar a calculadora do Exercício 01 usando métodos.

**Requisitos:**
- Crie métodos separados: `somar()`, `subtrair()`, `multiplicar()`, `dividir()`
- Crie um método `exibirMenu()`
- Crie um método `lerNumero()` para entrada
- O `main()` deve apenas chamar os métodos

**Estrutura sugerida:**
```java
public class Exercicio21 {
    public static double somar(double a, double b) { }
    public static double subtrair(double a, double b) { }
    public static double multiplicar(double a, double b) { }
    public static double dividir(double a, double b) { }
    public static void exibirMenu() { }
    public static double lerNumero(Scanner sc, String mensagem) { }
    
    public static void main(String[] args) { }
}
```

---

### 🔹 Exercício 22 - Validador de CPF

**Objetivo:** Validar um CPF usando o algoritmo oficial.

**Requisitos:**
- Receba o CPF como String (com ou sem formatação)
- Remova caracteres não numéricos
- Verifique se tem 11 dígitos
- Calcule e valide os dígitos verificadores
- Crie métodos auxiliares para cada etapa

**Dica:** O algoritmo de validação do CPF está disponível online. Pesquise!

**Exemplo de Entrada/Saída:**
```
Digite o CPF: 123.456.789-09
CPF válido!

Digite o CPF: 111.111.111-11
CPF inválido! (Todos dígitos iguais)
```

---

### 🔹 Exercício 23 - Gerador de Senhas

**Objetivo:** Gerar senhas aleatórias com critérios específicos.

**Requisitos:**
- Receba o tamanho desejado da senha
- Permita escolher tipos de caracteres:
  - Letras maiúsculas
  - Letras minúsculas
  - Números
  - Caracteres especiais
- Use a classe `Random`
- Gere e exiba a senha

**Exemplo de Entrada/Saída:**
```
=== Gerador de Senhas ===
Tamanho da senha: 12
Incluir maiúsculas? (S/N): S
Incluir minúsculas? (S/N): S
Incluir números? (S/N): S
Incluir especiais? (S/N): N

Senha gerada: aB3kL9mNp2xR
```

---

### 🔹 Exercício 24 - Conversor de Bases Numéricas

**Objetivo:** Converter números entre bases decimal, binário e hexadecimal.

**Requisitos:**
- Menu para escolher conversão
- Decimal ↔ Binário
- Decimal ↔ Hexadecimal
- Binário ↔ Hexadecimal
- Crie métodos para cada conversão
- **NÃO USE** Integer.toBinaryString() ou similares

**Exemplo de Entrada/Saída:**
```
=== Conversor de Bases ===
1. Decimal para Binário
2. Decimal para Hexadecimal
3. Binário para Decimal
Escolha: 1
Digite o número decimal: 42
42 em binário: 101010
```

---

### 🔹 Exercício 25 - Mini Sistema de Cadastro

**Objetivo:** Criar um sistema CRUD simples usando arrays e métodos.

**Requisitos:**
- Use arrays para armazenar dados (nome, idade, email)
- Implemente:
  - Cadastrar (Create)
  - Listar todos (Read)
  - Buscar por nome (Read)
  - Alterar dados (Update)
  - Excluir cadastro (Delete)
- Limite de 10 cadastros
- Menu interativo

**Este exercício é uma preparação para Orientação a Objetos!**

---

## 🏆 Critérios de Conclusão

Para considerar o módulo concluído:

- ✅ Resolver pelo menos **20 dos 25 exercícios**
- ✅ Usar boas práticas de nomenclatura
- ✅ Comentar o código adequadamente
- ✅ Testar com diferentes entradas
- ✅ Resolver os exercícios 21-25 (são obrigatórios)

---

## 📌 Próximo Módulo

Após concluir este módulo, você estará pronto para o **Módulo 02 - Orientação a Objetos**, onde aprenderá:
- Classes e Objetos
- Atributos e Métodos
- Construtores
- Encapsulamento
- Herança
- Polimorfismo
- E muito mais!

---

**Bons estudos! Qualquer dúvida, estou aqui para ajudar!** 💪
