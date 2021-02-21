public class Overload {
    private static int getTypeSize(long a) {
        return 8;
    }

    private static int getTypeSize(int a) {
        return 4;
    }

    private static int getTypeSize(short a) {
        return 2;
    }

    private static int getTypeSize(byte a) {
        return 1;
    }

    private static int getTypeSize(float a) {
        return 4;
    }

    private static int getTypeSize(double a) {
        return 8;
    }

    public static void main(String[] args) {
        System.out.println("Required number of bytes: " + getTypeSize((byte)127));
        System.out.println("Required number of bytes: " + getTypeSize((short)128));
        System.out.println("Required number of bytes: " + getTypeSize(2147483647));
        System.out.println("Required number of bytes: " + getTypeSize(2147483648L));
        System.out.println("Required number of bytes: " + getTypeSize(12.5f));
        System.out.println("Required number of bytes: " + getTypeSize(12.5d));
    }
}
