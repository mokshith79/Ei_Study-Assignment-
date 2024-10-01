package dataminer;

public class PDFDataMiner extends DataMiner {
    @Override
    protected void openFile(String path) {
        System.out.println("Opening PDF file: " + path);
    }

    @Override
    protected void extractData() {
        System.out.println("Extracting data from PDF file");
    }

    @Override
    protected void closeFile() {
        System.out.println("Closing PDF file");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing data from PDF file");
    }
}
