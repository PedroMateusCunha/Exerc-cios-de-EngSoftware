package interfaceFull;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InterfaceFull implements ActionListener {

	JPanel pnlQuestao1;
	JPanel pnlQuestao2;
	JPanel pnlQuestao3;
	
	String[] lsQuestoes = { "Lista de Questões", "Questão 1", "Questão 2", "Questão 3" };
	JComboBox<String> cmbQuestoes = new JComboBox<String>(lsQuestoes);
	
	JLayeredPane jlpCamadas;
	
	JButton botao1;
	JLabel label1;
	JTextField campo1;
	
	JButton botao2;
	JLabel label2;
	JTextField campo2A;
	JTextField campo2B;
	JTextField campo2C;
	
	JButton botao3;
	JLabel label3;
	JTextField campoDistancia3;
	JTextField campoTempo3;
	
	public InterfaceFull() {
		
		//Criação do Frame
		JFrame frame = new JFrame("Janelinha");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300, 400));

		//Criação da Barra de Menu
		JMenuBar barra = new JMenuBar();
		
		//Criação do Menu
		JMenu mnQuestoes = new JMenu("Menu de Questões");
		
		//Criação dos Itens de Menu
		JMenuItem mniQuestao1 = new JMenuItem("Questão 1");
		mniQuestao1.addActionListener(this);
		JMenuItem mniQuestao2 = new JMenuItem("Questão 2");
		mniQuestao2.addActionListener(this);
		JMenuItem mniQuestao3 = new JMenuItem("Questão 3");
		mniQuestao3.addActionListener(this);
		
		//Adição dos Itens de Menu
		mnQuestoes.add(mniQuestao1);
		mnQuestoes.add(mniQuestao2);
		mnQuestoes.add(mniQuestao3);
		mniQuestao1.setActionCommand("q1");
		mniQuestao2.setActionCommand("q2");
		mniQuestao3.setActionCommand("q3");
		
		
		//Adição do Menu de Questões na Barra de Menu
		barra.add(mnQuestoes);
		frame.setJMenuBar(barra);
		
		//Criação de Camadas de Interface em cascata
		jlpCamadas = new JLayeredPane();
		pnlQuestao1 = questao1();
		pnlQuestao2 = questao2();
		pnlQuestao3 = questao3();
		
		//Adição das interfaces nas camadas em cascata
		jlpCamadas.add(pnlQuestao1, Integer.valueOf(1));
		jlpCamadas.add(pnlQuestao2, Integer.valueOf(2));
		jlpCamadas.add(pnlQuestao3, Integer.valueOf(3));
		
		jlpCamadas.setBorder(BorderFactory.createTitledBorder("Questões"));
		
		//Listener do ComboBox
		cmbQuestoes.addActionListener(this);
		cmbQuestoes.setMaximumSize(new Dimension(300, 10));
		cmbQuestoes.setMinimumSize(new Dimension(300, 10));
		JPanel pnlBase = new JPanel();
		pnlBase.setLayout(new BoxLayout(pnlBase, BoxLayout.PAGE_AXIS));
		pnlBase.add(cmbQuestoes);
		pnlBase.add(jlpCamadas);
		
		//Adição do painel
		pnlBase.setOpaque(true);
		frame.setContentPane(pnlBase);
	
		frame.pack();
		frame.setVisible(true);
	}
	
	
	//Método da Questão 1
	JPanel questao1() {
		
		JPanel pnlQuestao1 = new JPanel();
		pnlQuestao1.setBounds(0,0, 250, 250);
		pnlQuestao1.setLayout(new GridLayout(3, 1));
		label1 = new JLabel("Temperatura em Celsius:");
		pnlQuestao1.add(label1);
		campo1 = new JTextField();
		pnlQuestao1.add(campo1);
		botao1 = new JButton("Converter!");
		botao1.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						//Action Performed da Questão 1
						Double temperaturaEmCelsius = Double.valueOf(campo1.getText());
						Double temperaturaEmFahrenheit = (temperaturaEmCelsius*9/5)+32;
						JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é: "+temperaturaEmFahrenheit);
						
					}
				}
				);
		pnlQuestao1.add(botao1);
		return pnlQuestao1;
	}
	
	
	
	//Método da Questão 2
	JPanel questao2() {
		
		JPanel pnlQuestao2 = new JPanel();
		pnlQuestao2.setBounds(0,0, 250, 250);
		pnlQuestao2.setLayout(new GridLayout(4, 1));
		// Adiciona uma label "Hello World" ubíqua.
		label2 = new JLabel("Coeficiente [A]");
		pnlQuestao2.add(label2);
		campo2A = new JTextField();
		pnlQuestao2.add(campo2A);
		label2 = new JLabel("Coeficiente [B]");
		pnlQuestao2.add(label2);
		campo2B = new JTextField();
		pnlQuestao2.add(campo2B);
		label2 = new JLabel("Coeficiente [C]");
		pnlQuestao2.add(label2);
		campo2C = new JTextField();
		pnlQuestao2.add(campo2C);
		botao2 = new JButton("Obter Delta [D]");
		botao2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Action Performed da Questão 2
				Double a = Double.valueOf(campo2A.getText());
				Double b = Double.valueOf(campo2B.getText());
				Double c = Double.valueOf(campo2C.getText());
				Double d = (b*b)-4*a*c;
				if (d > 0) {
					JOptionPane.showMessageDialog(null, "Delta [D]: "+d, "Delta [D] é válido", JOptionPane.DEFAULT_OPTION);			
				} else {
					JOptionPane.showMessageDialog(null, "Delta [D]: "+d, "Delta [D] é inválido", JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		pnlQuestao2.add(botao2);
		return pnlQuestao2;
	}
	
	
	
	//Método da Questão 3
	JPanel questao3() {
		
		JPanel pnlQuestao3 = new JPanel();
		pnlQuestao3.setBounds(0,0, 250, 250);
		pnlQuestao3.setLayout(new GridLayout(6, 1));
		label3 = new JLabel("Distância");
		pnlQuestao3.add(label3);
		campoDistancia3 = new JTextField();
		pnlQuestao3.add(campoDistancia3);
		label3 = new JLabel("Tempo");
		pnlQuestao3.add(label3);
		campoTempo3 = new JTextField();
		pnlQuestao3.add(campoTempo3);
		botao3 = new JButton("Obter Velocidade Média");
		botao3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Action Performed da Questão 3
				Double tempo = Double.valueOf(campoTempo3.getText());
				Double distancia = Double.valueOf(campoDistancia3.getText());
				Double velocidadeMedia = distancia/tempo;
				JOptionPane.showMessageDialog(null, "Velocidade Média "+velocidadeMedia);
			}
		});
		pnlQuestao3.add(botao3);
		return pnlQuestao3;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == cmbQuestoes) {
			int cmd = cmbQuestoes.getSelectedIndex();

			switch (cmd) {
			case 1:
				jlpCamadas.moveToFront(pnlQuestao1);
				jlpCamadas.setComponentZOrder(pnlQuestao1, 0);
				break;
			case 2:
				jlpCamadas.moveToFront(pnlQuestao2);
				jlpCamadas.setComponentZOrder(pnlQuestao2, 0);
				break;
			case 3:
				jlpCamadas.moveToFront(pnlQuestao3);
				jlpCamadas.setComponentZOrder(pnlQuestao3, 0);
				break;
			default:
				jlpCamadas.moveToFront(pnlQuestao3);
				jlpCamadas.setComponentZOrder(pnlQuestao3, 0);;
				break;
			}
		} else {
			if ("q1".equals(e.getActionCommand())) { // q1
				jlpCamadas.moveToFront(pnlQuestao1);
				jlpCamadas.setComponentZOrder(pnlQuestao1, 0);
				cmbQuestoes.setSelectedIndex(1);
			} else if ("q2".equals(e.getActionCommand())) { // q2
				jlpCamadas.moveToFront(pnlQuestao2);
				jlpCamadas.setComponentZOrder(pnlQuestao2, 0);
				cmbQuestoes.setSelectedIndex(2);
			} else if ("q3".equals(e.getActionCommand())) { // q3
				jlpCamadas.moveToFront(pnlQuestao3);
				jlpCamadas.setComponentZOrder(pnlQuestao3, 0);
				cmbQuestoes.setSelectedIndex(3);
			} else { // quit
				System.exit(0);
			}
		}
		
		
		
	}
	
	public static void main (String[] args) {
		new InterfaceFull();
	}
	

}
