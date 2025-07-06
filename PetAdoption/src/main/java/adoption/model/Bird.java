package adoption.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Bird implements Animal {
    private String type;
    private String name;
    private String gender;
    private FeatherType featherType;

    public static Animal of(String type, String name, String gender, FeatherType featherType) {
        return new Bird(type, name, gender, featherType);
    }
}
