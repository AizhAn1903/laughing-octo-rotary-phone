public class Turtle implements Swimable,Layable {
    @Override
    public void lay() {
        System.out.println("я умею яица");

    }

    @Override
    public void swim() {
        System.out.println("Я умею плавать");

    }
}
