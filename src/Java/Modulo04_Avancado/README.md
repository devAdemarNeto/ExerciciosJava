# 📘 Módulo 04 - Java Avançado

## 🎯 Objetivo do Módulo

Dominar recursos avançados do Java moderno: Streams, Lambdas, Enums, manipulação de datas e Optional. Escrever código mais limpo, eficiente e profissional!

---

## 📚 Conceitos Abordados

- Lambda Expressions
- Functional Interfaces
- Streams (filter, map, reduce, collect)
- Optional
- Enums
- LocalDate, LocalTime, LocalDateTime
- DateTimeFormatter
- Records (Java 16+)

---

## ✅ Lista de Exercícios

### Nível 1 - Lambda e Functional Interfaces (Exercícios 01-05)

| # | Exercício | Conceito | Status |
|---|-----------|----------|--------|
| 01 | Ordenação com Lambda | Lambda básico | ⬜ |
| 02 | Filtro de Lista | Lambda com removeIf | ⬜ |
| 03 | Calculadora Funcional | Functional Interface | ⬜ |
| 04 | Validador Genérico | Predicate | ⬜ |
| 05 | Transformador de Textos | Function e Consumer | ⬜ |

### Nível 2 - Streams (Exercícios 06-10)

| # | Exercício | Conceito | Status |
|---|-----------|----------|--------|
| 06 | Filtrar e Listar Produtos | filter, forEach | ⬜ |
| 07 | Transformar Dados | map, collect | ⬜ |
| 08 | Estatísticas de Vendas | reduce, count, sum | ⬜ |
| 09 | Processamento de Alunos | filter, map, sorted | ⬜ |
| 10 | Agrupamento de Dados | Collectors.groupingBy | ⬜ |

### Nível 3 - Enums e Datas (Exercícios 11-15)

| # | Exercício | Conceito | Status |
|---|-----------|----------|--------|
| 11 | Status de Pedido | Enum básico | ⬜ |
| 12 | Calculadora de Impostos | Enum com atributos | ⬜ |
| 13 | Agenda de Eventos | LocalDate, LocalTime | ⬜ |
| 14 | Cálculo de Idade e Prazo | Period, ChronoUnit | ⬜ |
| 15 | Formatação de Datas | DateTimeFormatter | ⬜ |

### Nível 4 - Optional, Records e Projeto (Exercícios 16-20)

| # | Exercício | Conceito | Status |
|---|-----------|----------|--------|
| 16 | Busca Segura | Optional básico | ⬜ |
| 17 | Encadeamento Optional | Optional.map, flatMap | ⬜ |
| 18 | Registro de Aluno | Record | ⬜ |
| 19 | Record com Validação | Record, compact constructor | ⬜ |
| 20 | Sistema de RH Completo | Projeto integrador | ⬜ |

---

## 📝 Detalhamento dos Exercícios

---

### 🔹 Exercício 01 - Ordenação com Lambda

**Objetivo:** Substituir Comparator por lambda expressions.

**Requisitos:**
- Crie um `ArrayList<String>` com 5 nomes
- Ordene por ordem alfabética usando lambda
- Ordene por tamanho da string (menor para maior)
- Ordene por última letra

**Exemplo de Saída:**
```
Por ordem alfabética: [Ana, Carlos, Maria, Pedro, Zara]
Por tamanho: [Ana, Zara, Maria, Pedro, Carlos]
Por última letra: [Maria, Zara, Pedro, Carlos, Ana]
```

**Dica:** Em vez de criar uma classe Comparator, use: `lista.sort((a, b) -> ...)`

---

### 🔹 Exercício 02 - Filtro de Lista

**Objetivo:** Usar lambda com `removeIf` para filtrar listas.

**Requisitos:**
- Crie uma lista de números inteiros (1 a 20)
- Remova todos os números pares com `removeIf`
- Crie outra lista de Strings e remova as que começam com "A"
- Exiba antes e depois

**Exemplo de Saída:**
```
Antes: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10...]
Após remover pares: [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
```

**Dica:** `lista.removeIf(n -> n % 2 == 0)`

---

### 🔹 Exercício 03 - Calculadora Funcional

**Objetivo:** Criar e usar uma Functional Interface.

**Requisitos:**
- Crie a interface `Operacao` com método `double calcular(double a, double b)`
- Use lambda para implementar: soma, subtração, multiplicação, divisão
- Crie um método `executar(double a, double b, Operacao op)` que recebe a operação como parâmetro

**Exemplo de Saída:**
```
Soma: 10 + 5 = 15.0
Subtração: 10 - 5 = 5.0
Multiplicação: 10 * 5 = 50.0
Divisão: 10 / 5 = 2.0
```

---

### 🔹 Exercício 04 - Validador Genérico

**Objetivo:** Usar `Predicate<T>` para criar validações reutilizáveis.

**Requisitos:**
- Use `Predicate<String>` para validar:
  - Não é vazio
  - Tem pelo menos 3 caracteres
  - Não contém números
- Use `Predicate<Integer>` para validar:
  - É positivo
  - É par
  - É maior que 10
