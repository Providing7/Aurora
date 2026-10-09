package br.recife.conecta.spatial.domain.event;

import java.time.LocalDateTime;
import java.util.UUID;

public record DenunciaEvent (
    UUID id,
    String relato,
    String bairro,
    Double latitude,
    Double longitude,
    LocalDateTime dataCriacao,
    String tipoViolencia
) {}
