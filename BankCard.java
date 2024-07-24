
/**
 * Write a description of class BankCard here.
 *
 * @author (22068108 Prashansa Lama)
 * @version (1.0.0)
 */
public class BankCard
{
    public int cardId;
    public String clientName;
    public String issuerBnk;
    public String bankAcc;
    public double BalanceAmt;
    
    
    //constructor
    public BankCard (double BalanceAmt, int cardId, String bankAcc,String issuerBnk){
        //att=param
        this.cardId = cardId;
        this.issuerBnk = issuerBnk;
        this.bankAcc = bankAcc;
        this.BalanceAmt = BalanceAmt;
    
        //emp string
        this.clientName = "";
    }
    
    //creating accessor for attribute
    public int getcardId(){
        return this.cardId;
    }
    
    public String getclientName(){
        return this.clientName;
    }
    
    public String getissuerBnk(){
        return this.issuerBnk;
    }
    
    public String getbankAcc(){
        return this.bankAcc;
    }
    
    public double getBalanceAmt(){
        return this.BalanceAmt;
    }
    
    //new methods to set client name and balance amt
    public void setclientName( String clientName){
        this.clientName = clientName;
    }
    
    public void setBalanceAmt(double BalanceAmt){
        this.BalanceAmt = BalanceAmt;
    }
    
    //display
    public void display(){
        if (clientName == "Chuck")
        {
            System.out.println("Client Name:" +clientName);
            System.out.println("Card ID:" +cardId);
            System.out.println("Issuer Bank:" +issuerBnk);
            System.out.println("Bank Account:" +bankAcc);
            System.out.println("Balance Amount:" +BalanceAmt);
           
        }
        else
        {
            System.out.println("Error please try again!");
        }
    }
}
