package dataminer;

public class DocDataMiner extends DataMiner {
    @Override
    protected void openFile(String path) {
        System.out.println("Opening DOC file: " + path);
    }

    @Override
    protected void extractData() {
        System.out.println("Extracting data from DOC file");
    }

    @Override
    protected void closeFile() {
        System.out.println("Closing DOC file");
    }

    @Override
    protected void parseData() {
        System.out.println("Parsing data from DOC file");
    }
}
