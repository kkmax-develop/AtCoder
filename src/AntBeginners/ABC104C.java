package AntBeginners;

import java.util.*;

public class ABC104C {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int d = Integer.parseInt(sc.next());
        int g = Integer.parseInt(sc.next());
        Problem p[] = new Problem[d];
        for (int i = 0; i < d; i++) {
            p[i] = new Problem(Long.parseLong(sc.next()), (i + 1) * 100, Long.parseLong(sc.next()));
        }
        sc.close();
        int min = Integer.MAX_VALUE;
        int count = 0;
        long total = 0;
        int maxBit = -1;
        
        // 全回答してボーナスを得た場合と１問も解かなかったケースを探索
        for (int bit = 0; bit < Math.pow(2, d); bit++) {
            for (int i = 0; i < d; i++) {
                // ビットが立っている場合、該当の問題から得られる特典を足す
                if ((bit >> i & 1) == 1) {
                    total += (p[i].score * p[i].questions) + p[i].bonus;
                    count += p[i].questions;
                } else {
                    maxBit = i;
                }
            }

            // 全回答＋ボーナスで総合スコアを超えた場合は回答数を比較して終了
            if (total >= g) {
                min = Math.min(min, count);

                // 総合スコアを超えていない場合、全回答していない中で最も配点の大きい問題を全回答直前まで解く
            } else {
                for (int i = 1; i < p[maxBit].questions; i++) {
                    total += p[maxBit].score;
                    if (total >= g) {
                        count += i;
                        min = Math.min(min, count);
                    }
                }

            }

            total = 0;
            count = 0;
            maxBit = -1;
        }
        
		System.out.println(min);
	}
}

class Problem {
    long questions;
    long score;
    long bonus;

    Problem(long questions, long score, long bonus) {
        this.questions = questions;
        this.score = score;
        this.bonus = bonus;
    }
}
    
