package dataminer;

public class Client {
    public static void main(String[] args) {
        DataMiner docDataMiner = new DocDataMiner();
        DataMiner csvDataMiner = new CSVDataMiner();
        DataMiner pdfDataMiner = new PDFDataMiner();

        docDataMiner.mine("data.doc");
        csvDataMiner.mine("data.csv");
        pdfDataMiner.mine("data.pdf");
    }
}
