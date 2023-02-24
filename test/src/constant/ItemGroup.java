package constant;

public enum ItemGroup {
    DT("Điện tử"),
    DL("Điện Lạnh"),
    MT("Máy tính"),
    TBVP("Thiết Bị Văn Phòng");
    private String value;

    ItemGroup(String value) {
        this.value = value;
    }
}
