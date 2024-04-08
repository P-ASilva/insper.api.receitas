package insper.api.receitas;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record ReceitaOut (
    String id,
    String name,
    Componente[] componentes
) { }
