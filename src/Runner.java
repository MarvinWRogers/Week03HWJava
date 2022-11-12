public class Runner {
    private int mph;
    private String runnerName, buildSep = "\n";
    private double runSpeed = 10;

    public Runner() {
    } // end  default constructor

    public Runner(int mph, String runnerName)  {this.mph = mph; this.runnerName = runnerName;
    } // end  param constructor



    // getters and setter block for all private fields
    public double getRunSpeed () { return runSpeed; }
    public void setMph(int newMph) { this.mph = newMph; }
    public int getMph () { return mph; }
    public void setRunnerName(String runnerName) { this.runnerName = runnerName; }

    public String getRunnerName () { return runnerName; }
    // methods block end


    // method that returns void -- used for Sys.print outs to cut down text in program class / main
    public void displayRunnerStats() {
        System.out.print("[Runner Statistics Report]\n");
        System.out.print(new StringBuilder("Runner Name: " + getRunnerName()).append(buildSep).append("Runners Top Speed: " + getMph()).append(buildSep).append("Requirement to be fast: " + getRunSpeed())
                .append(buildSep).append("Which class? " + getClass()).append(buildSep).append(buildSep));
    }

    // method that returns a value
    public double isThatFast (double runSpeed) {
        // color scheme for runner speed
        String ANSI_GREEN = "\u001B[32m\t";
        String ANSI_RED = "\u001B[31m\t";
        String ANSI_RESET = "\u001B[0m\t";
        // String Builder to reduce println use
        String runnerString = "The runner ";
        String Cond1print = " is very FAST, they run this fast and runs at ";
        String Cond2print = " is very SLOW, they only run at ";
        String mphStr = " miles per hour ";
        double fastestSpeed = this.mph;

        if (fastestSpeed >= runSpeed) {
            System.out.println(new StringBuilder(ANSI_GREEN).append(runnerString).append(runnerName).append(Cond1print ).append(mph).append(mphStr).append(ANSI_RESET));
            System.out.println("Awaiting next runner ---> placeholder text\n");
        } else {
            System.out.println(new StringBuilder(ANSI_RED).append(runnerString).append(runnerName).append(Cond2print).append(mph).append(mphStr).append(ANSI_RESET));
            System.out.println("Awaiting next runner ---> placeholder text\n");
        }
        return runSpeed;
    }

    // end methods block




}
