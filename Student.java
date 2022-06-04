public class Student {
    String name;
    int number;
    double gpa;
    Student(String name, int number, double gpa){
        this.name = name;
        this.number = number;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public int getNumber(){
        return number;
    }
    public double getGpa(){
        return gpa;
    }
    public String toString(){
        return "Name: "+name+" Number: "+number+" GPA: "+gpa;
    }
}

