public class Program {

    public static void main(String[] args) {

        // default and param obj creation for FitByte Class
        FitByte f1 = new FitByte();
        f1.setAge(50);
        f1.setRestingHeartRate(75);
        // param obj creation and method calls
        FitByte f2 = new FitByte(30, 50);

        // used https://raisanenmarkus.github.io/csharp/ source
        // test case demonstration -- modeled output for FitByte class requirement
        double percentage = 0.5;
        System.out.print("FitByte Report:\n");
        while (percentage < 1.0) {
            double target1 = f1.TargetHeartRate(percentage);
            double target2 = f2.TargetHeartRate(percentage);
            System.out.println("Target 1 " + (percentage * 100) + "% of maximum: " + target1);
            System.out.println("Target 2 " + (percentage * 100) + "% of maximum: " + target2);
            percentage += 0.1;
        } // end FitByte printout loop

        // method that returns void and print statements
        f1.displayRunnerStats();
        f2.displayRunnerStats();


        // default and param obj creation for Runner Class
        Runner m1 = new Runner();
        m1.setRunnerName("Usain Bolt"); m1.setMph(20);
        // param obj creation and method calls
        Runner m2 = new Runner(4, "Carl Lewis"); m2.isThatFast(m1.getRunSpeed());

        // Use of getter in default class to obtain the run speed of default constructor
        m1.isThatFast(m1.getRunSpeed());

        // use of getters for default and param constructor
        m1.displayRunnerStats();
        m2.displayRunnerStats();

        } // end main execution of program
    } // end program class

