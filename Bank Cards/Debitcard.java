public class Debitcard extends Bankcard
{   
    // attributes in debit card

    private int Pin_Number;
    private int Withdrawal_Amount;
    private String Date_of_Withdrawal;
    private boolean Has_Withdrawn;
    
    //constructor in debit card
    
    public Debitcard(int Card_ID, String Issuer_Bank, String Bank_Account, double Balance_Amount, int Pin_Number, String Client_Name)
    {
        super(Balance_Amount, Card_ID, Bank_Account, Issuer_Bank);
        super.setClient_Name(Client_Name);
        this.Pin_Number = Pin_Number;
        Has_Withdrawn= false;
    } 
    
    // accessor method for debit card (getter method)
    
    public int getPin_Number()
    {
        return this.Pin_Number;
    }
    
    public int getWithdrawal_Amount()
    {
        return this.Withdrawal_Amount;
    }
    
    public String getDate_of_Withdrawal()
    {
        return this.Date_of_Withdrawal;
    }
    
    public boolean getHas_Withdrawn()
    {
        return this.Has_Withdrawn;
    }
    
    // mutator method for debit card (setter method)
    
    public void setWithdrawal_Amount(int Withdrawal_Amount)
    {
        this.Withdrawal_Amount = Withdrawal_Amount;
    }
        
    // using nested if loop for debit transaction
    
    public void withdraw(int Withdrawal_Amount, String Date_of_Withdrawal, int Pin_Number)
    {
        if (Pin_Number == this.Pin_Number)
        {
            if(Withdrawal_Amount <= getBalance_Amount())
                            
            {
                setBalance_Amount(getBalance_Amount() - Withdrawal_Amount);
                this.Withdrawal_Amount=Withdrawal_Amount;
                this.Date_of_Withdrawal=Date_of_Withdrawal;
                Has_Withdrawn= true;
                System.out.println("Successful Transaction");
            }
                
            else
            {
                System.out.println("Insufficient Balance");
            }
        }      
    }
    
    // displaying the client's debit card details 
    
    public void display()
    {
        super.display(); 
        System.out.println("Your Pin Number is: " + Pin_Number);
        
        if(Has_Withdrawn)
        {
           System.out.println(Withdrawal_Amount + " Has been withdrawn from your account");
           System.out.println(Date_of_Withdrawal + " Was the date of withdrawl from your account");
        } 
        else
        {
           System.out.println(getBalance_Amount()+ " Is your available balance" );
        }
    } 
}