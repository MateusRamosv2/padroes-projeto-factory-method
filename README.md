# Padrões de Projeto - Factory Method

---

## Estrutura do Projeto

- **Interface (Produto Abstrato):** `IArquivo` → Define o contrato que todos os arquivos devem seguir (abrir e fechar).
- **Fábrica (Criador):** `ArquivoFactory` → Classe responsável por instanciar os arquivos dinamicamente usando Reflexão (Reflection) no Java.
- **Classes Concretas (Produtos):** `ArquivoPDF`, `ArquivoDOCX` e `ArquivoXLSX` → Implementam a interface `IArquivo`.
- **Classe Auxiliar (Cenário de Erro):** `ArquivoTexto` → Classe propositalmente criada sem implementar a interface, para validar o tratamento de erros da fábrica.
- **Testes:** `ArquivoFactoryTest`, `ArquivoPDFTest`, `ArquivoDOCXTest` e `ArquivoXLSXTest` → Validam o sucesso das criações e os cenários de falha com JUnit.

---

## Diagrama de Classes

Abaixo está o diagrama de classes representando a estrutura da implementação e como a fábrica se relaciona com a interface e os produtos concretos.

<img width="1150" height="418" alt="Diagrama-FactoryMethod" src="https://github.com/user-attachments/assets/b88012e7-28be-4b82-96b1-bde688fec663" />
