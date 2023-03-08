

public class Main {
    public static void main(String[] args) {
        int[] a0 = {0,1,1,1,1,0,1,0,1,0,1,1,0,1,1,1,1,1,0,0,1,1,1,1,1,1,0,0,1,1,1,1,1,0,0,0};
        int[] a1 = {0, 0, 0, 0, 0};
        int[] a2 = {0, 0, 0, 1, 1, 1};
        int[] a3 = {0, 0, 1, 1, 1, 0};
        int[] a4 = {0, 1, 0};


        System.out.println(canWin(9, a0));
    }

    public static boolean canWin(int leap, int[] game) {
        return isSolavble(leap, game, 0);
    }

    private static boolean isSolavble(int leap, int[] game, int i) {
        if(i>= game.length){
            return true;
        }
        if(i<0 || game[i]==1){
            return false;
        }
        game[i] = 1;
        return isSolavble(leap, game, i+1) || isSolavble(leap, game, i-1)  || isSolavble(leap, game, i+leap) ;
    }

}