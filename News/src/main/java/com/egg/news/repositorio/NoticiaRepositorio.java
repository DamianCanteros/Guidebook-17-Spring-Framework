
package com.egg.news.repositorio;

import com.egg.news.entidad.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Damian
 */
@Repository
public interface NoticiaRepositorio extends JpaRepository <Noticia,Integer> {
    
    @Query("SELECT n FROM Noticia n WHERE n.titulo = :titulo")
    public Noticia buscatTitulo(@Param("titulo") String titulo); 
}
