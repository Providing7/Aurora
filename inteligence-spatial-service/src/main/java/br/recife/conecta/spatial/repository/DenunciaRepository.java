package br.recife.conecta.spatial.repository;

import br.recife.conecta.spatial.domain.entity.Denuncia;
import org.locationtech.jts.geom.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

public interface DenunciaRepository extends JpaRepository<Denuncia, UUID> {
    
    @Query(value = "SELECT * FROM denuncia d WHERE ST_DWithin(d.geom, :point\\:\\geometry, :radius)", nativeQuery = true)
    List<Denuncia> findByProximidade(@Param("point") Point point,
                                     @Param("radius") Double radius);
    List<Denuncia> findByBairro(String bairro);
}
