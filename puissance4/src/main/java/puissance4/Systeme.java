package puissance4;

class Systeme {
    public static void main(String[] args) {
        
    }
}

class Partie {
    Player player1;
    Player player2;
    Grille grille;

    public Partie(Player player1, Player player2, Grille grille){
        this.player1 = player1;
        this.player2 = player2;
        this.grille = grille;
    }

    private Player Victoire(Grille grille){
        return this.player1;
    }

    private Player Defaite(Grille grille){
        return this.player2;
    }

    private Boolean Egaliter(Grille grille){
        return grille.IsFull();
    }

}

class Tours {

}
