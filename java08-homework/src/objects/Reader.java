package objects;

public class Reader extends Person {
    private static int AUTO_READER_CODE = 10000;
    private int readerCode;
    private String readerType;

    public Reader() {
        this.readerCode = AUTO_READER_CODE;
        AUTO_READER_CODE++;
    }
    public Reader(String readerType) {
        this.readerCode = AUTO_READER_CODE;
        AUTO_READER_CODE++;
        this.readerType = readerType;
    }

    public int getReaderCode() {
        return readerCode;
    }
    public String getReaderType() {
        return readerType;
    }

    public void setReaderType(String readerType) {
        this.readerType = readerType;
    }
}
