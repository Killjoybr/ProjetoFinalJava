package br.com.killjoybr.dao;

import br.com.killjoybr.models.Cliente;
import java.sql.*;

public class ClienteImpl implements ClienteDao{
    private static final String INSERT_CLIENTE = "INSERT INTO CLIENTES (nome, telefone) VALUES (?, ?)";
    private static final String SELECT_CLIENTES = "SELECT * FROM CLIENTES";
    private static final String SELECT_CLIENTE_ID = "SELECT id, nome, telefone FROM CLIENTES WHERE id = ?";
    private static final String DELETE_CLIENTE_ID = "DELETE FROM CLIENTES WHERE id = ?";
    private static final String UPDATE_CLIENTE_ID = "UPDATE FROM CLIENTES WHERE id = ?";

    private Connection connection;

    public ClienteImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Cliente cadastrarCliente(Cliente cliente) throws SQLException {
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

    @Override
    public Cliente getClienteId(int id) throws SQLException {
       PreparedStatement ps = connection.prepareStatement(SELECT_CLIENTE_ID);
       ps.setInt(1, id);
       ResultSet rs = ps.executeQuery();

       Cliente cliente = null;
       if (rs.next()) {
           cliente = new Cliente(rs.getInt("id"),
           rs.getString("nome"),
           rs.getString("telefone")
           );
       }
        ps.close();
        return cliente;
    }

    @Override
    public Cliente[] getClientes() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void atualizarCliente(Cliente cliente) throws SQLException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deletarCliente(int id) throws SQLException {
        // TODO Auto-generated method stub
        
    }
}
