public class FitByte {
    private int restingHeartRate;
    private int age;

    public FitByte(int age, int restingHeartRate)  {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    } // end  param constructor

    public FitByte() {
    } // end  default constructor
    // setters and getters

    public double getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getRestingHeartRate() {
        return restingHeartRate;
    }

    public void setRestingHeartRate(int restingHeartRate) {
        this.restingHeartRate = restingHeartRate;
    }



    public double TargetHeartRate(double percentageOfMaximum) {
        // local variable maximumHeartRate to perform the calc
        double maximumHeartRate = 206.3 - (0.711 * age);
        return (maximumHeartRate - restingHeartRate) * percentageOfMaximum + restingHeartRate;
    }

    public void displayRunnerStats() {
        System.out.print("[FitByte Statistics Report]\n");
        System.out.println(new StringBuilder("Age Of Person: " + getAge()).append("\nResting Heart Rate of Person: " + getRestingHeartRate()));
    }
}

