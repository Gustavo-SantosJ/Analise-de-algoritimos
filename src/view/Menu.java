package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.UIManager;

import mm.MétodosEModelo;
import mm.Vetor;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	mm.MétodosEModelo c = new MétodosEModelo();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(UIManager.getBorder("CheckBox.border"));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnQuicksort = new JButton("QuickSort");
		btnQuicksort.setBackground(new Color(153, 255, 255));
		btnQuicksort.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				MétodosEModelo controle = new MétodosEModelo();
				Vetor vetor = new Vetor();

				try {
					controle.LerESeparar(vetor.getNome());

					long TempoInicial = System.currentTimeMillis();
					controle.QuickSort(Vetor.getArray(), 0,Vetor.getIndice()-1);
					long TempoFinal = System.currentTimeMillis();
					controle.tempo(TempoInicial, TempoFinal);

				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "Erro");
					e1.printStackTrace();
				}

			}

		});
		btnQuicksort.setBounds(55, 119, 135, 30);
		btnQuicksort.setFont(new Font("Source Sans Pro ExtraLight", Font.PLAIN, 15));
		contentPane.add(btnQuicksort);

		JButton btnNewButton = new JButton("SelectionSort");
		btnNewButton.setBackground(new Color(153, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				MétodosEModelo controle = new MétodosEModelo();
				Vetor vetor = new Vetor();

				try {
					controle.LerESeparar(vetor.getNome());

					long TempoInicial = System.currentTimeMillis();
					controle.SelectionSort(Vetor.getArray());
					long TempoFinal = System.currentTimeMillis();
					controle.tempo(TempoInicial, TempoFinal);

				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "Erro");
					e1.printStackTrace();
				}

			}

		});
		btnNewButton.setBounds(55, 158, 135, 30);
		btnNewButton.setFont(new Font("Source Sans Pro ExtraLight", Font.PLAIN, 15));
		contentPane.add(btnNewButton);

		JButton btnBubblesort = new JButton("BubbleSort");
		btnBubblesort.setBackground(new Color(153, 255, 255));
		btnBubblesort.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				MétodosEModelo controle = new MétodosEModelo();
				Vetor vetor = new Vetor();

				try {
					controle.LerESeparar(vetor.getNome());

					long TempoInicial = System.currentTimeMillis();
					controle.BubbleSort(Vetor.getArray());
					long TempoFinal = System.currentTimeMillis();
					controle.tempo(TempoInicial, TempoFinal);

				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "Erro");
					e1.printStackTrace();
				}


			}

		});


		btnBubblesort.setBounds(241, 119, 135, 30);
		btnBubblesort.setFont(new Font("Source Sans Pro ExtraLight", Font.PLAIN, 15));
		contentPane.add(btnBubblesort);

		JButton btnInsertsort = new JButton("InsertSort");
		btnInsertsort.setBackground(new Color(153, 255, 255));
		btnInsertsort.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				MétodosEModelo controle = new MétodosEModelo();
				Vetor vetor = new Vetor();

				try {
					controle.LerESeparar(vetor.getNome());

					long TempoInicial = System.currentTimeMillis();
					controle.InsertionSort(Vetor.getArray());
					long TempoFinal = System.currentTimeMillis();
					controle.tempo(TempoInicial, TempoFinal);

				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "Erro");
					e1.printStackTrace();
				}

			}

		});
		btnInsertsort.setBounds(241, 158, 135, 30);
		btnInsertsort.setFont(new Font("Source Sans Pro ExtraLight", Font.PLAIN, 15));
		contentPane.add(btnInsertsort);

		JButton btnNewButton_1 = new JButton("1.000");
		btnNewButton_1.setBackground(new Color(153, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(25, 10, 122, 29);
		contentPane.add(btnNewButton_1);

		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(btnNewButton_1, popupMenu);

		JButton btnNewButton_2 = new JButton("1.000_100%");
		btnNewButton_2.setBackground(new Color(153, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vetor vetor = new Vetor();
				vetor.setNome("1.000 Numeros 100%");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		popupMenu.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("1.000_50%");
		btnNewButton_3.setBackground(new Color(153, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vetor vetor = new Vetor();
				vetor.setNome("1.000 Numeros 50%");
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		popupMenu.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("1.000_25%");
		btnNewButton_4.setBackground(new Color(153, 255, 255));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vetor vetor = new Vetor();
				vetor.setNome("1.000 Numeros 25%");
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		popupMenu.add(btnNewButton_4);

		JButton btnNewButton_1_1 = new JButton("10.000");
		btnNewButton_1_1.setBackground(new Color(153, 255, 255));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_1.setBounds(174, 10, 109, 29);
		contentPane.add(btnNewButton_1_1);

		JPopupMenu popupMenu_1 = new JPopupMenu();
		addPopup(btnNewButton_1_1, popupMenu_1);

		JButton btnNewButton_2_1 = new JButton("10.000_100%");
		btnNewButton_2_1.setBackground(new Color(153, 255, 255));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vetor vetor = new Vetor();
				vetor.setNome("10.000 Numeros 100%");
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		popupMenu_1.add(btnNewButton_2_1);

		JButton btnNewButton_3_1 = new JButton("10.000_50%");
		btnNewButton_3_1.setBackground(new Color(153, 255, 255));
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vetor vetor = new Vetor();
				vetor.setNome("10.000 Numeros 50%");
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		popupMenu_1.add(btnNewButton_3_1);

		JButton btnNewButton_4_1 = new JButton("10.000_25%");
		btnNewButton_4_1.setBackground(new Color(153, 255, 255));
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vetor vetor = new Vetor();
				vetor.setNome("10.000 Numeros 25%");
			}
		});
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		popupMenu_1.add(btnNewButton_4_1);

		JButton btnNewButton_1_1_1 = new JButton("100.000");
		btnNewButton_1_1_1.setBackground(new Color(153, 255, 255));
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1_1_1.setBounds(303, 10, 109, 29);
		contentPane.add(btnNewButton_1_1_1);

		JPopupMenu popupMenu_1_1 = new JPopupMenu();
		addPopup(btnNewButton_1_1_1, popupMenu_1_1);

		JButton btnNewButton_2_1_1 = new JButton("100.000_100%");
		btnNewButton_2_1_1.setBackground(new Color(153, 255, 255));
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vetor vetor = new Vetor();
				vetor.setNome("100.000 Numeros 100%");
			}
		});
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		popupMenu_1_1.add(btnNewButton_2_1_1);

		JButton btnNewButton_3_1_1 = new JButton("100.000_50%");
		btnNewButton_3_1_1.setBackground(new Color(153, 255, 255));
		btnNewButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vetor vetor = new Vetor();
				vetor.setNome("100.000 Numeros 50%");
			}
		});
		btnNewButton_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		popupMenu_1_1.add(btnNewButton_3_1_1);

		JButton btnNewButton_4_1_1 = new JButton("100.000_25%");
		btnNewButton_4_1_1.setBackground(new Color(153, 255, 255));
		btnNewButton_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vetor vetor = new Vetor();
				vetor.setNome("100.000 Numeros 25%");
			}
		});
		btnNewButton_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		popupMenu_1_1.add(btnNewButton_4_1_1);
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.getButton() == 1) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
} // @jve:decl-index=0:visual-constraint="112,26"
