package org.project.weather;

import org.junit.jupiter.api.Test;
import org.project.weather.domain.Memo;
import org.project.weather.repository.JdbcMemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@Transactional
// - 이 어노테이션을 켜두면, 실제 DB에는 영향이 가지않음! 테스트코드가 잘 작동하는지 확인하는 용도로 사용
public class JdbcMemoRepositoryTest {
    @Autowired
    JdbcMemoRepository jdbcMemoRepository;

    @Test
    void insertMemoTest() {
        //given
        Memo newMemo = new Memo(2, "insertMemoTest");

        //when
        jdbcMemoRepository.save(newMemo);
        //then ~ 할것이다
        Optional<Memo> result = jdbcMemoRepository.findById(2);
        assertEquals(result.get().getText(),"insertMemoTest");
    }

    @Test
    void findAllMemoTest() {
        List<Memo> memoList = jdbcMemoRepository.findAll();
        System.out.println(memoList);
        assertNotNull(memoList);
        //given
        //when
        //then
    }
}
