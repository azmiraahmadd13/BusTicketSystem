package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class BookingTicket extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingTicket frame = new BookingTicket();
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
	public BookingTicket() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("WELCOME");
		lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblWelcome.setBounds(195, 37, 111, 20);
		contentPane.add(lblWelcome);
		
		JLabel lblOrigin = new JLabel("Origin:");
		lblOrigin.setBounds(108, 116, 69, 20);
		contentPane.add(lblOrigin);
		
		JLabel lblDest = new JLabel("Destination:");
		lblDest.setBounds(73, 165, 85, 20);
		contentPane.add(lblDest);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setBounds(119, 211, 69, 20);
		contentPane.add(lblDate);
		
		JComboBox combOrigin = new JComboBox();
		combOrigin.setModel(new DefaultComboBoxModel(new String[] {"Select", "Melaka", "Selangor", "Pahang", "Perak"}));
		combOrigin.setBounds(218, 113, 156, 26);
		contentPane.add(combOrigin);
		
		JComboBox combDest = new JComboBox();
		combDest.setModel(new DefaultComboBoxModel(new String[] {"Select", "Seremban", "Perak", "Melaka", "Selangor"}));
		combDest.setBounds(218, 162, 156, 26);
		contentPane.add(combDest);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(241, 283, 115, 29);
		contentPane.add(btnNext);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		dateChooser.setBounds(218, 211, 156, 26);
		contentPane.add(dateChooser);
		dateChooser.setDateFormatString("dd-MM-yyyy");
		btnNext.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	AvailableBus ab = new AvailableBus();
	        	ab.setVisible(true);
	        	 
	        	
	        	/*String origin = combOrigin.getSelectedItem().toString();
	        	String dest = combDest.getSelectedItem().toString();
	        	String date = dateChooser.getSelectedItem().toString();
	 
	        	new SummaryBooking(origin,dest,date).setVisible(true);
	        	*/
	        	
	         }          
	      });
	}
}
