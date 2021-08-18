import org.jetbrains.annotations.Contract;

import java.util.ArrayList;
import java.util.List;

public class squad {
    private String mName;
    private int mSize;
    private String mCause;
    private static List<squad> instances = new ArrayList<squad>();
    private int mId;
    private List<Hero> mHeroes;

    public Squad(String name, int size, String cause) {
        mName = name;
        mSize = size;
        mCause = cause;
        instances.add(this);
        mId = instances.size();
        mHeroes = new ArrayList<Hero>();
    }

    public String getName() {
        return mName;
    }

    public int getSize() {
        return mSize;
    }

    public String getCause() {
        return mCause;
    }

    public static List<squad> all() {
        return instances;
    }
    public static void clear(){
        instances.clear();
    }
    public int getId(){
        return mId
    }
    @Contract(pure = true)
    public static squad find(int id){
        return instances.get(id - 1);
    }
    public List<Hero>getHeroes(){
        return mHeroes;
    }
    public void addHero(Hero hero) {
        mHeroes.add(hero);
    }
    public static boolean heroAlreadyExists(Hero newHero) {
        boolean exists = false;
        for (Squad squad : instances) {
            for (Hero hero : squad.getHeroes()) {
                if (hero.getName().equals(newHero.getName())) {
                    exists = true;
                }
            }
        }
        return exists;
    }


}
