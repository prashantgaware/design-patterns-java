package problem1.test;

import problem1.recruitment.HireJavaFreshers;

public class Recruiter1 {
    public static void main(String[] args) {
        // Problems with the code:
        // 1. Code Duplication: The same sequence of method calls is repeated in both classes.
        // 2. Lack of Abstraction: The logic for hiring, selecting candidates, conducting interviews,
        //    and sending offer letters is hardcoded in the main method, making it difficult to change.
        // Each client has to implement the same sequence of method calls, leading to code duplication.
        // The logic for hiring, selecting candidates, conducting interviews, and sending offer letters
        // is hardcoded in the main method, making it difficult to change or extend.

        // client should know all the steps involved in the hiring process.
        // client should know the sequence of steps involved in the hiring process.
        // which is not a good design.

        System.out.println("Recruiter1.main");
        HireJavaFreshers hireJavaFreshers = new HireJavaFreshers();
        boolean isSuccess = false;
        if (hireJavaFreshers.hire()) {
            isSuccess = hireJavaFreshers.selectCandidates();
            if (isSuccess) {
                isSuccess = hireJavaFreshers.conductInterview();
                if (isSuccess) {
                    isSuccess = hireJavaFreshers.sendOfferLetters();
                    if (isSuccess) {
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
