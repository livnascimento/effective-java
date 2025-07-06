package adoption.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Cat implements Animal{

    private String type;
    private String name;
    private String gender;
    private String furColor;
    private String furType;

    public static Animal of(String type, String name, String gender, String furColor, String furType) {
        return new Cat(type, name, gender, furColor, furType);
    }
}
