import javax.swing.*; // text tield combo box j label yestei haru imp garyo 
import java.awt.*; // colors haru yestei jhillimili banaune 
import java.awt.event.*; // button ko functionality ko lagi 
import java.util.ArrayList; // array list create garna ko lagi 
public class BankGUI implements ActionListener // class banako -- action listener chai event handeling ko lagi 
{
    ArrayList <Bankcard> araylist = new ArrayList <Bankcard>(); // arraylist banako dcard ccard ko value store garna 
    //Creating Instance variable for Jframe, JLable, JPanel, JTextField, JButton and JComboBox
    private JFrame obj;

    private JLabel heading, Card_ID, Card_IDD, Balance_Amount_C, Balance_Amount_D, Bank_Account_D, Issuer_Bank_D, Client_Name_D, Client_Name_C, Issuer_Bank_C, Bank_Account_C, Withdrawal_Date, CVC_Number, Interest_Rate, Credit_Limit, Grace_Period, Expiration_Date, Pin_Number, Creditcard, Withdrawal_Amount;
                   // just variable name = credit card & variable name 2 = debit card 
    private JPanel panel_obj,panel_obj2;

    private JTextField Card_IDfield, Credit_Limitfield, Balance_Amount_Cfield,
            Bank_Account_Cfield, Issuer_Bank_Cfield, Client_Name_Cfield, Interest_Ratefield,
            Grace_Periodfield, CVC_Numberfield,Card_IDDfield,CreditcardField,Pin_Numberfield,Creditcardfield ,Balance_Amount_Dfield ,  Bank_Account_Dfield ,Issuer_Bank_Dfield , Client_Name_Dfield ,Withdrawal_Amountfield ;

    private JButton addCreditcard, cancelCreditcard,withdraw ,home, setCredit_Limit,displayC, display,clear2, clear,addDebitcard; 
   
    private JComboBox<String> Expiration_Dateday, Expiration_Datemonth, Expiration_Dateyear,Withdrawal_Dateday,Withdrawal_Datemonth,Withdrawal_Dateyear;
 
