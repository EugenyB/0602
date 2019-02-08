public interface State8 {
    int op(int a, int b);

    State8 Add = (a,b)->a+b;
    State8 Sub = (a,b)->a-b;
    State8 Mult = (a,b)->a*b;
}