- Combine predicados com `.and()`, `.or()`, `.negate()`

**Exemplo de Saída:**
```
"Java" - não vazio E >= 3 chars: true
"Ab" - não vazio E >= 3 chars: false
15 - positivo E par: false
20 - positivo E par: true
```

---

### 🔹 Exercício 05 - Transformador de Textos

**Objetivo:** Usar `Function<T,R>` e `Consumer<T>`.

**Requisitos:**
- `Function<String, String>` para:
  - Converter para maiúsculas
  - Adicionar prefixo "Sr. " ou "Sra. "
  - Remover espaços extras
- `Consumer<String>` para:
  - Imprimir com decoração: ">>> texto <<<"
  - Imprimir com numeração
- Aplique as funções em uma lista de nomes

---

### 🔹 Exercício 06 - Filtrar e Listar Produtos

**Objetivo:** Usar Streams para filtrar dados.

**Requisitos:**
- Classe `Produto` com: nome, preço, categoria
- Crie uma lista com 8 produtos variados
- Use Streams para:
  - Listar produtos acima de R$ 50
  - Listar produtos da categoria "Eletrônicos"
  - Contar quantos produtos custam menos de R$ 30

**Exemplo de Saída:**
```
Produtos acima de R$ 50:
- Monitor: R$ 899.00
- Teclado Mecânico: R$ 250.00

Total abaixo de R$ 30: 3 produtos
```

**Dica:** `lista.stream().filter(p -> p.getPreco() > 50).forEach(...)`

---

### 🔹 Exercício 07 - Transformar Dados

**Objetivo:** Usar `map` e `collect` para transformar dados.

**Requisitos:**
- Lista de `Produto` com nome e preço
- Use `map` para:
  - Extrair só os nomes → `List<String>`
  - Aplicar 10% de desconto nos preços → nova lista
  - Converter preços para dólar (÷ 5.0) → `List<Double>`
- Use `collect(Collectors.toList())` para coletar resultados

**Exemplo de Saída:**
```
Nomes: [Mouse, Teclado, Monitor]
Com desconto: [R$ 26.91, R$ 71.91, R$ 809.10]
Em dólar: [US$ 5.98, US$ 15.98, US$ 179.80]
```

---

### 🔹 Exercício 08 - Estatísticas de Vendas

**Objetivo:** Usar `reduce`, `count`, `sum`, `average`.

**Requisitos:**
- Lista de `Venda` com: produto, valor, quantidade
- Calcule com Streams:
  - Faturamento total (`reduce` ou `mapToDouble.sum`)
  - Quantidade total vendida
  - Ticket médio
  - Venda de maior valor
  - Venda de menor valor

**Exemplo de Saída:**
```
=== Relatório de Vendas ===
Faturamento total: R$ 15.430,00
Quantidade vendida: 87 unidades
Ticket médio: R$ 177,36
Maior venda: R$ 2.500,00 (Notebook)
Menor venda: R$ 29,90 (Mouse)
```

---

### 🔹 Exercício 09 - Processamento de Alunos

**Objetivo:** Combinar filter, map e sorted em um pipeline.

**Requisitos:**
- Classe `Aluno` com: nome, nota, curso
- Use Streams para:
  - Filtrar aprovados (nota >= 7)
  - Ordenar por nota (maior primeiro)
  - Exibir só nome e nota
  - Filtrar por curso específico
  - Calcular média por curso

---

### 🔹 Exercício 10 - Agrupamento de Dados

**Objetivo:** Usar `Collectors.groupingBy`.

**Requisitos:**
- Lista de `Funcionario` com: nome, departamento, salario
- Agrupe por departamento → `Map<String, List<Funcionario>>`
- Conte funcionários por departamento → `Map<String, Long>`
- Calcule média salarial por departamento → `Map<String, Double>`
- Encontre o maior salário por departamento

---

### 🔹 Exercício 11 - Status de Pedido

**Objetivo:** Criar e usar Enums básicos.

**Requisitos:**
- Crie o enum `StatusPedido` com: PENDENTE, PREPARANDO, ENVIADO, ENTREGUE, CANCELADO
- Cada status tem uma descrição (String)
- Crie um pedido que muda de status
- Use `switch` com enum
- Não permita voltar para status anterior (ENTREGUE não pode voltar para ENVIADO)

**Exemplo de Saída:**
```
Pedido #1 - Status: PENDENTE (Aguardando confirmação)
Pedido #1 - Status: PREPARANDO (Em preparação)
Pedido #1 - Status: ENVIADO (Saiu para entrega)
Erro: Não é possível voltar para PREPARANDO!
```

---

### 🔹 Exercício 12 - Calculadora de Impostos

**Objetivo:** Usar Enum com atributos e métodos.

**Requisitos:**
- Enum `TipoImposto` com:
  - ICMS (18%), ISS (5%), PIS (1.65%), COFINS (7.6%)
- Cada enum tem a alíquota (percentual)
- Método no enum: `calcular(double valor)` → retorna o imposto
- Receba um valor e calcule cada imposto
- Exiba o total de impostos

---

