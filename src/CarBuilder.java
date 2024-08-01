interface Builder{
    Builder id(int id);
    Builder brand(String brand);
    Builder model(String model);
    Builder color(String color);
    ProductEntity build();
}


public class CarBuilder implements Builder{
    int id;
    String brand;
    String model;
    String color;

    public CarBuilder(){}

    public CarBuilder id(int id){
        this.id = id;
        return this;
    }

    public CarBuilder brand(String brand){
        this.brand = brand;
        return this;
    }

    public CarBuilder model(String model){
        this.model = model;
        return this;
    }

    public CarBuilder color(String color){
        this.brand = address;
        return this;
    }

    public Car build(){
        return new Car(this.id, this.model, this.brand, this.color);
    }

    public static void main(String[] args) {
        Car car = new CarBuilder()
                .id(1)
                .name("John Doe")
                .address("123 Main St")
                .build();

        System.out.println("Car ID: " + car.getId());
        System.out.println("Car Brand: " + car.getBrand());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Color: " + car.getColor());
    }
}

interface ProductEntity{

}
class Car implements ProductEntity{
    int id;
    String brand;
    String model;
    String color;

    public Car(int id, String brand, String model, String color){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
}

class Director{
    public static ProductEntity buildLambo(Builder builder){
            return builder
                .id(1)
                .brand("Lamborguini")
                .model("whatever")
                .color("Blue")
                .build();
    }

    public static ProductEntity buildFerrari(Builder builder){
        return builder
                .id(2)
                .brand("Ferrari")
                .model("whatever")
                .color("Red")
                .build();
    }

    public static void main(String[] args) {
        Car car = (Car) Director.buildLambo(new CarBuilder());
        System.out.println(car.getBrand());
    }
}