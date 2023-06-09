public class ball3 extends ball2{
    public ball3(double pX, double pY, double pZ, double pRadius){
        super(pX,pY,pZ,pRadius);
        kugel.setzeFarbe(0,0,360);
        kugel.verschiebe(0,-150,0);
    }
}
