import java.util.ArrayList;
import java.util.List;

public class Record{

    private String type;
    private Object value;
    private List<Tupla> id;

    public Record(String type, Object value) {
        this.type = type;
        this.value = value;
        this.id = new ArrayList<>();
    }

    public Record(Record r) {
        this.type = r.getType();
        this.value = r.getValue();
        this.id = new ArrayList<>();
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

