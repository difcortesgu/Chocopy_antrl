import java.util.List;

public class Record {

    private String type;
    private Object value;
    private List<Tupla> id;

    public Record(String type, Object value) {
        this.type = type;
        this.value = value;
    }

    public Record(String type, Object value, List<Tupla> id) {
        this.type = type;
        this.value = value;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public List<Tupla> getTrace() {
        return id;
    }

    public void setTrace(List<Tupla> id) {
        this.id = id;
    }

    public void addTrace(Tupla tupla){ this.id.add(tupla); }
}

