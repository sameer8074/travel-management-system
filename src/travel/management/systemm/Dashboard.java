package travel.management.systemm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    
    String username;
    JButton addPersonalDetails, viewPersonalDetails, updatePersonalDetails, checkpackage, bookpackage, viewpackage, viewhotels, destinations, viewBookedHotel;
    Dashboard(String username) {
        this.username = username;
      setExtendedState(JFrame.MAXIMIZED_BOTH);
      setLayout(null);
      
      JPanel p1 = new JPanel();
      p1.setLayout(null);
      p1.setBackground(Color.DARK_GRAY);
      p1.setBounds(0, 0, 1560, 65);
      add(p1);
      
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
      Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel icon = new JLabel(i3);
      icon.setBounds(5, 0, 70, 70);
      p1.add(icon);
      
      JLabel heading = new JLabel("Dashboard");
      heading.setBounds(80, 10, 300, 40);
      heading.setForeground(Color.white);
      heading.setFont(new Font("Tahoma", Font.BOLD, 30));
      p1.add(heading);
      
       JPanel p2 = new JPanel();
      p2.setLayout(null);
      p2.setBackground(Color.DARK_GRAY);
      p2.setBounds(0, 65, 300, 900);
      add(p2);
              
      addPersonalDetails = new JButton("Add Personal Details");
      addPersonalDetails.setBounds(0, 0, 300, 50);
      addPersonalDetails.setBackground(Color.DARK_GRAY);
      addPersonalDetails.setForeground(Color.white);
      addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
      addPersonalDetails.setMargin(new Insets(0, 0, 0, 60));
      addPersonalDetails.addActionListener(this);
      p2.add(addPersonalDetails);
      
       updatePersonalDetails = new JButton("Update Personal Details");
      updatePersonalDetails.setBounds(0, 50, 300, 50);
      updatePersonalDetails.setBackground(Color.DARK_GRAY);
      updatePersonalDetails.setForeground(Color.white);
      updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
      updatePersonalDetails.setMargin(new Insets(0, 0, 0, 30));
      updatePersonalDetails.addActionListener(this);
      p2.add(updatePersonalDetails);
              
              
      viewPersonalDetails = new JButton("View Details");
      viewPersonalDetails.setBounds(0, 100, 300, 50);
      viewPersonalDetails.setBackground(Color.DARK_GRAY);
      viewPersonalDetails.setForeground(Color.white);
      viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
      viewPersonalDetails.setMargin(new Insets(0, 0, 0, 130));
      viewPersonalDetails.addActionListener(this);
      p2.add(viewPersonalDetails);
                      
      JButton deletePersonalDetails = new JButton("Delete Personal Details");
      deletePersonalDetails.setBounds(0, 150, 300, 50);
      deletePersonalDetails.setBackground(Color.DARK_GRAY);
      deletePersonalDetails.setForeground(Color.white);
      deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
      deletePersonalDetails.setMargin(new Insets(0, 0, 0, 40));
      p2.add(deletePersonalDetails);      
      
      checkpackage = new JButton("Check Package");
      checkpackage.setBounds(0, 200, 300, 50);
      checkpackage.setBackground(Color.DARK_GRAY);
      checkpackage.setForeground(Color.white);
      checkpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
      checkpackage.setMargin(new Insets(0, 0, 0, 102));
      checkpackage.addActionListener(this);
      p2.add(checkpackage); 
      
      bookpackage = new JButton("Book Package");
      bookpackage.setBounds(0, 250, 300, 50);
      bookpackage.setBackground(Color.DARK_GRAY);
      bookpackage.setForeground(Color.white);
      bookpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
      bookpackage.setMargin(new Insets(0, 0, 0, 110));
      bookpackage.addActionListener(this);
      p2.add(bookpackage); 
      
      viewpackage = new JButton("View Package");
      viewpackage.setBounds(0, 300, 300, 50);
      viewpackage.setBackground(Color.DARK_GRAY);
      viewpackage.setForeground(Color.white);
      viewpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
      viewpackage.setMargin(new Insets(0, 0, 0, 110));
      viewpackage.addActionListener(this);
      p2.add(viewpackage); 
      
      viewhotels = new JButton("View Hotels");
      viewhotels.setBounds(0, 350, 300, 50);
      viewhotels.setBackground(Color.DARK_GRAY);
      viewhotels.setForeground(Color.white);
      viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
      viewhotels.setMargin(new Insets(0, 0, 0, 120));
      p2.add(viewhotels); 
      
      JButton bookhotels = new JButton("Book Hotels");
      bookhotels.setBounds(0, 400, 300, 50);
      bookhotels.setBackground(Color.DARK_GRAY);
      bookhotels.setForeground(Color.white);
      bookhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
      bookhotels.setMargin(new Insets(0, 0, 0, 120));
      p2.add(bookhotels); 
      
      viewBookedHotel = new JButton("View Booked Hotels");
      viewBookedHotel.setBounds(0, 450, 300, 50);
      viewBookedHotel.setBackground(Color.DARK_GRAY);
      viewBookedHotel.setForeground(Color.white);
      viewBookedHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
      viewBookedHotel.setMargin(new Insets(0, 0, 0, 50));
      p2.add(viewBookedHotel);
      
      destinations = new JButton("Destinations");
      destinations.setBounds(0, 500, 300, 50);
      destinations.setBackground(Color.DARK_GRAY);
      destinations.setForeground(Color.white);
      destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
      destinations.setMargin(new Insets(0, 0, 0, 120));
      p2.add(destinations);
      
      JButton payments = new JButton("Payments");
      payments.setBounds(0, 550, 300, 50);
      payments.setBackground(Color.DARK_GRAY);
      payments.setForeground(Color.white);
      payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
      payments.setMargin(new Insets(0, 0, 0, 140));
      p2.add(payments);
      
      JButton calculators = new JButton("Calculators");
      calculators.setBounds(0, 600, 300, 50);
      calculators.setBackground(Color.DARK_GRAY);
      calculators.setForeground(Color.white);
      calculators.setFont(new Font("Tahoma", Font.PLAIN, 20));
      calculators.setMargin(new Insets(0, 0, 0, 130));
      p2.add(calculators);
              
      JButton notepad = new JButton("Notepad");
      notepad.setBounds(0, 650, 300, 50);
      notepad.setBackground(Color.DARK_GRAY);
      notepad.setForeground(Color.white);
      notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
      notepad.setMargin(new Insets(0, 0, 0, 150));
      p2.add(notepad);    
      
      JButton about = new JButton("About");
      about.setBounds(0, 700, 300, 50);
      about.setBackground(Color.DARK_GRAY);
      about.setForeground(Color.white);
      about.setFont(new Font("Tahoma", Font.PLAIN, 20));
      about.setMargin(new Insets(0, 0, 0, 170));
      p2.add(about);
      
      ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
      Image i5 = i4.getImage().getScaledInstance(1560, 1000, Image.SCALE_DEFAULT);
      ImageIcon i6 = new ImageIcon(i5);
      JLabel image = new JLabel(i6);
      image.setBounds(0, 0, 1560, 1000);
      add(image);
      
      JLabel text = new JLabel ("Travel And Tourism Management System");
      text.setBounds(400, 70, 1000, 70);
      text.setForeground(Color.white);
      text.setFont(new Font("Raleway", Font.BOLD, 45));
      image.add(text);
      
      
      
      setVisible(true);
        
    }
    
    
    public void actionPerformed (ActionEvent ae) {
        if(ae.getSource() == addPersonalDetails) {
            new AddCustomer(username);
        } else if (ae.getSource() == viewPersonalDetails) {
            new ViewCustomer(username);
        } else if (ae.getSource() == updatePersonalDetails) {
            new UpdateCustomer(username);
        } else if (ae.getSource() == checkpackage) {
            new CheckPackage();
        }else if (ae.getSource() == bookpackage) {
            new BookPackage(username);
        }else if (ae.getSource() == viewpackage) {
            new ViewPackage(username);
        }else if (ae.getSource() == viewhotels) {
            new CheckHotels();
        }else if (ae.getSource() == destinations) {
            new Destinations();
        }else if (ae.getSource() == viewBookedHotel) {
            new ViewBookedHotel(username);
        }
            
       
    }
    
    
    
   public static void main(String[] args) {
       new Dashboard("");
   } 
}
