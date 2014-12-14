package io.foundationdriven.economy.managers;

import io.foundationdriven.economy.objects.Account;
import io.foundationdriven.economy.objects.Currency;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AccountManager {
    private static List<Account> accounts = new ArrayList<>();
    public static Account getAccount(String name){
        for (Account a : accounts){
            if (a.getName() == name) return a;
        }
        return null;
    }
    public static Account getAccount(UUID uuid){
        for (Account a : accounts){
            if (a.getUuid() == uuid) return a;
        }
        return null;
    }
    public static Account createAccount(String name){
        Account newAccount = new Account(name);
        return newAccount;
    }
    public static List<Account> getAccounts() {
        return accounts;
    }
    public static void purgeCurrency(Currency purge, Currency convertTo){
        for (Account a : accounts){
            if (a.getAmounts().containsKey(purge)){
                Integer convertedTo = ConversionManager.convert(purge, a.getAmount(purge), convertTo);
                a.getAmounts().remove(purge);
                a.give(convertTo, convertedTo);
            }
        }
    }
    public static void purgeCurrency(Currency purge){
        for (Account a : accounts) {
            if (a.getAmounts().containsKey(purge)) {
                a.getAmounts().remove(purge);
            }
        }
    }
}
