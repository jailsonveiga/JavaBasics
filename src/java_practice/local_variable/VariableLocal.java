package java_practice.local_variable;

public class VariableLocal {
        public int sum(int n) {
            int sum = 0;
            for(int i = 0; i < n; i++) {
                sum = sum + i;
                /*
                0 = 0 + 0
                0 = 0 + 1
                1 = 1 + 2
                3 = 3 + 3
                6 = 6 + 4
                10 = 10 + 5
                15 = 15 + 6
                21 = 21 + 7
                28 = 28 + 8
                36 = 36 + 9
                45
                */
            }
            return sum;
        }
    }

