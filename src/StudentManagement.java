public class StudentManagement {
    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public Student[] students = new Student[100];
    public int  index = 0;
    public void addStudent(Student newStudent) {
        students[index] = newStudent;
        index++;
    }

    public String studentsByGroup() {
        String[] groups = new String[100];
        int groupindex = 1;
        groups[0] = students[0].getGroup();
        for (int i = 1; i < index; i++) {
            boolean has = false;
            for (int j = 0; j < 100; j++) {
                if (students[i].getGroup().equals(groups[j])) {
                    has = true;
                    break;
                }
            }
            if (!has) {
                groups[groupindex] = students[i].getGroup();
                groupindex++;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0 ; i < groupindex; i++) {
            ans.append(groups[i]).append('\n');
            for (int j = 0; j < index; j++) {
                if (students[j].getGroup().equals(groups[i])) {
                    ans.append(students[j].getInfo()).append('\n');
                }
            }
        }
        return ans.toString();
    }

    public void removeStudent(String id) {
        Student[] temp = new Student[100];
        int tempId = 0;
        for (int i = 0; i < index; i++) {
            if (!(students[i].getId().equals(id))) {
                temp[tempId++] = students[i];
            }
            else {
                index--;
            }
        }

        students = temp;
    }
}
