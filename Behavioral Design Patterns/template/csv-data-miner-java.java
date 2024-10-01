package dataminer;

public class CSVDataMiner extends DataMiner {
    @Override
    protected void openFile(String path) {
        System.out.println("Opening CSV file: " + path);
    }

    @Override
    protected void extractData() {
        System.out.println("Extracting data from CSV file");
    }

    @Override
    protected void closeFile() {
        System.out.println("Closing CSV file");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing data from CSV file");
    }
}
