package com.example.hp.passingobject;

import java.io.Serializable;

public class Student implements Serializable {


     private String name;
    private  String FatherName;
     private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfatherName() {
        return FatherName;
    }
    public void setFatherName(String fatherName) {
        this.FatherName = fatherName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student {Name:" +  ""  + name + "\n"+ "FatherName:" +""+ FatherName + "\n"+ "ID:"+""+id + "}";


    }
}
