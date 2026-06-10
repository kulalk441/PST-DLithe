package Assignments.day8;

import java.io.*;
import java.util.*;

// POJO Class
class Feedback implements Serializable {
    private static final long serialVersionUID = 1L;

    private String trainerName;
    private String batchId;
    private String studentUsn;
    private double rating;
    private String comments;

    public Feedback(String trainerName, String batchId,
                    String studentUsn, double rating, String comments) {
        this.trainerName = trainerName;
        this.batchId = batchId;
        this.studentUsn = studentUsn;
        this.rating = rating;
        this.comments = comments;
    }

    public String getStudentUsn() {
        return studentUsn;
    }

    @Override
    public String toString() {
        return "Trainer Name : " + trainerName +
               "\nBatch ID     : " + batchId +
               "\nStudent USN  : " + studentUsn +
               "\nRating       : " + rating +
               "\nComments     : " + comments + "\n";
    }
}

// Driver Class
public class SeriolizesPojo {

    private static final String FILE_NAME = "feedbacks.ser";

    public static void main(String[] args) {

        try {
            // Create feedback objects
            List<Feedback> feedbackList = new ArrayList<>();

            feedbackList.add(new Feedback(
                    "John", "B101", "4NM21CS001",
                    4.5, "Excellent teaching"));

            feedbackList.add(new Feedback(
                    "Smith", "B102", "4NM21CS002",
                    4.0, "Good explanations"));

            feedbackList.add(new Feedback(
                    "David", "B103", "4NM21CS003",
                    5.0, "Very interactive sessions"));

            // Serialize list into file
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream(FILE_NAME));

            oos.writeObject(feedbackList);
            oos.close();

            System.out.println("Feedback records stored successfully.\n");

            // Search by USN
            String searchUsn = "4NM21CS002";

            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream(FILE_NAME));

            List<Feedback> readList =
            (List<Feedback>) ois.readObject();

            ois.close();

            System.out.println("Searching feedback for USN: " + searchUsn);

            boolean found = false;

            for (Feedback feedback : readList) {
                if (feedback.getStudentUsn().equals(searchUsn)) {
                    System.out.println("\nFeedback Found:");
                    System.out.println(feedback);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No feedback found for USN " + searchUsn);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}