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

    public Hero(String name, int age, String power, String weakness) {
        this.name = name.trim();
        this.age = age;
        this.power = power.trim();
        this.weakness = weakness.trim();
        findDuplicateHero(this);
        if (duplicate){
            System.out.println("Duplicate Hero Detected");
        } else{
            heroRegistry.add(this);
            this.heroID = heroRegistry.size();
            this.squadUnion = "";
        }

    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public void setSquadUnion(String squadUnion){this.squadUnion = squadUnion;}
    public String getSquadUnion(){return  squadUnion;}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPower() {
        return power;
    }

    public String getWeakness() {
        return weakness;
    }
    public int getHeroID(){
        return heroID;
    }

    public static List<Hero> getHeroRegistry() {
        return heroRegistry;
    }
    public static Hero findHero(int searchID){ return heroRegistry.get(searchID -1 );}
    private static void findDuplicateHero(Hero newInsertion){
        for (Hero hero:heroRegistry){
            if (newInsertion.name.equalsIgnoreCase(hero.name)&&
                newInsertion.power.equalsIgnoreCase(hero.power)&&
                    newInsertion.weakness.equalsIgnoreCase(hero.weakness)){
                duplicate = true;
                break;
            }else if (newInsertion.name.equalsIgnoreCase(hero.name)){
                duplicate = true;
                break;
            }

        }
    }
    public void updateSquad(String newSquad){this.squadUnion = newSquad;}

    public void updateName(String newName){this.name =newName;}
    public void updateAge(int newAge){this.age = newAge; }
    public void updatePower(String newPower){this.power =newPower;}
    public void updateWeakness(String newpower){this.power =  newpower;}

    public static void deleteHero(int searchID) {
        Hero heroToDelete = findHero(searchID);
        if (heroToDelete.getSquadUnion().equals("")) {
            Squad currentSquad = null;
            String currentSquadName = heroToDelete.getSquadUnion();
            for (Squad squad : Squad.getAllSquads()) {
                if (Squad.getName().equalsIgnoreCase(currentSquadName)){
                    currentSquad =squad;
                    break;
                }
            }
            assert currentSquad !=null;
            currentSquad.removeMember(heroToDelete);
        }
        heroRegistry.remove(searchID -1);
    }
    public static void clearHeroRegistry(){heroRegistry.clear();}

}
