package lesson19String3cuhisse;

public enum WeekDay {
    MONDAY("Bazar ertesi"),
    TUESDAY("Cersenbe axsamı"),
    WEDNESDAY("Cersenbe"),
    THURSDAY("Cumə axsamı"),
    FRIDAY("Cumə"),
    SATURDAY("Şənbə"),
    SUNDAY("Bazar");
    private String description;
    private WeekDay(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
