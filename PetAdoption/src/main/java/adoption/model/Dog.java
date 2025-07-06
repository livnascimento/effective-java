package adoption.model;

public class Dog implements Animal {

    private String name;
    private String breed;
    private String age;
    private String size;
    @Override
    public String getName() { return this.name; }
    @Override
    public String getBreed() {  return this.breed; }
    @Override
    public String getAge() { return this.age; }
}
