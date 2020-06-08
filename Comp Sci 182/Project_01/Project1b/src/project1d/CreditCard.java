/* Project 1
 * Programmer: Rory Glenn
 * Section #28928
 * Class: Comp Sci 182
 * Prof: Benjamin Riveira
 */
package project1d;

public class CreditCard {
    
    
        private String name;
        private String dueDate;
        private long accountNumber;
        private String rewardPoints;
        private double accountBalance;
        
        
        public CreditCard(){
            
            name = "N/A";
            dueDate = "30 days after initial opening of account";
            accountNumber = 0000000000000000;
            rewardPoints = "0";
            accountBalance = 0.00;
        }
        
        public CreditCard(String userName, String userDueDate, long userAccountNumber,
                String userRewardPoints, double userAccountBalance){
            
                this.name = userName;
                this.dueDate = userDueDate;
                this.accountNumber = userAccountNumber;
                this.rewardPoints = userRewardPoints;
                this.accountBalance = userAccountBalance;
        }
        
        public void setName(String userName){
            this.name = userName;
        }
        
        public String getName(){
            return name;
        }
        
        public void setDueDate(String userDueDate){
            this.dueDate = userDueDate;
        }
        
        public String getDueDate(){
            return dueDate;
        }
        
        public void setAccountNumber(long userAccountNumber){
            this.accountNumber = userAccountNumber;
        }
        
        public long getAccountNumber(){
            return accountNumber;
        }
        
        public void setRewardPoints(String userRewardPoints){
            this.rewardPoints = userRewardPoints;
        }
        
        public String getRewardPoints(){
            return rewardPoints;
        }
        
        public void setAccountBalance(double userAccountBalance){
            this.accountBalance = userAccountBalance;
        }
        
        public double getAccountBalance(){
            return accountBalance;
        }
        
        public static double creditCharge(double a){
            
            double balance = 0.00;
            balance = balance + a;
            
            return balance;
        }
        
        public static double cashAdvance(double x){
            
            double total = 0.00;
            double interest = 0.2599;
            total = total + x * interest;
            
            return total;
        }
        
        public static double payment(double x){
            
            double balance = 0.00;
            balance = balance - x;
            
            return balance;
        }
        
        public static double rewardPoints(double x){
            
            return x;
        }
    
}
