/*
 * OOPSBannerApp UC5
 * Inline Array Initialization using String.join()
 */

public class OOPSBANNERAPP {

    public static void main(String[] args) {

        String[] lines = {

            String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*     *", "*     "),
            String.join("   ", "*     *", "*     *", "*     *", "*     "),
            String.join("   ", "*     *", "*     *", " ***** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*      ", "     * "),
            String.join("   ", "*     *", "*     *", "*      ", "*     *"),
            String.join("   ", " ***** ", " ***** ", "*      ", " ***** ")

        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}