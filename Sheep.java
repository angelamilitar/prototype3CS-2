public class Sheep implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep(String name) {
        this.legs = 4;
        this.sound = "Baa";
        this.food = "Grass";
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public Sheep clone() {
        try {
            return (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Baa!");
    }

    @Override
    public String getType() { return "Sheep"; }
}