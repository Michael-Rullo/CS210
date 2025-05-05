// Question 1:
    // the variables are: name (String), and numFans (int)
// Question 2
    // setInfo allows the user to input the info that will be held by the instance variables
// Question 3
    // The first constructor is a zero parameters constructor; which initializes an object with specific default values when an object is created
    // The second constructor is a parameterized constructor; which accepts arguments to initialize object fields/attributes
    // The third constructor is a copy constructor; which creates a new object as a copy of an existing object of the same class



public class Artist {
    private String name;
    private int numFans;

    public Artist() {
        this.name = "Mike Rullo";
        this.numFans = 0;
    }

    public Artist(String name, int numFans) {
        this.name = name;
        this.numFans = numFans;
    }

    public Artist(Artist anotherArtist) {
        this.name = anotherArtist.name;
        this.numFans = anotherArtist.numFans;
    }

    public void setInfo(String name, int numFans) {
        this.name = name;
        this.numFans = numFans;
    }
}
