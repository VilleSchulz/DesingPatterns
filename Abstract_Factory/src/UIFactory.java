import java.util.Scanner;

abstract class UIFactory {

    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);
        UIFactory UI;

        //Choose Form
        System.out.println("Which of these FORM you want to show");
        System.out.println("A: signup, B: login, C: Order ");
        String form = scanner.nextLine().toUpperCase();
        while (!form.equals("A") && !form.equals("B") && !form.equals("C")) {
            System.out.println("Which of these FORM you want to show");
            System.out.println("A: signup, B: login");
            form = scanner.nextLine().toUpperCase();
        }

        //Choose UI-Style
        System.out.println("Which of these UI you want to show");
        System.out.println("A or B");
        String style = scanner.nextLine().toUpperCase();
        while (!style.equals("A") && !style.equals("B")) {
            System.out.println("Which of these UI you want to show");
            System.out.println("A or B");
            style = scanner.nextLine().toUpperCase();
        }

        switch (style){
            case "A": UI = new AFactory();
            break;
            case "B": UI = new BFactory();
            break;
        }

        switch (form){
            case "A": UI.generateUI("SignupForm");
            break;
            case "B": UI.generateUI("LoginForm");
            break;



        }

    }

    abstract void generateUI(String signupForm);
}
