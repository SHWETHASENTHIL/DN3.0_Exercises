package ProxyPatternExample;

public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // The image will be loaded from the server the first time it's displayed
        image1.display();
        System.out.println("");

        // The image will not be loaded from the server this time
        image1.display();
        System.out.println("");

        // The image will be loaded from the server the first time it's displayed
        image2.display();
        System.out.println("");

        // The image will not be loaded from the server this time
        image2.display();
    }
}


