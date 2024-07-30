public class Builder {
    int id;
    String name;
    String address;

    public Builder(){}

    public Builder id(int id){
        this.id = id;
        return this;
    }

    public Builder name(String name){
        this.name = name;
        return this;
    }

    public Builder address(String address){
        this.address = address;
        return this;
    }

    public Entity build(){
        return new Entity(this.id, this.name, this.address);
    }

    public static void main(String[] args) {
        Entity entity = new Builder()
                .id(1)
                .name("John Doe")
                .address("123 Main St")
                .build();

        System.out.println("Entity ID: " + entity.getId());
        System.out.println("Entity Name: " + entity.getName());
        System.out.println("Entity Address: " + entity.getAddress());
    }
}


class Entity {
    int id;
    String name;
    String address;

    public Entity(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}