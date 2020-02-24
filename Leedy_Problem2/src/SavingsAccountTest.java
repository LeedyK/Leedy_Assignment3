public static void main(String[] args){

        saver1=new SavingsAccount(2000.00);
        saver2=new SavingsAccount(3000.00);

        annualInterestRate = 0.04;
        System.out.println("Your initial account of 2000.00 is now" saver1 + saver1*annualInterestRate/12);
        System.out.println("Your initial account of 3000.00 is now" saver2 + saver2*annualIntesrestRate/12);

        annualInterestRateNew = 0.05;
        System.out.println("Your initial account of 2000.00 is now" saver1 + saver1*annualInterestRateNew/12);
        System.out.println("Your initial account of 3000.00 is now" saver2 + saver2*annualIntesrestRateNew/12);


        }