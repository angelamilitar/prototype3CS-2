public class AnimalRegistry {
    private Animal sheepPrototype;
    private Animal cowPrototype;
    private Animal horsePrototype;

    public AnimalRegistry() {
        this.sheepPrototype = new Sheep("Default");
        this.cowPrototype   = new Cow();
        this.horsePrototype = new Horse("Brown");
    }

    public Animal createSheep() {
        try {
            return sheepPrototype.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animal createCow() {
        try {
            return cowPrototype.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animal createHorse() {
        try {
            return horsePrototype.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}