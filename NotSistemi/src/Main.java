public class Main {
    public static void main(String[] args) {
        Course fizik = new Course("Fizik", "101", "FZK", 0,0);
        Course mat = new Course("Matematik", "101", "MAT", 0,0 );
        Course kimya = new Course("Kimya", "101", "KİM", 0,0);



        Teacher t1 = new Teacher("Mahmut Hoca", "222", "KİM");
        Teacher t2 = new Teacher("Ahmet Hoca", "333", "MAT");
        Teacher t3 = new Teacher("Mehmet Hoca", "444", "FZK");

        Student s1 = new Student("İnek Şaban", "123", 4, mat, fizik, kimya, 0,true);
        s1.addBulkExamNote (100, 100, 100);
        s1.addSozluNot(100, 100, 95);
        s1.isPass();

    }
}