public class Bankcard
{
    //attributes in bank card

    private int Card_ID;
    private String Client_Name;
    private String Issuer_Bank;
    private String Bank_Account;
    private double Balance_Amount;
    
    //constructor in bank card

    public Bankcard(double Balance_Amount,int Card_ID, String Bank_Account, String Issuer_Bank)
    {
        this.Balance_Amount=Balance_Amount;
        this.Bank_Account=Bank_Account;
        this.Card_ID=Card_ID;
        this.Issuer_Bank=Issuer_Bank;
        this.Client_Name="";
    }

    //accessor method for bank card (getter method)

    public int getCard_ID()
    {
        return this.Card_ID;
    }
    
    public String getClient_Name()
    {
        return this.Client_Name;
    }
    
    public double getBalance_Amount()
    {
        return this.Balance_Amount;
    }
    
    public String getIssuer_Bank()
    {
        return this.Issuer_Bank;
    }
    
    public String getBank_Account()
    {
        return this.Bank_Account;
    }
    
    // mutator method for bank card (setter method)

    public void setClient_Name(String Client_Name)
    {
        this.Client_Name= Client_Name;
    }
    
    public void setBalance_Amount(double Balance_Amount)
    {
        this.Balance_Amount= Balance_Amount;
    }
    
    // printing client output according to the given details

    public void display() 
    {
        if (Client_Name !="") 
        {
            System.out.println("The Client's name is : " +Client_Name);
            System.out.println("The Card ID assigned for the client is : "+Card_ID); 
            System.out.println(Issuer_Bank+" Is your Issuer Bank");
            System.out.println("The client's Bank Account is : "+Bank_Account);
            System.out.println(Balance_Amount+ " Is your available Balance Amount"); 
        }
        else
        {
            System.out.println("Sorry, Client details not available in registry");
        }
    }
}