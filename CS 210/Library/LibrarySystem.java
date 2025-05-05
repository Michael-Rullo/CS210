package Library;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LibrarySystem {

    HashMap<Member, Set<Book>> memberBooks = new HashMap<>();
    HashSet<Book> books = new HashSet<>();
    HashMap<Integer, Member> members = new HashMap<>();
    
    public void addBook(String title, String author, int ibsn, int copies) {
        Book newBook = new Book(title, author, ibsn, copies);

        if (books.contains(newBook)) {
            for (Book existingBook : books) {
                if (existingBook.equals(newBook)) {
                    for (int i = 0; i < copies; i++) {
                        existingBook.addCopy();
                    }
                    break;
                }
            }
        } else {
            books.add(newBook);
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
        for (Book existingBook : books) {
            if (existingBook.getAny(existingBook, searchMethod).equals(parameter)) {
                printBook(existingBook);
            }
        }
    }

    public void printBook(Book book) {
        System.out.print(book.getTitle() + " (IBSN: " + book.getIBSN() + "). Copies available for borrowing: " + book.getCopies());
    }

    public void issueBook(int id, String title) {
        Set<Book> memberBookSet = memberBooks.get(id);
        for (Book book : books) {
            if (book.getTitle().equals(title)) {

            }
        }
    }
}
