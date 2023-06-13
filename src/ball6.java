import GLOOP.GLVektor;

public class ball6 extends ball5{
    public ball6(double pX, double pY, double pZ, double pRadius){
        super(pX,pY,pZ,pRadius);
        kugel.setzeFarbe(100,100,0);
        kugel.verschiebe(0,-300,0);
        bewegung = new GLVektor(-60,0,0);
    }
}