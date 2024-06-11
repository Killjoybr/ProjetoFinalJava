package Front.css;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LojaVirtual {
	 public static void main(String[] args) {
	        // Cria a janela principal
	        JFrame frame = new JFrame("Loja Virtual");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(800, 600);
	        
	        // Cria a barra de menu
	        JMenuBar menuBar = new JMenuBar();
	        
	        // Cria menus
	        JMenu clientesMenu = new JMenu("Clientes");
	        JMenu cursosMenu = new JMenu("Cursos");
	        JMenu pagamentosMenu = new JMenu("Pagamentos");
	        
	        // Adiciona menus à barra de menu
	        menuBar.add(clientesMenu);
	        menuBar.add(cursosMenu);
	        menuBar.add(pagamentosMenu);
	        
	        // Cria itens de menu para "Clientes"
	        JMenuItem clientesIndex = new JMenuItem("Index");
	        JMenuItem clientesCadastro = new JMenuItem("Cadastro");
	        JMenuItem clientesAlteracao = new JMenuItem("Alteração");
	        JMenuItem clientesConsulta = new JMenuItem("Consulta");
	        JMenuItem clientesExclusao = new JMenuItem("Exclusão");
	        
	        // Adiciona itens de menu ao menu "Clientes"
	        clientesMenu.add(clientesIndex);
	        clientesMenu.add(clientesCadastro);
	        clientesMenu.add(clientesAlteracao);
	        clientesMenu.add(clientesConsulta);
	        clientesMenu.add(clientesExclusao);
	        
	        // Cria itens de menu para "Cursos"
	        JMenuItem cursosIndex = new JMenuItem("Index");
	        JMenuItem cursosCadastro = new JMenuItem("Cadastro");
	        JMenuItem cursosAlteracao = new JMenuItem("Alteração");
	        JMenuItem cursosConsulta = new JMenuItem("Consulta");
	        JMenuItem cursosExclusao = new JMenuItem("Exclusão");
	        
	        // Adiciona itens de menu ao menu "Cursos"
	        cursosMenu.add(cursosIndex);
	        cursosMenu.add(cursosCadastro);
	        cursosMenu.add(cursosAlteracao);
	        cursosMenu.add(cursosConsulta);
	        cursosMenu.add(cursosExclusao);
	        
	        // Cria itens de menu para "Pagamentos"
	        JMenuItem pagamentosIndex = new JMenuItem("Index");
	        JMenuItem pagamentosCadastro = new JMenuItem("Cadastro");
	        JMenuItem pagamentosAlteracao = new JMenuItem("Alteração");
	        JMenuItem pagamentosConsulta = new JMenuItem("Consulta");
	        JMenuItem pagamentosExclusao = new JMenuItem("Exclusão");
	        
	        // Adiciona itens de menu ao menu "Pagamentos"
	        pagamentosMenu.add(pagamentosIndex);
	        pagamentosMenu.add(pagamentosCadastro);
	        pagamentosMenu.add(pagamentosAlteracao);
	        pagamentosMenu.add(pagamentosConsulta);
	        pagamentosMenu.add(pagamentosExclusao);
	        
	        // Define a barra de menu na janela
	        frame.setJMenuBar(menuBar);
	        
	        // Adiciona um painel principal
	        JPanel panel = new JPanel();
	        frame.add(panel);
	        
	        // Exibe a janela
	        frame.setVisible(true);
	    }
	}
