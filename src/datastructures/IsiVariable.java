package datastructures;

public class IsiVariable extends IsiSymbol {

    public static final int NUMBER=0;
    public static final int TEXT  =1;

    private int type;
    private String value;
    private boolean initialized;

    public IsiVariable(String name, int type, String value, boolean initialized) {
        super(name);
        this.type = type;
        this.value = value;
        this.initialized = initialized;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean getInitialized() {
        return this.initialized;
    }

    public void setInitialized(boolean value) {
        this.initialized = value;
    }

    @Override
    public String toString() {
        return "IsiVariable [name=" + name + ", type=" + type + ", value=" + value + "]";
    }

    public String generateJavaCode() {
        String str;
        if (type == NUMBER) {
            str = "double ";
        }
        else {
            str = "String ";
        }
        return str + " "+super.name+";";
    }



}