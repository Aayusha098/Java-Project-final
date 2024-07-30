
/**
 * Write a description of class DebitCard here.
 *
 * @author (22067498 Aayusha Singh)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard
{
  //attributes
  private int pinNumber;
  private int withdrawalAmount;
  private String dateOfWithdrawal;
  private boolean hasWithdrawn;
  
  //constructor
  public DebitCard(double balanceAmount,int cardId,String bankAccount,String issuerBank,String clientName,int pinNumber){
      super(balanceAmount,cardId,bankAccount,issuerBank);
      super.setClientName(clientName);
      this.pinNumber = pinNumber;
      this.hasWithdrawn = false;
      
  }
   
  //getter or accessor for pin number
  public int getPinNumber(){
      return this.pinNumber;
  }
  
  //getter or accessor for withdrawal amount
  public int getWithdrawalAmount(){
      return this.withdrawalAmount;
  }
  
  //getter or accessor for date of withdrawal
  public String getDateOfWithdrawal(){
      return this.dateOfWithdrawal;
  }
  
  //getter or accessor for has withdrawn
  public boolean getHasWithdrawn(){
      return this.hasWithdrawn;
  }
  
  // setter or mutator for withdrawal amount
  public void setWithdrawalAmount(int withdrawalAmount){
      this.withdrawalAmount = withdrawalAmount;
  }

  //creating a method for withdraw
  public void withdraw(int withdrawalAmount,String dateOfWithdrawal,int pinNumber){
      //check if the pin Number is same or not
      if(pinNumber == this.pinNumber){
          if (withdrawalAmount<=super.getBalanceAmount()){
              //deduct the withdrawal amount is less or equal to balance Amount
              double newbalanceAmount = super.getBalanceAmount()- withdrawalAmount;
              //set new balance Amount in super class
              super.setBalanceAmount(newbalanceAmount);
              this.hasWithdrawn = true;
              this.withdrawalAmount = withdrawalAmount;
              this.dateOfWithdrawal = dateOfWithdrawal;
              System.out.println("Transaction successful,Remaining Amount:" + super.getBalanceAmount());
          }else{
              System.out.println("You do not have Sufficient Balance");
          }
      } else{
          System.out.println("Invalid pin Number");
      }
  }
    
  //display method    
  public void display(){
      //display the super class
      super.display();
      System.out.println("Pin Number: " + this.pinNumber);
       //check if the transaction was succesful or not
      if(hasWithdrawn == true){
          System.out.println("Withdrawal Amount: " + this.withdrawalAmount);
          System.out.println("Date of withdrawn: " + this.dateOfWithdrawal);
      }
    
      else{
          System.out.println("Transaction has not been carried out yet ,Balance Amount:" + super.getBalanceAmount()); 
      }
   }
}