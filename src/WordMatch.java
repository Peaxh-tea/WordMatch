public class WordMatch {
    private String secret;
    public WordMatch(String word){
        secret = word;
    }
    public int scoreGuess(String guess){
        int score = 0;
        for (int i = 0; i <= secret.length() - guess.length(); i++){
            if (secret.substring(i, i + guess.length()).equals(guess)){
                score++;
            }
        }
        return score * guess.length() * guess.length();
    }
    public String findBetterGuess(String guess1, String guess2){
        int guessA = scoreGuess(guess1);
        int guessB = scoreGuess(guess2);
        if (guessB > guessA){
            return guess2;
        }
        return guess1;
    }
}
