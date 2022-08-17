public class Main {
    public static void main(String[] args) {
        sapo a1 = new sapo(10,10,10);
        Aranha a2=new Aranha(5,5,5,3);
        Formiga a3 = new Formiga(2,2,2);
        Vegetal v1 = new Vegetal(1);
        Vegetal v2 = new Vegetal(5);
        Vegetal v3 = new Vegetal(10);

        //Algumas possíveis brincadeiras usando essse projeto.
        a2.info();
        a2.atacar(a3);
        //a3.mover();
         a2.info();
        System.out.println(a3.getVivo());
        a2.comer(5);
        a2.info();
        a1.atacar(a2);
        a1.info();
        a2.info();


    }
}
