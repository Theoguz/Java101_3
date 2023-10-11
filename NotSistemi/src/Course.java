public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozlunot;

    public Course(String name, String code, String prefix, int note, int sozlunot) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozlunot = 0;


    }

    public void addTeacher(Teacher t) {
        if (Course.this.prefix.equals(t.branch)) {
            Course.this.courseTeacher = t;
            System.out.println("Öğretmen eklendi");
            printTeacher();
        } else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor");
        }

    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}