public class Developor extends Employee {

    String language;

    public Developor(String name, double salary, String department,String language) {
        super(name, salary, department);
        this.language=language;   
    }

    public String getLanguage() {
        return this.language;
    }

    public String toString(){
        return "Developer details: "+"\n"+
                super.toString()+"\n"+
                "Language: "+getLanguage();
    }


    
}
