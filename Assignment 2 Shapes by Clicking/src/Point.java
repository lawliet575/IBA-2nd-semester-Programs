/**
 * Point
 */
public class Point {
int x;
int y;


Point(){
this.x=0;
this.y=0;

}


Point(int x,int y){
    this.x=x;
    this.y=y;

}

void setx(int x){
this.x=x;
}

void sety(int y){
    this.y=y;
}

int getx(){
    return this.x;
}

int gety(){
    return this.y;
}
    

}