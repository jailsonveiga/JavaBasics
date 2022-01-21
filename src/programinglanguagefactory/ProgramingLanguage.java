package programinglanguagefactory;

public class ProgramingLanguage {
    public String name;
    public boolean isObjectOriented;
    public String fileExtension;

    public ProgramingLanguage(String name, boolean isObjectOriented, String fileExtension) {
        this.name = name;
        this.isObjectOriented = isObjectOriented;
        this.fileExtension = fileExtension;
    }

    @Override
    public String toString() {
        return "Programing Language: \n" +
                "Name: " + name +
                ", IsObjectOriented: " + isObjectOriented +
                ", FileExtension: " + fileExtension;
    }
}
