package Library;

public class Book {
    
    private String title;
    private String author;
    private long ibsn;
    private int copies = 0;

    public Book(String title, String author, long ibsn, int copies) {
        this.title = title;
        this.author =  author;
        this.ibsn = ibsn;
        this.copies = copies;
    }

    public void addCopy() {
        copies += 1;
    }

    public int removeCopy() {
        if (copies > 0) {
            copies -= 1;
            return 0;
        } else {
            return 1;
        }
    }

    public int getCopies() {
        return this.copies;
    }

    public long getIBSN() {
        return this.ibsn;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAny(int parameter) {
        String returnValue = "";
        switch (parameter) {
            case 1: returnValue = this.title;
                break;
            case 2: returnValue = this.author;
                break;
            case 3: returnValue = Long.toString(this.ibsn);
                break;
        }
        return returnValue;
    }
}
