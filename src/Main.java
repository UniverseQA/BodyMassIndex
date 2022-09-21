import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 65;
        double height = 1.72;
        double bmi = service.calculate(mass, height);
        System.out.println("Ваш вес " + mass + " кг");
        System.out.println("Ваш рост " + height + " м");
        System.out.println("Индекс массы вашего тела составляет " + bmi);
    }
}
