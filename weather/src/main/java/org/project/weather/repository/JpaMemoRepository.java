package org.project.weather.repository;

import org.project.weather.domain.Memo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaMemoRepository extends JpaRepository<Memo,Integer> {
}
