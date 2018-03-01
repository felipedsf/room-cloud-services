package rocks.lipe.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rocks.lipe.app.domains.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
    Room findByRoomNumber(String roomNumber);
}
