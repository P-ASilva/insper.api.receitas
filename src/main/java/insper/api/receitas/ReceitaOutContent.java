package insper.api.receitas;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
@Getter
public class ReceitaOutContent {
    private ReceitaOut out;
    private List<ComponenteDTO> componentes;
}