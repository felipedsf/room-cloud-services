package rocks.lipe.app.services;

import rocks.lipe.app.domains.Room;

import java.util.List;

public interface RoomService {

    List<Room> getRooms();
    Room getRoomById(Long id);
    Room getRoomByRoomNumber(String roomNumber);

}
