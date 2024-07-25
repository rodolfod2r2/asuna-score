# Asuna Score

O projeto **Asuna Score** é uma aplicação modular desenvolvida em Java utilizando o framework Spring Boot, Spring Data JPA, Spring DevTools, Lombok, e H2 Database. O sistema é projetado para implementar e aplicar oito algoritmos de aprendizado de máquina para prever o risco de crédito e gerar scores baseados em dados financeiros.

## Estrutura do Projeto

O projeto é dividido em oito módulos, cada um implementando um algoritmo de aprendizado de máquina específico:

1. **Regressão Logística**
    - **Descrição**: Um modelo estatístico que utiliza a função logística para modelar a probabilidade de uma variável dependente binária, como a aprovação ou rejeição de crédito.
    - **Aplicação**: Predição de probabilidade de eventos binários, como inadimplência em pagamentos.

2. **Regressão Linear Múltipla**
    - **Descrição**: Extensão da regressão linear simples para modelar a relação entre múltiplas variáveis independentes e uma variável dependente contínua.
    - **Aplicação**: Avaliação de risco de crédito com base em múltiplos fatores como renda, idade e histórico de crédito.

3. **Árvores de Decisão e Random Forest**
    - **Descrição**: Estrutura hierárquica que divide os dados em subgrupos com base em atributos selecionados, resultando em um modelo de classificação ou regressão.
    - **Aplicação**: Classificação de clientes em categorias de risco ou previsão de comportamentos baseados em múltiplos critérios.

4. **Redes Neurais Artificiais (ANN)**
    - **Descrição**: Modelos de aprendizado profundo inspirados na estrutura do cérebro humano, compostos por neurônios interconectados em camadas.
    - **Aplicação**: Análise de grandes volumes de dados para identificar padrões complexos e fazer previsões precisas.

5. **Máquinas de Vetores de Suporte (SVM)**
    - **Descrição**: Algoritmo que mapeia dados de entrada em um espaço dimensional superior para encontrar um hiperplano de separação ótimo entre diferentes classes.
    - **Aplicação**: Classificação de clientes com base em características complexas e não-lineares.

6. **Gradient Boosting Machines (GBM)**
    - **Descrição**: Técnica de aprendizado de máquina que constrói modelos de previsão em forma de árvores de decisão sequencialmente.
    - **Aplicação**: Geração de scores baseados em dados históricos para prever comportamentos futuros.

7. **K-Nearest Neighbors (KNN)**
    - **Descrição**: Algoritmo que classifica novos exemplos com base na similaridade com exemplos existentes, usando uma função de distância.
    - **Aplicação**: Identificação de padrões em dados não estruturados ou semelhantes para previsão de risco.

8. **Análise de Componentes Principais (PCA)**
    - **Descrição**: Técnica de redução de dimensionalidade que transforma um conjunto de variáveis correlacionadas em um conjunto menor de variáveis não correlacionadas.
    - **Aplicação**: Redução de complexidade em conjuntos de dados grandes antes da aplicação de outros algoritmos de geração de score.

## Tecnologias Utilizadas

- **Spring Boot Web**: Framework para criação de APIs RESTful.
- **Spring Data JPA**: Framework para acesso e manipulação de dados.
- **Spring DevTools**: Ferramenta para desenvolvimento ágil com reinicialização automática.
- **Lombok**: Reduz o código boilerplate com anotações como `@Data`, `@Getter`, `@Setter`, etc.
- **H2 Database**: Banco de dados em memória para desenvolvimento e testes.

## Configuração do Projeto

### Requisitos

- Java 17 ou superior
- Maven 3.6 ou superior

### Passos para Configuração

1. **Clone o repositório**:
    ```sh
    git clone https://github.com/seu-usuario/asuna-score.git
    cd asuna-score
    ```

2. **Instale as dependências**:
   Certifique-se de ter o [Maven](https://maven.apache.org/) instalado. Execute:
    ```sh
    mvn clean install
    ```

3. **Configure o banco de dados**:
   O H2 Database é usado para desenvolvimento e testes. Não é necessário configurar um banco de dados externo. As configurações padrão do H2 estão localizadas em `src/main/resources/application.properties`:
    ```properties
    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.driver-class-name=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=password
    spring.jpa.hibernate.ddl-auto=update
    spring.h2.console.enabled=true
    ```

4. **Execute a aplicação**:
   Use Maven para iniciar o projeto:
    ```sh
    mvn spring-boot:run
    ```

5. **Acesse a aplicação**:
   Acesse a API via [http://localhost:8080](http://localhost:8080).

## Endpoints da API

Cada módulo possui endpoints para treinamento e previsão:

- **Regressão Logística**: `/logistic-regression`
- **Regressão Linear Múltipla**: `/multiple-linear-regression`
- **Árvores de Decisão e Random Forest**: `/decision-tree-random-forest`
- **Redes Neurais Artificiais (ANN)**: `/neural-network`
- **Máquinas de Vetores de Suporte (SVM)**: `/svm`
- **Gradient Boosting Machines (GBM)**: `/gbm`
- **K-Nearest Neighbors (KNN)**: `/knn`
- **Análise de Componentes Principais (PCA)**: `/pca`

## Exemplos de Uso

### Regressão Logística

**Request**:
```http
POST /logistic-regression
Content-Type: application/json

{
  "features": [1.0, 0.5, 0.3],
  "target": 1
}
```
**Reponse**:
```
{
  "probability": 0.75
}
```
### Regressão Linear Múltipla
**Request**:
```http
POST /multiple-linear-regression
Content-Type: application/json
{
   "features": [0.8, 0.6, 0.4]
}
```
**Reponse**:
```
{
   "predictedValue": 12.5
}
```

### Testes
Para executar os testes unitários e de integração, use o Maven:
```sh
mvn test
```
### Contribuição

Contribuições são bem-vindas! Para contribuir:

Faça um fork do repositório.

Crie uma branch para sua feature (git checkout -b minha-feature).

Faça commit das suas alterações (git commit -am 'Adiciona nova feature').

Envie suas alterações (git push origin minha-feature).

Abra uma pull request no GitHub.

### Licença
Este projeto está licenciado sob a Licença MIT.
