package com.example.rpcclitestserver.entity;

public class CheckLineBackup {

    private String storeServerAddr;

    private String storePath;

    private String account;

    private String password;

    @Override
    public String toString() {
        return "main.CheckLineBackup{" +
                "storeServerAddr='" + storeServerAddr + '\'' +
                ", storePath='" + storePath + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getStoreServerAddr() {
        return storeServerAddr;
    }

    public void setStoreServerAddr(String storeServerAddr) {
        this.storeServerAddr = storeServerAddr;
    }

    public String getStorePath() {
        return storePath;
    }

    public void setStorePath(String storePath) {
        this.storePath = storePath;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CheckLineBackup() {
    }

    public CheckLineBackup(String storeServerAddr, String storePath, String account, String password) {
        this.storeServerAddr = storeServerAddr;
        this.storePath = storePath;
        this.account = account;
        this.password = password;
    }
}
