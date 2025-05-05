package Library;

public class Book {
    
    private String title;
    private String author;
    private int ibsn;
    private int copies = 0;

    public Book(String title, String author, int ibsn, int copies) {
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

    public int getIBSN() {
        return this.ibsn;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAny(Book book, int parameter) {
        String returnValue = "";
        switch (parameter) {
            case 1: returnValue = this.title;
            case 2: returnValue = this.author;
            case 3: returnValue = Integer.toString(this.ibsn);
        }
        return returnValue;
    }
}
