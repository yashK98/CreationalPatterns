package singleton;

public class DbUtil {

    private static DbConnection dbConnectionInstance = null;

    private DbUtil(){}

    public static DbConnection getInstance(){
        if(dbConnectionInstance == null){
            dbConnectionInstance = new DbConnection();
            dbConnectionInstance.setDbName("Oracle");
            dbConnectionInstance.setUrl("oracle_db_url");
            dbConnectionInstance.setPort("4000");
        }
        return dbConnectionInstance;
    }
}
