package variable_visibility;

public class CatCount {
    public static void main (String[] args) {
        //Create an object instance of CatCount and store the value into the cat
        CatCount cat = new CatCount();

        //add a new value to the setCatCount method
        cat.setCatCount(1);

        //Display the value of cat.catCount on the screen
        System.out.println("Increase cat by " + cat.catCount);
    }

    ////Initialize catCount variable as a integer datatype and store the value into the catCount variable
    private static int catCount = 0;

    //Create setCatCount method and pass one parameter catCount variable as integer datatype
    private static void setCatCount(int catCount) {
       CatCount.catCount = catCount;
    }
}
