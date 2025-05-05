package Library;

public class Member {
    
    private static int id = 0;
    private String name;
    private int memberID;

    public Member(String name){
        this.name = name;
        this.memberID = id;
        idIncrease();
    }

    public void idIncrease() {
        id += 1;
    }

    public String getName() {
        return this.name;
    }

    public int getID() {
        return this.memberID;
    }
}
