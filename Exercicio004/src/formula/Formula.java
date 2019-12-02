package formula;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Formula implements ActionListener {
	private JButton botao;
	private JLabel label;
	private JTextField campoA;
	private JTextField campoB;
	private JTextField campoC;
	
	public Formula() {
		JFrame frame = new JFrame("Delta D");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(400, 150));

		frame.getContentPane().setLayout(new GridLayout(4, 2));

		// Adiciona uma label "Hello World" ubíqua.
		label = new JLabel("Coeficiente [A]");
		frame.getContentPane().add(label);
		
		campoA = new JTextField();
		frame.getContentPane().add(campoA);
		
		label = new JLabel("Coeficiente [B]");
		frame.getContentPane().add(label);
		
		campoB = new JTextField();
		frame.getContentPane().add(campoB);
		
		label = new JLabel("Coeficiente [C]");
		frame.getContentPane().add(label);
		
		campoC = new JTextField();
		frame.getContentPane().add(campoC);

		botao = new JButton("Obter Delta [D]");
		botao.addActionListener(this);
		frame.getContentPane().add(botao);

		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Formula();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Double a = Double.valueOf(campoA.getText());
		Double b = Double.valueOf(campoB.getText());
		Double c = Double.valueOf(campoC.getText());
		
		Double d = (b*b)-4*a*c;
		if (d > 0) {
			JOptionPane.showMessageDialog(null, "Delta [D]: "+d, "Delta [D] é válido", JOptionPane.DEFAULT_OPTION);			
		} else {
			JOptionPane.showMessageDialog(null, "Delta [D]: "+d, "Delta [D] é inválido", JOptionPane.ERROR_MESSAGE);
		}
	}

}