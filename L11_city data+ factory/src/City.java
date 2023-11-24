public class City {
    String name;
    double lat;
    double lng;
    String country;
    String iso2;
    String admin_name;


    City(String name,double lat,double lng,String country,String iso2,String admin_name){
        this.name=name;
        this.lat=lat;
        this.lng=lat;
        this.country=country;
        this.iso2=iso2;
        this.admin_name=admin_name;

    }


    public String getadmin_name(){
        return admin_name;
    }


    public String toString(){
        return "City: "+ this.name+ "\n"+ "lat: "+this.lat + "\n"+ "lng: " +this.lng+ "\n"+ "country: " +this.country
                +"\n"+"iso2: "+this.iso2+ "\n"+"admin_name: "+this.admin_name;


    }




}
