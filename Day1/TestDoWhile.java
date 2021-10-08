class TestDoWhile {
    public static void main(String args[]) {
        int i;
        i = 0;
        do
            i++;
        while (1 / i < 0.001);
        System.out.println("i is " + i);
    }

}