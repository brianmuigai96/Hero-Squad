package avatar;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private static List<Hero>heroRegistry = new ArrayList<>();
    private int heroID;
    private String squadUnion;
    private static boolean duplicate = false;

}
