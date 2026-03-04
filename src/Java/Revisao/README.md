# 🧪 Exercícios de Revisão - Problemas do Mundo Real

Exercícios que simulam situações reais para revisar os 3 módulos.

---

## 📘 Módulo 01 - Fundamentos

---

### Exercício R1 - Calculadora de Troco 💰

**Cenário:** Você trabalha em um caixa de supermercado e precisa calcular o troco do cliente, informando a quantidade de cada cédula/moeda.

**Requisitos:**
- Receba o valor da compra e o valor pago pelo cliente
- Valide se o valor pago é suficiente
- Calcule o troco
- Informe a menor quantidade de cédulas e moedas (100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05)

**Exemplo:**
```
Valor da compra: R$ 73.50
Valor pago: R$ 100.00
Troco: R$ 26.50

Cédulas:
1x R$ 20.00
1x R$ 5.00
1x R$ 1.00
Moedas:
1x R$ 0.50
```

**Conceitos:** variáveis, operadores aritméticos, condicionais, loops, formatação.

---

### Exercício R2 - Controle de Notas de uma Turma 📊

**Cenário:** Uma escola precisa de um programa para gerenciar as notas de 10 alunos, calcular estatísticas e gerar um relatório.

**Requisitos:**
- Use um array de `double` para armazenar 10 notas
- Peça as notas ao usuário (valide: 0 a 10)
- Calcule e exiba:
  - Média da turma
  - Maior e menor nota
  - Quantidade de aprovados (nota >= 7) e reprovados
  - Porcentagem de aprovação
- Classifique a turma: "Excelente" (média >= 8), "Boa" (>= 6), "Regular" (< 6)

**Conceitos:** arrays, loops, condicionais, operadores, métodos.

---

### Exercício R3 - Simulador de Caixa Eletrônico 🏧

**Cenário:** Simule um caixa eletrônico com menu interativo.

**Requisitos:**
- Saldo inicial de R$ 1.000,00
- Menu com opções: Consultar saldo, Depositar, Sacar, Extrato, Sair
- O extrato deve armazenar as últimas 5 operações em um array de Strings
- Valide saques (não pode sacar mais que o saldo)
- Exiba valores formatados com R$

**Conceitos:** variáveis, arrays, loops (do-while), switch-case, métodos.

---

## 📗 Módulo 02 - POO

---

### Exercício R4 - Sistema de Pedidos de Restaurante 🍕

**Cenário:** Um restaurante precisa de um sistema para gerenciar pedidos.

**Requisitos:**
- Classe `Prato` com: nome, preço, categoria (entrada/principal/sobremesa)
- Classe `Pedido` com: número do pedido, nome do cliente, array de pratos (máximo 10), status (aberto/fechado)
- Métodos:
  - `adicionarPrato(Prato p)` — adiciona ao pedido
  - `removerPrato(String nome)` — remove pelo nome
  - `calcularTotal()` — soma os preços
  - `fecharPedido()` — muda status e exibe conta
  - `exibirPedido()` — mostra tudo formatado
- Teste no Main: crie pratos, monte um pedido, feche e exiba a conta

**Conceitos:** classes, encapsulamento, construtores, arrays em objetos, métodos.

---

### Exercício R5 - Sistema de Transporte 🚗🚌✈️

**Cenário:** Uma empresa de logística precisa calcular custos de frete para diferentes tipos de transporte.

**Requisitos:**
- Classe abstrata `Transporte` com: origem, destino, distanciaKm, pesoCarga
  - Método abstrato `calcularFrete()`
  - Método `exibirInfo()`
- Classe `Caminhao extends Transporte`: frete = distância × 2.50 + peso × 0.80
- Classe `Navio extends Transporte`: frete = distância × 1.20 + peso × 0.50 + taxa portuária (R$ 500)
- Classe `Aviao extends Transporte`: frete = distância × 5.00 + peso × 3.00
- Interface `Rastreavel` com método `rastrear()` — retorna localização atual
  - `Caminhao` e `Aviao` implementam, `Navio` não
