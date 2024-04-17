package htwberlin.webtech;

public class Squad {
    private String players;
    private Integer formation;
    private String tactic;

    public Squad(String tactic, Integer formation, String players) {
        this.tactic = tactic;
        this.formation = formation;
        this.players = players;
    }

    public String getPlayers() {
        return players;
    }

    public Integer getFormation() {
        return formation;
    }

    public String getTactic() {
        return tactic;
    }
}




