public interface Animal extends Cloneable {
    Animal clone() throws CloneNotSupportedException;
    void makeSound();
    String getType();
}