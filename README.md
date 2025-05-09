# CP2-JAVA-Brinquedos
-----------------------------------------------------------------------------------------------------------------------------------
## Descrição
API REST para gerenciamento de brinquedos de uma empresa voltada ao público infantil (até 14 anos), usando Spring Boot e Oracle SQL.

## Tecnologias
- Java 17
- Spring Boot
- Maven
- Oracle Database (SQL Developer)
- Postman

![java spring](https://github.com/user-attachments/assets/f80ed9c0-6b99-4ad8-b9b3-dd0d7b8114da)


## Endpoints disponíveis

### 📌 `GET /brinquedos`
Retorna a lista de brinquedos cadastrados.

##  📌 `GET Buscar Brinquedo por ID`

### 📌 `POST /brinquedos`
Cadastra um novo brinquedo.

#### 🔶 Exemplo de JSON para cadastro:
```json
{
  "nome": "Boneco G.I.JOE",
  "tipo": "Boneco",
  "classificacao": "7+",
  "tamanho": "Médio",
  "preco": 49.99
}
