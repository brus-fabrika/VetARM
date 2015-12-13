package ua.od.fabrika.abrus.domain;

/**
 * Created by Айси on 13.12.15.
 */

public class DoctorType {
    private int id = -1;
    private String name = "";

    public DoctorType() {
    }

    public DoctorType(int id, String name) {
        if(name == null) throw new IllegalArgumentException();
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null) throw new IllegalArgumentException();
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DoctorType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
