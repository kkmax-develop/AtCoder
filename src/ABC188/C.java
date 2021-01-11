package ABC188;

import java.util.*;

public class C {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Queue<Player> winner = new ArrayDeque<>();
        for (int i = 0; i < Math.pow(2, n); i++) {
            winner.add(new Player(i + 1, Long.parseLong(sc.next())));
        }
        sc.close();

        Player player1 = null;
        Player player2 = null;
        Player loser = null;
        int ans = 0;
        
        while (winner.size() > 1) {
            for (int i = 0; i < winner.size()/2; i++) {
                player1 = winner.poll();
                player2 = winner.poll();
                if (player1.rate > player2.rate) {
                    winner.add(player1);
                    loser = player2;
                } else {
                    winner.add(player2);
                    loser = player1;
                }

                if (winner.size() == 1) {
                    ans = loser.num;
                }
                
            }
        }

        System.out.println(ans);

    }
}

class Player {
    int num;
    long rate;

    Player(int num, long rate) {
        this.num = num;
        this.rate = rate;
    }
}
