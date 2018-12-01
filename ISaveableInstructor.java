package InterfacesChallenge;


// Imports of needed tools and plug-ins
import java.util.List;

public interface ISaveableInstructor {
    List<String> write();
    void read(List<String> savedValues);
}
