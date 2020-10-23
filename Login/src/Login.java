import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
	JFrame f1;
	JPanel p1;
	JLabel unm,pass;
	JTextField tunm;
	JPasswordField jpass;
	JButton blog,breset;
	
	public Login()
	{
		super("");
		f1=new JFrame("Log in");
		f1.setSize(400,400);
		f1.setVisible(true);
		
		GridLayout gl=new GridLayout(3,2,10,10);
		f1.setLayout(gl);
		
		unm=new JLabel("User Name");
		tunm=new JTextField(10);
		pass=new JLabel("Password");
		jpass=new JPasswordField(10);
		blog=new JButton("Log In");
		breset=new JButton("Reset");
		
	
		f1.add(unm);
		f1.add(tunm);
		f1.add(pass);
		f1.add(jpass);
		f1.add(blog);
		f1.add(breset);
		
		blog.addActionListener(this);
		breset.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==blog)
		{
			String s1=tunm.getText();
			String s2=jpass.getText();
			if(s1.equals(s2))
			{
				System.out.println("Log in Successful!!");
			}
		}
		if(e.getSource()==breset)
		{
			tunm.setText(" ");
			jpass.setText("");
			
		}
	
		
		
		
	}

	public static void main(String[] args) {
		
		//new Login 
		//Commented because constructed need not be called as it is called automatically when instance of a class is created 
	}

}
