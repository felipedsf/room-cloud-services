package rocks.lipe.app.controllers;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;
import rocks.lipe.app.domains.Room;
import rocks.lipe.app.services.RoomService;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/rooms")
public class RoomController {

    private RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public List<Room> findAll(@RequestParam(name = "roomNumber", required = false) String roomNumber) {
        if (StringUtils.isNotEmpty(roomNumber)) {
            return Collections.singletonList(roomService.getRoomByRoomNumber(roomNumber));
        }
        return roomService.getRooms();
    }

    @GetMapping("/{id}")
    public Room findOne(@PathVariable("id") Long id) {
        return roomService.getRoomById(id);
    }
}
