
package com.portfolio2.newproyecto.Repository;

import com.portfolio2.newproyecto.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona, Long> {
    
}
