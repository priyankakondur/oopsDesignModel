public class ArtsDepartment implements Library, ArtsMusicRoom{
    public String bookISBN, bookAuthorName;
    public boolean isBookRent;
    public String type, material;
    public int age;
     public static int noOfArtsBooks, noOfRentedBooks,chairCount,staffCount,eldestStaffAge;
    public String fName, lName;

    @Override
    public void books(String bookISBN, boolean isBookRent, String bookAuthorName) {
        this.bookISBN = bookISBN;
        this.isBookRent = isBookRent;
        this.bookAuthorName = bookAuthorName;
        noOfArtsBooks = noOfArtsBooks+1;
        if(isBookRent){
            noOfRentedBooks = noOfRentedBooks+1;
        }
        //System.out.println("Total no of rented books = " +noOfRentedBooks);

    }

    @Override
    public void furniture(String type, String material) {
        this.type = type;
        this.material = material;
        if(type=="Chair"){
            chairCount = chairCount +1;
            //System.out.println(chairCount);
        }
    }

    @Override
    public void staff(int age, String fName, String lName) {
        this.age = age;
        this.fName = fName;
        this.lName = lName;
        staffCount++;
        if(this.age>eldestStaffAge){
            eldestStaffAge=this.age;
        }
    }
    @Override
    public void musicRoom(){

    }
}
