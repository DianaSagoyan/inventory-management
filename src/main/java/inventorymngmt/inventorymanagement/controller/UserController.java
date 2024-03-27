package inventorymngmt.inventorymanagement.controller;

import inventorymngmt.inventorymanagement.dto.ResponseWrapper;
import inventorymngmt.inventorymanagement.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("list")
    public ResponseEntity<ResponseWrapper> getAllUsers(){
        return ResponseEntity.ok(new ResponseWrapper("Successfully retrieved users", HttpStatus.OK, userService.listAllUsers()));
    }
}
