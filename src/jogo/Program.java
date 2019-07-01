package jogo;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Program extends JFrame {
	private static final long serialVersionUID = 1L;

	//Definido as variaveis e guardar�o o tamanho fixo da tela
	private static final int widthT = 800;
	private static final int heightT = 508;
	
	//Construtor da classe
	public Program() {
		//Obtendo a dimens�o do dispositivo
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();

		//Obtendo uma posi��o central para tela 
		double pos_x = (width / 2) - widthT/2;
		double pos_y = (height / 2) - heightT/2;

		setSize(widthT, heightT);	//Setando o tamanho do JFrame		
		setResizable(false);		//Fun��o para que o JFrame n�o seja redimensionavel
		setTitle("Game");			//Fun��o para setar o titulo do JFrame
		setLocation((int) pos_x, (int) pos_y);	//Centralizando o JFrame
		//add(new Program());
		setVisible(true);			//Fun��o para deixar o JFrame visivel

		//Fun��o para saida padr�o do JFrame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		/*
		 * JFrame ScreenGame = new JFrame();
		 * 
		 * ScreenGame.addKeyListener(new KeyAdapter() {
		 * 
		 * 
		 * @Override public void keyReleased(KeyEvent e) {
		 * 
		 * keyboardState.SetKeyMap(e.getKeyCode(), false);
		 * 
		 * }
		 * 
		 * @Override public void keyPressed(KeyEvent e) {
		 * 
		 * keyboardState.SetKeyMap(e.getKeyCode(), true);
		 * 
		 * 
		 * } });
		 * 
		 * ScreenGame.addMouseListener(new MouseAdapter() {
		 * 
		 * @Override public void mouseReleased(MouseEvent ex) {
		 * 
		 * mouseState.SetButtonState(false);
		 * 
		 * }
		 * 
		 * @Override public void mousePressed(MouseEvent ex) {
		 * 
		 * mouseState.SetButtonState(true);
		 * 
		 * }
		 * 
		 * });
		 * 
		 * ScreenGame.addMouseMotionListener(new MouseMotionAdapter() {
		 * 
		 * @Override public void mouseMoved(MouseEvent e) { mouseState.SetX(e.getX());
		 * mouseState.SetY(e.getY()); }
		 * 
		 * 
		 * });
		 * 
		 * ScreenGame.addWindowListener(new WindowAdapter() {
		 * 
		 * 
		 * @Override public void windowClosing(WindowEvent arg0) {
		 * 
		 * threadScreenGame.stop();
		 * 
		 * }
		 * 
		 * 
		 * });
		 */
		Program jogo = new Program();
	}
}
