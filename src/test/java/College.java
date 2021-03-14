public class College {
    public static void main(String[] args) {
        // add  books 
        EngineeringDepartment eng = new EngineeringDepartment();
        eng.books("123", true, "priya");
        eng.books("465", false, "sathiesh");
        eng.books("789", true, "vihaan");
        eng.books("42211",true,"sanj");
        //System.out.println("Total no of engineering books = " +EngineeringDepartment.noOfEngineeringBooks);
        //System.out.println("Total no of engineering rented books = " +EngineeringDepartment.noOfRentedBooks);

        ArtsDepartment arts = new ArtsDepartment();
        arts.books("43245",false,"sashu");
        arts.books("43",true,"praghu");
        //System.out.println("Total no of arts books = " +ArtsDepartment.noOfArtsBooks);
       // System.out.println("Total no of arts rented books = " +ArtsDepartment.noOfRentedBooks);
        System.out.println("total books in library(arts+engineering) = " +(EngineeringDepartment.noOfEngineeringBooks+ArtsDepartment.noOfArtsBooks));
        System.out.println("total rented books in library(arts+engineering) = " +(EngineeringDepartment.noOfRentedBooks+ArtsDepartment.noOfRentedBooks));

        //add furniture
        eng.furniture("Chair","plastic");
        eng.furniture("table","plastic");
        eng.furniture("Chair","wood");
        arts.furniture("Chair","wood");
        arts.furniture("Chair","wood");
        System.out.println("total no of chairs(arts+engineering) "+(EngineeringDepartment.chairCount+ArtsDepartment.chairCount));

        //add staff
        eng.staff(45,"pri","vihu");
        eng.staff(54, "sanj", "herur");
        arts.staff(56,"satt","kumar");
        arts.staff(61,"Sara","Jenny");
        System.out.println("Total staff count(arts+engineering) "+(EngineeringDepartment.staffCount+ArtsDepartment.staffCount));
        if(EngineeringDepartment.eldestStaffAge>ArtsDepartment.eldestStaffAge){
            System.out.println("Age of the eldest staff in college is(arts+engineering) "+EngineeringDepartment.eldestStaffAge);
        }
        System.out.println("Age of the eldest staff in college is(arts+engineering) " +ArtsDepartment.eldestStaffAge);


    }
}

