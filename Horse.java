public class Horse implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String color;

    public Horse(String color) {
        this.legs = 4;
        this.sound = "Neigh";
        this.food = "Oats";
        this.color = color;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public Horse clone() {
        try {
            return (Horse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void makeSound() {
        System.out.println(color + " horse says: Neigh!");
    }

    @Override
    public String getType() { return "Horse"; }
}