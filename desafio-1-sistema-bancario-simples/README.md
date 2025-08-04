
# 🏦 Desafio 1: Sistema Bancário Simples

### Objetivo:

Criar um sistema básico de banco digital em Java, com funcionalidades de cadastro de clientes e operações bancárias como saque, depósito e transferência.

---
## 📋 Funcionalidades :

**1. Criar conta**
- O usuário informa seus dados pessoais (nome, CPF, email e tipo de cliente).

- Seleciona o tipo de conta desejado: Corrente, Poupança, Salário ou Investimento.

- Define o saldo inicial da conta.

- O sistema gera automaticamente um número de conta único.

- A conta é criada apenas se não houver uma conta existente com o mesmo CPF.


**2. Depositar**

- Permite ao usuário realizar um depósito em uma conta existente.

- Requer o número da conta e o valor a ser depositado.

- Caso o número da conta seja válido e o valor positivo, o saldo da conta é atualizado.

**3. Sacar**

- Permite o saque de um valor a partir de uma conta existente.

- _Requer:_
  - Número da conta
  - Valor do saque

- _Validações:_
    - Conta precisa existir
    - Valor positivo
    - Saldo suficiente

- Atualiza o saldo e informa o resultado da operação

**4. Transferir**

- Permite transferir valores entre duas contas existentes.

- _Requer:_
    - Número da conta de origem
    - Número da conta de destino
    - Valor a transferir
  
- _Validações:_
    - Ambas as contas precisam existir
    - Valor positivo
    - Saldo suficiente na conta de origem
    - Atualiza os saldos das duas contas

**5. Ver dados da conta**

- Permite consultar os dados de uma conta informando seu número.
- Exibe:
    - Número da conta
    - Nome, CPF, email e tipo do cliente
    - Tipo da conta
    - Saldo atual
- Caso a conta não seja encontrada, informa o erro.

**0. Sair**
- Encerra o sistema com uma mensagem de despedida.

---

## 🛠️ Estrutura Técnica

- **Camada de Serviço (`contaServico`)**  
  > Responsável por toda a lógica de negócio: criação, busca, saque, depósito e transferência.

- **Modelos (`Conta`, `Cliente`)**  
  > Representam os dados essenciais da aplicação.

- **Enum (`TipoConta`)**  
  > Enumeração para os tipos de conta bancária.

- **Aplicação Principal (`Main`)**  
  > Interface via terminal. Responsável pela interação com o usuário e exibição das mensagens, utilizando apenas retornos booleanos das operações.

- Nenhuma mensagem é exibida nas classes de serviço ou modelo.  
  > Toda interação com o usuário ocorre apenas na `Main`.

---
🧠 Conceitos aplicados

- Programação orientada a objetos (POO)

- Encapsulamento e boas práticas de design

- Separação de responsabilidades (MVC simplificado)

- Enumerações

- Interação com usuário via terminal

