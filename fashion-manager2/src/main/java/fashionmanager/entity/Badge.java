package fashionmanager.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "badge")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Badge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num")
    private int badgeNum;

    @Column(name = "name")
    private String badgeName;

    @ManyToMany(mappedBy = "badges")
    private List<User> users = new ArrayList<>();

    @Override
    public String toString() {
        return "Badge{" +
                "badgeNum=" + badgeNum +
                ", badgeName='" + badgeName + '\'' +
                '}';
    }
}