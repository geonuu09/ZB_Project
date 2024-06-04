package org.project.weather;


import org.junit.jupiter.api.Test;
import org.project.weather.domain.Memo;
import org.project.weather.repository.JpaMemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@Transactional
public class JpaMemoRepositoryTest {
    @Autowired
    JpaMemoRepository jpaMemoRepository;

    @Test
    void insertMemoTest() {
        //given
        Memo newMemo = new Memo(10, "this is a Jpa memo");
        //when
        jpaMemoRepository.save(newMemo);

        //then
        List<Memo> memoList = jpaMemoRepository.findAll();
        assertTrue(memoList.size()>0);
    }

    @Test
    void findByIdTest() {
        //given
        Memo newMemo = new Memo(11, "JPA11");
        //when
        Memo memo = jpaMemoRepository.save(newMemo);
        System.out.println(memo.getId());
        //then
        Optional<Memo> Result = jpaMemoRepository.findById(memo.getId());
        assertEquals(Result.get().getText(),"JPA11");
    }
}
