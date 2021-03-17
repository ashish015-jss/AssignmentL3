package object.oriented.concepts;

/*
A bouquet consists of different types of flowers, Roses, Jasmines, Lilys etc.
Consider a rose costs 1$, jasmine costs 2$, Lily costs 3$. The cost of the bouquet is the sum of the cost
of the flowers in it.  Use the object-oriented approach to design the above situation
and write utility method to calculate the cost of the given bouquet.
*/

class Bouquet {
    private int rose;
    private int jasmines;
    private int lily;

    public Bouquet()
    {
        this.rose=1;
        this.jasmines=2;
        this.lily=3;
    }
    public Bouquet(int rose,int jasmines,int lily)
    {
        this.rose=rose;
        this.jasmines=jasmines;
        this.lily=lily;
    }

    public int costOfBouquet()
    {
        return this.rose+this.jasmines+this.lily;
    }

}

public class Excercise1Program {

    public static void main(String[] arg)
    {
        Bouquet bouquet1=new Bouquet();
        System.out.println("Price of Bouquet : $"+bouquet1.costOfBouquet());

        Bouquet bouquet2=new Bouquet(3,5,8);
        System.out.println("Price of Bouquet : $"+bouquet2.costOfBouquet());
    }

}