public class Main<Boards> {
    public static void main(String[] args) {
        Main myApp = new Main(); //RUN MY PROGRAM CONSTRUCTOR
    }

    int a;
    int b;
    int c;
    int bleh = 0;
    int row;
    int col;
    Main(){
        makeBoards();
    }
    public void makeBoards(){
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for(int k = 0;k < 4;k++) {
                    if(j<=i&&k<=j){
                        System.out.println(i + ", " + j + ", " + k );
                        resultingBoards(i,j,k);
                    }
                }

            }
        }
    }
    public void resultingBoards(int i, int j, int k) {
        System.out.println("***********************************");
        System.out.println("resulting boards");


        if (j <= i && k <= j) {
            resetAbc(i, j, k);
            while (c > 0) {

                c--;
                System.out.println();
                System.out.println(a + ", " + b + ", " + c);
            }
            resetAbc(i, j, k);
            while (b > 0) {
                b--;
                if(b<c) {
                    c=b;
                }
                System.out.println();
                System.out.println(a + ", " + b + ", " + c);


            }
            resetAbc(i, j, k);
            while (a > 1) {
                a--;
                System.out.println();
                if(a<b){
                    b=a;
                }
                if(b<c) {
                    c=b;
                }
                System.out.println(a + ", " + b + ", " + c);
            }

        }

    }
    public void resetAbc(int i, int j, int k){
        a = i;
        b = j;
        c = k;
    }
}

