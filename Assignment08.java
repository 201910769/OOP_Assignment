public class Assignment08 {
    public static void main(String[] args) {
        StudentDB studentDB = new StudentDB();
        Student student = new Student("김지우", 201911111, 4.01);
        studentDB = new StudentDB();
        studentDB.add(student);
        studentDB.add("이민준", 201922222, 3.85);
        studentDB.add("박서윤", 201933333, 3.90);

        System.out.println(studentDB.findby("김지우").toString());
        System.out.println(studentDB.findby(201922222));
        System.out.println(studentDB.findby(3.90));
        System.out.println(studentDB.findby(StudentDB.FindGPAParam.LOWER_THAN, 3.95));
        System.out.println(studentDB.findby(StudentDB.FindGPAParam.HIGHER_THAN, 3.95));
    }
}
