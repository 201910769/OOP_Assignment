public class StudentDB {
    Student[] students;
    enum FindGPAParam{LOWER_THAN, HIGHER_THAN}
    int count = 0;
    StudentDB(){
        students = new Student[3];
    }
    void add(Student s){
        Student student1 = new Student(s.name, s.number, s.gpa);
        students[count] = student1;
        count++;
    }
    void add(String name, int num, double gpa){
        Student student1 = new Student(name, num, gpa);
        students[count] = student1;
        count++;
    }
    Student findby(String name){
        for(int i=0; i<3; i++){
            if(name.equals(students[i].getName())){
                return students[i];
            }
        }
        return null;
    }
    Student findby(int number){
        for(int i=0;i<3;i++){
            if(number == students[i].getNumber()){
                return students[i];
            }
        }
        return null;
    }
    Student findby(double gpa){
        for(int i=0;i<3;i++){
            if(gpa == students[i].getGpa()){
                return students[i];
            }
        }
        return null;
    }
    Student findby(FindGPAParam param, double gpa){
        if(param==FindGPAParam.LOWER_THAN){
            for(int i=0; i<3;i++){
                if(gpa>students[i].gpa){
                    return students[i];
                }
            }
        }else if(param==FindGPAParam.HIGHER_THAN){
            for(int i=0; i<3; i++){
                if(gpa<students[i].gpa){
                    return students[i];
                }
            }
        }
        return null;
    }
}
