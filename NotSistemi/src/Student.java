public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    int sozlunot;

    public Student(String name, String stuNo, int classes, Course mat, Course fizik, Course kimya, double avarage, boolean isPass) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.avarage = avarage;
        this.isPass = isPass;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void calcAvarage() {
        this.avarage = ((((this.fizik.note * 0.8) + (this.sozlunot * 0.2))
                + ((this.kimya.note * 0.8) + (this.sozlunot * 0.2)) +
                ((this.mat.note * 0.8) + (this.sozlunot * 0.2))) / 3);
    }

    public void isPass() {

        this.isPass = isCheckPass();
        printNote();
        if (isCheckPass()) {
            System.out.println("Sınıfı Geçti");
        } else {
            System.out.println("Sınıfta Kaldı");
        }

    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }


    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Ortalama : " + this.avarage);
    }

    public void addSozluNot(int i, int i1, int i2) {

        this.sozlunot = i ;
        this.sozlunot = i1 ;
        this.sozlunot = i2 ;
    }
}