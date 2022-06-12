public class Assign {
    public static void main(String[] args) {
        int[] original = {1,2,3,4};
        int[] backup;

        backup = java.util.Arrays.copyOfRange(original, 0, original.length);

        System.out.println(java.util.Arrays.toString(backup));

    }
}
