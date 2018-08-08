package Homework5;

import java.math.BigDecimal;

public class CreditCardTests {

    public static void main(String[] args) {
        CreditCardTests tests = new CreditCardTests();
        tests.gettersTest();
        tests.setCreditLimitTest();
        tests.pupToBalanceTest();
        tests.withdrawFromBalanceTest();
        tests.withdrawMoreThanDebit();
        tests.withdrawMoreThanCreditLimit();
        tests.withdrawNegative();
        tests.withdrawMultipleTimes();
        tests.pupWithCreditInUse();
        tests.pupNegative();
        tests.wrongPinCodeTests();

    }

    public void gettersTest() {
        CreditCard card = new CreditCard("555128563412", "2290");
        System.out.println(card);
    }

    public void setCreditLimitTest() {
        CreditCard card = new CreditCard("555128563412", "2290");
        card.setCreditLimit(200);
        int comparision = card.getCreditLimit().compareTo(new BigDecimal(0));
        if (comparision > 0) {
            System.out.println("CREDIT LIMIT SETTER TEST OK!");
        } else {
            System.out.println("CREDIT LIMIT SETTER TEST FAILED!");
        }
        System.out.println(card);
    }

    // Adding to debit balance
    public void pupToBalanceTest() {
        CreditCard card = new CreditCard("555128563412", "2290");
        boolean result = card.toPup(200, "2290");
        if (result) {
            System.out.println("TO PUP TEST 1 SUCCESSFUL");
        } else {
            System.out.println("TO PUP TEST 1 FAILED!");
        }
        System.out.println(card);
    }

    // Simple withdraw test
    public void withdrawFromBalanceTest() {
        CreditCard card = new CreditCard("555128563412", "2290");
        card.setCreditLimit(200);
        card.toPup(200, "2290");
        boolean testResult = card.withdraw(150, "2290");
        if (testResult) {
            System.out.println("WITHDRAW FROM DEBIT BALANCE TEST OK!");

        } else {
            System.out.println("WITHDRAW FROM DEBIT BALANCE TEST FAILED!");
        }
        System.out.println(card);

    }

    // Withdraw more than available on Debit balance - checking getCreditInUse
    public void withdrawMoreThanDebit() {
        CreditCard card = new CreditCard("555128563412", "2290");
        card.setCreditLimit(200);
        card.toPup(200, "2290");
        card.withdraw(300, "2290");
        BigDecimal creditInUse = card.getCreditInUse();
        int comparision = creditInUse.compareTo(new BigDecimal(0.00));
        if (comparision > 0) {
            System.out.println("WITHDRAW TEST 2 - CREDIT IN USE TEST OK!");

        } else {
            System.out.println("WITHDRAW TEST 2 - CREDIT IN USE TEST FAILED!");

        }
        System.out.println(card);
    }

    // Withdraw more than available (credit limit test)
    public void withdrawMoreThanCreditLimit() {
        CreditCard card = new CreditCard("555128563412", "2290");
        card.setCreditLimit(200);
        card.toPup(200, "2290");
        boolean result = card.withdraw(450, "2290");
        if (!result) {
            System.out.println("WITHDRAW TEST 3 - CREDIT LIMIT TEST OK!");

        } else {
            System.out.println("WITHDRAW TEST 3 - - CREDIT LIMIT TEST FAILED!");

        }
        System.out.println(card);
    }

    // Withdraw negative amount
    public void withdrawNegative() {
        CreditCard card = new CreditCard("555128563412", "2290");
        card.setCreditLimit(200);
        card.toPup(200, "2290");
        boolean result = card.withdraw(-300, "2290");
        if (!result) {
            System.out.println("WITHDRAW TEST 4 - NEGATIVE AMOUNT OK!");

        } else {
            System.out.println("WITHDRAW TEST 4 - NEGATIVE AMOUNT FAILED!");

        }
        System.out.println(card);
    }

    // Withdraw several times in one test
    public void withdrawMultipleTimes() {
        CreditCard card = new CreditCard("555128563412", "2290");
        card.setCreditLimit(200);
        card.toPup(200, "2290");
        boolean result1 = card.withdraw(300.15, "2290");
        boolean result2 = card.withdraw(200, "2290");
        boolean result3 = card.withdraw(89.56, "2290");
        boolean result4 = card.withdraw(20, "2290");
        if (result1 && !result2 && result3 && !result4) {
            System.out.println("WITHDRAW TEST 5 - WITHDRAW MULTIPLE TIMES TEST OK!");
        } else {
            System.out.println("WITHDRAW TEST 5 - WITHDRAW MULTIPLE TIMES TEST FAILED!");
        }
        System.out.println(card);

    }

    // Adding using toPup method with credit in use
    public void pupWithCreditInUse () {
        CreditCard card = new CreditCard("555128563412", "2290");
        card.setCreditLimit(200);
        card.toPup(200, "2290");
        card.withdraw(380, "2290");
        BigDecimal creditAfterWithdraw = card.getCreditInUse();
        card.toPup(50, "2290");
        BigDecimal creditAfterPup = card.getCreditInUse();
        int comparision = creditAfterWithdraw.compareTo(creditAfterPup);
        if (comparision>0) {
            System.out.println("toPup TEST 2 - WITH CREDIT IN USE TEST OK!");

        }else {
            System.out.println("toPup TEST 2 - WITH CREDIT IN USE TEST FAILED!");

        }
        System.out.println(card);
    }

    public void pupNegative () {
        CreditCard card = new CreditCard("555128563412", "2290");
        card.setCreditLimit(200);
        boolean result = card.toPup(-200, "2290");
        if (result) {
            System.out.println("toPup TEST 3 - NEGATIVE AMOUNT FAILED!");

        }else {
            System.out.println("toPup TEST 3 - NEGATIVE AMOUNT OK!");
        }

        System.out.println(card);
    }

    public void wrongPinCodeTests() {
        CreditCard card = new CreditCard("555128563412", "2290");
        card.setCreditLimit(200);
        boolean toPopResult = card.toPup(400, "4410");
        boolean withdrawResult = card.withdraw(10, "1100");
        if (toPopResult & withdrawResult) {
            System.out.println("WRONG PINCODE TESTS FAILED!");
        } else {
            System.out.println("WRONG PINCODE TESTS PASSED!");
        }
//        System.out.println(card);

    }
}







