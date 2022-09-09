public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("A", "s","s");
        Student s3 = new Student(s2);
        s3.setGroup("K62");
        //System.out.println(s2.getInfo());
        StudentManagement manage = new StudentManagement();
        manage.addStudent(s1);
        manage.addStudent(s2);
        manage.addStudent(s3);
        if (StudentManagement.sameGroup(s1,s2)) System.out.println(true);
        System.out.println(manage.studentsByGroup());

    }
}
