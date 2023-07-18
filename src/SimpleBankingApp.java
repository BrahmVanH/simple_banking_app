import java.util.Scanner;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import bank.Bank;

public class SimpleBankingApp {

    public static void main(String args[]) {
        Scanner menu = new Scanner(System.in);
        Bank bank = new Bank("VanH Bank");
        // call loadBank function when created
        int n = -1;
        StringBuffer bankName = new StringBuffer();
        bankName.append("Welcome to the bank of ");
        bankName.append(bank.getName());
        System.out.println(bankName.toString());
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("hh:mm a MMMM d, u")));
        System.out.println();

        while (n != 6) {
            // create displayMenu sequence when displayMenu method created
        }

    }
    static void loadBank(Bank bank) {

    }
}
