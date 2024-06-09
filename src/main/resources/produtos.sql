DROP TABLE IF EXISTS produtos;

-- Criando a tabela produtos no banco de dados
CREATE TABLE produtos (
	id INT  NOT NULL AUTO_INCREMENT PRIMARY KEY UNIQUE,
    nome VARCHAR(255) NOT NULL,
	qtd INT NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    preco Double(12,2) NOT NULL;
);