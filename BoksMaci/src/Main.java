public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Oguz",50,100,75,100);
        Fighter f2 =new Fighter("Ali",20,100,85,0);

        Match match=new Match(f1,f2,70,90);
        match.run();

    }
}