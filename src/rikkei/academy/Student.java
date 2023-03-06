package rikkei.academy;

public class Student {
    private String name="dat";
    private String classes="mac";

    public Student() {
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getClasses() {
        return classes;
    }

//    public void setClasses(String classes) {
//        this.classes = classes;
//    }


//      void setClasses(String classes) {
//        this.classes = classes;
//      void setName(String name) {
//        this.name = name;
//    }

    protected void setName(String name) {
        this.name = name;
    }
    protected void setClasses(String classes) {
        this.classes = classes;
    }

}

