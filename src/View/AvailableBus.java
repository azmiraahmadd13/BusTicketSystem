package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Color;


import Model.BusTicket;
import Model.Passengers;

public class AvailableBus extends JFrame {

	private JPanel contentPane;
	JPanel windowContent=new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AvailableBus frame = new AvailableBus();
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
	public AvailableBus() {
		setTitle("Available");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JList list_1 = new JList();
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"7.30 AM Mayang Sari RM 12", "10.00 AM Mayang Sari RM12", "12.00 noon Seri Maju RM15"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_1.setBounds(76, 43, 294, 261);
		contentPane.add(list_1);
		list_1.addMouseListener(new MouseAdapter()
	        {
			
	            @Override
	            public void mousePressed(MouseEvent e)
	            {
	            
	                Object selected = list_1.getSelectedValue();
	                JOptionPane.showMessageDialog(windowContent, "Seat Matrix");
	                DefaultListModel dm = (DefaultListModel) list_1.getModel();
	                dm.add(list_1.getModel().getSize(), selected);
	                
	                
	            }
	        });
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setBounds(255, 338, 115, 29);
		contentPane.add(btnConfirm);
		btnConfirm.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	PassengerDetails pd = new PassengerDetails();
	        	pd.setVisible(true);
	        	 
	        	 
	            
	         }          
	      });
		
		
	}
}
