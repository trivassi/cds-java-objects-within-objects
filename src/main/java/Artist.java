import java.util.List;
import java.util.ArrayList;

public class Artist {
  private String mName;
  private static ArrayList<Artist> instances = new ArrayList<Artist>();
  private ArrayList<CD> mCDs;
  private int mId;

  public Artist(String name) {
    mName = name;
    instances.add(this);
    mId = instances.size();
    mCDs = new ArrayList<CD>();
  }

  public String getName() {
    return mName;
  }

  public static ArrayList<Artist> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static Artist find(int id) {
    return instances.get(id - 1);
  }

  public void addCD(CD cd) {
    mCDs.add(cd);
  }

  public ArrayList<CD> getCDs() {
    return mCDs;
  }
}
