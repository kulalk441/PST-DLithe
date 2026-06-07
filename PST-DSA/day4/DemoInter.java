package day4;

import java.util.Arrays;
// Remote
interface FeedRemote{
    // rows batch, column feedback
    String[][] feedbacks = new String[2][3];
    void createFeedBack(int id, String comment);
    void readFeedBack(int id);
    void deleteFeedback(int id);
}
// Service
class FeedBackService implements FeedRemote{

    @Override
    public void createFeedBack(int id, String comment) {
        if(id>=0&&id<feedbacks.length){
            for(int index = 0;index<3;index++){
                if(feedbacks[id][index]==null||feedbacks[id][index]==""){
                    feedbacks[id][index] = comment;
                    System.out.println(comment+" noted");
                    return;
                }
            }
            System.out.println("Feedback buffer is full");
        }else System.out.println("Invalid batch");
    }

    @Override
    public void readFeedBack(int id) {
        if(id>=0&&id<feedbacks.length)
            System.out.println(Arrays.toString(feedbacks[id]));
        else System.out.println("Invalid batch");
    }

    @Override
    public void deleteFeedback(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteFeedback'");
    }

}

// API
public class DemoInter {
    public static void main(String[] args) {
        FeedBackService service = new FeedBackService();
        service.createFeedBack(1, "Good");
        service.createFeedBack(2, "Good");
        service.createFeedBack(0, "Bad");
        service.createFeedBack(1, "Average");
        service.createFeedBack(0, "Average");
        service.createFeedBack(1, "Excellent");
        service.createFeedBack(1, "Bad");
        service.readFeedBack(0);
    }
}
