DROP TABLE IF EXISTS pagamentos;

-- Criando a tabela pagamentos no banco de dados
CREATE TABLE pagamentos (
	id INT  NOT NULL AUTO_INCREMENT PRIMARY KEY UNIQUE,
	idCliente INT NOT NULL REFERENCES clientes(id) ON DELETE CASCADE,
	data DATE NOT NULL,
    valorTotal Double(12,2) NOT NULL,
);