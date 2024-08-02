package com.example.bankaccountprogram

fun main()
{
    val jerylsBankAccount = BankAccount("Jeryl Goh", 9370.43);

    jerylsBankAccount.deposit(402.00);
    jerylsBankAccount.withdraw(1200.00);
    jerylsBankAccount.deposit(3000.00);
    jerylsBankAccount.deposit(2000.00);
    jerylsBankAccount.withdraw(4430.00);

    jerylsBankAccount.displayTransactionHistory();
    println("Account Balance: ${jerylsBankAccount.AccountBalance()}");

    val rinsBankAccount = BankAccount("Rin Clairvoyl", 0.0);
    rinsBankAccount.deposit(100.0);
    rinsBankAccount.withdraw(10.0);
    rinsBankAccount.deposit(300.0);

    rinsBankAccount.displayTransactionHistory();
    println("Account Balance: ${rinsBankAccount.AccountBalance()}");
}