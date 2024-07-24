
/**
 * Write a description of class DebitCard here.
 *
 * @author (22068108 Prashansa Lama)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard
{
    //attributes
    private int pinNum;
    private double withdrawalAmt;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    
    //create constructor
    
    //accept 6 parameter
    public DebitCard(int cardId, String issuerBnk, String clientName, String bankAcc, double BalanceAmt, int pinNum){
       //super in same order as parent constructor
       super(BalanceAmt,cardId,issuerBnk,bankAcc);
        //att=param
       super.setclientName(clientName);//used instead of this
       
       //attribute=param
       this.pinNum = pinNum;
       
       //assigning attri
       this.hasWithdrawn = false;
       
    }
       //setter/mutator
       public void setwithdrawalAmt(int withdrawalAmt){
        this.withdrawalAmt = withdrawalAmt;
    }
    
    //accessor
    public int getpinNum(){
        return this.pinNum;
    }
    
    public double getwithdrawalAmt(){
        return this.withdrawalAmt;
    }
    
    public String getdateOfWithdrawal(){
        return this.dateOfWithdrawal;
    }

    
    //withdraw method, withdraws money from client acc directly   
    public void withDraw( double withdrawalAmt, String dateOfWithdrawal, int pinNum){
        //check for valid pin and sufficient balance
        //set hasWithdrawal to true
        //deduct the withdarwal amt
        if (pinNum == this.pinNum && withdrawalAmt <= getBalanceAmt()){
         this.hasWithdrawn = true;
         this.withdrawalAmt = withdrawalAmt;
         this.dateOfWithdrawal = dateOfWithdrawal;
         double balanceamt = getBalanceAmt() - this.withdrawalAmt;
         setBalanceAmt(balanceamt);
         System.out.println("Balance Remaining:" +BalanceAmt);
        }
        else{
            System.out.println("You don't have enough balance for this transaction"); 
        }
    }
}
