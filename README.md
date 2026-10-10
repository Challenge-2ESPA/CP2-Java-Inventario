# Inventário – Checkpoint 2

**Disciplina:** Domain Driven Design – Java
**Professor:** Carlos Eduardo Machado de Oliveira
**Instituição:** FIAP

## Integrantes

| Nome | RM |
|------|----|
| Roger De Carvalho Paiva | 566949 |
| Pedro Henrique Tavares Viana | 567680 |
| David Ernesto Mogollon Gama | 567855 |
| João Antonio Sarracine Faedrich de Souza | 567407 |
| Felipe Menezes Santos | 566607 |

## Sobre o projeto

Programa de inventário em Java para cadastrar produtos. O foco do checkpoint é a modelagem de **entidades** no Domain Driven Design.

## Entidade `Produto`

No DDD, uma entidade é definida pela sua **identidade**, e não apenas pelos valores dos seus atributos. Em `Produto`:

- **Identidade:** o número do item identifica o produto de forma única.
- **Estado mutável:** nome, preço e estoque podem mudar sem que o produto deixe de ser o mesmo.
- **Ciclo de vida:** o produto pode ser marcado como **Ativo** ou **Descontinuado** (`setAtivo`).
- **Comportamento próprio:** o produto calcula o valor do seu estoque (preço × quantidade) e se descreve em `toString()`.

## Como executar

Na raiz do projeto:

```bash
javac -d out $(find src -name "*.java")
java -cp out br.com.fiap.test.ProductTester
```
