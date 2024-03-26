public class Main {
    public static void main(String[] args) {
        System.out.println(assertEquals(formatName("DOVYDAS"), "Dovydas"));
        System.out.println(assertEquals(formatName("  john"), "John"));
        System.out.println(assertEquals(formatName("$%&maRy"), "Mary"));
    }

    public static String formatName(String name) {

        name = name.trim();
        name = name.replaceAll("[^a-zA-Z ]", "");
        if (name.isEmpty()) {
            return "";
        }

        String[] parts = name.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String part : parts) {
            if (!part.isEmpty()) {
                result.append(part.substring(0, 1).toUpperCase());
                result.append(part.substring(1).toLowerCase());
                result.append(" ");
            }
        }
        // Remove trailing space
        result.setLength(result.length() - 1);
        return result.toString();
    }

    public static boolean assertEquals(String actual, String expected) {
        return actual.equals(expected);
    }

}