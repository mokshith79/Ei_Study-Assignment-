package Adapter;

public class MongoDBSQLAdapter implements Database {
    private AppDatabase appDatabase;

    public MongoDBSQLAdapter(AppDatabase appDatabase) {
        this.appDatabase = appDatabase;
    }

    @Override
    public void connect(String databaseName) {
        appDatabase.connect(databaseName);
    }

    @Override
    public void executeQuery(String query) {
        String mongoQuery = translateSQLToMongoQuery(query);
        appDatabase.executeQuery(mongoQuery);
    }

    private String translateSQLToMongoQuery(String sqlQuery) {
        if (sqlQuery.startsWith("SELECT")) {
            return "db.collection.find()";
        }
        return sqlQuery;
    }
}
