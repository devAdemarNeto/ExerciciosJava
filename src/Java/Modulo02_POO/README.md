# 📘 Módulo 02 - Orientação a Objetos (POO)

## 🎯 Objetivo do Módulo

Dominar os conceitos fundamentais de Programação Orientada a Objetos em Java. Este é o módulo mais importante para se tornar um desenvolvedor Java!

---

## 📚 Conceitos Abordados

- Classes e Objetos
- Atributos e Métodos
- Construtores (padrão e com parâmetros)
- Encapsulamento (private, getters, setters)
- Herança (extends)
- Polimorfismo
- Classes Abstratas
- Interfaces (implements)
- Modificadores de acesso

---

## ✅ Lista de Exercícios

### Nível 1 - Classes e Objetos (Básico)

| # | Exercício | Conceito | Status |
|---|-----------|----------|--------|
| 01 | Classe Pessoa | Classes, Atributos, Métodos | ⬜ |
| 02 | Classe Produto | Classes, Métodos com retorno | ⬜ |
| 03 | Classe ContaBancaria | Métodos, Validações | ⬜ |
| 04 | Classe Retangulo | Cálculos em métodos | ⬜ |
| 05 | Classe Aluno | Lógica em métodos | ⬜ |

### Nível 2 - Construtores e Encapsulamento

| # | Exercício | Conceito | Status |
|---|-----------|----------|--------|
| 06 | Construtores | Construtor padrão e com parâmetros | ⬜ |
| 07 | Encapsulamento | private, getters, setters | ⬜ |
| 08 | Classe Carro | Encapsulamento completo | ⬜ |
| 09 | Classe Funcionario | Encapsulamento, cálculos | ⬜ |
| 10 | Classe Data | Validações em setters | ⬜ |

### Nível 3 - Herança

| # | Exercício | Conceito | Status |
|---|-----------|----------|--------|
| 11 | Herança Básica (Animais) | extends, sobrescrita | ⬜ |
| 12 | Hierarquia de Veículos | extends, atributos extras | ⬜ |
| 13 | Sistema de Funcionários | extends, polimorfismo | ⬜ |
| 14 | Formas Geométricas | Classe abstrata | ⬜ |
| 15 | Conta Corrente e Poupança | Herança com comportamento | ⬜ |

### Nível 4 - Polimorfismo e Interfaces

| # | Exercício | Conceito | Status |
|---|-----------|----------|--------|
| 16 | Polimorfismo com Animais | Array de objetos | ⬜ |
| 17 | Interface Calculavel | implements | ⬜ |
| 18 | Interface Autenticavel | Contratos | ⬜ |
| 19 | Sistema de Pagamentos | Múltiplas implementações | ⬜ |
| 20 | Sistema de Biblioteca | Projeto integrador | ⬜ |

---

## 📝 Detalhamento dos Exercícios

---

### 🔹 Exercício 01 - Classe Pessoa

**Objetivo:** Criar sua primeira classe com atributos e métodos.

**Requisitos:**
- Crie uma classe `Pessoa` com atributos: `nome`, `idade`, `cpf`
- Crie um método `apresentar()` que exibe: "Olá, meu nome é [nome] e tenho [idade] anos."
- No `main()`, crie 2 objetos Pessoa e faça-os se apresentar

**Estrutura sugerida:**
```java
public class Pessoa {
    String nome;
    int idade;
    String cpf;
    
    public void apresentar() {
        // Exibir dados
    }
}
```

**Exemplo de Saída:**
```
Olá, meu nome é João e tenho 25 anos.
Olá, meu nome é Maria e tenho 30 anos.
```

**Dica:** Para criar um objeto: `Pessoa p1 = new Pessoa();`

---

### 🔹 Exercício 02 - Classe Produto

**Objetivo:** Criar métodos que retornam valores.

**Requisitos:**
- Crie uma classe `Produto` com: `nome`, `preco`, `quantidade`
- Crie método `calcularTotal()` que retorna `preco * quantidade`
- Crie método `exibirInfo()` que mostra todos os dados

**Exemplo de Saída:**
```
Produto: Notebook
Preço unitário: R$ 2500.00
Quantidade: 3
Total: R$ 7500.00
```

---

### 🔹 Exercício 03 - Classe ContaBancaria

