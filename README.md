# Projeto Final Java

Projeto da disciplina java, feito para comprovar o aprendizado em Java, Classes, Objetos, Manipulação de dados, Programação orientada a objetos e Java Swing.

## Autores

- [Ruan David](https://www.github.com/killjoybr)
- [Luis Felipe](https://www.github.com/luxzhs)

## Requisitos

- JDK openjdk 21.0.2 2024-01-16 ou mais recente
- Maven 3.9.6 ou mais recente

## Instalação

Clone o projeto.

```bash
git clone https://github.com/Killjoybr/ProjetoFinalJava.git
```

Navegue até a pasta do projeto.

```bash
cd ProjetoFinalJava
```

Instale as dependencias.

```bash
mvn install
```

Compile o projeto
```
javac -cp src/main/java src/main/java/br/com/killjoybr/App.java
```

Rode o programa
```
java -cp src/main/java br.com.killjoybr.App
```

    
## Examplos

```java
private static final String INSERT_CLIENTE = "INSERT INTO CLIENTES (nome, telefone) VALUES (?, ?)";
private static final String SELECT_CLIENTES = "SELECT * FROM CLIENTES";
private static final String SELECT_CLIENTE_ID = "SELECT id, nome, telefone FROM CLIENTES WHERE id = ?";
private static final String DELETE_CLIENTE_ID = "DELETE FROM CLIENTES WHERE id = ?";
private static final String UPDATE_CLIENTE_ID = "UPDATE CLIENTES SET nome = ?, telefone = ? WHERE id = ?";
```

```java
@Override
public Cliente cadastrarCliente(Cliente cliente)   throws SQLException {
    PreparedStatement ps = connection.prepareStatement(INSERT_CLIENTE, Statement.RETURN_GENERATED_KEYS);
    ps.setString(1, cliente.getNome());
    ps.setString(2, cliente.getTelefone());
    ps.executeUpdate();

    ResultSet rs = ps.getGeneratedKeys();
    if (rs.next()) {
        cliente.setId(rs.getInt(1));
    }
    
    ps.close();
    return cliente;
}
```

