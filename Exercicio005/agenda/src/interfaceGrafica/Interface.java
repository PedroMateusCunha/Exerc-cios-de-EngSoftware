package interfaceGrafica;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

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
	private Agenda agenda = new Agenda();
	

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
		
		DefaultTableModel dflTabela = new DefaultTableModel();
		dflTabela.addColumn("Nome");
		dflTabela.addColumn("Telefone");
		dflTabela.addColumn("Tipo");
		
		btnAdicionarContato = new JButton("Adicionar");
		btnAdicionarContato.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ContatoBasico contato = new ContatoBasico();
				contato.setNome(txtNome.getText());
				contato.setTelefone(new Telefone(txtTelefone.getText(), txtTipo.getText()));
				agenda.inserir(contato);
				dflTabela.insertRow(0, new Object[] {txtNome.getText(), txtTelefone.getText(), txtTipo.getText()});
				
			}
		});
		
		pnlAgenda.add(btnAdicionarContato);
		
		btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frmBusca = new JFrame("Agenda");
				frmBusca.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frmBusca.setPreferredSize(new Dimension(300, 400));
				
				JTable tblTabela = new JTable(dflTabela);
				frmBusca.getContentPane().add(new JScrollPane(tblTabela));

				frmBusca.pack();
				frmBusca.setVisible(true);
				
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
