package Assignments.day4;

// Abstract Class
abstract class LoanRemote {

    // Abstract methods
    abstract void applyLoan(int applicantId, String loanType);

    abstract void viewLoan(int applicantId);

    abstract void cancelLoan(int applicantId);

    // Concrete helper method
    void log(String message) {
        System.out.println(message);
    }
}

// Concrete Subclass
class LoanService extends LoanRemote {

    private String[][] loans;

    public LoanService(int applicants, int maxLoans) {
        loans = new String[applicants][maxLoans];
    }

    @Override
    void applyLoan(int applicantId, String loanType) {
        for (int i = 0; i < loans[applicantId].length; i++) {
            if (loans[applicantId][i] == null) {
                loans[applicantId][i] = loanType;
                log("Loan applied: " + loanType +
                        " for applicant " + applicantId);
                return;
            }
        }
        log("No loan slots available for applicant " + applicantId);
    }

    @Override
    void viewLoan(int applicantId) {
        System.out.print("Applicant " + applicantId + " loans: [");

        for (int i = 0; i < loans[applicantId].length; i++) {
            System.out.print(loans[applicantId][i]);

            if (i < loans[applicantId].length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    @Override
    void cancelLoan(int applicantId) {
        for (int i = 0; i < loans[applicantId].length; i++) {
            loans[applicantId][i] = null;
        }
        log("Loans cancelled for applicant " + applicantId);
    }
}

// Driver Class
public class LoanDemo {
    public static void main(String[] args) {

        LoanService service = new LoanService(5, 3);

        // Apply loans
        service.applyLoan(0, "Personal Loan");
        service.applyLoan(0, "Business Loan");
        service.applyLoan(1, "Education Loan");

        // View loans
        service.viewLoan(0);
        service.viewLoan(1);

        // Cancel loans
        service.cancelLoan(0);

        // View after cancellation
        service.viewLoan(0);
    }
}
