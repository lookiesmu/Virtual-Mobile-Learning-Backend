package Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class User {

    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    private String user_password;
    private String user_email;
    private String user_name;
    private String user_member;

    @OneToMany(mappedBy = "Entity.User")
    private List<Order> orders = new ArrayList<>();
}
