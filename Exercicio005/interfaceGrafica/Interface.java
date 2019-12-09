package interfaceGrafica;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import agenda.Agenda;
import agenda.ContatoBasico;
import agenda.Telefone;

public class Interface implements ActionListener {
	private JLabel lblNome;
	private JLabel lblTelefone;
	private JLabel lblTipo;
	private JTextField txtNome;
	private JTextField txtTipo;
	private JTextField txtTelefone;
	private JButton btnAdicionarContato;
	private JButton btnPesquisar;


	public Interface() {
		//Criação do Frame
		JFrame frame = new JFrame("Agenda");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300, 400));
		
		//#Criação do Painel#//
		JPanel pnlAgenda = new JPanel();
		pnlAgenda.setLayout(new GridLayout(9, 1));
		
		//#Adição de Componentes#//
		lblNome = new JLabel("Nome");
		pnlAgenda.add(lblNome);
		txtNome = new JTextField();
		pnlAgenda.add(txtNome);
		
		lblTelefone = new JLabel("Telefone");
		pnlAgenda.add(lblTelefone);
		txtTelefone = new JTextField();
		pnlAgenda.add(txtTelefone);
		
		lblTipo = new JLabel("Tipo");
		pnlAgenda.add(lblTipo);
		txtTipo = new JTextField();
		pnlAgenda.add(txtTipo);
		
		btnAdicionarContato = new JButton("Adicionar");
		btnAdicionarContato.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Agenda agenda = new Agenda();
				
				ContatoBasico contato = new ContatoBasico();
				contato.setNome(txtNome.getText());
				contato.setTelefone(new Telefone(txtTelefone.getText(), txtTipo.getText()));
				agenda.inserir(contato);
				agenda.buscarGeral("Pedro");
			}
		});
		
		pnlAgenda.add(btnAdicionarContato);
		
		btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		pnlAgenda.add(btnPesquisar);
		

		
		
		
		//#Adição do painel ao frame#//
		frame.add(pnlAgenda);
		
		//#Visualização da interface#//
		pnlAgenda.setOpaque(true);
		frame.setContentPane(pnlAgenda);
		frame.pack();
		frame.setVisible(true);
		
			
	}
	
		
	
	public static void main(String[] args) {
		new Interface();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

}
