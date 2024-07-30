
/**
 * Write a description of class BankCard here.
 *
 * @author (22067498 Aayusha Singh)
 * @version (1.0.0)
 */
public class BankCard
{
  //attribute
  private int cardId;
  private String clientName;    
  private String issuerBank;
  private String bankAccount;
  private double balanceAmount;
  
  //constructor
  public BankCard(double balanceAmount,int cardId,String bankAccount,String issuerBank){
      this.clientName = "";
      this.balanceAmount = balanceAmount;
      this.cardId = cardId;
      this.bankAccount = bankAccount;
      this.issuerBank = issuerBank;
  }
  
  //accessor method for such attribute
  public int getCardId(){
      return this.cardId;
  }
  
  public String getClientName(){
      return this.clientName;
  }
  
  public double getBalanceAmount(){
      return this.balanceAmount;
  }
   
  public String getBankAccount(){
      return this.bankAccount;
  }
  
  public String getIssuerBank(){
      return this.issuerBank;
  }
  
  //mutator method for ClientName and BalanceAmount
  public void setClientName(String clientName){
      this.clientName = clientName;
  }
  
  public void setBalanceAmount(double balanceAmount){
      this.balanceAmount = balanceAmount;
  }
  
  //display method
  public void display(){
      System.out.println("Your Card:" + cardId);
      System.out.println("Balance Amount:" + balanceAmount);
      System.out.println("Bank Account:" + bankAccount);
      System.out.println("Issuer Bank:" + issuerBank);
      //check if the client Name is empty or not
      if(clientName == ""){
          System.out.println("Client Name is not inserted");
      }
      else{
          System.out.println("Client Name:" + clientName);
      }
  }
}
