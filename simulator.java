
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
public class Simulator {
    /**
     * @param matches
     */
    public static void  playMatches(List<Match> matches){
        for(Match match : matches){
            int random = (int)((Math.random()*10)+1);
            //My random logic-This could be anything
            if(random % 2 == 0){
                match.setWinner(match.getTeam1());
                match.setLoser(match.getTeam2());
            }
            else{
                match.setWinner(match.getTeam2());
                match.setLoser(match.getTeam1());
            }
        }
    }
    static void showPointsTable(List<Team> teams,List<Match> matches){
        for(Team team : teams){
            int wonGames = matches.stream().filter(m -> m.getWinner().equals((team)).collect(Collectors.toList()).size());
            int lostGames = matches.stream().filter(m -> m.getLoser().equals((team)).collect(Collectors.toList()).size());
            System.out.println(team);
            System.out.println(String.valueOf(wonGames));
            System.out.println(String.valueOf(lostGames));
        
        
        }
    }
}

