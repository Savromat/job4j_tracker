package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                result = index;
                break;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return result;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        boolean result = false;
        for (int index = 0; index < abuses.length; index++) {
            if (abuses[index].equals(value)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (ElementAbuseException ea) {
            ea.printStackTrace();
        } catch (ElementNotFoundException en) {
            en.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[] {"Ivan", "Petr", "Irina"}, "Olga");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
