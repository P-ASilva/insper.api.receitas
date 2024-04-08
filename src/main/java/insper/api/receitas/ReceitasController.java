package insper.api.receitas;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "api-receitas")
public interface ReceitasController {

    @PostMapping("/receitas")
    public ResponseEntity<ReceitaOut> create(
        @RequestBody(required = true) ReceitaIn in
    );

    @GetMapping("/receitas")
    public ResponseEntity<ReceitaOut> read();
    
    
    @GetMapping("/receitas/{id}")
    public ResponseEntity<ReceitaOut> get(
        @PathVariable(required = true) String id
    ); 

    @PutMapping("/receitas/{id}")
    public ResponseEntity<ReceitaOut> update(
        @PathVariable(required = true) String id,
        @RequestBody(required = true) ReceitaIn in
    ); 
    // @DelMapping("/receitas/{id}")
    // public ResponseEntity<ReceitaOut> del(
    //     @PathVariable(required = true) String id,
    //      @RequestHeader(required = true, name = "role-user") String roleUser
    // );
}