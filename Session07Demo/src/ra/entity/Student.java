package ra.entity;

public class Student {
    private static Student student = new Student();
    protected String studentName;
    public static String uniform;

    private Mark mark;

    public Student() {
    }

    public Student(String studentName, Mark mark) {
        this.studentName = studentName;
        this.mark = mark;
    }

    public static Student getStudent() {
        return student;
    }

    static {
        uniform = "Vest";
        staticMethod();
    }

    public void disPlayData() {
        String data = "Student{" +
                "studentName='" + studentName + '\'' +
                '}';
        System.out.println(data);
    }

    public static void staticMethod() {
        System.out.println("Đây là method tĩnh");
    }

    public String getStudentName() {
        return this.studentName;
    }

    public static class Mark {
        private String subjectName;
        private String score;

        public Mark(String subjectName, String score) {
            this.subjectName = subjectName;
            this.score = score;
        }
    }


}
