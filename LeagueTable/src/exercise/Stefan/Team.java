package exercise.Stefan;

public class Team implements Comparable<Team>{

    private String name;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;
    private int points = 0;

    Team(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    int numberOfPoints() {
        return won * 3 + tied;
    }

    void matchResult(Team opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            won++;
            points += won;
            message = " beat ";
        }
        else if (ourScore < theirScore) {
            lost++;
            message = " lost to ";
        }
        else {
            tied++;
            points += tied;
            message = " tied with ";
        }
        if (opponent != null) {
            System.out.println(this.name + message + opponent.getName() + ". Score " + ourScore + " - " + theirScore);
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    @Override
    public int compareTo(Team opponent) {
        if (this.points > opponent.points)
            return -1;
        else if (this.points < opponent.points)
            return 1;
        return 0;
    }
}
