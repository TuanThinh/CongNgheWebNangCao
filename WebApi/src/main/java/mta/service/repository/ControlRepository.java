package mta.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mta.service.entity.Control;

public interface ControlRepository extends JpaRepository<Control, Long> {

}
