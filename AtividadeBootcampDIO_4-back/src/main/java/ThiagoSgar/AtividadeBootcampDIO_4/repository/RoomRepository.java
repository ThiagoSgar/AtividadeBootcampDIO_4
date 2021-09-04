package ThiagoSgar.AtividadeBootcampDIO_4.repository;


import ThiagoSgar.AtividadeBootcampDIO_4.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {


}
