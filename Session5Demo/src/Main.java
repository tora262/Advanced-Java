// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String s = "Hello ";
        System.out.println("Độ dài của chuỗi là: " + s.length());
        System.out.println("Ký tự ở vị trí thứ 2 là " + s.charAt(1));
        s = s.concat("Java");
        System.out.println("In hoa: " + s.toUpperCase());
        System.out.println("In thường: " + s.toLowerCase());

        System.out.println(s.isEmpty() ? "Chuỗi này rỗng" : "Chuỗi này không rỗng");
        String input = "   Input    ";
        System.out.println("Sau khi trim: " + input.trim() + ".");
        String s1 = "J123a";
        String s2 = "JAVA";
        String regex = "J[a-z]{2,3}a";

        System.out.println("S1 có khớp với regex hay không? " + s1.matches(regex));
        System.out.println(s1.equals(s2) ? "2 chuỗi giống nhau" : "2 chuỗi khác nhau");
        System.out.println("Nếu không phân biệt hoa thường thì " + (s1.equalsIgnoreCase(s2) ? "2 chuỗi giống nhau" : "2 chuỗi vẫn khác nhau"));

        System.out.println("Kết quả so sánh s1 và s2: " + s1.compareTo(s2));
        System.out.println("Kết quả so sánh s1 và S2 nếu không phân biệt hoa thường: " + s1.compareToIgnoreCase(s2));

        System.out.println("Kiểm tra s có kết thúc bằng s1 hay không? " + s.endsWith(s1));
        System.out.println("Kiểm tra s có chứa s1 hay không? " + s.contains(s1));
        System.out.println("Kiểm tra s có chứa s2 hay không? " + s.toUpperCase().contains(s2.toUpperCase()));

        Main main = new Main();
        System.out.println(main.toString());;

    }
}