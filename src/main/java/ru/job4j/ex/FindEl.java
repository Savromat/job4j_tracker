package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                result = index;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[] {"Ivan", "Petr", "Irina"}, "Olga");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