**Objetivo:** Criar métodos com lógica e validações.

**Requisitos:**
- Crie uma classe `ContaBancaria` com: `titular`, `saldo`, `numeroConta`
- Crie métodos:
  - `depositar(valor)` - adiciona ao saldo
  - `sacar(valor)` - remove do saldo (se houver)
  - `consultarSaldo()` - exibe o saldo
- Não permita saque maior que o saldo

**Exemplo de Saída:**
```
Depósito de R$ 1000.00 realizado com sucesso!
Saldo atual: R$ 1000.00

Saque de R$ 300.00 realizado com sucesso!
Saldo atual: R$ 700.00

Saque de R$ 1000.00 não permitido. Saldo insuficiente!
```

---

### 🔹 Exercício 04 - Classe Retangulo

**Objetivo:** Criar métodos de cálculo.

**Requisitos:**
- Crie uma classe `Retangulo` com: `largura`, `altura`
- Crie métodos:
  - `calcularArea()` - retorna largura × altura
  - `calcularPerimetro()` - retorna 2 × (largura + altura)
- Exiba os resultados formatados

**Exemplo de Saída:**
```
Retângulo: 5.0 x 3.0
Área: 15.0
Perímetro: 16.0
```

---

### 🔹 Exercício 05 - Classe Aluno

**Objetivo:** Criar métodos com lógica condicional.

**Requisitos:**
- Crie uma classe `Aluno` com: `nome`, `nota1`, `nota2`, `nota3`
- Crie métodos:
  - `calcularMedia()` - retorna a média das 3 notas
  - `verificarAprovacao()` - retorna se aprovado (média >= 7)
- Exiba situação do aluno

**Exemplo de Saída:**
```
Aluno: Carlos
Notas: 8.0, 7.5, 9.0
Média: 8.17
Situação: APROVADO ✓
```

---

### 🔹 Exercício 06 - Construtores

**Objetivo:** Aprender a usar construtores para inicializar objetos.

**Requisitos:**
- Refatore a classe `Pessoa` do Exercício 01
- Adicione construtor padrão (sem parâmetros)
- Adicione construtor com parâmetros (nome, idade, cpf)
- Crie objetos usando ambos construtores

**Estrutura sugerida:**
```java
public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    
    // Construtor padrão
    public Pessoa() {
        this.nome = "Sem nome";
        this.idade = 0;
        this.cpf = "000.000.000-00";
    }
    
    // Construtor com parâmetros
    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
}
```

**Exemplo de Uso:**
```java
Pessoa p1 = new Pessoa();  // Usa construtor padrão
Pessoa p2 = new Pessoa("Ana", 25, "123.456.789-00");  // Usa construtor com parâmetros
```

---

### 🔹 Exercício 07 - Encapsulamento

**Objetivo:** Proteger dados com private, getters e setters.

**Requisitos:**
- Refatore a classe `ContaBancaria` do Exercício 03
- Torne todos os atributos `private`
- Crie getters e setters para cada atributo
- Adicione validação no setter do saldo (não pode ser negativo)

**Estrutura sugerida:**
```java
public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta;
    
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }
    // ... outros getters e setters
}
```

---

### 🔹 Exercício 08 - Classe Carro

**Objetivo:** Criar uma classe completamente encapsulada.

**Requisitos:**
- Atributos privados: `marca`, `modelo`, `ano`, `velocidadeAtual`
- Métodos:
  - `acelerar(valor)` - aumenta velocidade
  - `frear(valor)` - diminui velocidade (mínimo 0)
  - `buzinar()` - exibe "Bi bi!"
- Velocidade não pode ser negativa

**Exemplo de Saída:**
```
Carro: Fiat Uno 2020
Velocidade: 0 km/h

Acelerando 50 km/h...
Velocidade atual: 50 km/h

Freando 30 km/h...
Velocidade atual: 20 km/h

Bi bi!
```

---

### 🔹 Exercício 09 - Classe Funcionario

**Objetivo:** Encapsulamento com cálculos.

**Requisitos:**
- Atributos privados: `nome`, `cargo`, `salario`
- Métodos:
  - `calcularAumento(percentual)` - aplica aumento percentual
  - `exibirContraCheque()` - mostra dados formatados
