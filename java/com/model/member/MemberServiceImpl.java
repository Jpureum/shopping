package com.model.member;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("com.model.member.MemberServiceImpl")
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper mapper;
	
	@Override
	public int duplicatedId(String id) {
		
		return mapper.duplicatedId(id);
	}

	@Override
	public int duplicatedEmail(String email) {
		
		return mapper.duplicatedEmail(email);
	}

	@Override
	public int create(MemberDTO dto) {
		
		return mapper.create(dto);
	}
	
	@Override
    public int loginCheck(Map<String, String> map) {
        return mapper.loginCheck(map);
    }

    @Override
    public Map<String, String> getGrade(String id) {
            
        return mapper.getGrade(id);
    }

	@Override
	public int total(Map map) {
		// TODO Auto-generated method stub
		return mapper.total(map);
	}

	@Override
	public List<MemberDTO> list(Map map) {
		// TODO Auto-generated method stub
		return mapper.list(map);
	}

	@Override
	public MemberDTO read(String id) {
		// TODO Auto-generated method stub
		return mapper.read(id);
	}

	@Override
	public int update(MemberDTO dto) {
		// TODO Auto-generated method stub
		return mapper.update(dto);
	}

	@Override
	public MemberDTO mypage(String id) {
		// TODO Auto-generated method stub
		return mapper.mypage(id);
	}

	@Override
	public int updateFile(Map map) {
		// TODO Auto-generated method stub
		return mapper.updateFile(map);
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return mapper.delete(id);
	}

}
