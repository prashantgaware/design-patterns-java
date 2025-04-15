package solution1.test;

import solution1.recruitment.HireDotNetFreshers;
import solution1.recruitment.HireFreshers;
import solution1.recruitment.HireJavaFreshers;
import solution1.recruitment.HireUiFreshers;

public class Recruiter {
    public static void main(String[] args) {
        HireFreshers javaFreshers = null;
        HireFreshers dotNetFreshers = null;
        HireFreshers uiFreshers = null;

        System.out.println("Java Freshers Recruitment Process");
        javaFreshers = new HireJavaFreshers();
        boolean javaFresher = javaFreshers.hireFreshers();
        if (javaFresher) {
            System.out.println("Java Freshers hired successfully.");
        } else {
            System.out.println("Failed to hire Java Freshers.");
        }

        System.out.println();
        System.out.println("DotNet Freshers Recruitment Process");
        dotNetFreshers = new HireDotNetFreshers();
        boolean dotNetFresher = dotNetFreshers.hireFreshers();
        if (dotNetFresher) {
            System.out.println("DotNet Freshers hired successfully.");
        } else {
            System.out.println("Failed to hire DotNet Freshers.");
        }

        System.out.println();
        System.out.println("UI Freshers Recruitment Process");
        uiFreshers = new HireUiFreshers();
        boolean uiFresher = uiFreshers.hireFreshers();
        if (uiFresher)
            System.out.println("UI Freshers hired successfully.");
        else
                System.out.println("Failed to hire candidates.");
    }
}
