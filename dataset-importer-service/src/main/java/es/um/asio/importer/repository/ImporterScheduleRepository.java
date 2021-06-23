package es.um.asio.importer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.um.asio.domain.importer.ImporterSchedule;

public interface ImporterScheduleRepository extends JpaRepository<ImporterSchedule, String> {

	List<ImporterSchedule> findByDeletedDateIsNull();
}
