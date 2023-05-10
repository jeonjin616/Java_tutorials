package Java_tutorials;

public class ForeachDemo {
    public static void main(String[] args) {
        String[] members = {"최진혁", "최유빈", "한이람"};
        for (String E : members
        ) {
            System.out.println(E + "은 상담을 받았습니다.");

        }
    }
}