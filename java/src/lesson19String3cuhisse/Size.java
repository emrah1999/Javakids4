package lesson19String3cuhisse;

public enum Size {
    SMALL("Kicik"), MEDIUM("Orta"), LARGE("Yeke"),EXTRA_LARGE("Lap yeke");
    private   String description;
    private Size(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
