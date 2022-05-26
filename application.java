package computerlab;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
public class ComputerLab extends JFrame implements ActionListener {
   //here magic is going to happen
    private JLabel label1 = new JLabel("Computer Lab IP Address");
    private JLabel label3 = new JLabel("Value");
    JTextField field1 = new JTextField(10);
    JTextField field2 = new JTextField(10);
    private JButton button1 = new JButton("+");
    private JButton button2 = new JButton("Show Computers");
    private JButton button3 = new JButton("Clear");  
    private JButton button4 = new JButton("Exit App");
    
    
    public ComputerLab(){
        super("   Lab App  ");
        setLayout(new GridLayout(5,2,5,5));
        add(label1);
        add(field1);
        add(label3);
        add(field2);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setSize(395,195);
           
    }ImageIcon icon = new ImageIcon("\"C:\\Users\\ADMIN\\Downloads\\Telegram Desktop\\pic.jpg");

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==button1){
    
        try{
            double amount = Double.parseDouble(field2.getText());
            Computer pamount = new Computer(amount);
            
        }
        catch(NumberFormatException nf){
            JOptionPane.showMessageDialog(null, "Invalid Amount");
        }
       catch(NegativeAmount na){
           JOptionPane.showMessageDialog(null, na.getMessage());
       }
      
       try{ArrayList<String>Address = new ArrayList<String>();
            ArrayList<Double>Amount = new ArrayList<Double>();
       double amount = Double.parseDouble(field2.getText());
            String address = field1.getText();
            if(amount>0){
            JOptionPane.showMessageDialog(this,"Computer Inserted");
            Amount.add(amount);
            Address.add(address);
            } }
            catch(NumberFormatException nfe){
                    
                    }
    }
    else
        if(e.getSource()==button2){
            
            ArrayList<String>Address = new ArrayList<String>();
            ArrayList<Double>Amount = new ArrayList<Double>();
            
             try{      
              double amount = Double.parseDouble(field2.getText());
            String address = field1.getText();
            
            if(amount>0){
            Amount.add(amount);
            Address.add(address);
            } 
            List collect = new ArrayList();
            collect.addAll(Address);
            collect.addAll(Amount);
            JOptionPane.showMessageDialog(null, collect,"Info" , HEIGHT, icon);
          }
          catch(NumberFormatException ne){
              
          }
         
    }
    else
            if(e.getSource()==button3){
            field1.setText("");
            field2.setText("");
            
    }
            else 
                if(e.getSource()==button4){
                    System.exit(0);
                }
    }
    
    
    
    public static void main(String[] args) {
        new ComputerLab();
    }
    
}
