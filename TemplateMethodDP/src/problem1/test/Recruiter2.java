package problem1.test;

import problem1.recruitment.HireDotNetFreshers;

public class Recruiter2 {
    public static void main(String[] args) {
        System.out.println("Recruiter2.main");
        HireDotNetFreshers hireDotNetFreshers = new HireDotNetFreshers();
        if (hireDotNetFreshers.hire()) {
            if (hireDotNetFreshers.selectCandidates()) {
                if (hireDotNetFreshers.conductInterview()) {
                    if (hireDotNetFreshers.sendOfferLetters()) {
                        System.out.println("All operations completed successfully.");
                    } else {
                        System.out.println("Failed to send offer letters.");
                    }
                } else {
                    System.out.println("Failed to conduct interview.");
                }
            } else {
                System.out.println("Failed to hire candidates.");
            }
        }
    }
}