### 🔹 Exercício 13 - Agenda de Eventos

**Objetivo:** Trabalhar com LocalDate e LocalTime.

**Requisitos:**
- Classe `Evento` com: nome, data (LocalDate), hora (LocalTime), local
- Funcionalidades:
  - Cadastrar evento
  - Listar eventos de hoje
  - Listar eventos da semana
  - Verificar se evento já passou
  - Calcular quantos dias faltam

**Exemplo de Saída:**
```
Evento: Reunião | Data: 25/02/2026 | Hora: 14:00
Faltam 3 dias para este evento!

Eventos de hoje:
- Almoço de equipe às 12:00
```

---

### 🔹 Exercício 14 - Cálculo de Idade e Prazo

**Objetivo:** Usar Period e ChronoUnit.

**Requisitos:**
- Receba data de nascimento e calcule idade exata (anos, meses, dias)
- Receba data de contrato e calcule tempo de empresa
- Calcule data de vencimento (30, 60, 90 dias)
- Verifique se uma data é dia útil (não é sábado/domingo)

---

### 🔹 Exercício 15 - Formatação de Datas

**Objetivo:** Usar DateTimeFormatter.

**Requisitos:**
- Converta String para LocalDate em diferentes formatos:
  - "22/02/2026" (dd/MM/yyyy)
  - "2026-02-22" (yyyy-MM-dd)
  - "22 de Fevereiro de 2026"
- Formate LocalDate para diferentes saídas
- Exiba dia da semana em português
- Trate `DateTimeParseException`

---

### 🔹 Exercício 16 - Busca Segura

**Objetivo:** Usar Optional para evitar NullPointerException.

**Requisitos:**
- Lista de `Produto` com: nome, preço
- Método `buscarPorNome(String nome)` que retorna `Optional<Produto>`
- Use `isPresent()`, `ifPresent()`, `orElse()`, `orElseThrow()`
- Busque produtos que existem e que não existem

**Exemplo de Saída:**
```
Buscando "Mouse"...
Encontrado: Mouse - R$ 29.90

Buscando "Impressora"...
Produto não encontrado, sugerindo: Produto Padrão - R$ 0.00
```

---

### 🔹 Exercício 17 - Encadeamento Optional

**Objetivo:** Usar `Optional.map` e `flatMap`.

**Requisitos:**
- Classe `Empresa` → tem `Optional<Departamento>`
- Classe `Departamento` → tem `Optional<Gerente>`
- Classe `Gerente` → tem nome e email
- Use `flatMap` para acessar o email do gerente de forma segura
- Sem Optional, isso daria NullPointerException em cadeia!

---

### 🔹 Exercício 18 - Registro de Aluno

**Objetivo:** Criar e usar Records.

**Requisitos:**
- Crie `record Aluno(String nome, double nota, String curso)`
- Records já vêm com: construtor, getters, toString, equals, hashCode
- Crie uma lista de alunos usando records
- Filtre e ordene usando Streams

**Dica:** Records são imutáveis — ideal para dados que não mudam!

---

### 🔹 Exercício 19 - Record com Validação

**Objetivo:** Usar compact constructor para validar.

**Requisitos:**
- `record Produto(String nome, double preco)` com validação:
  - nome não pode ser vazio
  - preço não pode ser negativo
- `record CPF(String numero)` com validação:
  - Deve ter 11 dígitos
  - Deve conter apenas números
- Lance `IllegalArgumentException` se inválido

---

### 🔹 Exercício 20 - Sistema de RH Completo (Projeto Integrador)

**Objetivo:** CRUD completo usando todos os conceitos do módulo.

**Requisitos:**
- Enum `Cargo` com: JUNIOR (3000), PLENO (6000), SENIOR (10000), GERENTE (15000)
- Record ou Classe `Funcionario` com: nome, cpf, cargo, dataAdmissao, salario
- Funcionalidades usando Streams:
  - Cadastrar funcionário
  - Listar todos (formatado com data)
  - Filtrar por cargo
  - Calcular folha de pagamento total
  - Calcular tempo de empresa de cada um
  - Ordenar por salário ou nome
  - Agrupar por cargo
  - Buscar por CPF com Optional
  - Exibir estatísticas (maior salário, menor, média)
- Trate exceções e use Enums para cargo
- Menu interativo

---

## 🏆 Critérios de Conclusão

Para considerar o módulo concluído:

- ✅ Resolver pelo menos **16 dos 20 exercícios**
- ✅ Usar Streams com filter, map e collect
- ✅ Criar e usar Enums com atributos
- ✅ Manipular datas com LocalDate
- ✅ Usar Optional corretamente
- ✅ Completar o Exercício 20 (projeto integrador)

---

## 📌 Próximo Módulo

Após concluir este módulo, você estará pronto para o **Módulo 05 - Banco de Dados com JDBC**, onde aprenderá:
- Conexão com MySQL/PostgreSQL
- CRUD com JDBC
- PreparedStatement
- DAO Pattern
- E muito mais!

---

**Bons estudos! Qualquer dúvida, estou aqui para ajudar!** 💪
