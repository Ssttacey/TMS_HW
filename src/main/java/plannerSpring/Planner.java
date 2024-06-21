package plannerSpring;

import plannerSpring.tasks.DoHW;
import plannerSpring.tasks.FeedDog;
import plannerSpring.tasks.ReadTheBook;

public class Planner {
    private String firstMessage;
    private String lastMessage;
    private ReadTheBook readTheBook;
    private DoHW doHW;
    private FeedDog feedDog;

    public String getFirstMessage() {
        System.out.println("Done!");
        return firstMessage;
    }

    public void setFirstMessage(String firstMessage) {
        this.firstMessage = firstMessage;
    }

    public String getLastMessage() {
        System.out.println("all tasks on the to-do list are completed");
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public ReadTheBook getReadTheBook() {
        return readTheBook;
    }

    public void setReadTheBook(ReadTheBook readTheBook) {
        this.readTheBook = readTheBook;
    }

    public DoHW getDoHW() {
        return doHW;
    }

    public void setDoHW(DoHW doHW) {
        this.doHW = doHW;
    }

    public FeedDog getFeedDog() {
        return feedDog;
    }

    public void setFeedDog(FeedDog feedDog) {
        this.feedDog = feedDog;
    }
}
