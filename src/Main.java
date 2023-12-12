public class Main {
    public static void main(String[] args) {
        isName("Oleg");
        isName("Vyacheslav");
        isName("Pasha");

        isSeven(4);
        isSeven(9);

        int[] arr = {4, 6, 9, 12, 15};
        multiple3(arr);
    }

    public static void isSeven(int number) {
        if (number > 7) {
            System.out.println("Привет");
        }
    }

    public static void isName(String name) {
        if (name.equals("Vyacheslav")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public static void multiple3(int[] arr) {
        for (int j : arr) {
            if (j % 3 == 0) {
                System.out.print(j + " ");
            }
        }
    }
}
