package WorkingWithJDBC;

@SuppressWarnings("FieldCanBeLocal")
public class PSGSQL_User {
    private static final String HOST = "localhost"; // Server name
    private static final String DATABASENAME = "testDB"; // DB name
    private static final String USERNAME = "postgres"; // Username
    private static final String PASSWORD = "P@r1$qLRUS@@@"; // User password

    public static String getHOST() {
        return HOST;
    }

    public static String getDATABASENAME() {
        return DATABASENAME;
    }

    public static String getUSERNAME() {
        return USERNAME;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }
}
