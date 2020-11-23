package ir.pb.repositories;

import ir.pb.base.repositories.BaseRepository;
import ir.pb.domains.Drug;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrugRepository extends CrudRepository<Drug, Long> {
}
