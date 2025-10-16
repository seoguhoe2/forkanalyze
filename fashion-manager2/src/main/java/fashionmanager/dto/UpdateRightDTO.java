package fashionmanager.dto;

import lombok.*;

@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UpdateRightDTO {
    private int memberNum;
    private int memberStateNum;
}
