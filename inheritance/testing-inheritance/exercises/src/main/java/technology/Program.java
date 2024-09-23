package technology;

public class Program {

    public static void main(String[] args) {
        Computer computer = new Computer("blue", 16, "AMD");
        SmartPhone smartPhone = new SmartPhone("gray", 8, "Intel", 6.2);
        Laptop laptop = new Laptop("red", 64, "NVidia", "US");

        System.out.println("computer: " + computer.getColor());
        System.out.println("smartPhone: " + smartPhone.getColor());
        System.out.println("laptop: " + laptop.getColor());
    }
}
