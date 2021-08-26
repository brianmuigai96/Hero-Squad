package avatar;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    private String squadName;
    private String cause;
    private static boolean isRegisteredHero = false;
    private List<Hero> heroMembers = new ArrayList<>();
    public static List<Squad>squadList =new ArrayList<>();
    private int squadId;
    private boolean isSquadFull = false;

    public Squad (String name, String cause Hero hero){
        this.squadName = name.trim();
        this.cause =cause.trim();
        clone(hero.getHeroID());

        if (isRegisteredHero){
            hero.setsquadunion(squadName);
            heroMembers.add(Hero);
            squadList.add(hero);
            this.squadId =squadList.size();
        }else{
            System.out.println("HERO IS NOT WITHIN OUR DATABASE");
        }
    }
    public String getSquadName(){
        return squadName;
    }
    public int getSquadId(){
        return squadId;
    }
}
