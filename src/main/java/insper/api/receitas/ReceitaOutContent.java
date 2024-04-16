package insper.api.receitas;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
@Getter @Setter
public class ReceitaOutContent {
    private ReceitaOut out;
    private List<ComponenteDTO> componentes;
}