package com.bipin.streams.HandsOn;

    public class Transaction {
        private String date;
        private int amount;

        // Constructor
        public Transaction(String date, int amount) {
            this.date = date;
            this.amount = amount;
        }

        // Getter for date
        public String getDate() {
            return date;
        }

        // Getter for amount
        public int getAmount() {
            return amount;
        }

        // toString method for easy printing
        @Override
        public String toString() {
            return "Transaction{" +
                    "date='" + date + '\'' +
                    ", amount=" + amount +
                    '}';
        }
    }