    public BankGUI()
    {
        obj = new JFrame();
        obj.setTitle("Cypher Bank");

        //Creating Jpanel
        panel_obj= new JPanel();
        panel_obj.setBackground(Color.GRAY);
        //Adding Jpanel in Jframe
        obj.add(panel_obj);
       
        panel_obj2= new JPanel();
        panel_obj2.setBackground(Color.GRAY);
        //Adding Jpanel in Jframe
        obj.add(panel_obj2);

        heading = new JLabel ("Credit Card");
        heading.setBounds(301, 30, 150, 30);
        Font ffR = new Font("Arial", Font.BOLD, 20);
        heading.setFont(ffR);
        panel_obj.add(heading);

        Card_ID = new JLabel ("Card ID");
        Card_ID.setBounds(51, 100, 80, 15);
        Font ff = new Font("Arial", Font.PLAIN, 12);
        //Card_ID.setFont(ff);
        panel_obj.add(Card_ID);

        //Creating text and adding balance amount to the panel with arial font
        Balance_Amount_C = new JLabel ("Balance Amount");
        Balance_Amount_C.setBounds(51, 145, 150, 15);
        Font fff = new Font("Arial", Font.PLAIN, 12);
        Balance_Amount_C.setFont(fff);
        panel_obj.add(Balance_Amount_C);

        //Creating text and adding Bank Account to the panel with arial font
        Bank_Account_C = new JLabel ("Bank Account");
        Bank_Account_C.setBounds(51, 185, 80, 15);
        Font ffff = new Font("Arial", Font.PLAIN, 12);
        Bank_Account_C.setFont(ffff);
        panel_obj.add(Bank_Account_C);

        //Creating text and adding Issuer Bank to the panel with arial font
        Issuer_Bank_C = new JLabel ("Issuer Bank");
        Issuer_Bank_C.setBounds(381, 100, 80, 15);
        Font fffff = new Font("Arial", Font.PLAIN, 12);
        Issuer_Bank_C.setFont(fffff);
        panel_obj.add(Issuer_Bank_C);

        //Creating text and adding Client Name to the panel with arial font
        Client_Name_C = new JLabel ("Client Name ");
        Client_Name_C.setBounds(381, 145, 80, 15);
        Font ffffff = new Font("Arial", Font.PLAIN, 12);
        Client_Name_C.setFont(ffffff);
        panel_obj.add(Client_Name_C);

        //Creating text and adding CVC Number to the panel with arial font
        CVC_Number = new JLabel ("CVC Number");
        CVC_Number.setBounds(381, 185, 80, 15);
        Font ffffv = new Font("Arial", Font.PLAIN, 12);
        CVC_Number.setFont(ffffv);
        panel_obj.add(CVC_Number);

        //Creating text field of Issuer Bank and adding it to the panel
        Issuer_Bank_Cfield = new JTextField();
        Issuer_Bank_Cfield.setBounds(481, 95, 170, 20);
        panel_obj.add(Issuer_Bank_Cfield);

        //Creating text field of Card Id and adding it to the panel
        Card_IDfield = new JTextField();
        Card_IDfield.setBounds(151, 95, 170, 20);
        panel_obj.add(Card_IDfield);

        //Creating text field of card id and adding it to the panel
        Balance_Amount_Cfield = new JTextField();
        Balance_Amount_Cfield.setBounds(151, 140, 170, 20);
        panel_obj.add(Balance_Amount_Cfield);

        //Creating text field of Bank Account and adding it to the panel
        Bank_Account_Cfield = new JTextField();
        Bank_Account_Cfield.setBounds(151, 180, 170, 20);
        panel_obj.add(Bank_Account_Cfield);

        //Creating text field of Client name and adding it to the panel
        Client_Name_Cfield = new JTextField();
        Client_Name_Cfield.setBounds(481, 140, 170, 20);
        panel_obj.add(Client_Name_Cfield);

        //Creating text field of client name and adding it to the panel
        CVC_Numberfield  = new JTextField();
        CVC_Numberfield.setBounds(481, 180, 170, 20);
        panel_obj.add(CVC_Numberfield);

        //Creating text field of credit limit and adding it to the panel
        Credit_Limitfield = new JTextField();
        Credit_Limitfield.setBounds(151, 325, 170, 20);
        panel_obj.add(Credit_Limitfield);

        //Creating button of credit card and adding it to the panel
        addCreditcard = new JButton("Add Credit Card ");
        addCreditcard.setBounds(201, 275, 170, 30);
        panel_obj.add(addCreditcard);

        //Creating button to cancel credit card and adding it to the panel
        cancelCreditcard = new JButton("Cancel Credit Card ");
        cancelCreditcard.setBounds(401, 275, 170, 30);
        panel_obj.add(cancelCreditcard);

        //Creating button to set credit limit and adding it to the panel
        setCredit_Limit = new JButton("Set Credit Limit");
        setCredit_Limit.setBounds(51, 480, 150, 30);
        panel_obj.add(setCredit_Limit);

        //Creating button to display information and adding it to the panel
        displayC = new JButton("Display");
        displayC.setBounds(201, 480, 100, 30);
        panel_obj.add(displayC);

        //Creating button to clear all the information and adding it to the panel
        clear = new JButton("Clear");
        clear.setBounds(301, 480, 100, 30);
        panel_obj.add(clear);

        /* This section is for the next panel
         *  where we add and set bounds for required texts, texts fields and
        some buttons */
        Interest_Rate = new JLabel ("Interest Rate");
        Interest_Rate.setBounds(51, 230, 80, 15);
        panel_obj.add(Interest_Rate);

        Interest_Ratefield = new JTextField();
        Interest_Ratefield.setBounds(151, 225, 170, 20);
        panel_obj.add(Interest_Ratefield);

        Credit_Limit = new JLabel ("Credit Limit");
        Credit_Limit.setBounds(51, 330, 80, 15);
        panel_obj.add(Credit_Limit);

        Grace_Period = new JLabel ("Grace Period");
        Grace_Period.setBounds(51, 380, 80, 15);
        panel_obj.add(Grace_Period);

        Grace_Periodfield = new JTextField();
        Grace_Periodfield.setBounds(151, 375, 170, 20);
        panel_obj.add(Grace_Periodfield);

        Expiration_Date = new JLabel ("Expiration Date");
        Expiration_Date.setBounds(51, 430, 150, 15);
        Font ffffS5 = new Font("Arial", Font.PLAIN, 12);
        Expiration_Date.setFont(ffffS5);
        panel_obj.add(Expiration_Date);

        String days[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        Expiration_Dateday = new JComboBox<>(days);
        Expiration_Dateday.setBounds(151, 430, 80, 20);
        panel_obj.add(Expiration_Dateday);

        String months[] = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        Expiration_Datemonth = new JComboBox<>(months);
        Expiration_Datemonth.setBounds(251, 430, 80, 20);
        panel_obj.add(Expiration_Datemonth);

        String year[] = {"2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030"};
        Expiration_Dateyear = new JComboBox<>(year);
        Expiration_Dateyear.setBounds(351, 430, 100, 20);
        panel_obj.add(Expiration_Dateyear);  
        
        
        
        //Debitcard GUI below
        
        heading = new JLabel ("Debit Card");
        heading.setBounds(301, 30, 150, 30);
        Font fffR = new Font("Arial", Font.BOLD, 20);
        heading.setFont(ffR);
        panel_obj2.add(heading);

        Client_Name_D = new JLabel ("Client Name");
        Client_Name_D.setBounds(51, 100, 80, 15);
        Font aff = new Font("Arial", Font.PLAIN, 12);
        Client_Name_D.setFont(aff);
        panel_obj2.add(Client_Name_D);

        //Creating text and adding balance amount to the panel with arial font
        Balance_Amount_D = new JLabel ("Balance Amount");
        Balance_Amount_D.setBounds(51, 145, 150, 15);
        Font bff = new Font("Arial", Font.PLAIN, 12);
        Balance_Amount_D.setFont(bff);
        panel_obj2.add(Balance_Amount_D);

        //Creating text and adding Bank Account to the panel with arial font
        Bank_Account_D = new JLabel ("Bank Account");
        Bank_Account_D.setBounds(51, 185, 80, 15);
        Font cff = new Font("Arial", Font.PLAIN, 12);
        Bank_Account_D.setFont(cff);
        panel_obj2.add(Bank_Account_D);

        //Creating text and adding Issuer Bank to the panel with arial font
        Issuer_Bank_D = new JLabel ("Issuer Bank");
        Issuer_Bank_D.setBounds(381, 100, 80, 15);
        Font dff = new Font("Arial", Font.PLAIN, 12);
        Issuer_Bank_D.setFont(dff);
        panel_obj2.add(Issuer_Bank_D);

        //Creating text and adding Client Name to the panel with arial font
        Card_IDD = new JLabel ("Card ID  ");
        Card_IDD.setBounds(381, 145, 80, 15);
        Font eff = new Font("Arial", Font.PLAIN, 12);
        Card_IDD.setFont(ffffff);
        panel_obj2.add(Card_IDD);

        //Creating text and adding CVC Number to the panel with arial font
        Pin_Number = new JLabel ("PIN Number");
        Pin_Number.setBounds(381, 185, 80, 15);
        Font gff = new Font("Arial", Font.PLAIN, 12);
        Pin_Number.setFont(gff);
        panel_obj2.add(Pin_Number);

        //Creating text field of Issuer Bank and adding it to the panel
        Issuer_Bank_Dfield = new JTextField();
        Issuer_Bank_Dfield.setBounds(481, 95, 170, 20);
        panel_obj2.add(Issuer_Bank_Dfield);

        //Creating text field of Card Id and adding it to the panel
        Client_Name_Dfield = new JTextField();
        Client_Name_Dfield.setBounds(151, 95, 170, 20);
        panel_obj2.add(Client_Name_Dfield);

        //Creating text field of card id and adding it to the panel
        Balance_Amount_Dfield = new JTextField();
        Balance_Amount_Dfield.setBounds(151, 140, 170, 20);
        panel_obj2.add(Balance_Amount_Dfield);

        //Creating text field of Bank Account and adding it to the panel
        Bank_Account_Dfield = new JTextField();
        Bank_Account_Dfield.setBounds(151, 180, 170, 20);
        panel_obj2.add(Bank_Account_Dfield);

        //Creating text field of Client name and adding it to the panel
        Card_IDDfield = new JTextField();
        Card_IDDfield.setBounds(481, 140, 170, 20);
        panel_obj2.add(Card_IDDfield);

        //Creating text field of client name and adding it to the panel
        Pin_Numberfield  = new JTextField();
        Pin_Numberfield .setBounds(481, 180, 170, 20);
        panel_obj2.add(Pin_Numberfield );


        //Creating button of credit card and adding it to the panel
        addDebitcard = new JButton("Set Debit Card");
        addDebitcard.setBounds(271, 250, 170, 30);
        panel_obj2.add(addDebitcard);
       
        Withdrawal_Amount = new JLabel ("Withdrawal Amount");
        Withdrawal_Amount.setBounds(51, 330, 120, 15);
        panel_obj2.add(Withdrawal_Amount);
       
        Withdrawal_Amountfield = new JTextField();
        Withdrawal_Amountfield.setBounds(171, 325, 170, 20);
        panel_obj2.add(Withdrawal_Amountfield);
       
       
        Withdrawal_Date = new JLabel ("Withdrawal Date");
        Withdrawal_Date.setBounds(51, 375, 150, 15);
        Font fffa = new Font("Arial", Font.PLAIN, 12);
        Withdrawal_Date.setFont(ffffS5);
        panel_obj2.add(Withdrawal_Date);

        String dayss[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        Withdrawal_Dateday = new JComboBox<>(days);
        Withdrawal_Dateday.setBounds(151,375, 80, 20);
        panel_obj2.add(Withdrawal_Dateday);

        String monthss[] = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        Withdrawal_Datemonth = new JComboBox<>(months);
        Withdrawal_Datemonth.setBounds(251, 375, 80, 20);
        panel_obj2.add(Withdrawal_Datemonth);

        String years[] = {"2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030"};
        Withdrawal_Dateyear = new JComboBox<>(year);
        Withdrawal_Dateyear.setBounds(351, 375, 100, 20);
        panel_obj2.add(Withdrawal_Dateyear);
       
        //Creating button to display information and adding it to the panel
        display = new JButton("Display");
        display.setBounds(51, 480, 100, 30);
        panel_obj2.add(display);

        //Creating button to clear all the information and adding it to the panel
        clear2 = new JButton("Clear");
        clear2.setBounds(151, 480, 100, 30);
        panel_obj2.add(clear2);
       
        withdraw = new JButton("withdraw");
        withdraw.setBounds(251, 480, 100, 30);
        panel_obj2.add(withdraw);
              
        //Debit card GUI ends here
       
       
       
       

        // frame size
        panel_obj.setLayout(null);
        panel_obj.setSize(701,601);
       
        panel_obj2.setLayout(null);
        panel_obj2.setSize(701,601);

       

        obj.add(panel_obj);
        obj.add(panel_obj2);
       
        JTabbedPane tp=new JTabbedPane();  
        tp.setBounds(10, 5, 665, 540);  
        tp.add("Credit",panel_obj);
        tp.add("Debit",panel_obj2);
        obj.add(tp);  
         
        obj.setSize(700,600);
        obj.setLayout(null);
        obj.setVisible(true);
       
        obj.setResizable(false);

        addCreditcard.addActionListener(this);
        addDebitcard.addActionListener(this);
        withdraw.addActionListener(this);
        clear.addActionListener(this);
        clear2.addActionListener(this);
        display.addActionListener(this);
        displayC.addActionListener(this);
        setCredit_Limit.addActionListener(this);
        cancelCreditcard.addActionListener(this);
       

    }

    @Override
    public void actionPerformed(ActionEvent e)

    {
        if(e.getSource()==addCreditcard)
        {
             try{ 
       
            double Balance_Amount_C = Double.parseDouble(Balance_Amount_Cfield.getText());
            System.out.println(Balance_Amount_C);
           
            String Bank_Account_C = Bank_Account_Cfield.getText();
            System.out.println(Bank_Account_C);
           
            String Issuer_Bank_C = Issuer_Bank_Cfield.getText();
            System.out.println(Issuer_Bank_C);
           
            String Client_Name_C = Client_Name_Cfield.getText();
            System.out.println(Client_Name_C);
           
            int CVC_Number = Integer.parseInt(CVC_Numberfield.getText());
            System.out.println(CVC_Number);
           
            int Card_ID = Integer.parseInt(Card_IDfield.getText());
            System.out.println(Card_ID);
           
            double interest_rate = Integer.parseInt(Interest_Ratefield.getText());
            System.out.println(interest_rate);
           
            String Expiration_Date = Expiration_Dateday.getSelectedItem()+ "" + Expiration_Datemonth .getSelectedItem()+ "" + Expiration_Dateyear.getSelectedItem();
           
           
           
            boolean match = false;
           
            if(araylist.isEmpty()){
                Creditcard obj = new Creditcard( Balance_Amount_C, Card_ID,  Bank_Account_C, Issuer_Bank_C, CVC_Number, interest_rate,Expiration_Date,Client_Name_C);
                araylist.add(obj);
                JOptionPane.showMessageDialog(panel_obj,"Card ID successfully added ","tittle",JOptionPane.INFORMATION_MESSAGE);// Card id has been added successfully.  
            }
            else
            {
                for(Bankcard obj: araylist)
                {
                    if(obj instanceof Creditcard)
                    {
                        if(obj.getCard_ID() == Card_ID)
                        {
                        JOptionPane.showMessageDialog(panel_obj,"Same card ID cannot be added twice","tittle",JOptionPane.WARNING_MESSAGE);// You cannot add the same card Id twice.
                        match = true;
                        break;
                        }
                    }
                }
            }
           
           
            if(match ==false){
                Creditcard obj = new Creditcard( Balance_Amount_C, Card_ID,  Bank_Account_C,Issuer_Bank_C,CVC_Number,interest_rate, Expiration_Date, Client_Name_C);
                araylist.add(obj);
                JOptionPane.showMessageDialog(panel_obj,"Card ID succesfully added","tittle",JOptionPane.INFORMATION_MESSAGE);
                // Card id has been added successfully.  
            }          
        }
       
       
        catch(NumberFormatException exception){
                        // The value entered was not correct.
                        JOptionPane.showMessageDialog(panel_obj,"Invalid Value entered ","title",JOptionPane.WARNING_MESSAGE);
        }

        }
        else if(e.getSource()==display)
        {
            if(Issuer_Bank_Dfield.getText().isEmpty() ||
            Card_IDDfield.getText().isEmpty() ||
            Client_Name_Dfield.getText().isEmpty() ||
            Bank_Account_Dfield.getText().isEmpty() ||
            Pin_Numberfield.getText().isEmpty() ||
            Balance_Amount_Dfield.getText().isEmpty() ||
            Withdrawal_Amountfield.getText().isEmpty()
           
            ){
                JOptionPane.showMessageDialog(null, "Please fill out all the necessary areas with required information", "Input Error", JOptionPane.ERROR_MESSAGE);
            }else{
                try{
                    int Card_ID = Integer.parseInt(Card_IDDfield.getText());
                    int Pin_Number = Integer.parseInt(Pin_Numberfield.getText());
                    int blcAmount = Integer.parseInt(Balance_Amount_Dfield.getText());
                    int WithdrawAmount = Integer.parseInt(Withdrawal_Amountfield.getText());

                    String Bank_Account_C = Bank_Account_Dfield.getText();
                    String Issuer_Bank_C = Issuer_Bank_Dfield.getText();
                    String Client_Name_C = Client_Name_Dfield.getText();
                    String DateOfWithdrawal = Withdrawal_Dateday.getSelectedItem()+ "" + Withdrawal_Datemonth.getSelectedItem()+ "" + Withdrawal_Dateyear.getSelectedItem();


                   
                    for(Bankcard debCard : araylist){
                        if(debCard instanceof Debitcard){
                            Debitcard deb_obj = (Debitcard) debCard;
                            if(deb_obj.getCard_ID() == Card_ID && deb_obj.getPin_Number() == Pin_Number )
                            {
                            String DebValues = "Card Id: "+Card_ID+" \nClient Name "+Client_Name_C+" \nIssuer Bank"+Issuer_Bank_C+" \nBank Account"+Bank_Account_C+" \nPin Number"+Pin_Number+"\n balance amount "+blcAmount+ " \n Final Balance Amount "+deb_obj.getBalance_Amount()+ " \nWithdraw Amount"+WithdrawAmount+" \nDate Of Withdrawal"+DateOfWithdrawal;

                            deb_obj.display();
                            JOptionPane.showMessageDialog(null, "Debit Card\n" + DebValues);
                       

                            }
                            else
                            {
                                JOptionPane.showMessageDialog(panel_obj2,"PIN number AND Card_ID didnt matched.","tittle",JOptionPane.WARNING_MESSAGE);
                            }

                    }
                }
            }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Please enter numeric value only in Card Id , Pin Number and Balance Amount, Pin Number and Withdrawal Amount", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if(e.getSource()==displayC)
        {
            if(Issuer_Bank_Cfield.getText().isEmpty() ||
            Card_IDfield.getText().isEmpty() ||
            Client_Name_Cfield.getText().isEmpty() ||
            Bank_Account_Cfield.getText().isEmpty() ||
            CVC_Numberfield.getText().isEmpty() ||
            Balance_Amount_Cfield.getText().isEmpty() ||
            Credit_Limitfield.getText().isEmpty() ||
            Grace_Periodfield.getText().isEmpty() ||
            Interest_Ratefield.getText().isEmpty()
           
            ){
                JOptionPane.showMessageDialog(null, "Please fill out all the necessary areas with required information", "Input Error", JOptionPane.ERROR_MESSAGE);
            }else{
                try{
                    int Card_ID = Integer.parseInt(Card_IDfield.getText());
                    int CVC_Number = Integer.parseInt(CVC_Numberfield.getText());
                    int blcAmount = Integer.parseInt(Balance_Amount_Cfield.getText());
                    int Credit_Limit = Integer.parseInt(Credit_Limitfield.getText());
                    int Interest_Rate = Integer.parseInt(Interest_Ratefield.getText());
                    int Grace_Period = Integer.parseInt(Grace_Periodfield.getText());
                   
                   

                    String Bank_Account_C = Bank_Account_Cfield.getText();
                    String Issuer_Bank_C = Issuer_Bank_Cfield.getText();
                    String Client_Name_C = Client_Name_Cfield.getText();
                    String Expiration_Date = Expiration_Dateday.getSelectedItem()+ "" + Expiration_Datemonth .getSelectedItem()+ "" + Expiration_Dateyear.getSelectedItem();
           
           
                   
                    for(Bankcard credCard : araylist){
                        if(credCard instanceof Creditcard){
                            Creditcard cred_obj = (Creditcard) credCard;
                            if(cred_obj.getCard_ID() == Card_ID  )
                            {
                            String DebValues = "Card Id: "+Card_ID+" \nClient Name "+Client_Name_C+" \nIssuer Bank"+Issuer_Bank_C+" \nBank Account"+Bank_Account_C+" \nCVC Number"+cred_obj.getCVC_Number()+"\n balance amount "+blcAmount+ "\n Interest_Rate-"+cred_obj.getInterest_Rate()+"\n Grace Period-"+cred_obj.getGrace_Period()+"\n Credit Limit-"+cred_obj.getCredit_Limit()+"\n Expiration Date"+Expiration_Date;

                            cred_obj.display();
                            JOptionPane.showMessageDialog(null, "Credit Card\n" + DebValues);
                       

                            }
                            else
                            {
                                JOptionPane.showMessageDialog(panel_obj2,"CVC Number and Card ID did not match.","tittle",JOptionPane.WARNING_MESSAGE);
                            }
                   }
                }
            }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Please enter numeric value only in Card Id , Pin Number and Balance Amount, Pin Number and Withdrawal Amount", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if(e.getSource()==clear)
        {
            CVC_Numberfield.setText("");
            Card_IDfield.setText("");
            Client_Name_Cfield.setText("");
            Issuer_Bank_Cfield.setText("");
            Bank_Account_Cfield.setText("");
            Balance_Amount_Cfield.setText("");
            Credit_Limitfield.setText("");
            Interest_Ratefield.setText("");
            Grace_Periodfield.setText("");  
        }
        else if(e.getSource()==clear2)
        {
            Withdrawal_Amountfield.setText("");
            Pin_Numberfield.setText("");
            Card_IDDfield.setText("");
            Client_Name_Dfield.setText("");
            Issuer_Bank_Dfield.setText("");
            Bank_Account_Dfield.setText("");
            Balance_Amount_Dfield.setText("");
        }
        else if(e.getSource()==addDebitcard)
        {
            try{
            double Balance_Amount_C = Double.parseDouble(Balance_Amount_Dfield.getText());
            String Bank_Account_C = Bank_Account_Dfield.getText();
            String Issuer_Bank_C = Issuer_Bank_Dfield.getText();
            String Client_Name_C = Client_Name_Dfield.getText();
            int pin_number = Integer.parseInt(Pin_Numberfield.getText());
            int Card_ID = Integer.parseInt(Card_IDDfield.getText());
           
            boolean match = false;
           
            if(araylist.isEmpty()){
                Debitcard obj = new Debitcard(Card_ID, Issuer_Bank_C, Bank_Account_C, Balance_Amount_C, pin_number, Client_Name_C);
                araylist.add(obj);
                JOptionPane.showMessageDialog(panel_obj2,"Card ID added successfully","tittle",JOptionPane.INFORMATION_MESSAGE);// Card id has been added successfully.  
            }
            else
            {
                for(Bankcard obj: araylist)
                {
                    if(obj instanceof Debitcard)
                    {
                        if(obj.getCard_ID() == Card_ID)
                        {
                        JOptionPane.showMessageDialog(panel_obj2,"Same Card ID can not be added twice","tittle",JOptionPane.WARNING_MESSAGE);// You cannot add the same card Id twice.
                        match = true;
                        break;
                        }
                    }
     
                }
            }
           
            if(match == false){
                Debitcard obj = new Debitcard(Card_ID, Issuer_Bank_C, Bank_Account_C, Balance_Amount_C, pin_number, Client_Name_C);
                araylist.add(obj);
                JOptionPane.showMessageDialog(panel_obj2,"Card ID succesfully added ","tittle",JOptionPane.INFORMATION_MESSAGE);
                // Card id has been added successfully.  
            }
           
        }
        catch(NumberFormatException exception){
                        // The value entered was not correct.
                        JOptionPane.showMessageDialog(panel_obj2,"INVALID VALUE","tittle",JOptionPane.WARNING_MESSAGE);
        }
    }
        else if(e.getSource()==setCredit_Limit)
        {
        if(Card_IDfield.getText().isEmpty() ||
            Grace_Periodfield.getText().isEmpty() ||
            Credit_Limitfield.getText().isEmpty()
            ){
                JOptionPane.showMessageDialog(panel_obj, "Please fill out all the necessary areas with required information to Set the Credit Limit", "Input Error", JOptionPane.ERROR_MESSAGE);
            }else{
                try{
                    int Card_ID = Integer.parseInt(Card_IDfield.getText());
                    int grace_period = Integer.parseInt(Grace_Periodfield.getText());
                    int credit_limit = Integer.parseInt(Credit_Limitfield.getText());

                   

                    for(Bankcard obj : araylist){
                        if(obj instanceof Creditcard)
                        {
                            if(obj.getCard_ID() == Card_ID)
                            {
                                Creditcard creditObject = (Creditcard)obj;
                                String SetCreValues = "Card Id: "+Card_ID+" \nGrace Period: "+grace_period+" \nCredit Limit: "+credit_limit;
                                if(credit_limit <= (creditObject.getBalance_Amount()*2.5))
                                {
                                    creditObject.setCredit_Limit(credit_limit, grace_period);
                                    JOptionPane.showMessageDialog(panel_obj, "Credit Limit set Successfully."+SetCreValues);


                                }
                            }else{
                                JOptionPane.showMessageDialog(panel_obj, "This Card don't exist.");

                            }
                        }
                    }
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(panel_obj, "Please enter numeric value only in Card Id, Balance Amount, Cvc Number, Interest Rate", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
         else if(e.getSource() == withdraw){
            if(Withdrawal_Amountfield.getText().isEmpty() ||
            Pin_Numberfield.getText().isEmpty() ||
            Card_IDDfield.getText().isEmpty()
            ){
                JOptionPane.showMessageDialog(panel_obj2, "Please fill out all the necessary areas with required information to carry out withdrawing transaction", "Input Error", JOptionPane.ERROR_MESSAGE);
            }else{
                try{
                   
                    int Card_ID = Integer.parseInt(Card_IDDfield.getText());
                    System.out.println("The card id is " + Card_ID);
                    int Pin_Number = Integer.parseInt(Pin_Numberfield.getText());
                    System.out.println("The pin number is " + Pin_Number);
                    int WithdrawAmount = Integer.parseInt(Withdrawal_Amountfield.getText());
                    System.out.println("The withdrawal amount is " + WithdrawAmount);

                    String DateOfWithdrawal = Withdrawal_Dateday.getSelectedItem()+ "" + Withdrawal_Datemonth.getSelectedItem()+ "" + Withdrawal_Dateyear.getSelectedItem();

                    String WithdrawValues = "Card Id: "+Card_ID+" \npin Number"+Pin_Number+" \nWithdraw Amount"+WithdrawAmount+"Date Of Withdrawal"+DateOfWithdrawal;

                    for(Bankcard dCard : araylist){
                        if(dCard instanceof Debitcard){
                            Debitcard debit_obj = (Debitcard) dCard ;
                            if(debit_obj.getCard_ID() == Card_ID && debit_obj.getPin_Number() == Pin_Number )
                            {
                                debit_obj.withdraw(WithdrawAmount, DateOfWithdrawal, Pin_Number);
                                System.out.println("The current balance is " + debit_obj.getBalance_Amount());
                                System.out.println("The withdrawal amount is " + debit_obj.getWithdrawal_Amount());
                                System.out.println("The date of withdrawal is " + debit_obj.getDate_of_Withdrawal());
                                System.out.println("Has the customer withdrawn ? " + debit_obj.getHas_Withdrawn());
                               
                                JOptionPane.showMessageDialog(panel_obj2,"Amount has been withdrawn successfully!");
                            }else
                            {
                                JOptionPane.showMessageDialog(panel_obj2,"Please enter correct Card ID. The entered Card doesn't exist");

                            }
                        }
                    }
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(panel_obj2, "Please enter numeric value only in Card Id , Pin Number and Withdrawal Amount", "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else if(e.getSource() == cancelCreditcard)
        {
        if(Issuer_Bank_Cfield.getText().isEmpty() ||
        Card_IDfield.getText().isEmpty() ||
        Client_Name_Cfield.getText().isEmpty() ||
        Bank_Account_Cfield.getText().isEmpty() ||
        Balance_Amount_Cfield.getText().isEmpty() ||
        CVC_Numberfield.getText().isEmpty() ||
        Interest_Ratefield.getText().isEmpty()
        ){
        JOptionPane.showMessageDialog(panel_obj, "Please fill out all the necessary areas with required information", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        try{
       
        int Card_ID = Integer.parseInt(Card_IDfield.getText());

           
           
        for(Bankcard cancelCreditcard : araylist)
        {
        if(cancelCreditcard instanceof Creditcard){
        Creditcard cre_obj = (Creditcard) cancelCreditcard;
        if(cre_obj.getCard_ID() == Card_ID)
        {
        cre_obj.Cancel_Credit_Card();
        JOptionPane.showMessageDialog(panel_obj, "Your Credit Card has been successfully cancelled");

        }
        }
        }
        }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(panel_obj, "Please enter numeric value only in Card Id, Balance Amount, Cvc Number, Interest Rate", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }
}
    public static void main(String[] args){
        new BankGUI();
    }
}
