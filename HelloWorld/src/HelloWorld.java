import javax.swing.*;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nhap tu ban phim
        System.out.println("Hay nhap vao can nang cua ban");
        int weight = scanner.nextInt();

        // tach cac hang tram, hang chuc, hang don vi
        int hundred = weight / 100;
        int rawDec = weight % 100;
        int dec = rawDec / 10;
        int i = weight % 10;
        String hunderdStr = "";
        // xu ly doc hang tram
        switch (hundred) {
            case 1:
                hunderdStr = "One hundred";
                break;
            case 2:
                hunderdStr = "Two hundred";
                break;
            case 3:
                    hunderdStr = "Three hundred";
                break;
            case 4:
                    hunderdStr = "Four hundred";
                break;
            case 5:
                    hunderdStr = "Five hundred";
                break;
            case 6:
                    hunderdStr = "Six hundred";
                break;
            case 7:
                    hunderdStr = "Seven hundred";
                break;
            case 8:
                    hunderdStr = "Eight hundred";
                break;
            case 9:
                    hunderdStr = "Nine hundred";
                break;
            default:
                break;
        }

        String decStr = "";

        if (rawDec > 10 && rawDec < 20) {
            switch (rawDec) {
                case 11:
                    decStr = "eleven";
                    break;
                case 12:
                    decStr = "twelve";
                    break;
                case 13:
                    decStr = "thirteen";
                    break;
                case 14:
                    decStr = "fourteen";
                    break;
                case 15:
                    decStr = "fifteen";
                    break;
                case 16:
                    decStr = "sixteen";
                    break;
                case 17:
                    decStr = "seventeen";
                    break;
                case 18:
                    decStr = "eightteen";
                    break;
                case 19:
                    decStr = "nineteen";
                    break;
                default:
                    break;
            }
            System.out.println("So can nang cua ban la: " + hunderdStr + " and " + decStr);
            System.exit(1);
        }
        switch (dec) {
            case 2:
                decStr = "twenty ";
                break;
            case 3:
                decStr = "thirty ";
                break;
            case 4:
                decStr = "forty ";
                break;
            case 5:
                decStr = "fifty ";
                break;
            case 6:
                decStr = "sixty ";
                break;
            case 7:
                decStr = "seventy ";
                break;
            case 8:
                decStr = "eighty ";
                break;
            case 9:
                decStr = "ninety ";
                break;
            default:
                break;
        }

        String iStr = "";
        switch (i) {
            case 1:
                iStr = "one";
                break;
            case 2:
                iStr = "two";
                break;
            case 3:
                iStr = "three";
                break;
            case 4:
                iStr = "four";
                break;
            case 5:
                iStr = "five";
                break;
            case 6:
                iStr = "six";
                break;
            case 7:
                iStr = "seven";
                break;
            case 8:
                iStr = "eight";
                break;
            case 9:
                iStr = "nine";
                break;
            default:
                break;
        }

        if (rawDec != 0) {
            hunderdStr += " and ";
        }

        System.out.println("Can nang cua ban la: " + hunderdStr + decStr + iStr);

    }
}
