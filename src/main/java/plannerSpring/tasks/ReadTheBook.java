package plannerSpring.tasks;

public class ReadTheBook {
    private String doTask2;
    private FindTheBook findTheBook;

    public String getDoTask2() {
        System.out.println("read the book");
        return doTask2;
    }

    public void setDoTask2(String doTask2) {
        this.doTask2 = doTask2;
    }

    public FindTheBook getFindTheBook() {
        return findTheBook;
    }

    public void setFindTheBook(FindTheBook findTheBook) {
        this.findTheBook = findTheBook;
    }
}

