# HELP para o Projeto Asuna Score

**Asuna Score** é uma aplicação modular para avaliação de risco de crédito, baseada em vários algoritmos de aprendizado de máquina. A seguir, você encontrará ajuda sobre como usar a aplicação, informações sobre endpoints e exemplos de uso.

## 1. Como Treinar e Prever com Modelos

Cada módulo possui endpoints específicos para treinamento e previsão. Veja abaixo como interagir com cada um deles:

- **Regressão Logística**:
  - **Endpoint**: `/logistic-regression`
  - **Método**: `POST`
  - **Body**: `{ "features": [valores], "target": valor }`

- **Regressão Linear Múltipla**:
  - **Endpoint**: `/multiple-linear-regression`
  - **Método**: `POST`
  - **Body**: `{ "features": [valores] }`

- **Árvores de Decisão e Random Forest**:
  - **Endpoint**: `/decision-tree-random-forest`
  - **Método**: `POST`
  - **Body**: `{ "features": [valores], "target": valor }`

- **Redes Neurais Artificiais (ANN)**:
  - **Endpoint**: `/neural-network`
  - **Método**: `POST`
  - **Body**: `{ "features": [valores], "target": valor }`

- **Máquinas de Vetores de Suporte (SVM)**:
  - **Endpoint**: `/svm`
  - **Método**: `POST`
  - **Body**: `{ "features": [valores], "target": valor }`

- **Gradient Boosting Machines (GBM)**:
  - **Endpoint**: `/gbm`
  - **Método**: `POST`
  - **Body**: `{ "features": [valores], "target": valor }`

- **K-Nearest Neighbors (KNN)**:
  - **Endpoint**: `/knn`
  - **Método**: `POST`
  - **Body**: `{ "features": [valores], "target": valor }`

- **Análise de Componentes Principais (PCA)**:
  - **Endpoint**: `/pca`
  - **Método**: `POST`
  - **Body**: `{ "features": [valores] }`

## 2. Consultar o Console do H2

- **URL**: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **Username**: `sa`
- **Password**: `password`

Para consultas e verificações diretas do banco de dados em memória H2, acesse a URL fornecida e utilize as credenciais acima.

## 3. Exemplo de Uso de API

Aqui estão exemplos de como fazer chamadas para os endpoints da API:

### Exemplo de Regressão Logística

**Request**:
```http
POST /multiple-linear-regression
Content-Type: application/json
{
   "features": [0.8, 0.6, 0.4],
   "target": 1
}
```
**Reponse**:
```
{
   "predictedValue": 12.5
}
```