package Homework5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

// Попробовал сделать, используя BigDecimal.
// Для счета сделал бы отдельный класс - Account, а объект класса CreditCard уже привязал бы к объекту класса Account.
public class CreditCard {

    private String cardNumber;
    // String - не надежно для pinCode =)
    private String pinCode;
    private BigDecimal debitBalance;
    private BigDecimal creditLimit;
    private BigDecimal creditInUse;

    public CreditCard (String cardNumber, String pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.debitBalance = new BigDecimal(0);
        this.creditInUse = new BigDecimal(0);
        this.creditLimit = new BigDecimal(0);
    }


    public BigDecimal getDebitBalance (){
        return debitBalance.setScale(3, BigDecimal.ROUND_HALF_UP);
    }

    public BigDecimal getCreditLimit (){
        return creditLimit.setScale(3, BigDecimal.ROUND_HALF_UP);
    }

    public BigDecimal getCreditInUse (){
        return creditInUse.setScale(3, BigDecimal.ROUND_HALF_UP);
    }

    public BigDecimal getTotalBalance (){
        BigDecimal creditLeft = creditLimit.subtract(getCreditInUse());
        BigDecimal totalBalance = debitBalance.add(creditLeft);
        return totalBalance.setScale(3, BigDecimal.ROUND_HALF_UP);
    }

    public void setCreditLimit (double value) {
        if (value<0) {
            creditLimit = convertToBigDecimal(0);
        }
        else {
            creditLimit = convertToBigDecimal(value);
        }
    }

    public boolean withdraw (double amount, String pin) {
        if (isNotNegative(amount) && isPinValid(pin)) {
            BigDecimal amountInDecimal = convertToBigDecimal(amount);
            if (isEnoughMoney(amountInDecimal) && isDebitBalanceAvailable(amountInDecimal)) {
                reduceFromDebitBalance(amountInDecimal);
                return true;
            } else if (isEnoughMoney(amountInDecimal) && !isDebitBalanceAvailable(amountInDecimal)) {
                BigDecimal creditUsed = amountInDecimal.subtract(getDebitBalance());
                reduceFromDebitBalance(getDebitBalance());
                addToCreditInUse(creditUsed);
                return true;
            }else{
                return false;
            }

        } else {
            return false;
        }

    }
    public boolean toPup (double amount, String pin) {
        if (isPinValid(pin) && isNotNegative(amount)) {
            BigDecimal decimalAmount = convertToBigDecimal(amount);
            if (isCreditInUse() && isAmountBigEnough(decimalAmount)) {
                BigDecimal result = decimalAmount.subtract(getCreditInUse());
                reduceFromCreditInUse(getCreditInUse());
                addToDebitBalance(result);
                return true;
            } else if (isCreditInUse() && !isAmountBigEnough(decimalAmount)) {
                reduceFromCreditInUse(decimalAmount);
                return true;
            } else {
                addToDebitBalance(decimalAmount);
                return true;
            }
        }else {
            return false;
        }

    }

    private void addToDebitBalance (BigDecimal value) { this.debitBalance = this.getDebitBalance().add(value);}

    private void reduceFromDebitBalance (BigDecimal value) {this.debitBalance = this.getDebitBalance().subtract(value);}

    private void addToCreditInUse (BigDecimal value) {
        this.creditInUse = this.getCreditInUse().add(value);}

    private void reduceFromCreditInUse (BigDecimal value) {this.creditInUse = this.getCreditInUse().subtract(value);}

    private BigDecimal convertToBigDecimal (double value) {
        BigDecimal decimalValue = new BigDecimal(value);
        return decimalValue.setScale(3, RoundingMode.HALF_UP);
    }

    private boolean isEnoughMoney(BigDecimal value) {
        BigDecimal result = getTotalBalance().subtract(value);
        int comparision = result.compareTo(convertToBigDecimal(0.000));
        return comparision >= 0;

    }

    private boolean isDebitBalanceAvailable (BigDecimal value) {
        int comparision = getDebitBalance().compareTo(value);
        return comparision >=0;
    }

    private boolean isCreditInUse () {
        int comparision = getCreditInUse().compareTo(convertToBigDecimal(0.000));
        return comparision > 0;
    }
    // Не знаю, стоит ли делать этот метод public - в методе toString всё отображается....
    private String getCardNumber () {
        return cardNumber;
    }

    private boolean isAmountBigEnough(BigDecimal amount) {
        int comparision = amount.compareTo(getCreditInUse());
        return comparision >=0;
    }

    private String getPinCode () {
        return pinCode;
    }

    private boolean isPinValid (String pin) {
        return pinCode.equals(pin);
    }

    private boolean isNotNegative (double value){
        return value >0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return Objects.equals(cardNumber, that.cardNumber) &&
                Objects.equals(pinCode, that.pinCode) &&
                Objects.equals(debitBalance, that.debitBalance) &&
                Objects.equals(creditLimit, that.creditLimit) &&
                Objects.equals(creditInUse, that.creditInUse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, pinCode, debitBalance, creditLimit, creditInUse);
    }

    @Override
    public String toString() {
        return "Info for card number: " + cardNumber + "\n" +
                "Current debit balance: " + getDebitBalance() +'\n' +
                "Current credit limit: " + getCreditLimit() + "\n" +
                "Credit in use: " + getCreditInUse() + "\n";
    }
}
