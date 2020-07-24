package exercise.Stefan;

public class Main {

    private static PremierLeague arsenal = new PremierLeague("Arsenal");
    private static PremierLeague chelsea = new PremierLeague("Chelsea");
    private static PremierLeague liverpool = new PremierLeague("Liverpool");
    private static PremierLeague manchesterCity = new PremierLeague("ManchesterCity");
    private static PremierLeague tottenham = new PremierLeague("Tottenham");
    private static PremierLeague southampton = new PremierLeague("Southampton");
    private static LaLiga barcelona = new LaLiga("Barcelona");
    private static BundesLiga bayern = new BundesLiga("Bayern Munchen");

    private static League<PremierLeague> premierLeague = new League<>("Premier League");
    public static void main(String[] args) {
        premierLeague.addTeam(arsenal);
        premierLeague.addTeam(chelsea);
        premierLeague.addTeam(liverpool);
        premierLeague.addTeam(manchesterCity);
        premierLeague.addTeam(tottenham);
        premierLeague.addTeam(southampton);
        //premierLeague.addTeam(barcelona);
        //premierLeague.addTeam(bayern);

        matchFixtures();

        premierLeague.showLeagueTable();
    }

    private static void matchFixtures() {
        arsenal.matchResult(chelsea, 1, 1);
        arsenal.matchResult(liverpool, 2,4);
        arsenal.matchResult(manchesterCity, 0,2);
        arsenal.matchResult(tottenham, 1, 0);
        arsenal.matchResult(southampton, 0,0);

        chelsea.matchResult(liverpool, 1,2);
        chelsea.matchResult(manchesterCity, 0,2);
        chelsea.matchResult(tottenham, 3, 0);
        chelsea.matchResult(southampton, 2,1);

        liverpool.matchResult(manchesterCity, 1,1);
        liverpool.matchResult(tottenham, 1, 0);
        liverpool.matchResult(southampton, 4,2);

        manchesterCity.matchResult(tottenham, 2, 0);
        manchesterCity.matchResult(southampton, 3,1);

        tottenham.matchResult(southampton, 1,1);

    }
}