- Use getters e setters

**Exemplo de Saída:**
```
=== CONTRA-CHEQUE ===
Funcionário: Pedro Silva
Cargo: Desenvolvedor
Salário: R$ 5.000,00

Aplicando aumento de 10%...
Novo salário: R$ 5.500,00
```

---

### 🔹 Exercício 10 - Classe Data

**Objetivo:** Validações complexas em setters.

**Requisitos:**
- Atributos privados: `dia`, `mes`, `ano`
- Validações nos setters:
  - Mês deve ser de 1 a 12
  - Dia deve ser válido para o mês
- Método `exibirFormatada()` → "DD/MM/AAAA"

**Exemplo de Saída:**
```
Data criada: 15/08/2024

Tentando alterar para dia 32...
Erro: Dia inválido!

Tentando alterar para mês 13...
Erro: Mês inválido!
```

---

### 🔹 Exercício 11 - Herança Básica (Animais)

**Objetivo:** Entender herança e sobrescrita de métodos.

**Requisitos:**
- Classe `Animal` com: `nome`, `idade`, método `emitirSom()`
- Classe `Cachorro extends Animal`: sobrescreva `emitirSom()` → "Au au!"
- Classe `Gato extends Animal`: sobrescreva `emitirSom()` → "Miau!"

**Estrutura sugerida:**
```java
public class Animal {
    protected String nome;
    protected int idade;
    
    public void emitirSom() {
        System.out.println("Som genérico");
    }
}

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}
```

**Exemplo de Saída:**
```
Rex (Cachorro): Au au!
Mimi (Gato): Miau!
```

---

### 🔹 Exercício 12 - Hierarquia de Veículos

**Objetivo:** Herança com atributos adicionais.

**Requisitos:**
- Classe `Veiculo`: `marca`, `modelo`, método `acelerar()`
- Classe `Carro extends Veiculo`: adicione `numPortas`
- Classe `Moto extends Veiculo`: adicione `cilindradas`

**Exemplo de Saída:**
```
Veículo: Fiat Uno
Tipo: Carro - 4 portas
Acelerando...

Veículo: Honda CB500
Tipo: Moto - 500 cilindradas
Acelerando...
```

---

### 🔹 Exercício 13 - Sistema de Funcionários

**Objetivo:** Herança com comportamentos diferentes.

**Requisitos:**
- Classe `Funcionario`: `nome`, `salarioBase`, `calcularSalario()`
- Classe `Gerente extends Funcionario`: adicione bônus de 50%
- Classe `Vendedor extends Funcionario`: adicione comissão por venda

**Exemplo de Saída:**
```
Funcionário: João (Gerente)
Salário base: R$ 5.000,00
Bônus (50%): R$ 2.500,00
Salário total: R$ 7.500,00

Funcionário: Maria (Vendedora)
Salário base: R$ 2.000,00
Comissão (10 vendas x R$ 50): R$ 500,00
Salário total: R$ 2.500,00
```

---

### 🔹 Exercício 14 - Formas Geométricas (Classe Abstrata)

**Objetivo:** Usar classes abstratas.

**Requisitos:**
- Classe abstrata `Forma` com método abstrato `calcularArea()`
- Classe `Circulo extends Forma`: atributo `raio`, implemente `calcularArea()`
- Classe `Quadrado extends Forma`: atributo `lado`
- Classe `Triangulo extends Forma`: atributos `base`, `altura`

**Estrutura sugerida:**
```java
public abstract class Forma {
    public abstract double calcularArea();
}

public class Circulo extends Forma {
    private double raio;
    
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
```

---

### 🔹 Exercício 15 - Conta Corrente e Poupança

**Objetivo:** Herança com comportamentos específicos.

**Requisitos:**
- Classe `Conta`: `saldo`, `depositar()`, `sacar()`
- Classe `ContaCorrente extends Conta`: taxa de manutenção mensal
- Classe `ContaPoupanca extends Conta`: rendimento mensal (0.5%)

**Exemplo de Saída:**
```
=== Conta Corrente ===
Saldo: R$ 1.000,00
Taxa de manutenção: R$ 15,00
Saldo após taxa: R$ 985,00

=== Conta Poupança ===
Saldo: R$ 1.000,00
Rendimento (0.5%): R$ 5,00
Saldo após rendimento: R$ 1.005,00
```

