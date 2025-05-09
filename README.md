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

## Endpoints disponíveis

### 📌 `GET /brinquedos`
Retorna a lista de brinquedos cadastrados.

### 📌 `POST /brinquedos`
Cadastra um novo brinquedo.

#### 🔶 Exemplo de JSON para cadastro:
```json
{
  "nome": "Boneca Mágica",
  "tipo": "Boneca",
  "classificacao": "3+",
  "tamanho": "Médio",
  "preco": 49.99
}
