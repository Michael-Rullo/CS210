package Library;

import java.util.HashMap;
import java.util.Set;

public class LibrarySystem {

    HashMap<Member, Set<Book>> memberBooks = new HashMap<>();
    HashMap<Integer, Book> books = new HashMap<>();
    HashMap<Integer, Member> members = new HashMap<>();
    
    public void addBook(String title, String author, int ibsn, int copies) {
        Book newBook = new Book(title, author, ibsn, copies);

        if (books.containsKey(ibsn)) {
            Book existingBook = books.get(ibsn);
            for (int i = 0; i < copies; i ++) {
                existingBook.addCopy();
            }
        } else {
            books.put(ibsn, newBook);
        }
    }

    public void addMember(String name) {
        Member newMember = new Member(name);
        members.put(newMember.getID(), newMember);
    }

    public void searchBook(Object parameter, int searchMethod) {
        switch (searchMethod) {
            case 1:
                parameter = (String) parameter;
                break;
            case 2:
                parameter = (String) parameter;
                break;
            case 3:
                int temp = (int) parameter;
                parameter = Integer.toString(temp);
                break;
            default:
                System.out.println("Error in searchBook");
        }

        for (Book existingBook : books.values()) {
            if (existingBook.getAny(existingBook, searchMethod).equals(parameter)) {
                printBook(existingBook);
            }
        }
    }

    public void printBook(Book book) {
        System.out.print(book.getTitle() + " (IBSN: " + book.getIBSN() + "). Copies available for borrowing: " + book.getCopies());
    }

    public int issueBook(int id, String title) {
        Set<Book> memberBookSet = memberBooks.get(id);
        int success = 0;

        for (Book existingBook : memberBookSet) {
            if (existingBook.getTitle().equals(title)) {
                success = 1;
                return success;
            }
        }

        for (Book existingBook : books.values()) {
            if (existingBook.getTitle().equals(title)) {
                if (existingBook.getCopies() > 0) {
                    memberBookSet.add(existingBook);
                    memberBooks.put(members.get(id), memberBookSet);
                    existingBook.removeCopy();
                }
                else {
                    return 2;
                }
            }
        }
        return success;
    }

    public void returnBook(int id, String title) {
        
    }
}