- Teste no Main: calcule frete para a mesma carga nos 3 transportes e compare

**Conceitos:** herança, classes abstratas, polimorfismo, interfaces, @Override.

---

### Exercício R6 - Clínica Veterinária 🐾

**Cenário:** Uma clínica veterinária precisa gerenciar animais e consultas.

**Requisitos:**
- Classe `Animal` com: nome, espécie, idade, nomeDono
- Classe `Consulta` com: animal, dataConsulta (String), diagnostico, valor
- Interface `Vacinavel` com: `aplicarVacina(String vacina)` e `listarVacinas()`
- Classe `Cachorro extends Animal implements Vacinavel`: armazena vacinas em array (máximo 5)
- Classe `Gato extends Animal implements Vacinavel`: armazena vacinas em array (máximo 5)
- Teste: cadastre animais, registre consultas, aplique vacinas e liste tudo

**Conceitos:** herança, interfaces, encapsulamento, arrays em objetos, construtores com super.

---

## 📕 Módulo 03 - Coleções

---

### Exercício R7 - Sistema de Delivery 🛵

**Cenário:** Um aplicativo de delivery precisa gerenciar restaurantes, pratos e pedidos.

**Requisitos:**
- Classe `Prato` com: nome, preço, tempo de preparo
- `HashMap<String, ArrayList<Prato>>` (restaurante → lista de pratos)
- Funcionalidades:
  - Cadastrar restaurante
  - Adicionar prato a um restaurante
  - Listar cardápio de um restaurante
  - Fazer pedido (escolher restaurante, escolher pratos, calcular total + taxa de entrega)
  - Ordenar pratos por preço (`Comparable`)
- Trate exceções: restaurante não encontrado, prato inválido

**Conceitos:** HashMap, ArrayList, Comparable, try/catch, objetos em coleções.

---

### Exercício R8 - Gerenciador de Senhas 🔐

**Cenário:** Crie um gerenciador de senhas simples.

**Requisitos:**
- Classe genérica `Cofre<T>` com lista de itens protegidos
- Classe `Credencial` com: site, login, senha
- `HashMap<String, Credencial>` (site → credencial)
- Funcionalidades:
  - Cadastrar credencial (não permitir site duplicado)
  - Buscar por site
  - Listar todos os sites
  - Remover credencial
  - Exportar para arquivo .txt
  - Importar de arquivo .txt
- Exceção personalizada: `SiteDuplicadoException`
- Trate `FileNotFoundException` e `IOException`

**Conceitos:** Generics, HashMap, HashSet, exceção personalizada, leitura/escrita de arquivo.

---

### Exercício R9 - Ranking de Jogadores 🎮

**Cenário:** Um jogo precisa de um sistema de ranking com múltiplos critérios de ordenação.

**Requisitos:**
- Classe `Jogador implements Comparable<Jogador>` com: nome, pontuacao, nivel, partidasVencidas
- `ArrayList<Jogador>` para armazenar jogadores
- `HashSet<String>` para garantir nomes únicos
- Funcionalidades:
  - Cadastrar jogador (nome único)
  - Atualizar pontuação
  - Ordenar por pontuação (padrão — Comparable)
  - Ordenar por nível (Comparator)
  - Ordenar por partidas vencidas (Comparator)
  - Exibir Top 3
  - Buscar jogador por nome (`HashMap<String, Jogador>`)
- Trate entrada inválida com try/catch

**Conceitos:** Comparable, Comparator, ArrayList, HashMap, HashSet, exceções.

---

## 🏆 Critérios

| Nível | Mínimo | Para completar a revisão |
|-------|--------|--------------------------|
| Módulo 01 | 2 de 3 | R1, R2 ou R3 |
| Módulo 02 | 2 de 3 | R4, R5 ou R6 |
| Módulo 03 | 2 de 3 | R7, R8 ou R9 |

---

**Esses exercícios são mais desafiadores que os dos módulos! Tente sem ajuda primeiro, e me mostre quando travar.** 💪🚀
