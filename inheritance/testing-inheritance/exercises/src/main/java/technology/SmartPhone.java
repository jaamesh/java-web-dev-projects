package technology;

public class SmartPhone extends Computer {

    private double screenDiagonal = 0;

    public SmartPhone(String color, int memory, String processorType, double screenDiagonal) {
        super(color, memory, processorType);
        this.screenDiagonal = screenDiagonal;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }
}
