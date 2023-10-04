public class DemoLambda {
    /*
    Functional interface:
    -Chỉ chứa duy nhất 1 phương thức abstract;
    -Ví dụ mình có 1 interface Flyable {
        void display();
    }

    learn(Flyable flyable) {
        flyable.display();
    }

    main() {
        learn(new Flyable() {
            @Override
            public void display() {
                System.out.println("Hello World!");
            }
        });

        learn(() -> {
            System.out.println();
        });
    }
     */


    public static void main(String[] args) {
        learn("Chim", (s) -> System.out.println(s));
    }

    private static void learn(String bird, Flyable flyable) {
        flyable.display(bird);
    }

}
