import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main { //file reading done here
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<City> citylist=new ArrayList<>();

        ArrayList<City> Sindhi=new ArrayList<>();
        ArrayList<City> Punjabi=new ArrayList<>();
        ArrayList<City> KPK=new ArrayList<>();
        ArrayList<City> Kashmiri=new ArrayList<>();
        ArrayList<City> Balochi=new ArrayList<>();
        ArrayList<City> G_baltistan=new ArrayList<>();







        java.io.File file=new java.io.File("data.csv");
        Scanner read = new Scanner(file); //exception handled
        read.nextLine(); //skips first line
        while(read.hasNext()){ //checks each line rmr
            read.useDelimiter(",");//seperates all on comas in the current line
            String name=read.next();
            double lat=read.nextDouble();
            double lng=read.nextDouble();
            String country=read.next();
            String iso2=read.next();
            String admin_name=read.next();

            City c=new City(name,lat,lng,country,iso2,admin_name);
            citylist.add(c);

            read.nextLine();//advances to next line


        }

        for(int i=0;i<citylist.size();i++) {
            String temp=citylist.get(i).getadmin_name();

            if( temp.equalsIgnoreCase("Sindh") ) {
             Sindhi.add( citylist.get(i) );
            }
            if( temp.equalsIgnoreCase("Punjab") || temp.equalsIgnoreCase("Islāmābād") ) {
                Punjabi.add( citylist.get(i) );
            }
            if( temp.equalsIgnoreCase("Khyber Pakhtunkhwa") ) {
                KPK.add( citylist.get(i) );
            }
            if( temp.equalsIgnoreCase("Azad Kashmir") ) {
                Kashmiri.add( citylist.get(i) );
            }
            if( temp.equalsIgnoreCase("Balochistān") ) {
                Balochi.add( citylist.get(i) );
            }
            if( temp.equalsIgnoreCase("Gilgit-Baltistan") ) {
                G_baltistan.add( citylist.get(i) );
            }

        } // factory after this

        Factory_class fc=new Factory_class(Sindhi,Punjabi,KPK,Kashmiri,Balochi,G_baltistan);
        System.out.println("Enter admin_name");
        Scanner input=new Scanner(System.in);
        String temp=input.next();
        System.out.println( fc.getcity(temp) );




    }


}