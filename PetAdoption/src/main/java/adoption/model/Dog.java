package adoption.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Dog implements Animal {

    private String type;
    private String name;
    private String gender;
    private String size;
    private String furColor;

    public static Animal of(String type, String name, String gender, String size, String furColor) {
        return new Dog(type, name, gender, size, furColor);
    }
}
