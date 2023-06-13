import GLOOP.*;
public class Ballsimulation{
    private GLEntwicklerkamera kamera;
    GLLicht licht;
    GLHimmel himmel;
    GLBoden boden;
    private GLTastatur tastatur;

    private Ball ball;
    private ball1 ball1;

    private ball2 ball2;

    private ball3 ball3;

    private ball4 ball4;

    private ball5 ball5;
    private ball5 ball6;
    private Hindernis[] hindernis;

    public Ballsimulation(){
        kamera = new GLEntwicklerkamera(800,500);
        kamera.setzePosition(0,500,2000);
        licht  = new GLLicht();       
        boden  = new GLBoden("src/Boden.jpg");
        himmel = new GLHimmel("src/Himmel.jpg");
        tastatur = new GLTastatur();

        hindernis = new Hindernis[2];
        hindernis[0] = new Hindernis(1000,200,0, 50,400,1300);
        hindernis[1] = new Hindernis(-1000,200,0, 50,400,1300);

        ball = new Ball (0,200,0, 20);
        ball.werfen(new GLVektor(2,0,0));

        ball1 = new ball1 (0,200,0, 20);
        ball1.werfen(new GLVektor(2,0,0));

        ball2 = new ball2 (0,200,0, 20);
        ball2.werfen(new GLVektor(2,0,0));

        ball3 = new ball3 (0,200,0, 20);
        ball3.werfen(new GLVektor(2,0,0));

        ball4 = new ball4 (0,200,0, 20);
        ball4.werfen(new GLVektor(2,0,0));

        ball5 = new ball5 (0,200,0, 20);
        ball5.werfen(new GLVektor(2,0,0));

        ball6 = new ball5 (0,200,0, 20);
        ball6.werfen(new GLVektor(2,0,0));

        fuehreAus();
    }

    public void fuehreAus(){
        while (!tastatur.esc()){

            ball.bewegeDich();
            ball1.bewegeDich();
            ball2.bewegeDich();
            ball3.bewegeDich();
            ball4.bewegeDich();
            ball5.bewegeDich();
            ball6.bewegeDich();
            for (int j=0; j<2; j++) {
                ball.bearbeiteHindernis(hindernis[j]);
                ball1.bearbeiteHindernis(hindernis[j]);
                ball2.bearbeiteHindernis(hindernis[j]);
                ball3.bearbeiteHindernis(hindernis[j]);
                ball4.bearbeiteHindernis(hindernis[j]);
                ball5.bearbeiteHindernis(hindernis[j]);
                ball6.bearbeiteHindernis(hindernis[j]);
            }
            Sys.warte();
        }
        Sys.beenden();
    }
    
}
