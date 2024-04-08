package insper.api.receitas;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record ReceitaIn (
    String name,
    String creator_id,
    Componente[] componentes
) { }
