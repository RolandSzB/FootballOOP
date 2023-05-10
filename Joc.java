package football;

public class Joc {

	private String echipaGazda;
    private String echipaOaspeti;
    private int gazdaScore;
    private int oaspetiScore;
    private int nrOuts;
    private int nrCorners;
	public Joc(String echipaGazda, String echipaOaspeti) {
		super();
		this.echipaGazda = echipaGazda;
		this.echipaOaspeti = echipaOaspeti;
		this.gazdaScore = 0;
		this.oaspetiScore = 0;
		this.nrOuts =0;
		this.nrCorners = 0;
	}
    
	public void simuleaza() {
        Minge ball = new Minge(50, 25);
        
        for (int i = 0; i < 1000; i++) {
            try {
                ball.suteaza();

                System.out.println(" : Mingea se afla la coordonatele (" + ball.getX() + ", " + ball.getY() + ")");
            } catch (Exception e) {
                switch (e.getMessage()) {
                    case "Out":
                        this.nrOuts++;

                        System.out.println( "  Out!");

                        ball = new Minge(ball.getX(), ball.getY());
                        break;

                    case "Gol":
                        if (ball.getX() == 0) 
                            this.gazdaScore++;
                        else this.oaspetiScore++;  }
	   }
      }
     }
	}
