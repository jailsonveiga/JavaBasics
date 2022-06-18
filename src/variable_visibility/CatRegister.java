package variable_visibility;

public class CatRegister {

    //Initialize catCount variable as a integer datatype and store the value into the catCount variable
    private static int catCount = 0;

    //Create addNewCat method and pass one parameter catCount variable as integer datatype
    public void addNewCat(int catCount) {
        CatRegister.catCount = catCount;
    }


    public static void main(String[] args) {
        //Create an object instance of CatRegister and store the value into the cat
       CatRegister cat = new CatRegister();

       //add a new value to the addNewCat method
       cat.addNewCat(1);

       //Display the value of catCount on the screen
       System.out.println(catCount);
    }
}
