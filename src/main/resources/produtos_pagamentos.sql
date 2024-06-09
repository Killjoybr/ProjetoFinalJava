-- Criando tabela auxiliar para produtos e pagamentos
CREATE TABLE produtos_pagamentos (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY UNIQUE,
    id_produto INT NOT NULL,
    id_pagamento INT NOT NULL,
    FOREIGN KEY (id_produto) REFERENCES produtos(id),
    FOREIGN KEY (id_pagamento) REFERENCES pagamentos(id)
);

