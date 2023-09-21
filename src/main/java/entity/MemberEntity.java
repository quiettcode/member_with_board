package entity;

import dto.MemberSaveDTO;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name="member_table")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // auto_increment와 같은 역할?!
    @Column(name = "member_id")
    private Long id;

    @Column(length = 50, unique = true)
    private String memberEmail;
    // Entity에서는 _(언더바) 절대 금물. 차후에 오류 발생 가능성 높음.
    // 카멜케이스로 작성한 컬럼은 member_email로 자동으로 바뀜.

    @Column(length = 20)
    private String memberPassword;

    @Column() // 아무 지정을 안해줄 경우 varchar(255) 크기로 생성됨
    private String memberName;

    public static MemberEntity saveMember(MemberSaveDTO memberSaveDTO) {
        // MemberEntity타입의 객체를 보내기 위해 memberEntity라는 객체 선언
//        MemberEntity memberEntity = new MemberEntity();
//
//        // memberEntity 객체에 memberSaveDTO 객체 안에 담긴 각 요소를 담아준다
//        memberEntity.setMemberEmail(memberSaveDTO.getMemberEmail());
//        memberEntity.setMemberPassword(memberSaveDTO.getMemberPassword());
//        memberEntity.setMemberName(memberSaveDTO.getMemberName());
//
//        // 변환이 완료된 memberEntity 객체를 넘겨줌
//        return memberEntity;

        return MemberEntity.builder()
                .memberEmail(memberSaveDTO.getMemberEmail())
                .memberPassword(memberSaveDTO.getMemberPassword())
                .memberName(memberSaveDTO.getMemberName())
                .build();
    }


}
