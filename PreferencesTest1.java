import java.util.prefs.*;

public class PreferencesTest1
{
    public static void main(String[] args) throws Exception
    {
        Preferences prefs=Preferences.systemRoot();
        prefs.put("test key", "test value");
        prefs.put("테스트용 key", "테스트용 value");

        Preferences subPrefs=prefs.node("subPrefs");
        subPrefs.put("sub test key", "sub test value");
        System.out.println(subPrefs.absolutePath());

        subPrefs=prefs.node("서브 prefs");
    }
}
