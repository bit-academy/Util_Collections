import java.util.prefs.*;

public class PreferencesTest2 implements NodeChangeListener, PreferenceChangeListener
{
    Preferences prefs;

    public PreferencesTest2()
    {
        prefs=Preferences.userRoot();
        prefs.addNodeChangeListener(this);
    }

    void makeChange()
    {
        Preferences subPrefs=prefs.node("new prefs");
        subPrefs.addPreferenceChangeListener(this);
        subPrefs.put("new key", "new value");
    }

    void cleanUp() throws BackingStoreException
    {
        Preferences subPrefs=prefs.node("new prefs");
        subPrefs.addPreferenceChangeListener(this);
        subPrefs.removeNode();
    }

    public void childAdded(NodeChangeEvent evt)
    {
        System.out.println(evt);
    }

    public void childRemoved(NodeChangeEvent evt)
    {
        System.out.println(evt);
    }

    public void preferenceChange(PreferenceChangeEvent evt)
    {
        System.out.println(evt);
    }

    public static void main(String[] args) throws Exception
    {
        PreferencesTest2 test2=new PreferencesTest2();
        test2.makeChange();
        test2.cleanUp();
    }
}
