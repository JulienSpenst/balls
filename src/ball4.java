import GLOOP.GLVektor;

public class ball4 extends ball3{
    public ball4(double pX, double pY, double pZ, double pRadius){
        super(pX,pY,pZ,pRadius);
        kugel.setzeFarbe(0,100,100);
        kugel.verschiebe(0,-100,0);
        bewegung = new GLVektor(-40,0,0);

    }
}
