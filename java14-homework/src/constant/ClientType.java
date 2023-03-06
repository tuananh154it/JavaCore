package constant;

public enum ClientType {
    CN("Cá nhân"),
    TT("Tập thể"),
    DN("Doanh nghiệp");
    private String value;

    ClientType(String value) {
        this.value = value;
    }
}
