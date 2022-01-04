public class JavaBasics {
    public static void main(String[] args){
        String firstName = "Jay";
        String lastName = "Veiga";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        System.out.println(createFullName("Jay", "Veiga"));
        System.out.println(NameGenerator.generateFullName("Jay", "Veiga"));
    }
    public static String createFullName(String firstName, String lastName){
        return firstName.concat(" " + lastName);
    }
    public static class NameGenerator{

        public static String generateFullName(String firstname, String lastName){
            return firstname + " " + lastName;
        }
    }

}
