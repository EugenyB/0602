import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	    new Main().run();
    }

    private void run() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1==s2);

        Pizza p1 = new Pizza.PizzaBuilder(30, "Italiano")
                .olives(3)
                .myaso(10)
                .build();
        int d = 30;
        Pizza p2 = new Pizza.PizzaBuilder(d, "Americano")
                .syr(5)
                .myaso(7)
                .olives(11)
                .tomatoes(10)
                .syr(7)
                .build();
        System.out.println(p1);
        System.out.println(p2);

        LocalDate date = LocalDate.now().plusDays(2).plusDays(3).plusMonths(1).plusWeeks(3);
        System.out.println(date);

        State s = new Add();
        int r1 = s.op(2, 3);
        s = new Mult();
        int r2 = s.op(2,3);
        s = new Sub();
        int r3 = s.op(2,3);
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        State8 s8 = State8.Add;
        int r4 = s8.op(2, 3);
    }
}
