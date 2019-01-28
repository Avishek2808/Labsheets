package ath;
import java.util.Scanner;

public class TestAthlete {
    public static Athlete inputAthlete(int i) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter details for athlete #" + (i + 1) + ": ");

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("Enter fastest lap: ");
        double fastest_time = input.nextDouble();
        Athlete atheleteDetails = new Athlete();

        atheleteDetails.setName(name);
        atheleteDetails.setFastest_time(fastest_time);

        return atheleteDetails;
    }

    public static Athlete fastestAthlete(Athlete [] athleteArr) {
        double fastest_time = 99999.9;
        Athlete fastestAthleteObj = null;
        for (int i = 0; i < athleteArr.length; i++) {
            if (athleteArr[i].getFastest_time() < fastest_time) {
                fastest_time = athleteArr[i].getFastest_time();
                fastestAthleteObj = athleteArr[i];
            }
        }
        return fastestAthleteObj;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter no. of Athletes: ");
        int num = input.nextInt();
        Athlete [] athleteAtrr = new Athlete[num];

        for (int i = 0; i < num; i++) {
           athleteAtrr[i] = inputAthlete(i);
        }

        fastestAthlete(athleteAtrr).toString();
    }
}
