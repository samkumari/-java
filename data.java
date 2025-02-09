import java.util.*;

class data {
    static void display() {
        System.out.println("Choose an option:");
        System.out.println("1. Google");
        System.out.println("2. Swiggy");
        System.out.println("3. Next");
        System.out.println("4. Previous");
        System.out.println("5. Exit");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> history = new LinkedList<>();
        int current = -1; 
        boolean running = true;

        while (running) {
            display();
            int choice = scanner.nextInt();
            

            switch (choice) {
                case 1:
                    System.out.println("Google selected: 1. Top news 2. Today's weather report");
                    if (current < history.size() - 1) {
                       history.subList(current + 1, history.size()).clear(); 
                    }
                    history.add(choice);
                    current++;
                    break;

                case 2:
                    System.out.println("Swiggy selected: Enjoy your meal options!");
                    if (current < history.size() - 1) {
                        history.subList(current+ 1, history.size()).clear(); 
                    }
                    history.add(choice);
                    current++;
                    break;

                case 3: 
                    if (current< history.size() - 1) {
                        current++;
                        int next = history.get(current);
                        System.out.println("Navigated to next page: " + getPageName(next));
                    } else {
                        System.out.println("No next page available.");
                    }
                    break;

                case 4: 
                    if (current> 0) {
                        current--;
                        int prev = history.get(current);
                        System.out.println("Navigated to previous page: " + getPageName(prev));
                    } else {
                        System.out.println("No previous page available.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting application.");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

       
    }

   
    static String getPageName(int choice) {
        switch (choice) {
            case 1:
                return "Google";
            case 2:
                return "Swiggy";
            default:
                return "Unknown";
        }
    }
}
