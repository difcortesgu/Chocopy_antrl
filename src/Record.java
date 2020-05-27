import java.util.ArrayList;

public class Record{

    private String type;
    private Object value;
    private ArrayList<Object> id;

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

    public ArrayList<Object> getTrace() {
        return id;
    }

    public void setTrace(ArrayList<Object> id) {
        this.id = id;
    }

    public void addTrace(Tupla tupla){ this.id.add(tupla); }
}

