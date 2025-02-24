package Enums;

public enum Season {
    SPRING("Xuân"),
    SUMMER("Hè"),
    AUTUMN("Thu"),
    WINTER("Đông");

    private String vietnameseName;

    private Season(String vietnameseName) {
        this.vietnameseName = vietnameseName;
    }

    public String getVietnameseName() {
        return vietnameseName;
    }
}
