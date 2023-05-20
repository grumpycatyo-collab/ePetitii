package func;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String value;
    private String label;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Category(String value, String label) {
        this.value = value;
        this.label = label;
    }
}
