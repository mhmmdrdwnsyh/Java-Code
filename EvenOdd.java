import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

public class GanjilGenap extends javax.swing.JFrame {


    public GanjilGenap() {
    	getContentPane().setBackground(Color.WHITE);
    	getContentPane().setEnabled(false);
    	getContentPane().setForeground(new Color(128, 128, 0));
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jSpinner1.setForeground(new Color(230, 230, 250));
        jSpinner1.setFont(new Font("Bebas Neue Bold", Font.PLAIN, 15));
        jSpinner1.setBackground(new Color(230, 230, 250));
        Submit = new javax.swing.JButton();
        Submit.setForeground(Color.BLACK);
        Submit.setBackground(new Color(102, 255, 204));
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextArea1.setFont(new Font("Bebas Neue Regular", Font.PLAIN, 15));
        jTextArea1.setBackground(new Color(153, 204, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Submit.setText("Tekan");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(67)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jSpinner1, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(Submit)))
        			.addGap(57))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(12)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jSpinner1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(Submit, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
        			.addGap(30)
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }                        

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
        int number = (Integer) jSpinner1.getValue();
				jTextArea1.setText("");
				for (int i = 1; i <= number; i++) {
					jTextArea1.append(i + " adalah bilangan ");
					if (i % 2 == 0) {
						jTextArea1.append("genap\n");
					} else {
						jTextArea1.append("ganjil\n");
					}
				}
    }                                      

  
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GanjilGenap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GanjilGenap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GanjilGenap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GanjilGenap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GanjilGenap().setVisible(true);
            }
        });
    }

    private javax.swing.JButton Submit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
}
