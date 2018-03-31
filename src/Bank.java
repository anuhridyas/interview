public class Bank {


    /** This is a copy of the code that will be executed.  You may copy and paste it unto your IDE to help you write the answer.

     private static final String TEXT =  "I am a {0} account with {1,number,#} units of {2} currency";

     public static void main(String args[] ) throws Exception {

     List<BankAccount> accounts = new ArrayList<BankAccount>();
     accounts.add(new SavingsAccount("USD",3));//Savings
     accounts.add(new SavingsAccount("EUR",2));//Savings
     accounts.add(new CheckingAccount("HUF",100));//Checking
     accounts.add(new CheckingAccount("COP",10000));//Checking
     accounts.add(new BrokerageAccount("GBP",2));//Brokerage
     accounts.add(new BrokerageAccount("INR",600));//Brokerage

     accounts.stream().forEach(
     account -> System.out.println(
     MessageFormat.format(TEXT,
     new Object[]{
     account.getAccountType().getName(),//make this work
     account.getUnits(),//make this work
     account.getCurrency()//make this work
     })));
     }

     Please create your classes below.  DO NOT USE Access Modifiers for your classes */


    abstract  class  BankAccount{

        private  int accountType;

        private int units ;

        private  String currency ;

            BankAccount(String  currency , int units){
                this.units=units;
                this.currency=currency;

            }


        abstract public AccountType getAccountType();

         public int getUnits(){
             return units;
         }


         public String getCurrency(){
             return currency;
        }
    }



    enum AccountType {

        SAVINGS("Savings"),
        CHECKING("Checking"),
        BROKERAGE("Brokerage");

        private final String name;



        AccountType(String envUrl) {
            this.name = envUrl;
        }

        String getName() {
            return name;
        }

    }

    class SavingsAccount extends BankAccount {


        SavingsAccount(String currency , int units){
          super(currency,units);
        }

        public AccountType getAccountType() {
            return AccountType.SAVINGS;
        }

      /* public int getUnits(){
           return
        }


        public int  getCurrency(){

        }*/



    }



    class CheckingAccount extends BankAccount{

        CheckingAccount(String currency , int units){
        super(currency,units);
        }

        public AccountType getAccountType() {
            return AccountType.CHECKING;
        }

    /*    public AccountType getUnits(){
            return;
        }


        public AccountType getCurrency(){

        }*/


    }


    class BrokerageAccount extends BankAccount{

        BrokerageAccount(String currency , int units){
            super(currency,units);
        }

        public AccountType getAccountType() {
            return AccountType. BROKERAGE;
        }

     /*   public int getUnits(){
           return
        }


        public AccountType getCurrency(){

        }*/


    }







}
