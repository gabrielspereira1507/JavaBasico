package farmacia;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class LoginPerfil extends JFrame implements ActionListener {

	// declaração dos componentes

	JLabel lblUsuario, lblSenha, lblMensagem;

	JTextField txtUsuario;

	JPasswordField txtSenha;

	JButton btnEntrar, btnSair;

	// construtor

	public LoginPerfil() {

		// configuração da janela

		super("Farmacia Life");
		getContentPane().setBackground(new Color(196, 241, 253));

		this.setSize(400, 300);

		getContentPane().setLayout(null);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// instanciação dos componentes

		lblUsuario = new JLabel("Usuário:");

		lblUsuario.setBounds(50, 90, 100, 25);
		txtUsuario = new JTextField();
		txtUsuario.setBounds(110, 90, 200, 25);
		lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(50, 120, 100, 25);
		txtSenha = new JPasswordField();
		txtSenha.setBounds(110, 120, 200, 25);
		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(50, 160, 100, 25);
		btnEntrar.addActionListener(this);
		btnSair = new JButton("Sair");
		btnSair.setBounds(200, 160, 100, 25);
		btnSair.addActionListener(this);
		lblMensagem = new JLabel("");
		lblMensagem.setBounds(88, 195, 200, 58);

		// adicionando os componentes na janela

		getContentPane().add(lblUsuario);
		getContentPane().add(txtUsuario);
		getContentPane().add(lblSenha);
		getContentPane().add(txtSenha);
		getContentPane().add(btnEntrar);
		getContentPane().add(btnSair);
		getContentPane().add(lblMensagem);

		JLabel lblNewLabel = new JLabel("Faça login para continuar");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(50, 55, 260, 25);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Berm vindo a Farmácia Life");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(50, 27, 260, 25);
		getContentPane().add(lblNewLabel_1);

	}

	public void verificaLoginPerfil() {

		String usuario = txtUsuario.getText();
		String senha = new String(txtSenha.getPassword());
		if (usuario.equals("admin") && senha.equals("123")) {
			lblMensagem.setText("Seja bem-vindo, administrador!");
			lblMensagem.setForeground(Color.blue);
		} else if (usuario.equals("user") && senha.equals("123")) {
			lblMensagem.setText("Seja bem-vindo!");
			lblMensagem.setForeground(Color.blue);
		} else {
			lblMensagem.setText("Usuário ou senha incorretos!");
			lblMensagem.setForeground(Color.red);
		}
	}

	// método que trata os eventos dos botões

	@Override

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnEntrar) {
			verificaLoginPerfil();
		} else if (e.getSource() == btnSair) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		JFrame janela = new LoginPerfil();
		janela.setVisible(true);

	}
}