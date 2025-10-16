package fashionmanager.entity;

import fashionmanager.entity.pk.ReviewPostItemPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "review_item")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ReviewPostItemEntity {
    @EmbeddedId
    private ReviewPostItemPK reviewPostItemPK;
}
