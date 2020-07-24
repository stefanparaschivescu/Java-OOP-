package exercise.Stefan;

import java.util.ArrayList;
import java.util.Collections;

class League<T extends Team> {

    private ArrayList<T> teams;
    private String name;

    League(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
    }

    boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " is already in " + this.name);
            return false;
        }
        System.out.println(team.getName() + " was added to " + this.name);
        teams.add(team);
        return true;
    }

    void showLeagueTable() {
        Collections.sort(teams);
        System.out.println("===" + this.name + "===");
        for (int i=0; i<teams.size(); i++)
            System.out.println(i+1 + ". " + teams.get(i).getName() + ": " + teams.get(i).numberOfPoints());
    }
}

class PremierLeague extends Team {

    PremierLeague(String team) {
        super(team);
    }
}

class ChampionshipLeague extends Team{

    public ChampionshipLeague(String team) {
        super(team);
    }
}

class LaLiga extends Team {

    LaLiga(String team) {
        super(team);
    }
}

class BundesLiga extends Team {

    BundesLiga(String name) {
        super(name);
    }
}
