package ABC184;

import java.util.*;

public class C {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        long r1 = sc.nextLong();
        long c1 = sc.nextLong();
        long r2 = sc.nextLong();
        long c2 = sc.nextLong();
        sc.close();

        Deque<XY> deque = new ArrayDeque<>();

        long a = r1;
        long b = c1;
        long depth = 0;

        while (true) {
            depth += 1;
            if (r1 < r2) {
                for (long i = r1; i <= r2; i++) {
                    if (c1 < c2) {
                        for (long j = c1; j <= c2; j++) {
                            if ((a + b) == (i + j) || (a - b) == (i - j) || Math.abs(a - i) + Math.abs(b - j) <= 3) {
                                if (i == r2 && j == c2) {
                                    System.out.println(depth);
                                    return;
                                }
                                deque.add(new XY(i, j, depth));
                            }
                        }
                    } else {
                        for (long j = c1; j >= c2; j--) {
                            if ((a + b) == (i + j) || (a - b) == (i - j) || Math.abs(a - i) + Math.abs(b - j) <= 3) {
                                if (i == r2 && j == c2) {
                                    System.out.println(depth);
                                    return;
                                }
                                deque.add(new XY(i, j, depth));
                            }
                        }
                    }

                }
            } else {
                for (long i = r1; i <= r2; i++) {
                    if (c1 < c2) {
                        for (long j = c1; j <= c2; j++) {
                            if ((a + b) == (i + j) || (a - b) == (i - j) || Math.abs(a - i) + Math.abs(b - j) <= 3) {
                                if (i == r2 && j == c2) {
                                    System.out.println(depth);
                                    return;
                                }
                                deque.add(new XY(i, j, depth));
                            }
                        }
                    } else {
                        for (long j = c1; j >= c2; j--) {
                            if ((a + b) == (i + j) || (a - b) == (i - j) || Math.abs(a - i) + Math.abs(b - j) <= 3) {
                                if (i == r2 && j == c2) {
                                    System.out.println(depth);
                                    return;
                                }
                                deque.add(new XY(i, j, depth));
                            }
                        }
                    }

                }

            }

            XY xy = deque.poll();
            r1 = xy.x;
            c1 = xy.y;
            depth = xy.depth;

        }

    }
    
    public static class XY {
        long y;
        long x;
    
        long depth;
    
        XY(long y, long x, long d) {
            this.x = x;
            this.y = y;
            depth = d;
        }
    }
}
