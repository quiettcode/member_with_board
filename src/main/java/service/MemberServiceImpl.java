package service;

import dto.MemberSaveDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    // Repository 생성자 주입.
    private final MemberRepository mr;

    @Override
    public Long save(MemberSaveDTO memberSaveDTO) {
        return null;
    }

    // 회원가입 정보 저장


}
