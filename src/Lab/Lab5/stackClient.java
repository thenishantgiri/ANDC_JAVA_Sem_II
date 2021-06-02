package Lab.Lab5;

public class stackClient {

    public static void main(String[] args) throws Exception {

        stack stack = new stack();

        //pushing elements
        try {
            for (int i = 0; i <= 11; i++) {
                stack.push(i);
            }
        } catch (Exception error) {
            System.out.println(error);
        }

        //displaying elements
        stack.display();

        //popping elements
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Popped : "+ stack.pop());
            }
        } catch (Exception error) {
            System.out.println(error);
        }

    }
}
