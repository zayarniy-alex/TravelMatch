package ru.travelmatch.base.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.travelmatch.base.entities.Tag;

public interface TagRepository extends JpaRepository<Tag,Long> {
}
