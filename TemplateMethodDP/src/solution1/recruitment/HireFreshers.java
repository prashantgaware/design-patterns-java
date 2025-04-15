package solution1.recruitment;

public abstract class HireFreshers {
    public boolean hire() {
        System.out.println("Hiring Freshers");
        return true;
    }

    public boolean conductInterview() {
        System.out.println("Conducting Interview for Freshers");
        return true;
    }

    public boolean selectCandidates() {
        System.out.println("Selecting Candidates for Freshers");
        return true;
    }

    public abstract void sendOfferLetters();

    public final boolean hireFreshers() {
        if (hire()) {
            if (conductInterview()) {
                if (selectCandidates()) {
                    sendOfferLetters();
                }
            }
        }
        return true;
    }
}
