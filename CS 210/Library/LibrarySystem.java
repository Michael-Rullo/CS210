package Library;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class LibrarySystem {

    HashMap<Member, Set<Book>> memberBooks = new HashMap<>();
    HashMap<Long, Book> books = new HashMap<>();
    HashMap<Integer, Member> members = new HashMap<>();
    
    public int addBook(String title, String author, long ibsn, int copies) {
        Book newBook = new Book(title, author, ibsn, copies);
        int result = 0;

        if (books.containsKey(ibsn)) {
            Book existingBook = books.get(ibsn);
            for (int i = 0; i < copies; i ++) {
                existingBook.addCopy();
                result = 1;
            }
        } else {
            books.put(ibsn, newBook);
            result = 0;
        }
        return result;
    }

    public void addMember(String name) {
        Member newMember = new Member(name);
        Set<Book> newMemberSet = new HashSet<Book>();
        members.put(newMember.getID(), newMember);
        memberBooks.put(newMember, newMemberSet);
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
                long temp = (long) parameter;
                parameter = Long.toString(temp);
                break;
            default:
                System.out.println("Error in searchBook");
        }

        for (Book existingBook : books.values()) {
            if (existingBook.getAny(searchMethod).equals(parameter)) {
                printBook(existingBook);
            }
        }
    }

    public void printBook(Book book) {
        System.out.print("Book found: ");
        System.out.println(book.getTitle() + " by " + book.getAuthor() + " (IBSN: " + book.getIBSN() + "). Copies available for borrowing: " + book.getCopies());
    }

    public int issueBook(int id, String title) {
        Set<Book> memberBookSet = memberBooks.get(id);
        int success = 0;

        if (memberBookSet == null) {
            memberBookSet = new HashSet<>();
        } else {
            for (Book existingBook : memberBookSet) {
                if (existingBook.getTitle().equals(title)) {
                    success = 1;
                    return success;
                }
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

    public int returnBook(int id, String title) {
        int result = 0;
        Set<Book> memberBookSet = memberBooks.get(id);
        for (Book existingBook : memberBookSet) {
            if (existingBook.getTitle().equals(title)) {
                memberBookSet.remove(existingBook);
                memberBooks.put(members.get(id), memberBookSet);
                result = 0;
                break;
            } else {
                result = 1;
            }
        }
        return result;
    }

    public void listBorrowedBooks(int id) {
        Set<Book> memberBookSet = memberBooks.get(id);
        for (Book existingBook : memberBookSet) {
            printBook(existingBook);
        }
    }

    public Book fetchMemberBook(int id, String title) {
        Set<Book> memberBookSet = memberBooks.get(id);
        Book newBook = null;
        if (memberBookSet == null) {
            memberBookSet = new HashSet<>();
        } else {
            for (Entry<Member, Set<Book>> entry : memberBooks.entrySet()) {
                Member key = entry.getKey();
                Set<Book> val = entry.getValue();
                if (key.getID() == id) {
                    for (Book book : val) {
                        if (book.getTitle().equals(title)) {
                            return book;
                        }
                    }
                }
            }
        }
        return newBook;
    }

    public void printOptions() {
        System.out.println("Library Management System");
        System.out.println("1. Add Book:");
        System.out.println("2. Add Member");
        System.out.println("3. Search Book");
        System.out.println("4. Issue Book");
        System.out.println("5. Return Book");
        System.out.println("6. List Borrowed Books");
        System.out.println("7. Exit");
        System.out.print("Choose an option: ");
    }
}
