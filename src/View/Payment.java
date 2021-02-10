package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Payment extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment frame = new Payment();
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
	public Payment() {
		setTitle("Payment");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThankYouFor = new JLabel("Thank You For Using Our Service :)");
		lblThankYouFor.setBounds(93, 71, 271, 120);
		contentPane.add(lblThankYouFor);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(167, 241, 115, 29);
		contentPane.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	BookingTicket bk = new BookingTicket();
	        	bk.setVisible(true);
	        	 
	        	 
	            
	         }          
	      });
		
	}
}
