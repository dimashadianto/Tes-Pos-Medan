public class Main {
    public static void main(String[] args) {
        System.out.println("===== Number 1 =====");
        System.out.println(CountLetters.countLetters("We Always Mekar"));
        System.out.println(CountLetters.countLetters("Coding Is Fun"));

        System.out.println("\n===== Number 2 =====");
        String[] input1 = {"Abc", "bCd"};
        String[] input2 = {"Oke", "One"};
        String[] input3 = {"Pendanaan", "Terproteksi", "Untuk", "Dampak", "Berarti"};
        System.out.println(SortAndGroup.sortAndGroup(input1));
        System.out.println(SortAndGroup.sortAndGroup(input2));
        System.out.println(SortAndGroup.sortAndGroup(input3));
    }
}