public class ball1 extends Ball{
    public ball1(double pX, double pY, double pZ, double pRadius){
        super(pX,pY,pZ,pRadius);
        kugel.setzeFarbe(0,360,0);
        kugel.verschiebe(0,50,0);
    }
}