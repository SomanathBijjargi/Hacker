class BankAccount{
  private double balance;
  private Customer customer;

  public BankAccount(Customer customer,double initialBalance){
  this.customer=customer;
  this.balance=initialBalance;
}
 public void deposit(double amount){
   balance+=amount;
System.out.println("Deposited Rs: "+amount+"\n");
}
