package com.company;

public class Main {

    public static void main(String[] args) {
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank("RBC");

        bank.addBranch("Mississauga");
        bank.addCustomer("Mississauga","Jay",100.50);
        bank.addCustomer("Mississauga","Komal",200.50);

        bank.addBranch("Brampton");
        bank.addCustomer("Brampton","Jay",10.40);

        bank.addCustomerTransaction("Mississauga","Jay",20.20);
        bank.addCustomerTransaction("Mississauga","Komal",30.40);

        bank.listCustomers("Mississauga",true);
        bank.listCustomers("Brampton",true);
    }
}
