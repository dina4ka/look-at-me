package lookAtMe;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import java.awt.image.*;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.Random;
import javax.swing.JFrame;
/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class NewJFrame extends javax.swing.JFrame {
	private JTextField login;
	private JButton enter;
	private JTextArea about;
	private JPanel image_panel;
	private JPasswordField password;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				NewJFrame inst = new NewJFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public NewJFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			{
				this.setSize(295, 178);
			}
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			
			
			 
			getContentPane().setLayout(thisLayout);
			{
				login = new JTextField();
				login.setText("login");
				login.setBounds(32, 64, 116, 22);
			}
			{
				enter = new JButton();
				enter.setText("enter");
				enter.setBounds(32, 137, 54, 22);
				enter.addActionListener(new ActionListener() {//потом логично отдельно создать actionListener и сюда передавать
					 
			            public void actionPerformed(ActionEvent e)//тут должна быть проверка логина и пароля по БД
			            {
			            	if(login.getText().equals("настя"))
			            	{
			            		login.setVisible(false);
			            		password.setVisible(false);
			            		enter.setVisible(false);
			            		image_panel.setBackground(Color.BLACK);//здесь будет загружаться картинка пользователя
			            		about.setVisible(true);
			            		about.setLineWrap(true);
			            		about.setWrapStyleWord(true);
			            		about.setText("х*й, пи*да, и Джигурда. информация о пользователе");
			            	}
			            //System.out.println(login.getText());
			            }
			        });      
			}
			{
				about = new JTextArea();
				about.setVisible(false);
			}
			{
				image_panel = new JPanel();
				
			}
			{
				password = new JPasswordField();
				password.setBounds(32, 98, 116, 22);
			}
				thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(image_panel, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addGroup(thisLayout.createParallelGroup()
					    .addGroup(thisLayout.createSequentialGroup()
					        .addComponent(about, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 0, Short.MAX_VALUE))
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					        .addGap(9)
					        .addComponent(login, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					        .addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					        .addComponent(enter, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 17, Short.MAX_VALUE)))
					.addContainerGap(28, 28));
				thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
					.addContainerGap(18, 18)
					.addGroup(thisLayout.createParallelGroup()
					    .addComponent(image_panel, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					        .addComponent(login, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					        .addGap(14))
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					        .addComponent(password, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					        .addGap(14))
					    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
					        .addComponent(enter, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					        .addGap(43)))
					.addGap(44)
					.addComponent(about, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(60, Short.MAX_VALUE));
			{
				
				//public void paint(Graphics g)
				{
				  //g.drawImage(img, 0, 0, this);
				}
			}

			pack();
			setSize(400, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
