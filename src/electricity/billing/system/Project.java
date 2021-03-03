/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricity.billing.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author hp
 */
public class Project extends JFrame implements ActionListener{
    Project(){
        super("Electricity billing syatem");
        
        setSize(1920,1030);
        //adding background image
        ImageIcon ic=new ImageIcon(ClassLoader.getSystemResource("icon/elect1.jpg"));
        Image i3=ic.getImage().getScaledInstance(1900, 950, Image.SCALE_DEFAULT);
        ImageIcon icc3=new ImageIcon(i3);
        JLabel l1=new JLabel(icc3);
        add(l1);
        
        
        //first coloumn
        JMenuBar mb=new JMenuBar();
        JMenu master=new JMenu("Master");
        JMenuItem m1=new JMenuItem("New customer");
        JMenuItem m2=new JMenuItem("Customer Details");
        JMenuItem m3=new JMenuItem("Deposit Detailes");
        master.setForeground(Color.BLUE);
        
        
        //Customer deatailes
        m1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon1=new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
        Image image1=icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        m1.setIcon(new ImageIcon(image1));
        m1.setMnemonic('D');
        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        m1.setBackground(Color.white);
        
        
        //meter details
        m2.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon2=new ImageIcon(ClassLoader.getSystemResource("icon/icon2.png"));
        Image image2=icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        m2.setIcon(new ImageIcon(image2));
        m2.setMnemonic('M');
        m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        m2.setBackground(Color.white);
        
        //deposite details
        m3.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon3=new ImageIcon(ClassLoader.getSystemResource("icon/icon3.png"));
        Image image3=icon3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        m3.setIcon(new ImageIcon(image3));
        m3.setMnemonic('N');
        m3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        m3.setBackground(Color.white);
        
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        //--------------------------------------------------------------------------------
        
        //second coloumn
        JMenu user=new JMenu("user");
        JMenuItem u1=new JMenuItem("pay bill");
        JMenuItem u2=new JMenuItem("Calculate bill");
        JMenuItem u3=new JMenuItem("Last bill");
        user.setForeground(Color.red);
        
        //pay bill
        u1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon4=new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image image4=icon4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image3));
        u1.setMnemonic('P');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        u1.setBackground(Color.white);
        
        //bill details
        u2.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon5=new ImageIcon(ClassLoader.getSystemResource("icon/icon5.png"));
        Image image5=icon5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        u2.setIcon(new ImageIcon(image3));
        u2.setMnemonic('B');
        u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        u2.setBackground(Color.white);
        
        //last bill
        u3.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon6=new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image6=icon6.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        u3.setIcon(new ImageIcon(image6));
        u3.setMnemonic('L');
        u3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
        u3.setBackground(Color.white);
        
        u1.addActionListener(this);
        u2.addActionListener(this);
        u3.addActionListener(this);
        
        //----------------------------------------------------------------------
        
        
        //third coloumn
        JMenu report = new JMenu("Report");
        JMenuItem r1 = new JMenuItem("Generate Bill");
        report.setForeground(Color.red);
        
        //report
        r1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon7=new ImageIcon(ClassLoader.getSystemResource("icon/icon7.png"));
        Image image7=icon7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        r1.setIcon(new ImageIcon(image3));
        r1.setMnemonic('R');
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
        r1.setBackground(Color.white);
        
        r1.addActionListener(this);
        
        //----------------------------------------------------------------------
        
        //forth coloumn
        JMenu utility=new JMenu("UTILITY");
        JMenuItem ut1 = new JMenuItem("Notepad");
        JMenuItem ut2 = new JMenuItem("Calculator");
        JMenuItem ut3 = new JMenuItem("web browser");
        utility.setForeground(Color.RED);
        
        //calender
        ut1.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon8=new ImageIcon(ClassLoader.getSystemResource("icon/icon12.png"));
        Image image8=icon8.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ut1.setIcon(new ImageIcon(image8));
        ut1.setMnemonic('C');
        ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
        ut1.setBackground(Color.white);
        
        //calculator
        ut2.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon9=new ImageIcon(ClassLoader.getSystemResource("icon/icon9.png"));
        Image image9=icon9.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ut2.setIcon(new ImageIcon(image9));
        ut2.setMnemonic('X');
        ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
        ut2.setBackground(Color.white);
        
        //web browser
        ut3.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon10=new ImageIcon(ClassLoader.getSystemResource("icon/icon10.png"));
        Image image10=icon10.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ut3.setIcon(new ImageIcon(image10));
        ut3.setMnemonic('W');
        ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,ActionEvent.CTRL_MASK));
        ut3.setBackground(Color.white);
        
        ut1.addActionListener(this);
        ut2.addActionListener(this);
        ut3.addActionListener(this);
        
        //fifth coloumn
        
        JMenu exit=new JMenu("EXIT");
        JMenuItem ex=new JMenuItem("EXIT");
        exit.setForeground(Color.BLUE);
        
        //--------------exit----------------------------------------------------------
        ex.setFont(new Font("monospaced",Font.PLAIN,12));
        ImageIcon icon11=new ImageIcon(ClassLoader.getSystemResource("icon/icon11.png"));
        Image image11=icon11.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
        ex.setMnemonic('W');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,ActionEvent.CTRL_MASK));
        ex.setBackground(Color.white);
        
        ex.addActionListener(this);
        
        //-----------------------------------------------------------------------------
        
        
        master.add(m1);
        master.add(m2);
        master.add(m3);
        
        user.add(u1);
        user.add(u2);
        user.add(u3);
        
        report.add(r1);
        
        utility.add(ut1);
        utility.add(ut2);
        utility.add(ut3);
        
        exit.add(ex);
        
        mb.add(master);
        mb.add(user);
        mb.add(report);
        mb.add(utility);
        mb.add(exit);
        
        setJMenuBar(mb);
        
        setFont(new Font("senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        setVisible(false);
        
    }
   public void openWebPage(String url){
   try {         
     java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
   }
   catch (java.io.IOException e) {
       System.out.println(e.getMessage());
   }
   System.exit(0);
}
    public void actionPerformed(ActionEvent ae)
    {
        String msg=ae.getActionCommand();
        if(msg.equals("Customer Details")){
            new customer_details().setVisible(true);
        }else if(msg.equals("New customer")){
            new new_customer().setVisible(true);
        }else if(msg.equals("Calculate bill")){
            new calculate_bill().setVisible(true);
        }else if(msg.equals("pay bill")){
            openWebPage("https://paytm.com/electricity-bill-payment");
        }else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){}
        }else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){}
        }else if(msg.equals("web browser")){
            try{
                Runtime.getRuntime().exec("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
            }catch(Exception e){}
        }else if(msg.equals("EXIT")){
            System.exit(0);
        }else if(msg.equals("Generate Bill")){
            new generate_bill().setVisible(true);
        }
    }
    public static void main(String[] args){
        new Project().setVisible(true);
    }
    
}
