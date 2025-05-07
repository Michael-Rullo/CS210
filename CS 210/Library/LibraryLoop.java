package Library;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class LibraryLoop {
    
    public void loop () {

        LibrarySystem library = new LibrarySystem();
        Scanner input = new Scanner(System.in);

        while (true) {

            int option = 0;
            System.out.println();
            library.printOptions();

            while (true) {
                try {
                    option = input.nextInt();
                    input.nextLine();
                    if (option < 1 || option > 7) {
                        throw new IllegalArgumentException("Please enter an integer between 1 and 7");
                    }
                    break;
                } catch (InputMismatchException ime) {
                    option = 0;
                    input.nextLine();
                    System.out.print("Error: Thats not a valid number. PLease enter an Integer. : ");
                } catch (IllegalArgumentException iae) {
                    option = 0;
                    System.out.print("Error: " + iae.getMessage() + ": ");
                }
            }

            if (option == 1) {
                
                long ibsn = 0;
                int copies = 0;
                System.out.print("Enter book title: ");
                String title = input.nextLine();
                System.out.print("Enter Book Author: ");
                String author = input.nextLine();

                while (true) {
                    try {
                        System.out.print("Enter book IBSN: ");
                        ibsn = input.nextLong();
                        input.nextLine();
                        if (ibsn < 0) {
                            throw new IllegalArgumentException("Please enter an integer greater than 0.");
                        }
                        break;
                    } catch (InputMismatchException ime) {
                        ibsn = 0;
                        input.nextLine();
                        System.out.println("Error: Thats not a valid number. PLease enter an Integer.");
                    } catch (IllegalArgumentException iae) {
                        ibsn = 0;
                        System.out.println("Error: " + iae.getMessage());
                    }
                }

                while (true) {
                    try {
                        System.out.print("Enter number of copies: ");
                        copies = input.nextInt();
                        input.nextLine();
                        if (copies < 1) {
                            throw new IllegalArgumentException("Please enter have more than 0 copies.");
                        }
                        break;
                    } catch (InputMismatchException ime) {
                        copies = 0;
                        input.nextLine();
                        System.out.println("Error: Thats not a valid number. PLease enter an Integer.");
                    } catch (IllegalArgumentException iae) {
                        copies = 0;
                        System.out.println("Error: " + iae.getMessage());
                    }
                }

                int result = library.addBook(title, author, ibsn, copies);
                Book newBook = library.books.get(ibsn);
                if (result == 0) {
                    System.out.print("Book added: " + newBook.getTitle() + " by " + newBook.getAuthor());
                    System.out.println(" (IBSN: " + newBook.getIBSN() + ").");
                    System.out.println("Copies available for borrowing: " + newBook.getCopies());
                } else {
                    System.out.print("Book already exists. ");
                    System.out.println("Updated the number of copies in the library.");
                    System.out.println("Copies available for borrowing: " + newBook.getCopies());
                }
            }
            
            if (option == 2) {
                int id = 0;
                System.out.print("Enter member name: ");
                String name = input.nextLine();
                library.addMember(name);
                for (Map.Entry<Integer, Member> entry : library.members.entrySet()) {
                    Member member = entry.getValue();
                    if (member.getName().equals(name)) {
                        id = member.getID();
                        break;
                    }
                }
                System.out.println("Member added: " + name + " (Member ID: M" + id + ").");
            }

            if (option == 3) {
                
                int choice = 0;
                String title, author;
                long ibsn;

                System.out.println("Search book by:");
                System.out.println("1. Title");
                System.out.println("2. Author");
                System.out.println("3. IBSN");

                while (true) {
                    try {
                        System.out.print("Choose an option: ");
                        choice = input.nextInt();
                        input.nextLine();
                        if (choice < 1 || choice > 3) {
                            throw new IllegalArgumentException("Please enter a number between 1 and 3.");
                        }
                        break;
                    } catch (InputMismatchException ime) {
                        choice = 0;
                        input.nextLine();
                        System.out.println("Error: Thats not a valid number. PLease enter an Integer.");
                    } catch (IllegalArgumentException iae) {
                        choice = 0;
                        System.out.println("Error: " + iae.getMessage());
                    }
                }

                if (choice == 1) {
                    System.out.print("Enter the book title: ");
                    title = input.nextLine();
                    library.searchBook(title, choice);
                } else if (choice == 2) {
                    System.out.print("Enter the author name: ");
                    author = input.nextLine();
                    library.searchBook(author, choice);
                } else if (choice == 3) {
                    while (true) {
                        try {
                            System.out.print("Enter book IBSN: ");
                            ibsn = input.nextLong();
                            input.nextLine();
                            if (ibsn < 0) {
                                throw new IllegalArgumentException("Please enter an integer greater than 0.");
                            }
                            break;
                        } catch (InputMismatchException ime) {
                            ibsn = 0;
                            input.nextLine();
                            System.out.println("Error: Thats not a valid number. PLease enter an Integer.");
                        } catch (IllegalArgumentException iae) {
                            ibsn = 0;
                            System.out.println("Error: " + iae.getMessage());
                        }
                    }
                    library.searchBook(ibsn, choice);
                }
            }

            if (option == 4) {

                String accountNumber;
                int id = 0;

                while (true) {
                    try {
                        System.out.print("Enter member ID: ");
                        accountNumber = input.nextLine();
                        id = Integer.parseInt(accountNumber.substring(1));
                        if (id < 0) {
                            throw new IllegalArgumentException("Please enter a number >= 0 following an M.");
                        }
                        break;
                    } catch (InputMismatchException ime) {
                        id = 0;
                        System.out.println("Error: Thats not a valid number. PLease enter an account number in the format M#");
                    } catch (IllegalArgumentException iae) {
                        id = 0;
                        System.out.println("Error: " + iae.getMessage());
                    }
                }

                System.out.print("Enter book title: ");
                String title = input.nextLine();

                int result = library.issueBook(id, title);

                switch (result) {
                    case 0:
                        System.out.println("Book issued: " + title + " to " + accountNumber);
                        break;
                    case 1:
                        System.out.println(accountNumber + " has already borrowed this book: " + title);
                        System.out.println("Could not issue the book.");
                        break;
                    case 2:
                        System.out.println("Book may not exist, or insufficient copies are available.");
                        break;
                    default:
                        System.out.println("Issue in issuing book in switch-case statement.");
                }

                library.printBook(library.fetchMemberBook(id, title));
            }

            if (option == 5) {

                String accountNumber;
                int id = 0;

                while (true) {
                    try {
                        System.out.print("Enter member ID to list borrowed books: ");
                        accountNumber = input.nextLine();
                        id = Integer.parseInt(accountNumber.substring(2));
                        if (id < 0) {
                            throw new IllegalArgumentException("Please enter a number >= 0 following an M.");
                        }
                        break;
                    } catch (InputMismatchException ime) {
                        id = 0;
                        System.out.println("Error: Thats not a valid number. PLease enter an account number in the format M#");
                    } catch (IllegalArgumentException iae) {
                        id = 0;
                        System.out.println("Error: " + iae.getMessage());
                    }
                }

                System.out.print("Enter book title: ");
                String title = input.nextLine();

                Book memberBook = library.fetchMemberBook(id, title);
                int result = library.returnBook(id, title);
                if (result == 0) {
                    System.out.print("Book returned: " + memberBook.getTitle() + " by " + memberBook.getAuthor());
                    System.out.println(" (IBSN: " + memberBook.getIBSN() + ").");
                } else {
                    System.out.println(accountNumber + " has not borrowed this book: " + title + ". Or title was incorrectly entered.");
                }
            }
            
            if (option == 6) {

                String accountNumber;
                int id = 0;

                while (true) {
                    try {
                        System.out.print("Enter member ID to list borrowed books: ");
                        accountNumber = input.nextLine();
                        id = Integer.parseInt(accountNumber.substring(1));
                        if (id < 0) {
                            throw new IllegalArgumentException("Please enter a number >= 0 following an M.");
                        }
                        break;
                    } catch (InputMismatchException ime) {
                        id = 0;
                        System.out.println("Error: Thats not a valid number. PLease enter an account number in the format M#");
                    } catch (IllegalArgumentException iae) {
                        id = 0;
                        System.out.println("Error: " + iae.getMessage());
                    }
                }

                library.listBorrowedBooks(id);
            }
            
            if (option == 7) {
                System.out.println("Exiting.  .  .");
                System.exit(0);
            }
        }
    }
}
