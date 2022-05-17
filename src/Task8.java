public class Task8 {
    public static void main(String[] args) {

        Integer[] value = new Integer[]{3,4};
        changeValue(value);
        System.out.print("value = [ ");
        for (Integer i : value) {
            System.out.print(i + " ");
        }
        System.out.println("]");

    }

    public static void changeValue(Integer[] value) {
        value[0] = 99;
    }

}