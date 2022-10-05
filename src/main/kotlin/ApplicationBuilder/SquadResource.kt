package ApplicationBuilder

import datastructure.model.Model
import datastructure.model.ModelStatLine
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SquadResource {
    @CrossOrigin(origins = ["http://localhost:3000"])
    @GetMapping(path = ["/squad/**"])
    fun index(): Map<String, Model> = mapOf(
        "SM_SM" to Model("Space marine", "SM_SM", ModelStatLine(6, 1, 3, 3, 4, 4, 2, 3, 7, 3)),
        "SM_SMS" to Model("Space marine sergeant", "SM_SMS", ModelStatLine(6, 1, 3, 3, 4, 4, 2, 4, 8, 3)),
        "SM_SC" to Model("Scout", "SM_SC", ModelStatLine(6, 1, 4, 4, 4, 4, 2, 3, 7, 4)),
    )
}