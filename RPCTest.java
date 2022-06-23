 private static JsonRpcHttpClient rpcHttpClient;

    public static void main(String[] args) throws Throwable {
        // 创建JsonRpcHttpClient
        rpcHttpClient = new JsonRpcHttpClient(new URL("http://localhost:4000/jsonrpc"));
        CheckLineBackup lineBackup = new CheckLineBackup();
        lineBackup.setStorePath("/");
        lineBackup.setAccount("root");
        lineBackup.setPassword("Ruijie@@2017");
        lineBackup.setStoreServerAddr("192.168.100.224");
        String checkSftp = rpcHttpClient.invoke("CheckSftp", lineBackup, String.class);
        System.out.println(checkSftp);
    }
