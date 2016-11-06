package davidfoale.info.android_pass_object_to_activity;



import java.io.Serializable;

public class Person implements Serializable{

    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    // getters & setters....

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }


    public void setName(String name) { this.name = name;  }

    public void setAge(int age)      { this.age = age;    }

    public String getName()          { return this.name;  }

    public int getAge()           { return this.age;  }


}
