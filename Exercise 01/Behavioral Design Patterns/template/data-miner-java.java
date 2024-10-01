package dataminer;

public abstract class DataMiner {
    public void mine(String path) {
        openFile(path);
        extractData();
        parseData();
        analyzeData();
        sendReport();
        closeFile();
    }

    protected abstract void openFile(String path);
    protected abstract void extractData();
    protected abstract void parseData();
    protected abstract void closeFile();

    protected void analyzeData() {
        System.out.println("Analyzing data... (Default implementation)");
    }

    protected void sendReport() {
        System.out.println("Sending report... (Default implementation)");
    }
}
