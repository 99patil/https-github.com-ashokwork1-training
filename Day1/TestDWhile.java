class TestWhile {
    public static void main(String args[]) {
        int i = 100, j = 200;

        //Finding the MidPoint

        while (++i < --j) {
            System.out.println("i is " + i);
            System.out.println("j is " + j);
        }
        
        System.out.println("The midpoint is " + i);
    }
}