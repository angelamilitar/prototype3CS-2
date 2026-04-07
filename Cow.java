public class Cow implements Animal {
    private int legs;
    private String sound;
    private String food;

    public Cow() {
        this.legs = 4;
        this.sound = "Moo";
        this.food = "Hay";
    }

    public String getSound() { return sound; }
    public void setSound(String sound) { this.sound = sound; }

    @Override
    public Cow clone() {
        try {
            return (Cow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void makeSound() {
        System.out.println("Cow says: " + sound);
    }

    @Override
    public String getType() { return "Cow"; }
}