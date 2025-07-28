package ArrayandString;

public class StringBufferAndStringBuilder {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
        System.out.println(buffer.capacity());
        buffer.append("World");
        System.out.println(buffer);

        StringBuilder buffer1 = new StringBuilder("Hello");
        System.out.println(buffer.capacity());
        buffer1.append("World");
        System.out.println(buffer1);
    }
}
