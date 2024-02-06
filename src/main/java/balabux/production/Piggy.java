package balabux.production;

public class Piggy {
    public static void main(String[] args) {
        String[] input = new String[]{
                "1", "2", "3", "x", "5", "6", "a", "porosiatko", "c", "10", "11", "12", "13", "14", "15", "16"
        };

        System.out.println(input.length);

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            if (isNewRow(input.length, i)) {
                System.out.println(input[i]);

            }

        }
    }

    static boolean isNewRow(int length, int i) {
        if (i==0) return false;
        return length / i == 3;
    }
}
