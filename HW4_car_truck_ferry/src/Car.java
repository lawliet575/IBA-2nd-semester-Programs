public class Car {
String name;
double price;
double priceroadworthy;
int[] roadtax;
String bodytype;
String transmiss;
int seats;
String segment;
String intro;
String end;

Car(String name, double price,double priceroadworthy, int[] roadtax, 
String bodytype, String transmiss, int seats,String segment,String intro, String end){

 this.name=name;
 this.price=price;
 this.priceroadworthy=priceroadworthy;
 this.roadtax=roadtax;
 this.bodytype=bodytype;
 this.transmiss=transmiss;
 this.seats=seats;
 this.segment=segment;
 this.intro=intro;
 this.end=end;
}

public String toString(){
 return "Name: "+ name + "\n"+"Price: "+price+"\n"+"New Price Roadworthy:"+ priceroadworthy
         +"\n"+ "Road Tax / 3 Months: "+Integer.toString(roadtax[0])+" - "+Integer.toString(roadtax[1])
         +"\n"+"Body Type: "+ bodytype+"\n"+"Transmission: "+ transmiss+"\n"+
         "Number Of Seats: "+ seats+"\n"+"Segment: "+ segment+"\n"+ "Introduction: "+ intro
         +"\n"+"End: "+end;
}

}
