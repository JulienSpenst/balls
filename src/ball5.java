import GLOOP.GLVektor;

public class ball5 extends ball4{
    public ball5(double pX, double pY, double pZ, double pRadius){
        super(pX,pY,pZ,pRadius);
        kugel.setzeFarbe(100,100,0);
        kugel.verschiebe(0,-150,0);
        bewegung = new GLVektor(-50,0,0);
    }
}