---

### 🔹 Exercício 16 - Polimorfismo com Animais

**Objetivo:** Entender polimorfismo em ação.

**Requisitos:**
- Use as classes do Exercício 11
- Crie um array de `Animal[]` com cães e gatos misturados
- Percorra o array e chame `emitirSom()` para cada um

**Exemplo de Código:**
```java
Animal[] animais = new Animal[4];
animais[0] = new Cachorro("Rex");
animais[1] = new Gato("Mimi");
animais[2] = new Cachorro("Bob");
animais[3] = new Gato("Luna");

for (Animal a : animais) {
    a.emitirSom();  // Polimorfismo em ação!
}
```

---

### 🔹 Exercício 17 - Interface Calculavel

**Objetivo:** Criar e implementar interfaces.

**Requisitos:**
- Interface `Calculavel` com método `calcular(double a, double b)`
- Classe `Soma implements Calculavel`
- Classe `Subtracao implements Calculavel`
- Classe `Multiplicacao implements Calculavel`

**Estrutura sugerida:**
```java
public interface Calculavel {
    double calcular(double a, double b);
}

public class Soma implements Calculavel {
    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
}
```

---

### 🔹 Exercício 18 - Interface Autenticavel

**Objetivo:** Contratos com interfaces.

**Requisitos:**
- Interface `Autenticavel` com `boolean autenticar(String senha)`
- Classe `Usuario implements Autenticavel`: autenticação simples
- Classe `Admin implements Autenticavel`: requer senha + token

**Exemplo de Saída:**
```
Usuário: joao
Senha: ****
Autenticação: SUCESSO

Admin: admin
Senha: ****
Token: 123456
Autenticação: SUCESSO
```

---

### 🔹 Exercício 19 - Sistema de Pagamentos

**Objetivo:** Múltiplas implementações de interface.

**Requisitos:**
- Interface `Pagavel` com `void processarPagamento(double valor)`
- `PagamentoCartao implements Pagavel` - cobra taxa de 2%
- `PagamentoPix implements Pagavel` - sem taxa
- `PagamentoBoleto implements Pagavel` - desconto de 5%

**Exemplo de Saída:**
```
Processando pagamento de R$ 100,00...

Via Cartão:
Valor: R$ 100,00
Taxa (2%): R$ 2,00
Total: R$ 102,00

Via Pix:
Valor: R$ 100,00
Taxa: R$ 0,00
Total: R$ 100,00

Via Boleto:
Valor: R$ 100,00
Desconto (5%): R$ 5,00
Total: R$ 95,00
```

---

### 🔹 Exercício 20 - Sistema de Biblioteca (Projeto Integrador)

**Objetivo:** Aplicar todos os conceitos de OO em um projeto.

**Requisitos:**
- Classe `Pessoa` (base) com `nome`, `cpf`
- Classe `Leitor extends Pessoa` com lista de livros emprestados
- Classe `Bibliotecario extends Pessoa` com `matricula`
- Classe `Livro` com `titulo`, `autor`, `disponivel`
- Classe `Emprestimo` com `livro`, `leitor`, `dataEmprestimo`
- Interface `Emprestavel` com `emprestar()` e `devolver()`

**Funcionalidades:**
- Cadastrar leitores e livros
- Emprestar livro para leitor
- Devolver livro
- Listar empréstimos ativos

---

## 🏆 Critérios de Conclusão

Para considerar o módulo concluído:

- ✅ Resolver pelo menos **16 dos 20 exercícios**
- ✅ Usar encapsulamento corretamente
- ✅ Aplicar herança quando apropriado
- ✅ Resolver os exercícios 11-15 (herança) e 16-20 (polimorfismo/interfaces) - **obrigatórios**
- ✅ Completar o Exercício 20 (projeto integrador)

---

## � Próximo Módulo

Após concluir este módulo, você estará pronto para o **Módulo 03 - Coleções e Estruturas de Dados**, onde aprenderá:
- ArrayList, LinkedList
- HashMap, HashSet
- Generics
- Comparable e Comparator
- E muito mais!

---

**Bons estudos! Qualquer dúvida, estou aqui para ajudar!** 💪
