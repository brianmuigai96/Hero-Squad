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

}
