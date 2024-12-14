public class Creditcard extends Bankcard
{
    // attributes in credit card

    private int CVC_Number;
    private double Credit_Limit;
    private double Interest_Rate;
    private String Expiration_Date;
    private int Grace_Period;
    private boolean Is_Granted;
    
    public Creditcard(double Balance_Amount, int Card_ID, String Issuer_Bank, String Bank_Account, int CVC_Number, double Intrest_Rate, String Expiration_Date, String Client_Name)
    {
        super(Balance_Amount, Card_ID, Bank_Account, Issuer_Bank);
        this.CVC_Number = CVC_Number;
        this.Expiration_Date=Expiration_Date;
        this.Interest_Rate=Interest_Rate;
        this.setClient_Name(Client_Name);
        this.Is_Granted = false;
    }

    //getter method in credit card
    
    public int getCVC_Number()
    {
        return this.CVC_Number;
    }
        
    public double getCredit_Limit()
    {
        return this.Credit_Limit;
    }
    
    public double getInterest_Rate()
    {
        return this.Interest_Rate;
    }
    
    public int getGrace_Period()
    {
        return this.Grace_Period;
    }
    
    public String getExpiration_Date()
    {
        return this.Expiration_Date;
    }
    
    public boolean getIs_Granted()
    {
        return this.Is_Granted;
    }
    
    // setting credit limit in client's card
    
    public void setCredit_Limit(double Credit_Limit, int Grace_Period)
    {
        if(Credit_Limit <= 2.5*(super.getBalance_Amount()))
        {
            this.Is_Granted = true;
            this.Credit_Limit = Credit_Limit;
            this.Grace_Period = Grace_Period;
        }
        else
        {
            System.out.println("Sorry, transaction couldn't be successful at the moment. Please try again later");
        }
    }
    
    //method to cancel credit card
    
    public void Cancel_Credit_Card()
    {
        this.CVC_Number= 0;
        this.Grace_Period=0;
        this.Credit_Limit=0;
        this.Is_Granted=false;
        System.out.println("Credit card cancelled successfully!");
    }
     
    //display method to display credit card details
    
    public void display()
    {
        if(this.Is_Granted==true)
        {
            super.display();
        }
        else
        {
            this.Credit_Limit=0;
            this.Is_Granted=false;
        } 
    }    
}