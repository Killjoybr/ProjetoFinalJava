package br.com.killjoybr.dao;

import br.com.killjoybr.models.Cliente;
import java.sql.SQLException;
import java.util.List;

public interface ClienteDao {
    // Metodo p/ cadastrar cliente 
    public Cliente cadastrarCliente(Cliente cliente) throws SQLException;
    
    // Metodo p/ buscar cliente(id) 
    public Cliente getClienteId(int id) throws SQLException;
    
    // Metodo p/ buscar todos clientes
    public List<Cliente> getClientes() throws SQLException;
    
    // Metodo p/ cadastrar atualizar cliente
    public void atualizarCliente(Cliente cliente) throws SQLException;
    
    // Metodo p/ deletar cliente
    public void deletarCliente(int id) throws SQLException;

}
