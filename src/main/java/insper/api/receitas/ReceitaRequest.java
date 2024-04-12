package insper.api.receitas;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
@Getter
public class ReceitaRequest {
    ReceitaIn in;
    List<ComponenteDTO> componentes;
}