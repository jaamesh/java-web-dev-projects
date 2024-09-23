package technology;

public class Computer {
    private String color = null;
    private int memory = 0;
    private String processorType = null;

    public Computer(String color, int memory, String processorType) {
        this.color = color;
        this.memory = memory;
        this.processorType = processorType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }
}
