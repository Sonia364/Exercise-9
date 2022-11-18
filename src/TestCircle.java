
public class TestCircle {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        circle.setCentre(0, 1);
        System.out.println("Surface area of Circle: " + circle.surface());
        System.out.println("New coordinate point is a part of circle : " + circle.isInternal(3,4));

    }
}
