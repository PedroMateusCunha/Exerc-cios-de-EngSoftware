package velocidadeMedia;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class VelocidadeMedia implements ActionListener {
	private JButton botao;
	private JLabel label;
	private JTextField campoDistancia;
	private JTextField campoTempo;
	
	public VelocidadeMedia() {
		JFrame frame = new JFrame("Delta D");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(400, 150));

		frame.getContentPane().setLayout(new GridLayout(6, 3));

		// Adiciona uma label "Hello World" ubíqua.
		label = new JLabel("Distância");
		frame.getContentPane().add(label);
		
		campoDistancia = new JTextField();
		frame.getContentPane().add(campoDistancia);
		
		label = new JLabel("Tempo");
		frame.getContentPane().add(label);
		
		campoTempo = new JTextField();
		frame.getContentPane().add(campoTempo);
		

		botao = new JButton("Obter Velocidade Média");
		botao.addActionListener(this);
		frame.getContentPane().add(botao);

		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new VelocidadeMedia();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Double tempo = Double.valueOf(campoTempo.getText());
		Double distancia = Double.valueOf(campoDistancia.getText());
		
		Double velocidadeMedia = distancia/tempo;
		JOptionPane.showMessageDialog(null, "Velocidade Média "+velocidadeMedia);			
	}
}


