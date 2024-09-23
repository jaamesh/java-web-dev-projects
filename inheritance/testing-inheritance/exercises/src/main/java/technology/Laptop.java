package technology;

public class Laptop extends Computer {

    private String keyboardType = null;

    public Laptop(String color, int memory, String processorType, String keyboardType) {
        super(color, memory, processorType);
        this.keyboardType = keyboardType;
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public void setKeyboardType(String keyboardType) {
        this.keyboardType = keyboardType;
    }
}
