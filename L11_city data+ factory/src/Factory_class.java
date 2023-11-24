import java.util.ArrayList;

public class Factory_class {
    ArrayList<City> Sindhi;
    ArrayList<City> Punjabi;
    ArrayList<City> KPK;
    ArrayList<City> Kashmiri;
    ArrayList<City> Balochi;
    ArrayList<City> G_baltistan;

    City c;

    Factory_class(ArrayList sindhi,ArrayList punjabi,ArrayList kpk,ArrayList kashmiri,ArrayList balochi,ArrayList gb){
        this.Sindhi=sindhi;
        this.Punjabi=punjabi;
        this.KPK=kpk;
        this.Kashmiri=kashmiri;
        this.Balochi=balochi;
        this.G_baltistan=gb;
    }

    public City getcity(String temp){
        if( temp.equalsIgnoreCase("Sindh") ) {
           int a=(int) ( 0 + Math.random()* Sindhi.size() );
           c=Sindhi.get(a);
           Sindhi.remove(a);
        }
        if( temp.equalsIgnoreCase("Punjab") ) {
            int a=(int) ( 0 + Math.random()* Punjabi.size() );
            c=Punjabi.get(a);
            Punjabi.remove(a);
        }
        if( temp.equalsIgnoreCase("Kpk") ) {
            int a=(int) ( 0 + Math.random()* KPK.size() );
            c=KPK.get(a);
            KPK.remove(a);
        }
        if( temp.equalsIgnoreCase("Kashmir") ) {
            int a=(int) ( 0 + Math.random()* Kashmiri.size() );
            c=Kashmiri.get(a);
            Kashmiri.remove(a);
        }
        if( temp.equalsIgnoreCase("Balochistan") ) {
            int a=(int) ( 0 + Math.random()* Balochi.size() );
            c=Balochi.get(a);
            Balochi.remove(a);
        }
        if( temp.equalsIgnoreCase("gb") ) {
            int a = (int) (0 + Math.random() * G_baltistan.size());
            c = G_baltistan.get(a);
            G_baltistan.remove(a);
        }

        return c;

    }





}
