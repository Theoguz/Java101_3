public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name +"ye"+ " " + this.damage + " hasar vurdu.");
        if (foe.isDodge())
        {
            System.out.println(foe.name + " gelen hasarı blokladı.");
            return foe.health;
        }
        return foe.health-this.damage;


    }

    boolean isDodge(){
        double randomNumber = Math.random()*100;
        return randomNumber <= this.dodge;
    }

}
