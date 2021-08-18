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

    public String getmName() {
        return mName;
    }
}
