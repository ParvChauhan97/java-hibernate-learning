import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserClassHiber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;

    UserClassHiber() {

    }

    UserClassHiber(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public UserClassHiber(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
