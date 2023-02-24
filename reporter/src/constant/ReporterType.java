package constant;

public enum ReporterType {
    CN("Chuyên nghiệp"),
    ND("Nghiệp dư"),
    CTV("Cộng tác viên");
    protected String value;

    ReporterType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ReporterType{" +
                "value='" + value + '\'' +
                '}';
    }
}
