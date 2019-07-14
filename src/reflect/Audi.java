package reflect;

public class Audi implements Car{
    private String color;

    public Audi() {
        System.out.println("无参构造");
        this.color = "black";
    }

    public Audi(String color) {
        this.color = color;
        System.out.println("有参构造");
    }

    @Override
    public void show(){
        System.out.println("Car color is: "+color);
    }

    @Override
    public void show(String c) {
        System.out.println("Car new color is: "+c);
    }
}
