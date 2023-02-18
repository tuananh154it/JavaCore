package constants;

public enum ReaderType {
    STUDENT("Sinh viên"),
    GRADUATE_STUDENT("Học viên cao học"),
    TEACHER("Giảng viên");
    private String readerType;

    ReaderType(String readerType) {
        this.readerType = readerType;
    }
}
