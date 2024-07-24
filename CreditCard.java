
/**
 * Write a description of class CreditCard here.
 *
 * @author (22068108 Prashansa Lama)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard
{
    //attributes 
    private int CVCnum;
    private double creditLim;
    private double interestRate;
    private String expDate;
    private int gracePeriod;
    private boolean isGranted;
    
    //constructors
    public CreditCard( int balanceAmt,int cardId, String clientName, String issuerBnk, String bankAcc, int CVCnum, double interestRate, String expDate){
      //call with four parameters
      //calling constructors from class BankCard
      super(balanceAmt,cardId,bankAcc, issuerBnk);
      
      //calling setter from class BankCard
      super.setclientName(clientName);
      
      this.CVCnum = CVCnum;
      this.interestRate = interestRate;
      this.expDate = expDate;
      
      //initialize isGranted as false
      this.isGranted = false;
    }
    
    //accessor
    public int getCVCnum()
    {
        return CVCnum;
    }
    
    public double getcreditLim(){
        return creditLim;
    }
    
    public double getinterestRate(){
       return interestRate; 
    }
    
    public String getexpDate(){
        return expDate;
    }
    
    public int getgracePeriod(){
        return gracePeriod;
    }
    
    public boolean getisGranted(){
        return isGranted;
    }
    
    //setter
    public void setcreditLimit(double creditLimit, int gracePeriod){
        if(creditLim <= 2.5 * (getBalanceAmt())){
            this.creditLim = creditLim;
            this.gracePeriod = gracePeriod;
            this.isGranted = true; 
        }
        else
        {
            System.out.println("Sorry but the credit can not be issued, please check the errors and try again");
        }
    }
    
    //cancelling Credit card
    public void cancelCreditCard(){
        this.CVCnum = 0;
        this.creditLim = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
    }
    
    //to display Client's name
    public void display()
    {
        if(isGranted == true)
        {
            super.display();
            System.out.println("CVC Number:" +CVCnum);
            System.out.println( "Credit Limit:" + creditLim);
            System.out.println("Expiration Date:" +expDate);
            System.out.println("Interest Rate:" +interestRate);
            System.out.println("Grace Period:" + gracePeriod);
        }
        else
        {
            super.display();
            System.out.println("CVC Number:" +CVCnum);
            System.out.println("Interest Rate:" +interestRate);
            System.out.println("Expiration Date:" +expDate);
        }
    }
}
