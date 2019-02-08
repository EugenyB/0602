public class Pizza {
    private int diameter; // required
    private String type;  // required
    private int myaso;
    private int syr;
    private int olives;
    private int tomatoes;

    public static class PizzaBuilder {
        private int diameter; // required
        private String type;  // required
        private int myaso;
        private int syr;
        private int olives;
        private int tomatoes;

        public PizzaBuilder(int diameter, String type) {
            this.diameter = diameter;
            this.type = type;
        }

        public Pizza build() {
            Pizza pizza = new Pizza(this);
            return pizza;
        }

        public PizzaBuilder myaso(int m) {
            this.myaso += m;
            return this;
        }

        public PizzaBuilder syr(int s) {
            this.syr += s;
            return this;
        }

        public PizzaBuilder olives(int o) {
            this.olives += o;
            return this;
        }

        public PizzaBuilder tomatoes(int t) {
            this.tomatoes += t;
            return this;
        }
    }

    private Pizza(PizzaBuilder builder) {
        this.type = builder.type;
        this.diameter = builder.diameter;
        this.tomatoes = builder.tomatoes;
        this.olives = builder.olives;
        this.syr = builder.syr;
        this.myaso = builder.myaso;
    }

    public int getDiameter() {
        return diameter;
    }

    public String getType() {
        return type;
    }

    public int getMyaso() {
        return myaso;
    }

    public int getSyr() {
        return syr;
    }

    public int getOlives() {
        return olives;
    }

    public int getTomatoes() {
        return tomatoes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pizza:")
                .append(" diameter=").append(diameter)
                .append(" type=").append(type);
        if (myaso!=0) {
            sb.append(" myaso=").append(myaso);
        }
        if (syr!=0) {
            sb.append(" syr=").append(syr);
        }
        if (olives!=0) {
            sb.append(" olives=").append(olives);
        }
        if (tomatoes!=0) {
            sb.append(" tomatoes=").append(tomatoes);
        }
        return sb.toString();
    }
}
